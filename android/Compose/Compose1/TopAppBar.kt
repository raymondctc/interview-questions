// 
// Refer to top_appbar.png
// How can you make this compose function more scalable and reusable?
// 
@Composable
fun TopAppBar(
    navigationIcon: Painter?,
    title: String,
    subtitle: String? = null, // optional
    actions: List<Action> = emptyList(),
)