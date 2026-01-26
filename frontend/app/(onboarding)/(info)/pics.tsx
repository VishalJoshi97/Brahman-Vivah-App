import { View, Text,  } from "react-native";
import React from "react";
import { Link } from "expo-router";
import Shloka from "@/components/Shloka";
import { SHLOKAS } from "@/constants/shlokas";

export default function PicturesScreen() {
  return (
    <View style={{ padding: 24 }}>
      <Shloka {...SHLOKAS.pics} />

      <Text style={{ fontSize: 22, fontWeight: "600" }}>Upload photos</Text>

      <Text style={{ marginTop: 8 }}>Clear photos help build trust.</Text>
      <Link href="/(tabs)/home">ENTER</Link>
    </View>
  );
}

