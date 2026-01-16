import apiClient from "./apiClient";

/**
 * Get all users
 * GET /api/users
 */
export const getAllUsers = async () => {
  return apiClient.get("/users");
};
/**
 * Get user by ID
 * GET /api/users/{id}
 */
export const getUserById = async (id: number) => {
  return apiClient.get(`/users/${id}`);
};
