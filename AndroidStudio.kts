// Composable is a decorator that tells the compiler that this function is used to describe part of the UI
// OnCreate is the entry point of the app UI and looks for fucntions with the Composable decorator
// Modifier is used to modify the UI element
// Preview is used to preview the composable function in the design view
@Preview(showBackground= true )
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}