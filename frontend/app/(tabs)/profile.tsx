import { View, Text,Pressable } from "react-native";
import { Stack,router } from "expo-router";

export default function Profile() {
  return (
    <View style={{ flex: 1, justifyContent: "center", alignItems: "center" }}>
      <Stack.Screen
        options={{
          headerShown: true,
          title: "Profile",
        }}
      />
        <Text style={{ fontSize: 20 }}>Profile Page</Text>
      <Pressable
        onPress={() => router.replace("/(onboarding)/(intro)/loading")}
        style={{ backgroundColor: "#555", padding: 10, borderRadius: 6 }}
      >
        <Text style={{ color: "white" }}>Logout</Text>
      </Pressable>
    </View>
  );
}
