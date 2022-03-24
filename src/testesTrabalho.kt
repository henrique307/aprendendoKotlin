import kotlin.reflect.typeOf

fun main() {
//    val henrique = Conexao("henrique","senha")
//
//    println()
//
//    henrique.conectar("henrique", "senha")
//
//    henrique.mudarSenha("senha", "novaSenha")
//
//    println(henrique.minhaSenha())

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

class Conexao(var jogador: String, senha:String) {
    var senha = senha
        private set(value) {
            field = value;
        }
        get() {
            return field
        }
    var conectado = false

    fun conectar(jogador: String, senha: String) {
        if (this.jogador === jogador && this.senha === senha) {
            this.conectado = this.conectado === false;
            println("jogador conectado com sucesso!")
        } else {
            println("Usuario ou senha incorreto(s)");
        }
    }

    fun mudarSenha(senhaAntiga: String, novaSenha: String) {
        if (this.senha === senhaAntiga) {
            this.senha = novaSenha;
            println("Senha modificada com sucesso!")
        } else {
            println("A senha antiga está incorreta")
        }
    }

    fun minhaSenha(): String {
        if (this.conectado) {
            return this.senha
        }
        return "A conta não está conectada no momento."
    }

    fun mudarUsuario(novoNome : String){

        when {
            !this.conectado -> {
                println("O jogador não está atualmente conectado")
            }

            novoNome.length < 4 -> {
                println("Seu nome de usuário deve ter no mínimo 5 letras")
            }
            else -> {
                this.jogador = novoNome
            }
        }

//        if(novoNome.length >= 4 && this.conectado){
//            this.jogador = novoNome
//            println("Nome de usuário modificado com sucesso!")
//        } else {
//            println("usuário tem menos de 5 letras ou o jogador está atualmente desconectado")
//        }
    }
};

fun novaConta(jogador: String, senha: String) {

}


// loop manero
//    loop@ for (i in 1..3) {
//        for (j in 1..10000) {
//            if (j <= 10) {
//                if (j % 2 !== 0) {
//                    print(" [impar] ")
//                } else {
//                    print(" [par] ")
//                }
//            } else {
//                println()
//                break
//            }
//        }
//    }