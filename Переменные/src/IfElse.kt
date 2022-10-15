fun main() {
    val sum = 100
    val food = if (sum < 200) {
        println("Вы в дошираке")
        "доширак"
    } else if (sum < 500) {
        "шаурма"
    } else {
        null
    }
    println("Вы можете позволить себе купить: $food, длина этого слова равна: ${food?.length ?: 0}")
}