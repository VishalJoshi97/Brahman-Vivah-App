import { View, Text, TextInput } from "react-native";
import React from "react";
import { Link } from "expo-router";

const Bday = () => {
  return (
    <View>
      <Text>May we know your b-day?</Text>
      <TextInput
        placeholder="Enter Your B-day"
        secureTextEntry
        style={{ borderWidth: 1, padding: 10, marginBottom: 20 }}
      />
      <Link href="/(onboarding)/(info)/gender">ENTER</Link>
    </View>
  );
};

export default Bday;
