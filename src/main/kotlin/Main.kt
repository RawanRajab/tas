fun main() {
    //Write a Kotlin program that draws a right-angled triangle of stars with a height of 5.
    println("Right-Angled Triangle")
    val Height= 5
    for (i in 1..Height) {
        for (j in 1..i) {

            print("* ")
        }
        println()
    }
    //Write a Kotlin program that draws an isosceles triangle of stars with a height of 5
    println(" Isosceles Triangle")
    for (i in 1..Height) {

        for (j in 1..Height - i) {
            print("  ")
        }

        for (k in 1..(2 * i - 1)) {
            print("* ")
        }
        println()
    }
    //Write a Kotlin program that draws a pyramid of stars with a height of 5.
    println(" Pyramid ")
    for (i in 1..Height) {
        // Print leading spaces
        for (j in 1..Height - i) {
            print(" ")
        }
        for (k in 1..(2 * i - 1)) {
            print("*")
        }
        println()

    }
    //Write a Kotlin program that counts the number of vowels (a, e, i, o, u) in the string "Kotlin is awesome".
    println("Counting Vowels in a String")
    val sentence = "Kotlin is awesome"
    var count = 0
    for (char in sentence) {
        if (char.lowercaseChar() in "aeiou") {
            count++
        }
    }
    println("Number of vowels: $count")
    //Write a Kotlin program that reverses the string "Kotlin"
    println(" Reversing a String")
    val t = "Kotlin"
    var reversed = ""
    for (i in t.length - 1 downTo 0) {
        reversed += t[i]

        println("Reversed: $reversed")
    }
    //Write a Kotlin program that filters and prints only the digits from the string "K0t1l1n 2s 4w3s0m3".
    println(" Filtering Digits from a String")
    val SmallSentence = "K0t1l1n 2s 4w3s0m3"
    var digits = ""
    for (char in SmallSentence) {
        if (char.isDigit()) {
            digits += char
        }
    }
    println("Digits: $digits")
    //Write a Kotlin program that splits the string "Kotlin is a great language" into words and prints each word on a new line.
    println(" Splitting a String into Words")
    val smallText = "Kotlin is a great language"
    val words = smallText.split(" ")
    for (word in words) {
        println("Word: $word")
    }
    //Write a Kotlin program that counts the number of words in the string "Kotlin is a great language".
    println("Counting Words in a String")

    var Count = 0
    for (word in words) {
        Count++
    }
    println("Number of words: $Count")

//Write a Kotlin program that removes all spaces from the string "Kotlin is fun" and prints the result.
    val Stext = "Kotlin is fun"
    var RemoveSpaces = ""
    for (char in Stext) {
        if (char != ' ') {
            RemoveSpaces += char
        }
    }
    println("Text without spaces: $RemoveSpaces")

}
