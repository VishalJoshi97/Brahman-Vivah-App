import AsyncStorage from "@react-native-async-storage/async-storage"

export const saveUserId = async (id) => {
    await AsyncStorage.setItem("userId",id.toString())
}

export const getUserId = async () => {
    return await AsyncStorage.getItem("userId")
}