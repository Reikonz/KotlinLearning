/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {  
    println("Total is ${getAddition(1,2)}")
    showGreeting()
    showThanks()
}

fun getAddition(num1:Int, num2:Int):Int{
    return num1 + num2
}

fun showGreeting():Unit{
    println("Welcome!")
}

fun showThanks(){
    println("Thank you!")
}
