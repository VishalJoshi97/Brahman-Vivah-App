import { View, Text, } from "react-native";
import React from "react";
import { Link } from "expo-router";
import Shloka from "@/components/Shloka";
import { SHLOKAS } from "@/constants/shlokas";

 export default function SexualOrientationScreen() {
   return (
     <View style={{ padding: 24 }}>
       <Shloka {...SHLOKAS.sexont} />

       <Text style={{ fontSize: 22, fontWeight: "600" }}>
         Sexual orientation
       </Text>

       <Text style={{ marginTop: 8 }}>
         This helps ensure respectful matches.
       </Text>
       <Link href="/(onboarding)/(info)/interest">ENTER</Link>
     </View>
   );
 }
