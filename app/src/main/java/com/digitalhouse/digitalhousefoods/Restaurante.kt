package com.digitalhouse.digitalhousefoods

class Restaurante(var id: Int, var nome: String, var endereco: String, var imgRestaurante: Int) {

    override fun toString(): String {
        return "Restaurante(id=$id, nome='$nome', endereco='$endereco', imgRestaurante=$imgRestaurante)"
    }
}