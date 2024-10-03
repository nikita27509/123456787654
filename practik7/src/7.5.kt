fun main()
{
    println("Введите первое число:")
    val num1 = readLine()!!.toInt()

    println("Введите второе число:")
    val num2 = readLine()!!.toInt()

    val areEqual = areNumbersEqual(num1, num2)

    println("Числа ${if (areEqual) "равны" else "не равны"}")
}

fun areNumbersEqual(num1: Int, num2: Int): Boolean
{
    return num1 == num2
}