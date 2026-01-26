import { StyleSheet, Dimensions } from "react-native";

const { width, height } = Dimensions.get("window");

export const onboardingStyles = StyleSheet.create({
  container: {//for view
    flex: 1,
    backgroundColor: "#FFFFFF",
    paddingHorizontal: 24,
    justifyContent: "center",
  },

  imageContainer: {
    alignItems: "center",
    marginBottom: 32,
  },

  image: {
    width: width * 0.7,
    height: height * 0.35,
    resizeMode: "contain",
  },

  title: {
    fontSize: 28,
    fontWeight: "700",
    color: "#7B1E3A", // maroon (traditional)
    textAlign: "center",
    marginBottom: 12,
  },

  subtitle: {
    fontSize: 16,
    color: "#555",
    textAlign: "center",
    lineHeight: 22,
    marginBottom: 32,
  },

  button: {
    backgroundColor: "#7B1E3A",
    paddingVertical: 14,
    borderRadius: 10,
    alignItems: "center",
  },

  buttonText: {
    color: "#000",
    fontSize: 16,
    fontWeight: "600",
  },

  skipText: {
    marginTop: 20,
    textAlign: "center",
    color: "#999",
    fontSize: 14,
  },

  featureList: {
    marginTop: 16,
  },

  featureItem: {
    fontSize: 16,
    color: "#333",
    marginBottom: 12,
    textAlign: "center",
  },

  indicatorContainer: {
    flexDirection: "row",
    justifyContent: "center",
    marginBottom: 24,
  },

  indicator: {
    width: 8,
    height: 8,
    borderRadius: 4,
    backgroundColor: "#DDD",
    marginHorizontal: 6,
  },

  activeIndicator: {
    backgroundColor: "#7B1E3A",
    width: 20,
  },
});
