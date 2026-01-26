import { View, Text, TouchableOpacity } from "react-native";
import { Link } from "expo-router";
import { onboardingStyles as styles } from "../../../styles/onboard.styles";

export default function Welcome() {
  return (
    <View style={styles.container}>
      <Text style={styles.title}>Welcome to Brahman Vivah</Text>

      <Text style={styles.subtitle}>
        Find your life partner within the Brahman community with trust and
        tradition.
      </Text>

      <Link href="/(tabs)/home" asChild>
        <TouchableOpacity style={styles.button}>
          <Text style={styles.buttonText}>Next</Text>
        </TouchableOpacity>
      </Link>
    </View>
  );
}
