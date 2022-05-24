//
// Q: What is the problem of this compose function?
// How it should be fixed?
@Composable
fun ContactList(
    contancts: List<Contact>,
    comparator: Comparator<Contact>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier) {
        items(contacts.sortedWith(comparator)) { contact -> 
            // ...
        }
    }
}