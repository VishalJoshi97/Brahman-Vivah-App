import { View, Text } from "react-native";
import { SafeAreaView } from "react-native-safe-area-context";
import { useEffect } from "react";
import { router } from "expo-router";
import styles from "@/styles/splash.styles";

export default function SplashScreen() {
  useEffect(() => {
    const timer = setTimeout(() => {
      router.replace("/(onboarding)/(intro)/welcome");
    }, 2200);

    return () => clearTimeout(timer);
  }, []);

  return (
    <SafeAreaView style={styles.container}>
      <View style={styles.card}>
        {/* App Icon */}
        <View style={styles.logo}>
          <Text style={styles.logoIcon}>❀</Text>
        </View>

        {/* App Name */}
        <Text style={styles.title}>Brahman Vivah</Text>

        {/* Taglines */}
        <Text style={styles.subtitle}>Community-first Brahmin matrimony</Text>

        <Text style={styles.caption}>
          Connecting souls, preserving traditions.
        </Text>

        {/* Feature Pills */}
        <View style={styles.pillsRow}>
          <View style={styles.pill}>
            <Text style={styles.pillText}>For Brahmin singles & families</Text>
          </View>

          <View style={styles.pill}>
            <Text style={styles.pillText}>Verified community profiles</Text>
          </View>

          <View style={styles.pill}>
            <Text style={styles.pillText}>
              Tradition with a modern experience
            </Text>
          </View>
        </View>

        {/* Dots */}
        <View style={styles.dotsRow}>
          <View style={[styles.dot, styles.activeDot]} />
          <View style={styles.dot} />
          <View style={styles.dot} />
        </View>
      </View>
    </SafeAreaView>
  );
}
