import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object DataTypes extends App {

  val int1 = 10   //implicit
  val int2 : Int = 20  //explicit
  val int3 = "30".toInt  //String to Int

  val double1 = 10.1 //implicit
  val double2 : Double = 20.1 //explicit
  val double3 = "30.1".toDouble //String to Double

  val float1 = 10.2f  //implicit
  val float2 : Float = 20.2f  //explicit
  val float3 = "20.2".toFloat //String to Float

  val byte1 : Byte = 1 //Byte
  val char1 = 'c'  //Char

  val string1 = "DataTypes"  //String

  val date1 = LocalDateTime.now  //Date
  val date1String = date1.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))  //Date string

  println(s"int1 : $int1")
  println(s"int2 : $int2")
  println(s"int3 : $int3")

  println(s"double1 : $double1")
  println(s"double2 : $double2")
  println(s"double3 : $double3")

  println(s"float1 : $float1")
  println(s"float2 : $float2")
  println(s"float3 : $float3")

  println(s"byte1 : $byte1")
  println(s"char1 : $char1")
  println(s"string1 : $string1")

  println(s"date1 : $date1")
  println(s"date1String : $date1String")

  /**
    * int1 : 10
    * int2 : 20
    * int3 : 30
    * double1 : 10.1
    * double2 : 20.1
    * double3 : 30.1
    * float1 : 10.2
    * float2 : 20.2
    * float3 : 20.2
    * byte1 : 1
    * char1 : c
    * string1 : DataTypes
    * date1 : 2019-03-13T10:56:47.827
    * date1String : 2019-03-13
    */

}
