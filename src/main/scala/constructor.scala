class Person(val name: String, val age: Int) {
println("Just constructed another person")
def description = println(s"$name is $age years old")
}
object test extends App{
val p1=new Person("john",45)
p1.description
}
