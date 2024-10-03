fun removeSpaces(str: String): String
{
    return str.replace(" ", "")
}

fun main()
{
    val str = readLine()!!.toString()
    val noSpacesStr = removeSpaces(str)
    println("Строка без пробелов: $noSpacesStr")
}