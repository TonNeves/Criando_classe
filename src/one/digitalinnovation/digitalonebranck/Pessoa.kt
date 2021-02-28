package one.digitalinnovation.digitalonebranck

class Pessoa {
    val nome: String = "Washington"
    val cpf: String = "770.490.802-25"

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