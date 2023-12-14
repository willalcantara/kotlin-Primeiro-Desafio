// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel {
    BASICO,
    INTERMEDIARIO,
    DIFICIL
}

class Usuario(val name: String, val id: Int){
    
}

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>,var nivel: Enum<Nivel>) {
    val inscritos = mutableListOf<Usuario>()
 
    fun matricular(usuario: Usuario) {
        inscritos.add( usuario)
    }
}

data class ConteudoEducacional(var nome: String, val duracao: Int = 60) 

fun main() {
    val user1 = Usuario("Amanda", 1)
    val user2 = Usuario("Valdomiro", 2)
 
    val f01 =Formacao( "Frontend",listOf(ConteudoEducacional("html", 6), ConteudoEducacional("css", 12)),Nivel.BASICO)
    val f02 =Formacao( "BackEnd",listOf(ConteudoEducacional("Kotlin", 6), ConteudoEducacional("Java", 12)),Nivel.INTERMEDIARIO)
    val f03 =Formacao( "DevOps",listOf(ConteudoEducacional("Kurbenetes", 6), ConteudoEducacional("AWS", 12)),Nivel.DIFICIL)
    val f04 =Formacao( "Data",listOf(ConteudoEducacional("SQL", 6), ConteudoEducacional("ETL", 12)),Nivel.INTERMEDIARIO)

    f01.matricular(user1)

    println(f01.conteudos)
    println(f01.inscritos)
}
