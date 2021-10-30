import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var maxNumber = 0
    var minNumber = 0

    while (sc.hasNext()) {
        val input = sc.nextInt()
        if (input > maxNumber)
            maxNumber = input
        if (minNumber == 0)
            minNumber = input
        if (input < minNumber)
            minNumber = input
    }
    println("$maxNumber $minNumber")
}