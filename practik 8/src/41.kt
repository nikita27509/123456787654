fun countVowels(str: String): Int
{
    val vowels = "aeiouAEIOU"
    var count = 0
    for (char in str)
    {
        if (char in vowels)
        {
            count++
        }
    }
    return count
}

fun main()
{
    val str = readLine()!!.toString()
    val vowelCount = countVowels(str)
    println("Количество гласных в строке '$str': $vowelCount")
}