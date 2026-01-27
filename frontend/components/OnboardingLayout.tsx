import { View } from "react-native";
import ProgressIndicator from "./ProgressIndicator";
import Shloka from "@/components/Shloka";

type Props = {
  children: React.ReactNode;
  shloka: {
    shloka: string;
    meaning?: string;
    source?: string;
  };
  currentStep: number;
  totalSteps: number;
};

export default function OnboardingLayout({
  children,
  shloka,
  currentStep,
  totalSteps,
}: Props) {
  return (
    <View style={{ flex: 1, padding: 24 }}>
      <ProgressIndicator totalSteps={totalSteps} currentStep={currentStep} />

      <Shloka {...shloka} />

      <View style={{ flex: 1 }}>{children}</View>
    </View>
  );
}
