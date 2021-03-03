package one.digitalinnovation.digitalonebranck

class Pessoa {
    var nome: String = "Washington"
    var cpf: String = "770.490.802-25"
    private set

    inner class Endereco {
        var rua: String = "Alameda Orquideas"

    }
}
fun main(){
    val Tom = Pessoa()


    println (Tom.nome)
    println (Tom.cpf)

    println(Tom.Endereco().rua)
}