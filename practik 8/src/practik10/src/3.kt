fun main()
{
    println("Введите текст для шифрования:")
    val text = readLine() ?: ""
    println("Введите сдвиг:")
    val shift = readLine()?.toIntOrNull() ?: 0

    val encryptedText = caesarCipher(text, shift)
    println("Зашифрованный текст: $encryptedText")
}

fun caesarCipher(text: String, shift: Int): String
{
    val alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя"
    val shiftedAlphabet = alphabet.substring(shift) + alphabet.substring(0, shift)
    return text.toLowerCase().map {
        if (it in alphabet)
        {
            shiftedAlphabet[alphabet.indexOf(it)]
        } else
        {
            it
        }
    }.joinToString("")
}