import { View, Text, TouchableOpacity } from "react-native";
import { COLORS } from "../../constants/ui";

type Props = {
  options: string[];
  selected: string[];
  onChange: (val: string[]) => void;
};

export default function MultiSelectChip({
  options,
  selected,
  onChange,
}: Props) {
  const toggle = (item: string) => {
    if (selected.includes(item)) {
      onChange(selected.filter((i) => i !== item));
    } else {
      onChange([...selected, item]);
    }
  };

  return (
    <View style={{ flexDirection: "row", flexWrap: "wrap" }}>
      {options.map((item) => {
        const isSelected = selected.includes(item);

        return (
          <TouchableOpacity
            key={item}
            onPress={() => toggle(item)}
            style={{
              backgroundColor: isSelected
                ? COLORS.PRIMARY
                : "#ccc",
              padding: 8,
              borderRadius: 20,
              margin: 5,
            }}
          >
            <Text style={{ color: "#fff" }}>{item}</Text>
          </TouchableOpacity>
        );
      })}
    </View>
  );
}
