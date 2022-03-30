package `Orientacao a Objetos`.`exemplo funcionarios`

class Supervisor(
    nome: String,
    cpf: String,
    salario: Int = 0,
    senha:String = "admin"
) : FuncionarioSup(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override protected var senha: String
        set(value) {}

    override var salario: Int = salario

}