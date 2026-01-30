export const BASE_URL = "http://localhost:9090/api/users";

export const registerUser=async (payload)=>{
    const response = await fetch(
        `${BASE_URL}/register`, {
            method: "POST",
            headers: {
                "Content-Type":"application/json"
            },
            body:JSON.stringify(payload)
        }
    )

    if (!response.ok) {
        const err = await response.text()
        throw new Error(err)
    }

    return response.json()
}