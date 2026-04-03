import { Gender } from "../enums/Gender";
import { GenderLabel } from "../enums/GenderLabel";

export const useGender = () => {
  const options = Object.values(Gender).map((gender) => ({
    value: gender,
    label: GenderLabel[gender],
  }));

  return { options };
};
