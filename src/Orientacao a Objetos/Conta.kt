package `Orientacao a Objetos`

abstract class Conta(var nome: String, senha: String, gold: Int = 0) {

    var gold = gold
        protected set(value) {
            field = value
        }

    var senha = senha
        protected set(value) {
            field = value
        }

    var conectado = false
        protected set(valor) {
            field = valor
        }

    var banido: Boolean = false

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