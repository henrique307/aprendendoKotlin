package `Orientacao a Objetos`

fun main() {
    val henrique = ContaPadrao("henrique", "senha")

    val fran = ContaVIP( "fran", "senhaFran", 1000)

    henrique.conecta("henrique", "senha")

    fran.conecta("fran", "senhaFran")

    fran.desconecta()

    println(henrique.gold)

    henrique.adicionaGold(100)

    println(henrique.gold)

    henrique.adicionaGold(100)

    println(henrique.gold)

}