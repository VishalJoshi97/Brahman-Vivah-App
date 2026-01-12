import { View, Text, TextInput, Pressable, TouchableOpacity } from "react-native";
import { useRouter } from "expo-router";
import { Ionicons } from "@expo/vector-icons";
import { useSSO } from "@clerk/clerk-expo";

export default function Login() {

const { startSSOFlow } = useSSO();
  const router = useRouter()
  
  const handleGoogleSignIn = async () => {
  try {
    const { createdSessionId, setActive } = await startSSOFlow({ strategy: "oauth_google" }) 
    
    if (setActive && createdSessionId) {
      setActive({ session: createdSessionId });//active logged-in user
      router.replace("/(tabs)/home")
    }
  }
  catch (error) {
    console.error("OAuth error:",error);
  }
}


  return (
    <View>
      <TouchableOpacity
        onPress={handleGoogleSignIn}
        activeOpacity={0.9}>
        <View>
          <Ionicons name='logo-google'/>
        </View>
        <Text>
        Continue With Google
        </Text>
      </TouchableOpacity>
   </View>
  );
}
