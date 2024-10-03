fun findElementByIndex(array: IntArray, index: Int): Int?
{
    if (index in 0 until array.size)
    {
        return array[index]
    }
    return null
}

fun main()
{
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val index = 2
    val element = findElementByIndex(numbers, index)
    if (element != null)
    {
        println("Элемент по индексу $index: $element")
    }
    else
    {
        println("Индекс выходит за границы массива")
    }
}