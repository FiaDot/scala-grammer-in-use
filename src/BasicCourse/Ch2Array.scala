package BasicCourse


object Ch2Array {

	def main(args: Array[String]): Unit = {
		
		val a = Array(1, 2, 3)		
		val result = for ( ele <- a ) yield 2 * ele
		
		println("array a=" + a)
		
		for ( ele <- a )
			printf("%d ", ele)
			
		println("\narray a'=" + result)
		
		for ( ele <- result )
			printf("%d ", ele)
	}

}