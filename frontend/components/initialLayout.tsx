import { useAuth } from "@clerk/clerk-expo";
import { Stack, useRouter, useSegments } from "expo-router";
import { useEffect } from "react";

export default function InitialLayout() {
  const { isLoaded, isSignedIn } = useAuth();
  const segments = useSegments();
  const router = useRouter();

  useEffect(() => {
    if (!isLoaded) return; //Stops logic from running before Clerk is ready
    const inAuthScreen = segments[0] === "(auth)"; //check any (auth) route

    if (!isSignedIn && !inAuthScreen) router.replace("/(auth)/login");
    else if (isSignedIn && inAuthScreen) router.replace("/(tabs)/home");
  }, [isLoaded, isSignedIn, segments]);

  if (!isLoaded) return null; //Prevents rendering anything until Clerk is ready
  return <Stack screenOptions={{ headerShown: false }} />;
}