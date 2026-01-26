import { View, Text, TextInput, Pressable } from "react-native";
import { Link, useRouter } from "expo-router";

export default function Register() {
  const router = useRouter();

  return (
    <View style={{ flex: 1, padding: 20, justifyContent: "center" }}>
      <Text style={{ fontSize: 24, marginBottom: 20 }}>Register</Text>

      <TextInput
        placeholder="Full Name"
        style={{ borderWidth: 1, padding: 10, marginBottom: 10 }}
      />

      <TextInput
        placeholder="Email"
        style={{ borderWidth: 1, padding: 10, marginBottom: 10 }}
      />

      <TextInput
        placeholder="Password"
        secureTextEntry
        style={{ borderWidth: 1, padding: 10, marginBottom: 20 }}
      />

      <Pressable
        // onPress={() => router.replace("/(tabs)/home")}
        style={{ backgroundColor: "#8B0000", padding: 12, borderRadius: 6 }}
      ><Link href='/(auth)/verification'>
          
        <Text style={{ color: "white", textAlign: "center" }}>Register</Text>
      </Link>
      </Pressable>
    </View>
  );
}
