import { View, Text } from "react-native";
import React from "react";
import { Link } from "expo-router";

const Choices = () => {
  return (
    <View>
      <Text>May we know your Choices?</Text>
       
      <Link href="/(onboarding)/(info)/habits">ENTER</Link>
    </View>
  );
};

export default Choices;
