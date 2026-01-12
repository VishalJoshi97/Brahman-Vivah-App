import { View, Text, TouchableOpacity } from "react-native";
import { Link } from "expo-router";
import { onboardingStyles as styles } from "../../styles/onboard.styles";
 
export default function GetStarted() {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Let’s Get Started</Text>

      <Text style={styles.subtitle}>
        Create your profile and begin your journey towards a meaningful match.
      </Text>

          {/* power of link-wrap touch->text */}
      <Link href="/(auth)/login" replace asChild>
        <TouchableOpacity style={styles.button}>
          <Text style={styles.buttonText}>Continue</Text>
        </TouchableOpacity>
      </Link>

      <Text style={styles.skipText}>
        You can update your profile anytime later
      </Text>
    </View>
  );
}
