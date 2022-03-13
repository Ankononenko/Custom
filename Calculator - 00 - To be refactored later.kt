import kotlin.properties.Delegates

// Here we're going to create a calculator. Operations that we want to deploy are:
// 1 - sum, 2 - minus, 3 - multiply, 4 - division, 5 - raise to the power of, 6 - extract the root,
// 7 - get percentage of the number

private var finalSum by Delegates.notNull<Double>()

fun <Number> sum (vararg numbers: Number): Double {
    finalSum = 0.0
    for (number in numbers) {
        when (number) {
            is Int -> finalSum += number
            is Double -> finalSum += number
        }
    }
    return finalSum
}

fun <Number> minus (vararg numbers: Number): Double {
    finalSum = 0.0
    for (number in numbers) {
        when (number) {
            is Int -> finalSum -= number
            is Double -> finalSum -= number
        }
    }
    return finalSum
}

fun <Number> multiply (vararg numbers: Number): Double {
    finalSum = numbers[0].toString().toDouble()
    for (number in numbers) {
        when (number) {
            is Int -> finalSum *= number
            is Double -> finalSum *= number
        }
    }
    return finalSum
}

fun <Number> division (vararg numbers: Number): Double {
    finalSum = numbers[0].toString().toDouble()
    for (number in numbers) {
        when (number) {
            is Int -> finalSum /= number
            is Double -> finalSum /= number
        }
    }
    return finalSum
}

fun raiseToThePowerOf (number: Int, exponent: Int): Int {
    finalSum = 0.0
    repeat(exponent - 1) {
        finalSum += number * number
    }
    return finalSum.toInt()
}

fun extractTheRoot (number: Int): Double {
    val lenghtOfTheNum: Int = number.toString().length + 1
    var startingPosition: Double = lenghtOfTheNum * 100.0
    if (number == 0 || number == 1)
        startingPosition = number.toDouble()
    else {
        while ((startingPosition * startingPosition).toInt() != number) {
            startingPosition = 0.5 * (startingPosition + (number / startingPosition))
        }
    }
    return startingPosition
}

fun getPercentageOf (numberToCountPercentageOf: Int, numberToConvertToPercentage: Int): String {
    return ("${(numberToConvertToPercentage.toDouble() / (numberToCountPercentageOf.toDouble() / 100))}%")
}

fun main (){
    println(getPercentageOf(15, 2))
}
