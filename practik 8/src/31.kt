fun celsiusToFahrenheit(celsius: Double): Double
{
    return celsius * 9.0 / 5.0 + 32.0
}

fun main()
{
    val celsius = 25.0
    val fahrenheit = celsiusToFahrenheit(celsius)
    println("$celsius градусов Цельсия = $fahrenheit градусов Фаренгейта")
}