fun sumFromOneToN(n: Int): Int
{
    return (1..n).sum()
}

fun main()
{
    val n = readLine()!!.toInt()
    val sum = sumFromOneToN(n)
    println("Сумма чисел от 1 до $n: $sum")
}