fun main() {
  sum()
}

fun sum(){
    println("How many nunbers will you enter?")
    val amountOfNumbers = readln().toIntOrNull() ?: 0

    var sum = 0
    var i = 0
    while (i < amountOfNumbers){
        println("Please enter number #${i + 1}")
        val number = readln().toIntOrNull() ?: continue
        sum += number
        i++
    }

    println("The total sum is: $sum")
}