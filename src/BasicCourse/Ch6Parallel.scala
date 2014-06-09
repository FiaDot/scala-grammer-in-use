package BasicCourse

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}
import scala.util.Random

object Ch6Parallel {
	
	
	def sleep(duration: Long) { Thread.sleep(duration) }
	
	
	def future_usage() = {

		
		val f = Future {
			sleep(Random.nextInt(500))
			42
		}

		println("2- before onComplete")
		f.onComplete {
			case Success(value) => println(s"Got the callback, meaning = $value")
			case Failure(e) => e.printStackTrace
		}
		
			
		println("A ..."); sleep(100)
		println("B ..."); sleep(100)
		println("C ..."); sleep(100)
		println("D ..."); sleep(100)
		println("E ..."); sleep(100)
		println("F ..."); sleep(100)

	}
	  
	
	def main(args: Array[String]): Unit = {		
		future_usage()
	}

}