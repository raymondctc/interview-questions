//
// This is a function to fetch usernames from API endpoint 
//
// Q: How can you improve the performance of this coroutine?
//
suspend fun getUsernames(userIds: List<String>): List<String> {
    val firstnames = mutableListOf<String>()
    for (id in userIds) {
        firstname.add(getUserById(id).firstname)
    }
    return firstnames
}
suspend fun getUserById(id: String): User {
    delay(1000L)
    return User(id = id, firstname = “FirstName $id”)
}