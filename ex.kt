fun MutableList<Int>.swap(index1: Int, index2: Int) {
  val tmp = this[index1]
  this[index1] = this[index2]
  this[index2] = tmp
}

val list = mutableListOf(1,2,3)
list.swap(0,2)

fun<T> MutableList<T>.swap(index1: Int, index2:Int) {
  val tmp = this[index1]
  this[index1] = this[index2]
  this[index2] = tmp
}

fun Any?.toString(): String{
  if (this == null) return "null"
  return toSTring()

val <T> List<T>.lastIndex: Int
get() size -1

open class C
class D: C()
fun C.foo() = "c"
fun D.foo() = "D"


fun printFoo(c: C){
  println(c.foo())
}

printFoo(D())







}
