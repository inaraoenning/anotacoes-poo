fun main() {

    println("Informe o numero de inicio:")
    val inicio: Int = readln().toInt()

    println("Informe o numero final:")
    val final: Int = readln().toInt()

    println("Intervalo:")
    val intervalo: Int = readln().toInt()

    for (i in inicio downTo final step intervalo) {

        print(" $i ")
    }




    // Loop de 1 a 5
    for (i in 1..5) {
        print(i)
    }


    // Loop decrescente de 5 a 1
    for (i in 5 downTo 1) {
        print(i)
    }

    // Verficar se um numero esta entre 1 e 10
    val numero = 7
    if (numero in 1..10) {
        println("O numero $numero esta entre 1 e 10")
    } else {
        println("O numero $numero nao esta entre 1 e 10")
    }

    // Loop de 0 a 10, pulando de 2 em 2
    for (i in 0..10 step 2) {
        print(i)
    }

    // Loop de 10 a 0, pulando de 2 em 2
    for (i in 10 downTo 0 step 2) {
        print(i)
    }
}