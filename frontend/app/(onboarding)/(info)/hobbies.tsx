import { View, Text } from 'react-native'
import React from 'react'
import { Link } from "expo-router";

const Hobbies = () => {
  return (
    <View>
      <Text>Hobbies</Text>
      {/* <Link href="/(onboarding)/(info)/interest">ENTER</Link> */}
      <Link href="/(onboarding)/(info)/langs">ENTER</Link>
    </View>
  );
}

export default Hobbies