import api from "./interceptor";

export type LoginRequest = {
  email: string;
  password: string;
};

export const loginUser = async (payload: LoginRequest) => {
  const res = await api.post("/auth/login", payload);
  return res.data; // should return { token, userId }
};
