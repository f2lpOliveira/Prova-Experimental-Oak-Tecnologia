package crprodutos

import grails.gorm.transactions.Transactional

class ProdutoController {

    def index() {
        redirect(action: "list")
    }

    def list() {
        def produtos = Produto.list(sort: "valor", order: "asc")
        [produtos: produtos]
    }

    def create() {
        [produtoInstancia: new Produto(params)]
    }

    @Transactional
    def save() {
        def produtoInstancia = new Produto(params)

        try {
            if (produtoInstancia.save(flush: true)) {
                flash.message = "Produto ${produtoInstancia.nome} cadastrado com sucesso"
                redirect(action: "list")
            } else {
                render(
                        view: "create",
                        model: [produtoInstancia: produtoInstancia]
                )
            }
        } catch (Exception e) {
            log.error("Erro ao salvar o produto: ${e.message}")
            flash.message = "Erro ao salvar o produto: ${e.message}"
            render(
                    view: "create",
                    model: [produtoInstancia: produtoInstancia]
            )
        }
    }
}
