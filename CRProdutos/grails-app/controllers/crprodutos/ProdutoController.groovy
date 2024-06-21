package crprodutos

class ProdutoController {

    def index() {
        redirect(action: "lista")
    }

    def listar() {
        def produtos = Produtos.listar()
        [produtos: produtos]
    }

    def criar() {
        [produtosInstancia: new Produtos(params)]
    }

    def salvar() {
        def produtosInstancia = new Produtos(params)
        if (produtosInstancia.salvar(flush: true)) {
            flash.message = "Produtos ${produtosInstancia.nome} criado com sucesso!"
            redirect(action: "listar")
        } else {
            render(
                    view: "criar",
                    model: [produtosInstancia: produtosInstancia]
            )
        }
    }
}
