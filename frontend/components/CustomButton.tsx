import { TouchableOpacity, Text, ActivityIndicator } from "react-native";
import { COLORS } from "../../constants/ui";

type Props = {
  title: string;
  onPress: () => void;
  loading?: boolean;
};

export default function CustomButton({ title, onPress, loading }: Props) {
  return (
    <TouchableOpacity
      onPress={onPress}
      style={{
        backgroundColor: COLORS.PRIMARY,
        padding: 14,
        borderRadius: 10,
        alignItems: "center",
        marginVertical: 10,
      }}
      disabled={loading}
    >
      {loading ? (
        <ActivityIndicator color="#fff" />
      ) : (
        <Text style={{ color: "#fff", fontWeight: "bold" }}>{title}</Text>
      )}
    </TouchableOpacity>
  );
}
