class Greeter(val name : String){
  fun greet(){
    println("hello $name");
  }
}

class Person(val firstName : String, val lastName: String, var age: Int){
  

}

fun main(args : Array<String>){
  Greeter(args[0]).greet()
  val person = Person("joe", "smith", 30)
  println(person.firstName)
  person.age++
  println(person.age)
}
