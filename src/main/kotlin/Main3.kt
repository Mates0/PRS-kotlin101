import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine()
    var sum = 0
    for (i in 1 until input.length + 1) {
        if (i % 2 == 0) {
            if (Character.getNumericValue(input[i]) % 3 == 0) {
                sum += Character.getNumericValue(input[i])
            }
        }
    }
    println(sum)
}