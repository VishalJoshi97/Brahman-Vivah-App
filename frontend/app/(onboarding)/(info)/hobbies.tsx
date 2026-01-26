import { View, Text, } from "react-native";
import React from "react";
import { Link } from "expo-router";
import Shloka from "@/components/Shloka";
import { SHLOKAS } from "@/constants/shlokas";

 export default function HobbiesScreen() {
   return (
     <View style={{ padding: 24 }}>
       <Shloka {...SHLOKAS.hobbies} />

       <Text style={{ fontSize: 22, fontWeight: "600" }}>Your hobbies</Text>

       <Text style={{ marginTop: 8 }}>Share what you enjoy doing.</Text>
       <Link href="/(onboarding)/(info)/langs">ENTER</Link>
     </View>
   );
 }

