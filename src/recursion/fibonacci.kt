package recursion

fun fibonacci(n: Int): Int{
    if(n <= 0) return 0
    else if(n in 1..2) return 1

    return fibonacci(n-1) + fibonacci(n-2)
}

fun main(){
    println("fibonacci of position 5 => ${fibonacci(5)}")
    println("fibonacci of position 10 => ${fibonacci(10)}")
    println("fibonacci of position 13 => ${fibonacci(13)}")
}