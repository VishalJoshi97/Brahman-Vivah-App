import { View, Text } from 'react-native'
import React from 'react'
import { Link } from "expo-router";

const Habits = () => {
  return (
    <View>
      <Text>Habits</Text>
      <Link href="/(onboarding)/(info)/hobbies">ENTER</Link>
    </View>
  );
}

export default Habits