fun main() {

    println("Digite um numero de 1 a 7:")
    val dia = readln().toInt()

    when (dia) {
        1 -> println("Domingo")
        2 -> println("Segunda")
        3 -> println("Terça")
        4 -> println("Quarta")
        5 -> println("Quinta")
        6 -> println("Sexta")
        7 -> println("Sábado")
        else -> println("Número inválido")
    }
}