object StringInterpolator {

  def main(args: Array[String]): Unit = {
    val weather = "Sunny"
    println(s"${weather} weather outside")  //s interpolator allows usage of variables directly in string
    println(s"1 + 1 = ${1 + 1}")  //s interpolator can also take expressions as input

    val temp = 27.5d
    println(f"Today's temperature is $temp%2.2f°C")  //f interpolator allows creation of formatted strings. Style format string should be provided with each variable

    println(raw"a\nb") //raw interpolator is similar to s interpolator, but does not perform escaping of literals
  }

  /**
    * Sunny weather outside
    * 1 + 1 = 2
    * Today's temperature is 27.50°C
    * a\nb
    */

}
