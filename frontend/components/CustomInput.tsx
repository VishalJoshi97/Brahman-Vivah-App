import { View, TextInput, Text } from "react-native";
import { COLORS } from "../../constants/ui";

type Props = {
  label: string;
  value: string;
  onChange: (val: string) => void;
  secure?: boolean;
};

export default function CustomInput({
  label,
  value,
  onChange,
  secure,
}: Props) {
  return (
    <View style={{ marginBottom: 12 }}>
      <Text>{label}</Text>
      <TextInput
        value={value}
        onChangeText={onChange}
        secureTextEntry={secure}
        style={{
          borderWidth: 1,
          borderColor: COLORS.TEXT,
          padding: 10,
          borderRadius: 8,
          marginTop: 5,
        }}
      />
    </View>
  );
}
