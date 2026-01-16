import apiClient from "./apiClient";

export const loginUser = (data: {
  email: string;
  password: string;
}) => {
  return apiClient.post("/auth/login", data);
};
