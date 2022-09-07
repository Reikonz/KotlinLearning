/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {     
    showGreeting()
    showGreeting("Kenny")
    showGreeting("Kenny", "Glacier")
    showGreeting("Kenny", 2)
}

fun showGreeting(){
    println("Welcome!")
}

fun showGreeting(name:String, city:String="London"){
    println("Welcome $name! from $city")
}

fun showGreeting(name:String, count:Int){
    println("Welcome $name, you number is $count!")
}


