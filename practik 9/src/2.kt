fun main()
{
    val text = readLine()!!.toString()

    var vowelCount = 0
    var consonantCount = 0

    for (char in text)
    {
        if (char.isLetter())
        {
            if (char.toLowerCase() in "аоуэыяёюеи")
            {
                vowelCount++
            }
            else
            {
                consonantCount++
            }
        }
    }

    println("Гласных: $vowelCount")
    println("Согласных: $consonantCount")
}