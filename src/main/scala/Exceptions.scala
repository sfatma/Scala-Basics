import scala.util.{Failure, Success, Try}

object Exceptions {

  def main(args: Array[String]): Unit = {
    val x = None
    val y : String = null
    val test1 = Try(x.isEmpty)
    val test2 = Try(y.isEmpty)

    test1 match {
      case Success(v) => println(s"Test1 : x isEmpty ? $v")
      case Failure(e) => println(s"Test1 : Error - ${e.getClass.getName}")
        throw e
    }
    test2 match {
      case Success(v) => println(s"Test2 : y isEmpty ? $v")
      case Failure(e) => println(s"Test2 : Error - ${e.getClass.getName}")
        throw e
    }
  }

  /**
    * Test1 : x isEmpty ? true
    * Test2 : Error - java.lang.NullPointerException
    * Exception in thread "main" java.lang.NullPointerException
    * at Exceptions$.$anonfun$main$2(Exceptions.scala:9)
    * at scala.runtime.java8.JFunction0$mcZ$sp.apply(JFunction0$mcZ$sp.java:12)
    * at scala.util.Try$.apply(Try.scala:209)
    * at Exceptions$.main(Exceptions.scala:9)
    * at Exceptions.main(Exceptions.scala)
    */
}
