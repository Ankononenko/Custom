import java.lang.IllegalArgumentException

// Here we're going to create a calculator. Operations that we want to deploy are:
// 1 - sum, 2 - minus, 3 - multiply, 4 - division, 5 - raise to the power of, 6 - get percentage of the number
// Here we take user input for a change and do some refactoring compared to the 00 version

fun main (vararg args: String) {
    println("Please enter an arithmetic problem in format '1 + 3'")
    var input = readLine()
    while (input != null && input.isNotBlank()) {

        val values = input.split(" ")
        val firstNumber = values[0].toDouble()
        val secondNumber = values[2].toDouble()

         try {
             val operator = values[1]
                when(operator) {
                    "+" -> println(firstNumber + secondNumber)
                    "-" -> println(firstNumber - secondNumber)
                    "*" -> println(firstNumber * secondNumber)
                    "/" -> println(firstNumber / secondNumber)
                    "^" -> {
                        var result = 0.0
                        repeat(values[2].toInt()) {
                            result += firstNumber * firstNumber
                        }
                        println(result)
                    }
                    "%" -> println("${(secondNumber / (firstNumber / 100))}%")
                    
                    else -> throw IllegalArgumentException("Invalid operator $operator")
                }
         } catch (exception: IndexOutOfBoundsException) {
             println("There should be spaces in between the numbers")
         }
        input = readLine()
    }
    println("Goodbye!")
}
