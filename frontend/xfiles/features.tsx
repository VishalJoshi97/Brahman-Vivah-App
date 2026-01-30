import { View, Text, TouchableOpacity } from "react-native";
import { Link } from "expo-router";
import { onboardingStyles as styles } from "../styles/onboard.styles";
 
export default function Features() {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Why Choose Us?</Text>

      <View style={styles.featureList}>
        <Text style={styles.featureItem}>✔ Verified Brahman Profiles</Text>
        <Text style={styles.featureItem}>✔ Privacy & Security First</Text>
        <Text style={styles.featureItem}>✔ Family-Friendly Platform</Text>
      </View>

      <Link href="/(onboarding)/(intro)/getstarted" asChild>
        <TouchableOpacity style={styles.button}>
          <Text style={styles.buttonText}>Next</Text>
        </TouchableOpacity>
      </Link>
    </View>
  );
}
