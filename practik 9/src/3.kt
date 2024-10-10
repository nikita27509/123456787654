import java.util.Scanner
fun main ()
{
 val a = Scanner(System.`in`)

    println("Введите сумму в долларах:")
    val amount = a.nextDouble()

    println("Введите курс обмена доллара к евро:")
    val exchangeRate = a.nextDouble()

    val euroAmount = amount * exchangeRate

    println("$amount долларов = $euroAmount евро")
}