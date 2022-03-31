package `Orientacao a Objetos`.`exemplo funcionarios`

fun main(){

    val henrique = Eletricista("hen", "123",123)

    henrique.aumento(1000)

}


class Eletricista(
    nome: String,
    cpf: String,
    salario: Int = 0
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override var salario: Int = salario
}

class Encanador(
    nome: String,
    cpf: String,
    salario: Int = 0
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {

    override var salario: Int = salario
        get() {return field}
        set(value) {}
}