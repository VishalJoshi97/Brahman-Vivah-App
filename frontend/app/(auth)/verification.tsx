// import { Button } from '@rneui/themed'
// <Button title={} onPress={}  />;
import { View, Text } from 'react-native'
import React from 'react'
import { Link } from 'expo-router'

const Verification = () => {
  return (
      <View>
          {/* Email Verification */}
      <Text>Enter Email Verification Code</Text>
          {/* Mobile Number Verification */}
          <Text>Enter OTP  </Text>
          <Link href='/(onboarding)/(info)/name'>Enter</Link>
    </View>
  )
}

export default Verification