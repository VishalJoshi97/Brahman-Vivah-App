import { View, ActivityIndicator } from "react-native";

export default function LoadingOverlay() {
  return (
    <View
      style={{
        position: "absolute",
        top: 0,
        left: 0,
        right: 0,
        bottom: 0,
        justifyContent: "center",
        alignItems: "center",
        backgroundColor: "rgba(0,0,0,0.3)",
      }}
    >
      <ActivityIndicator size="large" color="#fff" />
    </View>
  );
}
