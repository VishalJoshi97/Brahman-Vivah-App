import { View, Text, TextInput, Pressable ,Alert} from "react-native";
import React, { useEffect, useState } from "react";
import { Link, router } from "expo-router";
import Shloka from "@/components/Shloka";
import { SHLOKAS } from "@/constants/shlokas";
import { registerUser } from "@/api/userApi"
import { getUserId, } from "@/utils/storage";


export default function NameScreen() {

  const [name, setName] = useState("")
  const [userId,setUserId]=useState<number | null>(null)
  const [loading, setLoading] = useState(true);

  //get userId first
  useEffect(() => {
    const loadUserId = async () => {
      const storedId = await getUserId()
      
      if (!storedId) {
        Alert.alert("Error", "User not found.")
        return;
      }

      setUserId(Number(storedId))
      setLoading(false)

    }
    loadUserId()
  }, [])

  const handleNext = async () => {
    try {
      if (!name.trim()) {
        Alert.alert("Validation", "Name cannot be empty");
        return;
      }

      if (!userId) {
        Alert.alert("Error", "User not loaded yet");
        return;
      }
      await registerUser({ id: userId, name: name.trim() });
      // await setName
      router.push("/(onboarding)/(info)/bday")
    } catch (e:any) {
      Alert.alert("Error", e.message);
    }
  }
  return (
    <View style={{ padding: 20 }}>
      <Shloka
        shloka={SHLOKAS.name.shloka}
        meaning={SHLOKAS.name.meaning}
        source={SHLOKAS.name.source}
      />

      <Text style={{ fontSize: 22, fontWeight: "600" }}>
        May We Know Your name?
      </Text>
      <TextInput
        placeholder="Your Name"
        value={name}
        onChangeText={setName}
        style={{ borderWidth: 1, padding: 10, marginBottom: 20 }}
      />

      <Pressable
      onPress={handleNext}>
        <Text style={{ color: "red", textAlign: "center" }}>Next</Text>
      </Pressable>
    </View>
  );
}
