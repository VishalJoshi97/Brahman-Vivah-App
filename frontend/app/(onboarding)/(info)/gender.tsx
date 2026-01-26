import { View, Text,  } from "react-native";
import React from "react";
import { Link } from "expo-router";
import Shloka from "@/components/Shloka";
import { SHLOKAS } from "@/constants/shlokas";
import GenderEnum from "../../../constants/enums";

// const Gender = () => {
//   return (
//     <View>
//       <Text>May we know your Gender?</Text>
//       <Text>{GenderEnum() + ""}</Text>
//       <Link href="/(onboarding)/(info)/sexont">ENTER</Link>
//     </View>
//   );
// };

// export default Gender;
export default function GenderScreen() {
  return (
    <View style={{ padding: 24 }}>
      <Shloka {...SHLOKAS.gender} />

      <Text style={{ fontSize: 22, fontWeight: "600" }}>Your gender</Text>
      <Text>{GenderEnum() + ""}</Text>
      <Text style={{ marginTop: 8 }}>Select the gender you identify with.</Text>
      <Link href="/(onboarding)/(info)/sexont">ENTER</Link>
    </View>
  );
}

