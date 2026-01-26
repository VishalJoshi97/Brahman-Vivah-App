import { View, Text, TextInput } from "react-native";
import React from "react";
import { Link } from "expo-router";
import Shloka from "@/components/Shloka";
import { SHLOKAS } from "@/constants/shlokas";

export default function BdayScreen() {
  return (
    <View style={{ padding: 20 }}>
      <Shloka
        shloka={SHLOKAS.bday.shloka}
        meaning={SHLOKAS.bday.meaning}
        source={SHLOKAS.bday.source}
      />

      <Text style={{ fontSize: 22, fontWeight: "600" }}>
        What is your Birthday?
      </Text>
      <TextInput
        placeholder="Enter Your b-DAY"
        secureTextEntry
        style={{ borderWidth: 1, padding: 10, marginBottom: 20 }}
      />
      <Link href="/(onboarding)/(info)/gender">ENTER</Link>
    </View>
  );
}
