fun main() {

    // Printar numeros e operação
    println(
        """Informe a operação ex(num+num)
Operações disponíveis: + - * /
"""
    )
    // Ler numeros e operação
    val operacao = readln()

    // Separar numeros e operação
    if (operacao.contains("+")) {
        val operador = operacao.split("+")
        val soma = separar(operacao, "+")
    }; if (operacao.contains("-")) {
        val operador = operacao.split("-")
        val subtracao = separar(operacao, "-")
    }; if (operacao.contains("*")) {
        val operador = operacao.split("*")
        val multiplacao = separar(operacao, "*")
    }; if (operacao.contains("/")) {
        val separar = operacao.split("/")
        val divisao = separar(operacao, "/")
    }
}

fun separar(operacao: String, simbolo: String) {
    val separar = operacao.split(simbolo)
    val resultado = when (simbolo) {
        "+" -> separar[0].trim().toInt() + separar[1].trim().toInt()
        "-" -> separar[0].trim().toInt() - separar[1].trim().toInt()
        "*" -> separar[0].trim().toInt() * separar[1].trim().toInt()
        "/" -> if (separar[1].trim().toInt() == 0) {
            println("Não é divisivel por 0")
            return
        } else separar[0].trim().toInt() / separar[1].trim().toInt()

        else -> return
    }
    println("${separar[0]} $simbolo ${separar[1]} = $resultado")
}