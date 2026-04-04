import axios from "axios";

export const BASE_URL = "http://10.0.2.2:9090/api";

const api = axios.create({
  baseURL: BASE_URL,
  headers: {
    "Content-Type": "application/json",
  },
});

export default api;
