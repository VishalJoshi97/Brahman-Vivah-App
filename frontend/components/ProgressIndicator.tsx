import { View } from "react-native";

type Props = {
  totalSteps: number;
  currentStep: number; // 1-based index
};

export default function ProgressIndicator({ totalSteps, currentStep }: Props) {
  return (
    <View
      style={{
        flexDirection: "row",
        gap: 6,
        marginBottom: 16,
      }}
    >
      {Array.from({ length: totalSteps }).map((_, index) => {
        const isActive = index + 1 <= currentStep;

        return (
          <View
            key={index}
            style={{
              flex: 1,
              height: 6,
              borderRadius: 6,
              backgroundColor: isActive ? "#E67E22" : "#E0E0E0",
            }}
          />
        );
      })}
    </View>
  );
}
