fun printNumber(n: Int): List<Int>
{
    if (n == 0)
    {
        return emptyList()
    } else
    {
        val numbers = mutableListOf<Int>()
        for (i in n downTo 1)
        {
            numbers.add(i)
        }
        return numbers
    }
}

fun main()
{
    println(printNumber(0))
    println(printNumber(2))
    println(printNumber(7))
}