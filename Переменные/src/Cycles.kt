fun main() {
    val arr = arrayOfNulls<Int?>(61)
    for ((index, i) in (300..600 step 5).withIndex()) {
        arr[index] = i
    }
    for (i in arr.size-1 downTo 0){
        println(arr[i])
    }
}