fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val searchElement = 5

    // Поиск элемента
    val index = numbers.indexOf(searchElement)

    if (index != -1) {
        println("Элемент $searchElement найден по индексу $index")
    } else {
        println("Элемент $searchElement не найден в массиве")
    }
}