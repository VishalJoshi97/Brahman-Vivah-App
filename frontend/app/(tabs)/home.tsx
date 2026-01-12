import { View, Text, Pressable } from "react-native";
import { useRouter,Stack } from "expo-router";

export default function Home() {
  const router = useRouter();

  return (
    <View style={{ flex: 1, justifyContent: "center", alignItems: "center" }}>
      <Text style={{ fontSize: 22, marginBottom: 20 }}>
        Welcome to Brahman Vivah
      </Text>
    </View>
  );
}
