import com.typesafe.scalalogging.LazyLogging

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.util.{Failure, Random, Success}

object Concurrency extends App with LazyLogging {

  //Any future block starts in a separate thread
  def getRandom : Future[Int] = Future {
    val r = 100 + Random.nextInt(200)
    Thread.sleep(r)
    r
  }

  //blocking thread
  val f1 = getRandom
  val result = Await.result(f1, 1 second)
  println(s"f1 random number : $result")
  println("Milestone 0")

  //Non blocking thread. onComplete callback
  val f2 = getRandom
  f2.onComplete{
    case Success(result) => println(s"f2 random number= $result")
    case Failure(e) => e.printStackTrace
  }

  //Non blocking thread. onSuccess/onFailure callbacks
  val f3 = getRandom
  f3.onSuccess{
    case result => println(s"f3 random number: $result")
  }

  f3.onFailure{
    case t => println(s"Exception: ${t.getMessage}")
  }

  println("Milestone 1"); Thread.sleep(100)
  println("Milestone 2"); Thread.sleep(100)
  println("Milestone 3"); Thread.sleep(100)

  println("Milestone 4"); Thread.sleep(100)
  println("Milestone 5"); Thread.sleep(100)
  println("Milestone 6"); Thread.sleep(100)

  /**
    * f1 random number : 182
    * Milestone 0
    * Milestone 1
    * Milestone 2
    * f3 random number: 119
    * Milestone 3
    * f2 random number= 285
    * Milestone 4
    * Milestone 5
    * Milestone 6
    */
}
