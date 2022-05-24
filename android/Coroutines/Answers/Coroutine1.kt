suspend fun getUsernames(userIds: List<String>): List<String> {
    val firstnames = mutableListOf<Deferred<String>>()
    coroutineScope {
        for (id in userIds) {
            val user = async {
                getUserById(id)
            }
            firstname.add(user.firstname)
        }
    }
    
    return firstnames.awaitAll()
}

suspend fun getUserById(id: String): User {
    delay(1000L)
    return User(id = id, firstname = “FirstName $id”)
}