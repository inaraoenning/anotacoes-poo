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


//    println("Digite um numero de 1 a 7:")
//    val dia = readln().toInt()
//
//    when (dia) {
//        1 -> println("Domingo")
//        2 -> println("Segunda")
//        3 -> println("Terça")
//        4 -> println("Quarta")
//        5 -> println("Quinta")
//        6 -> println("Sexta")
//        7 -> println("Sábado")
//        else -> println("Número inválido")
//    }
}