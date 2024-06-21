package crprodutos

class Produto {
    String nome
    String descricao
    BigDecimal valor
    String disponibilidade

    static constraints = {
        nome(nullable: false, size: 0..100)
        descricao(nullable: true)
        valor(nullable: false, scale: 2)
        disponibilidade(size: 0..3)
    }

    static mapping = {
        sort valor: "asc"
    }
}
