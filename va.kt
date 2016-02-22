
fun str(){
  val c = '0'
  val n = '\n'
  val u = '\uFF00'
  val s = "hello world\n"
  val text = """
    test
    test
  """
  val i = 10
  val str_ = "i = $i, ix 2 = ${i * 2}"
  val c0 = str_[0]
  for(chr in str_){
    println(chr)
  }
  println(c)
  println(n)
  println(u)
  println(s)
  println(text)
  println(c0)
  
}



fun main(args : Array<String>){
  str() 
 //Greeter(args[0]).greet()
/*
  val digits = 123
  val longInt = 123L
  val hex =  0x0f
  val bin = 0b00001011
  val dbl = 123.5
  val withe = 123.5e10
  val flt = 123.5f  
  val num: Short = 3
  println(num);
  println(digits);
  println(longInt);
  println(hex);
  println(bin);
  println(dbl);
  println(withe);
  println(flt);
*/  
}

