//
// Suppose you cancel this job in view model, what will happen and how it should be fixed?
// 
suspend fun riskyTask() {
    try {
        delay(3000L)
        println("The answer is ${10/0}")
    } catch (e: DivisionByZeroException) {
        if (e is CancellationException) {
            throw e
        }
        println("Exception occurred")
    }
}