class Number(val a : Int){
  def add(b : Int) : Int = a + b
}

//This is companion object - used as Factory for Number class
object Number{
  def apply(a : Int) = new Number(a)
}

object Factory extends App{
  val num1 = Number(10)  //apply gets called implicitly - Returns Number object with a as 10
  println(s"Adding 5 to Number(${num1.a}) = ${num1.a + 5}")

  /**
    * Output
    * Adding 5 to Number(10) = 15
    */
}