fun main()
{
    println("Введите строку:")
    val inputString = readLine()!!.toString()

    val outputString = inputString.map{
        if (it.isUpperCase())
        {
            it.toLowerCase()
        }
        else if (it.isLowerCase())
        {
            it.toUpperCase()
        }
        else
        {
            it
        }
    }.joinToString("")

    println("Измененная строка: $outputString")
}