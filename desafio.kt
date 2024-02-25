// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class Aula(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val Curso: MutableList<Aula> = mutableListOf()) {
    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(user: Usuario) {
        inscritos.add(user)
    }
}

fun main() {
    val user1 = Usuario("Flavio")
    val Curso1 = Aula("Kotlin", 73)
    val Curso2 = Aula("Banco de Dados", 65)
    val formacao1 = Formacao("Programação")
    
    formacao1.Curso.addAll(listOf(Curso1, Curso2))
    formacao1.matricular(user1)
    
    println("Usuário ${user1.nome} matriculado na formação ${formacao1.nome}.")
    println("Conteúdos da formação ${formacao1.nome}:")
    formacao1.Curso.forEach { println("${it.nome} - Duração: ${it.duracao} minutos") }
}
