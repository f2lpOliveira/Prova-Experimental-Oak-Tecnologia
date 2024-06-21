package crprodutos

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "produto", action: "list")
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
