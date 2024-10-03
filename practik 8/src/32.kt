fun reverseString(str: String): String
{
    return str.reversed()
}

fun main()
{
    val str = readLine()!!.toString()
    val reversedStr = reverseString(str)
    println("Перевернутая строка: $reversedStr")
}