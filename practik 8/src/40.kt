fun copyArray(array: IntArray): IntArray
{
    val newArray = array.copyOf()
    return newArray
}

fun main()
{
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    val copiedNumbers = copyArray(numbers)
    println("Скопированный массив: ${copiedNumbers.contentToString()}")
}