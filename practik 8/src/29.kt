fun findMinMax(array: IntArray): Pair<Int, Int>
{
    if (array.isEmpty())
    {
        throw IllegalArgumentException("Массив не может быть пустым")
    }
    var min = array[0]
    var max = array[0]
    for (i in 1 until array.size)
    {
        if (array[i] < min)
        {
            min = array[i]
        }
        else if (array[i] > max)
        {
            max = array[i]
        }
    }
    return Pair(min, max)
}

fun main()
{
    val numbers = intArrayOf(5, 10, 2, 8, 1)
    val (min, max) = findMinMax(numbers)
    println("Минимальное значение: $min")
    println("Максимальное значение: $max")
}