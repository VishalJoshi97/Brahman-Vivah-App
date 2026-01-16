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
/**
 * Update user
 * PUT /api/users/{id}
 */
export const updateUser = async (
  id: number,
  data: {
    name?: string;
    email?: string;
  }
) => {
  return apiClient.put(`/users/${id}`, data);
};

/**
 * Delete user
 * DELETE /api/users/{id}
 */
export const deleteUser = async (id: number) => {
  return apiClient.delete(`/users/${id}`);
};
