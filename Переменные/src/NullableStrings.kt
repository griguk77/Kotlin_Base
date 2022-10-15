fun main() {
    val name1: String? = "null"
    val name2: String? = null
    val name3: String? = ""
    val sum = (name1?.length?:0) + (name2?.length?:0) + (name3?.length?:0)
    println(sum)
}