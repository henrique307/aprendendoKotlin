package `Orientacao a Objetos`.`exemplo funcionarios`

interface Autenticavel {

    fun autentica(nome:String, Senha:String)

    fun mudaSenha(senhaAntiga:String, novaSenha:String)

}

abstract class Funcionario(
    nome: String,
    cpf: String,
    salario: Int
){
    val nome = nome;

    protected open var cpf = cpf

    open var salario = salario
        get() {return field}
        protected set(value){
            aumento(value)
        }

    fun aumento(valor: Int){
        salario += valor;
        println(salario)
    }

    fun desconto(valor: Int){
        salario -= valor
        println(salario)
    }
}

abstract class FuncionarioSup(
    nome: String,
    cpf: String,
    salario: Int,
    protected var senha: String = "admin"
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {

    protected var conectado:Boolean = false

    override fun autentica(nome: String, senha: String) {
        if(this.nome === nome && this.senha === senha){
            this.conectado = true
            println("Bem vindo ${this.nome}!")
        }else {
            println("Nome de usuário ou senha incorretos")
        }
    }

    override fun mudaSenha(senhaAntiga: String, novaSenha:String) {
        if(senha !== senhaAntiga){
            println("Senha incorreta")
        }else{
            println("Senha alterada com sucesso!")
            senha = novaSenha
        }
    }

}