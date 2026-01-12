import { View, Text } from "react-native";
import { Stack } from "expo-router";

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
    </View>
  );
}
