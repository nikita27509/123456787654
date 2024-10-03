fun createArray(n: Int): IntArray
{
    return IntArray(n) { it + 1 }
}

fun main()
{
    val n = readLine()!!.toInt()
    val array = createArray(n)
    println("Массив от 1 до $n: ${array.contentToString()}")
}