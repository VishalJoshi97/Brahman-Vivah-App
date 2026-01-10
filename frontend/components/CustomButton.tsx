import { Pressable, Text } from "react-native";

type Props = {
  title: string;
  onPress: () => void;
};

export default function CustomButton({ title, onPress }: Props) {
  return (
    <Pressable
      onPress={onPress}
      style={{ backgroundColor: "#8B0000", padding: 12, borderRadius: 6 }}
    >
      <Text style={{ color: "white", textAlign: "center" }}>{title}</Text>
    </Pressable>
  );
}
