fun containsSubstring(str: String, substring: String): Boolean
{
    return str.contains(substring)
}
fun main()
{
    val str = readLine()!!.toString()
    val substring = readLine()!!.toString()
    val contains = containsSubstring(str, substring)
    println("Строка '$str' содержит подстроку '$substring': $contains")
}