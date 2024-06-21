package crprodutos

class Produtos {

    String nome
    String descricao
    BigDecimal preco
    Boolean avaliacao

    static constraints = {
        nome blank: false, size: 3..255
        descricao nullable: true, maxSize: 1000
        preco min: 0.0
        avaliacao nullable: false
    }

    static mapping = {
        sort preco: "asc"
    }
}
