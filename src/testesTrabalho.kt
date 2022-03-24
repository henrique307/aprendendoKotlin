import kotlin.reflect.typeOf

fun main() {
    val henrique = Conta("henrique", "senha")

    henrique.conecta("henrique", "senha")

    println(henrique.gold)

    henrique.adicionaGold(100)

    println(henrique.gold)

    print(henrique.conectado)
}

open class Conta(var jogador: String, senha: String, gold : Int = 0) {

    var gold = gold
        private set(value) { field = value }

    var senha = senha
        private set(value) { field = value }

    var conectado = false
        private set(valor){ field = valor }

    fun conecta(jogador: String, senha: String) {
        if (this.jogador === jogador && this.senha === senha) {
            conectado = true
            println("jogador conectado com sucesso!")
        } else {
            println("Usuario ou senha incorreto(s)");
        }
    }

    fun desconecta(){
        conectado = false
    }

    fun mudarSenha(senhaAtual: String, novaSenha: String) {
        if (this.senha === senhaAtual) {
            this.senha = novaSenha;
            println("Senha modificada com sucesso!")
        } else {
            println("A senha atual está incorreta")
        }
    }

    fun minhaSenha(): String {
        if (this.conectado) {
            return this.senha
        }
        return "A conta não está conectada no momento."
    }

    fun mudarUsuario(novoNome: String) {

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
    }

    open fun adicionaGold(valor : Int){
        if(this.conectado){
            this.gold = valor
        }
    }
}

//class ContaVIP(var jogador: String, senha: String, gold: Int=0):