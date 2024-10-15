fun generatePyramid(n: Int): List<String>
{
    val pyramid = mutableListOf<String>()
    for (i in 1..n)
    {
        val spaces = " ".repeat(n - i)
        val hashes = "#".repeat(i * 2 - 1)
        val row = spaces + hashes + spaces
        pyramid.add(row)
    }
    return pyramid
}

fun main()
{
    val n = readLine()!!.toInt()
    val pyramid = generatePyramid(n)
    pyramid.forEach { println(it) }
}