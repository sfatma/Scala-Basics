import com.typesafe.scalalogging.{CanLog, LazyLogging, Logger}

object Logging extends LazyLogging with App{
  //No need to initialize logger
  //Dependencies used : com.typesafe.scala-logging/scala-logging-3.9.2 - Provides wrapper on slf4j
  //                    ch.qos.logback/logback-classic-1.2.3 - Logger implementation
  //Check build.sbt for dependencies
  //Scala string interpolation used for printing variables
  val weather = "Sunny"
  logger.debug(s"${weather} weather outside")

  //Below implementation for scenarios where extra param eg AppId/ThreadId needs to be added to log messages
  implicit case object CanLogAppId extends CanLog[String]{
    def logMessage(originalMsg: String, a: String): String = s"${a} ${originalMsg}"
  }

  implicit val app = "123"
  val logger2 = Logger.takingImplicit(app)
  logger2.info("Sunny weather outside")

  /**
    * Output
    * 17:12:19.972 [main] DEBUG Logging$ - Sunny weather outside
    * 17:12:20.010 [main] INFO 123 - 123 Sunny weather outside
    */
}