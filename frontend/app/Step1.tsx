import { View, Text, TextInput } from "react-native";
import GenderPicker from "../GenderPicker";

export default function Step1({ form, update }: any) {
  return (
    <View>
      <Text>Select Gender</Text>
      <GenderPicker
        value={form.gender}
        onChange={(val) => update("gender", val)}
      />

      <Text>Date of Birth</Text>
      <TextInput
        placeholder="YYYY-MM-DD"
        value={form.dob}
        onChangeText={(val) => update("dob", val)}
      />
    </View>
  );
}
