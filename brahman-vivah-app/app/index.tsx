import { View, Text, Pressable } from "react-native";
import { useRouter } from "expo-router";

export default function Index() {
  const router = useRouter();

  return (
    <View style={{ flex: 1, justifyContent: "center", alignItems: "center" }}>
      <Text style={{ fontSize: 22, marginBottom: 20 }}>Brahman Vivah App</Text>

      <Pressable
        onPress={() => router.push("/(auth)/login")}
        style={{ backgroundColor: "#8B0000", padding: 12, borderRadius: 6 }}
      >
        <Text style={{ color: "white" }}>Get Started</Text>
      </Pressable>
    </View>
  );
}
