import { View, Text } from "react-native";
import styles from "@/styles/shloka.styles";

type ShlokaProps = {
  shloka: string;
  meaning?: string;
  source?: string;
};

export default function Shloka({ shloka, meaning, source }: ShlokaProps) {
  return (
    <View style={styles.container}>
      <Text style={styles.shlokaText}>{shloka}</Text>

      {meaning && <Text style={styles.meaningText}>{meaning}</Text>}

      {source && <Text style={styles.sourceText}>— {source}</Text>}
    </View>
  );
}
