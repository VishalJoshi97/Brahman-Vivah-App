import { View, Text, TextInput } from "react-native";

export default function Step2({ form, update }: any) {
  return (
    <View>
      <Text>Education</Text>
      <TextInput
        placeholder="e.g. B.Tech"
        value={form.education}
        onChangeText={(val) => update("education", val)}
      />
    </View>
  );
}
