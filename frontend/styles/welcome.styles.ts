import { StyleSheet, Dimensions } from "react-native";

const { height } = Dimensions.get("window");

export default StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fffaf4",
  },

  wrapper: {
    flex: 1,
  },

  image: {
    width: "100%",
    height: height * 0.45,
    resizeMode: "cover",
  },

  content: {
    flex: 1,
    padding: 24,
  },

  header: {
    flexDirection: "row",
    alignItems: "center",
    marginBottom: 16,
  },

  logo: {
    width: 36,
    height: 36,
    borderRadius: 8,
    backgroundColor: "#f59e0b",
    alignItems: "center",
    justifyContent: "center",
    marginRight: 10,
  },

  logoText: {
    color: "#fff",
    fontSize: 18,
    fontWeight: "700",
  },

  appName: {
    fontSize: 18,
    fontWeight: "600",
    color: "#111",
  },

  title: {
    fontSize: 26,
    fontWeight: "700",
    color: "#111",
    marginTop: 10,
  },

  subtitle: {
    fontSize: 15,
    color: "#6b7280",
    marginVertical: 12,
    lineHeight: 22,
  },

  primaryButton: {
    backgroundColor: "#f59e0b",
    paddingVertical: 14,
    borderRadius: 10,
    alignItems: "center",
    marginTop: 10,
  },

  primaryButtonText: {
    color: "#fff",
    fontSize: 16,
    fontWeight: "600",
  },

  secondaryButton: {
    borderWidth: 1,
    borderColor: "#e5e7eb",
    paddingVertical: 14,
    borderRadius: 10,
    alignItems: "center",
    marginTop: 12,
  },

  secondaryButtonText: {
    color: "#111",
    fontSize: 15,
    fontWeight: "500",
  },

  guestText: {
    textAlign: "center",
    color: "#9ca3af",
    marginTop: 14,
  },

  trustRow: {
    flexDirection: "row",
    justifyContent: "space-between",
    marginTop: 30,
  },

  trustItem: {
    width: "48%",
  },

  trustIcon: {
    fontSize: 20,
    marginBottom: 6,
  },

  trustTitle: {
    fontSize: 14,
    fontWeight: "600",
    color: "#111",
  },

  trustDesc: {
    fontSize: 12,
    color: "#6b7280",
    marginTop: 2,
  },
});
