import { View, Text, Image, Pressable } from "react-native";
import { SafeAreaView } from "react-native-safe-area-context";
import { router } from "expo-router";
import styles from "../../../styles/welcome.styles";

export default function Welcome() {
  return (
    <SafeAreaView style={styles.container}>
      <View style={styles.wrapper}>
        {/* Hero Image */}
        <Image
          source={require("../../../assets/svgs/image.png")}
          style={styles.image}
        />

        {/* Content */}
        <View style={styles.content}>
          {/* Header */}
          <View style={styles.header}>
            <View style={styles.logo}>
              <Text style={styles.logoText}>ॐ</Text>
            </View>
            <Text style={styles.appName}>Brahman Vivah</Text>
          </View>

          {/* Title */}
          <Text style={styles.title}>
            Find your perfect soulmate within the community.
          </Text>

          {/* Subtitle */}
          <Text style={styles.subtitle}>
            Join thousands of verified members finding meaningful connections
            and lasting relationships every day.
          </Text>

          {/* CTA */}
          <Pressable
            style={styles.primaryButton}
            onPress={() => router.push("/(auth)/createAcc")}
          >
            <Text style={styles.primaryButtonText}>Get Started</Text>
          </Pressable>

          <Pressable
            style={styles.secondaryButton}
            onPress={() => router.push("/(tabs)/home")}
          >
            <Text style={styles.secondaryButtonText}>
              I already have an account
            </Text>
          </Pressable>

          <Pressable>
            <Text style={styles.guestText}>Browse as Guest</Text>
          </Pressable>

          {/* Trust Badges */}
          <View style={styles.trustRow}>
            <View style={styles.trustItem}>
              <Text style={styles.trustIcon}>✔</Text>
              <Text style={styles.trustTitle}>100% Verified</Text>
              <Text style={styles.trustDesc}>Manually screened profiles</Text>
            </View>

            <View style={styles.trustItem}>
              <Text style={styles.trustIcon}>🔒</Text>
              <Text style={styles.trustTitle}>Private & Secure</Text>
              <Text style={styles.trustDesc}>
                Your data is always protected
              </Text>
            </View>
          </View>
        </View>
      </View>
    </SafeAreaView>
  );
}
