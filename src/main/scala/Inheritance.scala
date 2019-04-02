
trait Eats {  //Similar to Java Interfaces
  def isEating : Boolean = false
}
class Person(val name : String, val age : Int) extends Eats   //Class attributes can be specified as params with class name
                                                              //Class attributes are not visible outside "if" defined "without val"
class Employee (override val name : String, override val age : Int, var grade : String) extends Person (name, age)

object Inheritance extends App{
  val p1 = new Person("Saman", 16)
  println(s"Name: ${p1.name}; Age: ${p1.age}")

  val p2 = new Employee("Shujaat", 21, "100")
  println(s"Name: ${p2.name}; Age: ${p2.age}; Grade: ${p2.grade}")
  p2.grade = "150"

  println(s"${p2.name}'s new grade : ${p2.grade}")

  println(s"Is ${p2.name} eating ? ${p2.isEating}")

  /**
    * Output
    * Name: Saman; Age: 16
    * Name: Shujaat; Age: 21; Grade: 100
    * Shujaat's new grade : 150
    * Is Shujaat eating ? false
    */

}



