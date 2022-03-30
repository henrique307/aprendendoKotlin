package `Orientacao a Objetos`.`exemplo funcionarios`

interface Autenticavel {

    var nome:String;
    open var senha:String;

    fun autentica(nome:String, Senha:String)

}

abstract class Funcionario(
    nome: String,
    cpf: String,
    salario: Int
){
    val nome = nome;

    protected val cpf = cpf;

    open var salario = salario
        protected set(value){
            aumento(value)
        }

    fun aumento(valor: Int){
        this.salario += valor;
    }

    fun desconto(valor: Int){
        this.salario -= valor
    }
}

abstract class FuncionarioSup(
    nome: String,
    cpf: String,
    salario: Int,
    senha: String = "admin"
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {

    override var senha: String = senha

    protected var conectado:Boolean = false
        set(value){
            field = value
        }

    override fun autentica(nome: String, senha: String) {
        if(this.nome !== nome && this.senha !== senha){
            this.conectado = true
            println("Bem vindo ${this.nome}")
        }
    }

}