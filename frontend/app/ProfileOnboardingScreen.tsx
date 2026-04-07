import { useState } from "react";
import { View, Button } from "react-native";
import Step1 from "../components/onboarding/Step1";
import Step2 from "../components/onboarding/Step2";
import Step3 from "../components/onboarding/Step3";
import Step4 from "../components/onboarding/Step4";
import { useAuthContext } from "../context/AuthContext";
import { postProfile } from "../api/profile.api";

export default function ProfileOnboardingScreen() {
  const [step, setStep] = useState(1);
  const { userId } = useAuthContext();

  const [form, setForm] = useState({
    gender: null,
    dob: "",
    education: "",
    hobbies: [] as string[],
  });

  const next = () => setStep((s) => s + 1);
  const back = () => setStep((s) => s - 1);

  const update = (key: string, value: any) => {
    setForm((prev) => ({ ...prev, [key]: value }));
  };

  const submit = async () => {
    if (!userId) return;

    await postProfile(userId, form);
  };

  return (
    <View>
      {step === 1 && <Step1 form={form} update={update} />}
      {step === 2 && <Step2 form={form} update={update} />}
      {step === 3 && <Step3 form={form} update={update} />}
      {step === 4 && <Step4 form={form} />}

      <View style={{ flexDirection: "row", marginTop: 20 }}>
        {step > 1 && <Button title="Back" onPress={back} />}
        {step < 4 ? (
          <Button title="Next" onPress={next} />
        ) : (
          <Button title="Submit" onPress={submit} />
        )}
      </View>
    </View>
  );
}
