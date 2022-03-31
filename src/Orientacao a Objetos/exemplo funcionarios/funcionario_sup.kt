package `Orientacao a Objetos`.`exemplo funcionarios`

fun main(){
    val henrique = Supervisor("hen","123", 123,"senhaForte" )

    henrique.autentica("hen", "senhaForte")

    henrique.mudaSenha("senhaForte", "senhaForte2") // mudando pra uma senha mais confiável ;)
}

class Supervisor(
    nome: String,
    cpf: String,
    salario: Int,
    senha:String,
) : FuncionarioSup(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
)