class Person {
private var name = ""
private var age = 0
println("default")
println()
def this(name: String) { // An auxiliary constructor
this() 
println(" Calls primary constructor")
println()
this.name = name
}
def this(name: String, age: Int) { // Another auxiliary constructor
this()
println(" Calls secondary constructor")
println()// Calls previous auxiliary constructor
this.age = age
}
}
object test extends App{
val P1=new Person 

val P2=new Person("kaushik")

val P3=new Person("kaushik",23)
}
