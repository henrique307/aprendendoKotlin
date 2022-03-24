fun main() {

    // val titular : String = "Henrique";
    val numeros: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9);
    // val idade : Int = 10;
    // val idadeExata : Double = 10.3;

    // println("titular: $titular ");

    quantosPares(numeros)
}

class Conta {
    var nome = "henrique";
    var quantidadeDePenises = 1;
    var jaJogouLol = true;
    var ehBom = "depende";
}

fun quantosPares(array: IntArray) {

    for (numero in array) {
        when {
            numero % 2 === 0 -> {
                print("$numero, ")
            }
        }
    }

}