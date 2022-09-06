/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {  
	calculate(12, 8)
    calculate(20, 8)
    calculate(12, 12)
}

fun calculate(firstNumber:Int, secondNumber:Int){
    printStartingPart()
    println("First number is $firstNumber")
    println("Second number is $secondNumber")
    println("Addition of them is ${firstNumber+secondNumber}")
    println("Subtraction of them is ${firstNumber-secondNumber}")
    printEndingPart()
}

fun printStartingPart(){
    println("********************************")
    println("CalBot Started")
    println("")
    
}

fun printEndingPart(){
    println("")
    println("CalBot Ended")
    println("********************************")
}
