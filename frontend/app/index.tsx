import { View, Text, Pressable } from "react-native";
import { Redirect, useRouter } from "expo-router";

//WHICH screen opens first
//Usually just redirects-route
export default function Index() {
 

  return (
    // <Redirect href="/(onboarding)/welcome" />
    // <Redirect href="/(onboarding)/(intro)/loading" />
    <Redirect href="/(tabs)/home"/>
  );
}
