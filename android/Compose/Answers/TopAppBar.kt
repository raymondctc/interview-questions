@Composable
fun TopAppBar(
    navigationIcon: @Composable (() -> Unit)? = null,
    title: @Composable () -> Unit,
    actions: @Composable (RowScope.() -> Unit)? = null,
    // ...
)