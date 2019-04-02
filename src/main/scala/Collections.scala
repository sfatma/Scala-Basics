object Collections extends App {

  val list = List(1,2,3,4,5,6,7,8,9,10)
  println(list) //List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  val evenList = list filter (_%2 == 0)
  println(evenList) //List(2, 4, 6, 8, 10)

  val even = list find(_%2 == 0)
  println(even) //2

  val fiveMultiples = evenList map (_*5)
  println(fiveMultiples) //List(10, 20, 30, 40, 50)

  val grpByEvenOdd = list groupBy (_%2)
  println(grpByEvenOdd) //Map(1 -> List(1, 3, 5, 7, 9), 0 -> List(2, 4, 6, 8, 10))

  val combinedList = List(evenList, fiveMultiples)
  println(combinedList) //List(List(2, 4, 6, 8, 10), List(10, 20, 30, 40, 50))
  val flatList = combinedList.flatten
  println(flatList)  //List(2, 4, 6, 8, 10, 10, 20, 30, 40, 50)

  /**
    * List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    * List(2, 4, 6, 8, 10)
    * 2
    * List(10, 20, 30, 40, 50)
    * Map(1 -> List(1, 3, 5, 7, 9), 0 -> List(2, 4, 6, 8, 10))
    * List(List(2, 4, 6, 8, 10), List(10, 20, 30, 40, 50))
    * List(2, 4, 6, 8, 10, 10, 20, 30, 40, 50)
    */

}
