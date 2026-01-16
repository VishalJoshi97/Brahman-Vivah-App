import axios from "axios";

// Base API instance
const apiClient = axios.create({
  baseURL: "http://localhost:8080/api", // change for production
  headers: {
    "Content-Type": "application/json",
  },
  timeout: 10000,
});
// Request interceptor (attach token)
apiClient.interceptors.request.use(
  async (config) => {
    // If using JWT
    const token = localStorage.getItem("token"); 
    // In React Native: use AsyncStorage

    if (token) {
      config.headers.Authorization = `Bearer ${token}`;
    }
    return config;
  },
  (error) => Promise.reject(error)
);
// Response interceptor
apiClient.interceptors.response.use(
  (response) => response.data,
  (error) => {
    console.error("API Error:", error.response || error.message);
    return Promise.reject(error);
  }
);

export default apiClient;
