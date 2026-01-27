import { View, Text, TextInput } from "react-native";
import React from "react";
import { Link } from "expo-router";
import Shloka from "@/components/Shloka";
import { SHLOKAS } from "@/constants/shlokas";

export default function NameScreen() {
  return (
    <View style={{ padding: 20 }}>
      <Shloka
        shloka={SHLOKAS.name.shloka}
        meaning={SHLOKAS.name.meaning}
        source={SHLOKAS.name.source}
      />

      <Text style={{ fontSize: 22, fontWeight: "600" }}>
        What is your full name?
      </Text>
      <TextInput
        placeholder="Enter Your Full Name"  
        secureTextEntry
        style={{ borderWidth: 1, padding: 10, marginBottom: 20 }}
      />
      <Link href="/(onboarding)/(info)/bday">ENTER</Link>
    </View>
  );
}
