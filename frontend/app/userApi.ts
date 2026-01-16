import apiClient from "./apiClient";

/**
 * Get all users
 * GET /api/users
 */
export const getAllUsers = async () => {
  return apiClient.get("/users");
};
