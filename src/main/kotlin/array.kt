fun main() {

    colecoes()


}


fun colecoes() {
    // Array de inteiros
    val letras = arrayOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J")

    val numeros = intArrayOf(1, 2, 3, 4, 5)

    for (i in 0 until letras.size) {
//        println("Número: ${numeros[i]} index: ${numeros.indexOf(numeros[i])}")

        if (numeros.size < letras.size) {
            println("Número: ${numeros[i]} Letra: ${letras[i]}")
        }


        // Verificar se o número é par ou ímpar
//        if (numeros[i] % 2 == 0) {
//            print("$i - Par\n")
//
//        } else print("$i - Impar\n")
    }


    // Array simples

//    val palavras = arrayOf("Olá", "Mundo", "Kotlin")
//    println(palavras[0]) // Saída: Olá
//    println(palavras[1]) // Saída: Mundo
//    println(palavras[2]) // Saída: Kotlin

}