package `Orientacao a Objetos`

class ContaPadrao : Conta {
    constructor(
        nome: String,
        senha: String,
        gold: Int = 0
    ) : super(
        nome = nome,
        senha = senha,
        gold = gold
    );

}

class ContaVIP : Conta {
    constructor(
        nome: String,
        senha: String,
        gold: Int = 0
    ) : super(
        nome = nome,
        senha = senha,
        gold = gold,
    ) {
    }

}

