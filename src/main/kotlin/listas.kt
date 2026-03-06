// Listas ordenadas

// List
// - listas ordenadas


// MutableList
// - listas ordenadas mutables

fun main() {
    lista()


    println("------------------")

    mutableLista()
}


fun lista() {
    val frutas = listOf<String>("Maçã", "Banana", "Laranja")
    println(frutas)
    // Acessar elementos da lista
    println(frutas[0]) // Saída: Maçã

    if (frutas.contains("Banana")) {
        println("A lista contém Banana")
    } else {
        println("A lista não contém Banana")
    }
}

fun mutableLista() {

    val numeros = mutableListOf<Int>(1, 2, 3, 5, 6, 7)

    numeros.add(8)
    numeros.add(0)
    numeros.remove(2)
    numeros.sorted()
    println(numeros)

    println(numeros.last())
    println(numeros.first())

    // para cada elemento da lista
    numeros.forEach { numeros ->
        println(numeros)

    }
}


// lista.first()
// lista.last()
// lista.contains()
// lista.sorted()