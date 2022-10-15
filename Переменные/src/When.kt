fun main() {
    val time = 3
    val weather = true
    val result = when {
        time in 6..22 && weather -> "Гулять"
        time in 6..22 && !weather -> "Читать книгу"
        else -> "Спать"
    }
    println(result)
}