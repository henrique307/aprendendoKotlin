package `Orientacao a Objetos`
class ContaPadrao : Conta {
    constructor(
        nome: String,
        senha: String,
        gold: Int = 0
    ):super(
        nome = nome,
        senha = senha,
        gold = gold
    );

    override fun adicionaGold(valor: Int) {
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

            override fun adicionaGold(valor: Int) {
                var valorSomado = valor + 10

                if (this.conectado) {
                    this.gold += valorSomado
                }
            }
        }
        if (this.conectado) {
            this.gold += valor
        }
    }
}
