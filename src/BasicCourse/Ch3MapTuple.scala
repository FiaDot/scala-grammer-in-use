package BasicCourse

object Ch3MapTuple {
	
	
	def map_usage() = {
		// immutable
		// val kv = Map("fiadot" -> 1, "jason" -> 2)
		
		// 위와 동일한 형식으로 사용 가능 Map(("fiadot", 1), ("jason", 2))
		
		// mutable
		var kv = scala.collection.mutable.Map("fiadot" -> 1, "jason" -> 2)

		// 해당 키 있을 때 
		val result = kv("fiadot")		
		println("result=" + result)
		
		// 키에 해당하는 값 없을 때 처리
		val result2 = kv.getOrElse("fiado", 0)
		println("result2=" + result2)
		

		// 값 변경 (mutable로 선언했을때만 가능)
		kv("fiadot") = 3
		println("result3=" + kv("fiadot"))
		
		
		// iterating!
		println(">> Iteration")
		for( (k,v) <- kv )
			println(k + "->" + v)
	}
	
	
	def tuple_usage() = {
		val t = (1, "two", 3.0)
		
		val second_ele = t._2
		println("second_ele=" + second_ele)
	
		
		val (first,second,third) = t
		println("pattern matching = " + first + "," + second + "," + third)
		
		val (f,s,_) = t
		println("pattern matching (some)= " + f + "," + s )		
						
	}
	
	def zipping() = {
		
		val name = Array("name", "seq", "age")
		val data = Array("fiadot", 1, 33)
		
		val pairs = name.zip(data)	// to map!
		
		println(">> zipping")
		for ( (k, v) <- pairs )			
			println(k + "=" + v)	
	}

	
	def main(args: Array[String]): Unit = {
		map_usage()
		tuple_usage()
		zipping()
	}
	

}