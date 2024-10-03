fun printMultiplicationTable(number: Int)
{
    for (i in 1..10)
    {
        println("$number * $i = ${number * i}")
    }
}

fun main()
{
    val number = readLine()!!.toInt()
    println("Таблица умножения для $number:")
    printMultiplicationTable(number)
}