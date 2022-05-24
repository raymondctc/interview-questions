// 
// Q: If you call this function directly in view model, what will be the problem and how do you fix it?
// 
suspend fun doNetworkCall(): Result<String> {
    val result = networkCall()
    return if (result == "Success") {
        Result.success(result)
    } else Result.failure(HttpException("Network error"))
}

suspend fun networkCall(): String {
    delay(3000L)
    return if (Random.nextBoolean()) "Success" else "Error"
}