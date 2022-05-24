//
// Q: What will be the problem of this coroutine when user rotate their device? And how it should be fixed?
// 
class MainActivity: ComponentActivity() {
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val button = findViewById<Button>(R.id.confirm)

        button.setOnClickListener {
            viewModel.submitValueToApi()
        }
    }
}

class MainViewModel: ViewModel() {
    fun submitValueToApi() {
        viewModelScope.launch {
            delay(1000L)
        }
    }
}