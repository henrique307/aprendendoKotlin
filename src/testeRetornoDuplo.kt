fun main() {
    val arrayRapido = arrayOf(1,2,3,4,5,6,7)


    val (pares, impares) = divide(arrayRapido)

    for(par in pares){
        print("$par, ")
    }
    println()
    for(impar in impares){
        print("$impar, ")
    }
}
// Pegando o tipo de alguma coisa https://stackoverflow.com/questions/45165143/get-type-of-a-variable-in-kotlin
// println(coisa::class.java.typeName) mais ou menos isso.

fun divide(array : Array<Int>): Pair<Array<Int>,Array<Int>> {
    var arrayPares = mutableListOf<Int>()
    var arrayImpares = mutableListOf<Int>();
    //https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/mutable-list-of.html

    for(elemento in array){
        when {
            elemento % 2 === 0 -> arrayPares.add(elemento)
            else -> arrayImpares.add(elemento)
        }
    }

    return Pair(arrayPares.toTypedArray(), arrayImpares.toTypedArray())
    // https://www.techiedelight.com/return-multiple-values-kotlin/
    //https://www.techiedelight.com/add-new-element-array-kotlin/
}
