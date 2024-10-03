fun sumList(list: List<Int>): Int {
    return list.sum()
}
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = sumList(numbers)
    println("Сумма элементов списка: $sum")
}