fun main() {
    println("Place enter a number: ")
    val input = readln()
    val inputAsInteger = input.toIntOrNull()
    if (inputAsInteger != null) {
        val output = if (inputAsInteger % 2 == 0) {
            "The number is even!"
        } else if (inputAsInteger < 10) {
            "The number is odd and less than 10"
        } else {
            "The number is odd and at least 11"
        }

        println(output)
    } else {
        println("Dude, enter a valid number!")
    }
}