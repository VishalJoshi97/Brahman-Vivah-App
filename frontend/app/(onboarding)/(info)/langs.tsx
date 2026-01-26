import { View, Text, TextInput } from "react-native";
import React from "react";
import { Link } from "expo-router";
import Shloka from "@/components/Shloka";
import { SHLOKAS } from "@/constants/shlokas";

 export default function LanguagesScreen() {
   return (
     <View style={{ padding: 24 }}>
       <Shloka {...SHLOKAS.langs} />

       <Text style={{ fontSize: 22, fontWeight: "600" }}>
         Languages you speak
       </Text>

       <Text style={{ marginTop: 8 }}>
         Communication matters in relationships.
       </Text>
       <Link href="/(onboarding)/(info)/pics">ENTER</Link>
     </View>
   );
 }

