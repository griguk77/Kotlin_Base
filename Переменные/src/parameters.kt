fun main() {
    println("Объём параллелепипеда равен ${volume(3, 5, 9)}")
}

fun volume (a: Int, b: Int = a, c: Int = a) = a * b * c