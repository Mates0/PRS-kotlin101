import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextLine()
    var sum = 0
    for (element in input) {
        if (element.code == 49) {
            sum += 1
        }
        if (element.code == 50) {
            sum += 2
        }
        if (element.code == 51) {
            sum += 3
        }
        if (element.code == 52) {
            sum += 4
        }
        if (element.code == 53) {
            sum += 5
        }
        if (element.code == 54) {
            sum += 6
        }
        if (element.code == 55) {
            sum += 7
        }
        if (element.code == 56) {
            sum += 8
        }
        if (element.code == 57) {
            sum += 9
        }
    }
    println(sum)
}