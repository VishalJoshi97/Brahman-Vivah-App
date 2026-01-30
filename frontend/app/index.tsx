// import { View, Text, Pressable } from "react-native";
import { Redirect,   } from "expo-router";

//WHICH screen opens first
//Usually just redirects-route
export default function Index() {
 

  return (
    // <Redirect href="/(onboarding)/welcome" />
    <Redirect href="/(onboarding)/(intro)/splash" />
    // <Redirect href="/(onboarding)/(info)/name"/>
  );
}
