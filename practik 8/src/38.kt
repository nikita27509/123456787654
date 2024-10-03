fun stringLength(str: String): Int
{
    return str.length
}

fun main()
{
    val str = readLine()!!.toString()
    val length = stringLength(str)
    println("Длина строки '$str': $length")
}