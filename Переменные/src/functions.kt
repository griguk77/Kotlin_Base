import kotlin.math.min

fun main() {
    //println(cut("BigiPigi"))
    //println(sum(2, 5, 1, 9, 0, -2, 3))
    //val mutList: MutableList<Int> = mutableListOf(2, 5, 1, 9, 0, -2, 3, 5)
    //val list = sort(mutList)
    //val arr = arrayOf(2, 5, 1, 9, 0, -2, 3, 5)
    //val list = sort(arr)
    //val list = sort(2, 5, 1, 9, 0, -2, 3, 5)
    //for (i in list) {
      //  println(i)
    //}
}

fun cut(s: String) = s.substring(0, min(5, s.length))

fun sum(vararg x: Int): Int {
    var s = 0
    for (i in x) {
        s += i
    }
    return s
}

fun sort(x: MutableList<Int>): List<Int> {
    for (i in x.indices) {
        for (j in x.size - 1 downTo i + 1) {
            if (x[j] < x[j - 1]) {
                val c = x[j]
                x[j] = x[j - 1]
                x[j - 1] = c
            }
        }
    }
    return x
}


fun sort(x: Array<Int>) = sort(x.toMutableList())


fun sort(vararg x: Int) = sort(x.toMutableList())