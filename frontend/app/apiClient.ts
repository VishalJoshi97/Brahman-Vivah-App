import axios from "axios";

// Base API instance
const apiClient = axios.create({
  baseURL: "http://localhost:8080/api", // change for production
  headers: {
    "Content-Type": "application/json",
  },
  timeout: 10000,
});
