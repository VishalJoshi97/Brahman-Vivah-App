import { View, Text } from 'react-native'
import React from 'react'
import { Tabs } from 'expo-router'

export default function TabLayout() {
  return (
      <Tabs>
          <Tabs.Screen name='home'
          />
          <Tabs.Screen name='chat'
          />
          <Tabs.Screen name='search'
          />
          <Tabs.Screen name='matches'
          />
          <Tabs.Screen name='profile'
          />
      </Tabs>
  )
}