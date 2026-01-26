import { View, Text,  } from "react-native";
import React from "react";
import { Link } from "expo-router";
import Shloka from "@/components/Shloka";
import { SHLOKAS } from "@/constants/shlokas";

 export default function HabitsScreen() {
   return (
     <View style={{ padding: 24 }}>
       <Shloka {...SHLOKAS.habits} />

       <Text style={{ fontSize: 22, fontWeight: "600" }}>Lifestyle habits</Text>

       <Text style={{ marginTop: 8 }}>Habits influence long-term harmony.</Text>
       <Link href="/(onboarding)/(info)/hobbies">ENTER</Link>
     </View>
   );
 }

