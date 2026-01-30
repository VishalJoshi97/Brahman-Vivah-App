import { View, Text, TextInput, Alert, Pressable } from "react-native";
import React, { useEffect, useState } from "react";
import { Link,router } from "expo-router";
import Shloka from "@/components/Shloka";
import { SHLOKAS } from "@/constants/shlokas";
import { registerUser } from "@/api/userApi";
import { getUserId } from "@/utils/storage";


export default function BdayScreen() {

  const [userId, setUserId] = useState<number | null>(null)
  const [bday, setBday] = useState("")
   const [loading, setLoading] = useState(true);

  useEffect(() => {
    const loadUser =async () => {
      const storedId = await getUserId() 
      
      if (!storedId) {
        Alert.alert("Error","User not found")
      }

      setUserId(Number(storedId))//for spring boot
      setLoading(false)
    }
    loadUser()
  },[])


  const handleNext = async () => {
    try {
      if (!bday) {
        Alert.alert("Validation", "Birthday cannot be empty");
        return;
      }

      if (!userId) {
        Alert.alert("Error", "User not loaded yet");
        return;
      }

      await registerUser({
        id: userId,
        bday: bday.toString(),
      });

      router.push("/(onboarding)/(info)/gender");
    } catch (e: any) {
      Alert.alert("Error", e.message);
    }
  };


  return (
    <View style={{ padding: 20 }}>
      <Shloka
        shloka={SHLOKAS.bday.shloka}
        meaning={SHLOKAS.bday.meaning}
        source={SHLOKAS.bday.source}
      />

      <Text style={{ fontSize: 22, fontWeight: "600" }}>
        What is your Birthday?
      </Text>
      <TextInput
        placeholder="Enter Your b-DAY"
        value={bday}
        onChangeText={setBday}
        style={{ borderWidth: 1, padding: 10, marginBottom: 20 }}
      />

      <Pressable
           onPress={handleNext}>
             <Text style={{ color: "red", textAlign: "center" }}>Next</Text>
           </Pressable>

    </View>
  );
}
