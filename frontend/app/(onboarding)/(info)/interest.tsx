import { View, Text,  } from "react-native";
import React from "react";
import { Link } from "expo-router";
import Shloka from "@/components/Shloka";
import { SHLOKAS } from "@/constants/shlokas";

 export default function InterestScreen() {
   return (
     <View style={{ padding: 24 }}>
       <Shloka {...SHLOKAS.interest} />

       <Text style={{ fontSize: 22, fontWeight: "600" }}>Your interests</Text>

       <Text style={{ marginTop: 8 }}>
         This helps us understand your mindset.
       </Text>
       <Link href="/(onboarding)/(info)/choices">ENTER</Link>
     </View>
   );
 }

