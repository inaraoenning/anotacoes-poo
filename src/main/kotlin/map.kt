fun main() {

    mapas()

    println("------------------")
    mutableMap()
}

fun mapas() {

    // Key - value
    val mapa = mapOf<String, Int>(
        "zero" to 2,
        "tres" to 3
    ) // fim do mapa

    // Acessar o valor invocar a variavel com o nome da chave
    println(mapa["zero"]) // Saída: 0
    // acessar cada key e valor do mapa
}

fun mutableMap() {

    val mutable = mutableMapOf<String, Int>(
        "zero" to 0,
        "um" to 1,
        "dois" to 2
    )
    mutable["zero"] = 3
    mutable["tres"] = 5
    println(mutableMap())

    mutable.forEach { (numeroExtenso, numeroDigito) ->
        println("Chave : $numeroExtenso - Valor: $numeroDigito")
    }
}