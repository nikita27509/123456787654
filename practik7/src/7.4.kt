fun main()
{
    println("Введите числа, разделенные пробелами:")
    val input = readLine()!!.split(" ").map { it.toInt() }

    val smallestNumber = findSmallestNumber(input)

    println("Самое маленькое число: $smallestNumber")
}

fun findSmallestNumber(numbers: List<Int>): Int
{
    if (numbers.isEmpty())
    {
        throw IllegalArgumentException("Список чисел не может быть пустым")
    }
    var smallest = numbers[0]
    for (i in 1 until numbers.size)
    {
        if (numbers[i] < smallest)
        {
            smallest = numbers[i]
        }
    }
    return smallest
}