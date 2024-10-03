fun main()
{
    while (true)
    {
        println("Введите первое число:")
        val num1 = readLine()!!.toDouble()

        println("Введите оператор (+, -, *, /):")
        val operator = readLine()!!

        println("Введите второе число:")
        val num2 = readLine()!!.toDouble()

        val result = when (operator)
        {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> if (num2 == 0.0)
            {
                println("Деление на ноль недопустимо")
                continue
            }
            else
            {
                num1 / num2
            }
            else ->
                {
                println("Неверный оператор")
                continue
            }
        }

        println("Результат: $result")

        println("Хотите продолжить? (да/нет)")
        val continueChoice = readLine()!!

        if (continueChoice != "да")
        {
            break
        }
    }
}