


fun main(args : Array<String>){
  val list = arrayOf(1,2,3)
  var arr : Array<Int?> = arrayOfNulls(3)
  val asc = Array(5, {i -> (i * i).toString()})
  for(item in list){println(item)}
  list[0] = list[1]+list[2]
  println(list[0])
}
