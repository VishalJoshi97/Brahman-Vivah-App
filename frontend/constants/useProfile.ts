import { useState } from "react";
import { postProfile, ProfileRequest } from "../api/profile.api";

export const useProfile = () => {
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState<string | null>(null);

  const createProfile = async (
    userId: number,
    payload: ProfileRequest
  ) => {
    try {
      setLoading(true);
      setError(null);

      const data = await postProfile(userId, payload);

      return data;
    } catch (err: any) {
      console.error(err);
      setError(err?.response?.data?.message || "Something went wrong");
      throw err;
    } finally {
      setLoading(false);
    }
  };

  return {
    createProfile,
    loading,
    error,
  };
};
