fun main() {
    val henrique = Conta("henrique", "senha")

    henrique.conecta("henrique", "senha")

    println(henrique.gold)

    henrique.adicionaGold(100)

    println(henrique.gold)

    henrique.adicionaGold(100)

    println(henrique.gold)

}

open class Conta(var nome: String, senha: String, gold: Int = 0) {

    var gold = gold
        protected set(value) {
            field = value
        }

    var senha = senha
        private set(value) {
            field = value
        }

    var conectado = false
        private set(valor) {
            field = valor
        }

    fun conecta(jogador: String, senha: String) {
        if (this.nome === jogador && this.senha === senha) {
            conectado = true
            println("jogador conectado com sucesso!")
        } else {
            println("Usuario ou senha incorreto(s)");
        }
    }

    fun desconecta() {
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
                this.nome = novoNome
            }
        }
    }

    open fun adicionaGold(valor: Int) {
        if (this.conectado) {
            this.gold += valor
        }
    }
}

class ContaVIP : Conta {
    constructor(
        nome: String,
        senha: String,
        gold: Int = 0
    ) : super(
        nome = nome,
        senha = senha,
        gold = gold
    ) {
    }

    override fun adicionaGold(valor: Int) {
        var valorSomado = valor + 10

        if (this.conectado) {
            this.gold += valorSomado
        }
    }
}










