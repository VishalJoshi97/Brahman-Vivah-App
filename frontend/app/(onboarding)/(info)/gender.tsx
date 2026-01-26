import { View, Text, } from "react-native";
import React from "react";
import { Link } from "expo-router";
import GenderEnum from "../../../constants/enums"

const Gender = () => {
  return (
    <View>
      <Text>May we know your Gender?</Text>
      <Text>{GenderEnum() +"" }</Text>
      <Link href="/(onboarding)/(info)/sexont">ENTER</Link>
    </View>
  );
};

export default Gender;
