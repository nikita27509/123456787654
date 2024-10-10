fun main ()
{
    print("Введите число")
    for ( a in 1 .. readLine()!!.toInt() step 2)
    {

        print("$a ")
    }

}