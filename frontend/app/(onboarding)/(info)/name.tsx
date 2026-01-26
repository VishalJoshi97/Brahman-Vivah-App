import { View, Text, TextInput } from "react-native";
import React from 'react'
import { Link } from "expo-router";

const Name = () => {
  return (
    <View>
      <Text>May we know your name?</Text>
       <TextInput
              placeholder="Enter Your Name"
              secureTextEntry
              style={{ borderWidth: 1, padding: 10, marginBottom: 20 }}
      />
      <Link href='/(onboarding)/(info)/bday'>ENTER</Link>
    </View>
  )
}

export default Name