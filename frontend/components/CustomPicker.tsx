import { View } from "react-native";
import { Picker } from "@react-native-picker/picker";

type Option = {
  label: string;
  value: string;
};

type Props = {
  value: string | null;
  onChange: (val: string) => void;
  options: Option[];
};

export default function CustomPicker({ value, onChange, options }: Props) {
  return (
    <View>
      <Picker
        selectedValue={value}
        onValueChange={(val) => onChange(val)}
      >
        <Picker.Item label="Select..." value={null} />
        {options.map((opt) => (
          <Picker.Item key={opt.value} label={opt.label} value={opt.value} />
        ))}
      </Picker>
    </View>
  );
}
