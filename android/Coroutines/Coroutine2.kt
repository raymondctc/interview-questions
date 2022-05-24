//
// Q: Can you spot the problem of this coroutine?
// 
suspend fun doSomething() {
    val job = CoroutineScope(Dispatchers.Default).launch {
        var random = Random.nextInt(100_000)
        while (random != 50000) {
            random = Random.nextInt(100_000)
        }
    }
    delay(500L)
    job.cancel()
}