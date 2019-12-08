package recursion

fun factorial(n: Int): Int {
    println(n)
    return if (n == 0) 1
    else n * factorial(n - 1)
}

fun main() {
    println("Factorial of 10 => ${factorial(10)}")
    //println("Factorial of 10 => ${factorial(20)}")
    //println("Factorial of 10 => ${factorial(30)}")
}