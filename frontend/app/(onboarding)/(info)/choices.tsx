import { View, Text, } from "react-native";
import React from "react";
import { Link } from "expo-router";
import Shloka from "@/components/Shloka";
import { SHLOKAS } from "@/constants/shlokas";

 export default function ChoicesScreen() {
   return (
     <View style={{ padding: 24 }}>
       <Shloka {...SHLOKAS.choices} />

       <Text style={{ fontSize: 22, fontWeight: "600" }}>Your preferences</Text>

       <Text style={{ marginTop: 8 }}>Choose what matters most to you.</Text>
       <Link href="/(onboarding)/(info)/habits">ENTER</Link>
     </View>
   );
 }

