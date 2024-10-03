fun sumOfFirstN(n: Int): Int
{
    return (1..n).sum()
}

fun main()
{
    val n = readLine()!!.toInt()
    val sum = sumOfFirstN(n)
    println("Сумма первых $n натуральных чисел: $sum")
}