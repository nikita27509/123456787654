fun main()
{
    println("Введите слово:")
    val word = readLine()!!.lowercase()

    if (isPalindrome(word))
    {
        println("$word - палиндром")
    }
    else
    {
        println("$word - не палиндром")
    }
}

fun isPalindrome(word: String): Boolean
{
    return word == word.reversed()
}