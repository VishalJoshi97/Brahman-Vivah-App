import { View, Text, TouchableOpacity } from 'react-native'
import React from 'react'
import { Link } from 'expo-router'
import { onboardingStyles as styles } from "../../../styles/onboard.styles";

export default function loading() {
  return (
    <View>
      <Text>Loading</Text>
      <Link href='/(auth)/register'>
        <TouchableOpacity
        >
      <Text style={styles.buttonText}>Next</Text>
        </TouchableOpacity>
      </Link>
    </View>
  )
}