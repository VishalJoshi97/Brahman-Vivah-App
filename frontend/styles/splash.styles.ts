import { StyleSheet } from "react-native";

export default StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fffaf4",
    justifyContent: "center",
    alignItems: "center",
  },

  card: {
    width: "88%",
    backgroundColor: "#ffffff",
    borderRadius: 18,
    paddingVertical: 36,
    paddingHorizontal: 24,
    alignItems: "center",

    shadowColor: "#000",
    shadowOpacity: 0.08,
    shadowRadius: 18,
    shadowOffset: { width: 0, height: 10 },
    elevation: 6,
  },

  logo: {
    width: 72,
    height: 72,
    borderRadius: 20,
    backgroundColor: "#f59e0b",
    alignItems: "center",
    justifyContent: "center",
    marginBottom: 18,
  },

  logoIcon: {
    color: "#fff",
    fontSize: 32,
    fontWeight: "700",
  },

  title: {
    fontSize: 22,
    fontWeight: "700",
    color: "#111",
  },

  subtitle: {
    fontSize: 14,
    color: "#374151",
    marginTop: 6,
  },

  caption: {
    fontSize: 13,
    color: "#9ca3af",
    marginTop: 10,
    marginBottom: 22,
  },

  pillsRow: {
    flexDirection: "row",
    flexWrap: "wrap",
    justifyContent: "center",
    gap: 8,
  },

  pill: {
    backgroundColor: "#fff3e0",
    paddingHorizontal: 14,
    paddingVertical: 6,
    borderRadius: 20,
  },

  pillText: {
    fontSize: 12,
    color: "#92400e",
    fontWeight: "500",
  },

  dotsRow: {
    flexDirection: "row",
    marginTop: 22,
  },

  dot: {
    width: 6,
    height: 6,
    borderRadius: 3,
    backgroundColor: "#d1d5db",
    marginHorizontal: 4,
  },

  activeDot: {
    backgroundColor: "#6b7280",
  },
});
