import React, { createContext, useContext, useEffect, useState } from "react";
import { getToken, saveToken, removeToken } from "../utils/authStorage";
import { loginUser } from "../api/auth.api";

type AuthContextType = {
  userId: number | null;
  token: string | null;
  loading: boolean;
  login: (email: string, password: string) => Promise<void>;
  logout: () => Promise<void>;
};

const AuthContext = createContext<AuthContextType | null>(null);

export const AuthProvider = ({ children }: { children: React.ReactNode }) => {
  const [userId, setUserId] = useState<number | null>(null);
  const [token, setToken] = useState<string | null>(null);
  const [loading, setLoading] = useState(true);

  // 🔁 Restore session on app start
  useEffect(() => {
    const loadAuth = async () => {
      const storedToken = await getToken();

      if (storedToken) {
        setToken(storedToken);
        // optionally decode token to get userId
      }

      setLoading(false);
    };

    loadAuth();
  }, []);

  const login = async (email: string, password: string) => {
    const data = await loginUser({ email, password });

    await saveToken(data.token);

    setToken(data.token);
    setUserId(data.userId);
  };

  const logout = async () => {
    await removeToken();
    setToken(null);
    setUserId(null);
  };

  return (
    <AuthContext.Provider
      value={{ userId, token, loading, login, logout }}
    >
      {children}
    </AuthContext.Provider>
  );
};

export const useAuthContext = () => {
  const context = useContext(AuthContext);
  if (!context) throw new Error("AuthContext not found");
  return context;
};
