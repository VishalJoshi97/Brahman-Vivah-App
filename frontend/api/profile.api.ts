import api from "./interceptor";

export const postProfile = async (userId: number, payload: any) => {
  const res = await api.post(`/profile/${userId}`, payload);
  return res.data;
};
