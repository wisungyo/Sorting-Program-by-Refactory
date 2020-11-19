/*
* author: wisungyo
* sorting program written in kotlin
*/

fun main() {
    val input           = readLine()
    val splittedInput   = input?.split(" ")
    val arrayInput      = splittedInput?.map { it.toInt() }?.toMutableList()
    var ifSwap          = false
    var looping         = 0

    do {
        if (arrayInput != null) {
            for (i in 0..arrayInput.size-2) {
                if (arrayInput[i] > arrayInput[i+1]) {
                    ifSwap = true
                    looping++

                    // swap process
                    val temporary   = arrayInput[i]
                    arrayInput[i]   = arrayInput[i+1]
                    arrayInput[i+1] = temporary

                    // print the result after swapping
                    print("${looping}. [${arrayInput[i]},${arrayInput[i+1]}] -> ")
                    for (x in 0 until arrayInput.size) {
                        print("${arrayInput[x]} ")
                    }

                    println()
                    break
                } else {
                    ifSwap = false
                }
            }
        }
    } while (ifSwap)

    print("\nJumlah swap: $looping")
}