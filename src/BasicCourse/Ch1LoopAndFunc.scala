package BasicCourse

object Ch1LoopAndFunc {

	// 함수 뒤에 = 주의!
	def sum(args : Int*) = {
		var result = 0
		
		for (arg <- args ) {
			result += arg			
		}
		
		result
	}
	
	// how to break in for
	
	def for_break() = {
		
		
		
	}
	
	def main(args: Array[String]): Unit = {
		var s1 = sum(1,2,3,4,5) 
		println("sum #1=" + s1)
		
		var s2 = sum(1 to 5: _*)
		println("sum #2=" + s2)		
	}
}