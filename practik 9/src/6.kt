fun sortStrings(tresh: Array<String>): Array<String>
{
    return tresh.sortedArray()
}
fun main()
{
    val a = arrayOf("Полина", "Ян", "Толя", "Никита", "Олеся","Миша","Слава","Влада","Денис")

    val b = sortStrings(a)

    println("Отсортированный массив строк: ${b.joinToString(", ")}")
}