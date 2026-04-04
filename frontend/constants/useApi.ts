import { useState } from "react";

export const useApi = <T, P extends any[]>(
  apiFunc: (...args: P) => Promise<T>
) => {
  const [loading, setLoading] = useState(false);
  const [error, setError] = useState<string | null>(null);

  const request = async (...args: P): Promise<T> => {
    try {
      setLoading(true);
      setError(null);

      const result = await apiFunc(...args);
      return result;
    } catch (err: any) {
      setError(err?.response?.data?.message || "API Error");
      throw err;
    } finally {
      setLoading(false);
    }
  };

  return { request, loading, error };
};
