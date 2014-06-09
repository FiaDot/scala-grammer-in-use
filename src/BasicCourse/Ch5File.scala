package BasicCourse

import scala.io.Source
import java.io.PrintWriter

object Ch5File {

	def readFile() = {
		val src = Source.fromFile("readme.txt", "UTF-8")
		
		val lineIter = src.getLines
		
		// iteration
		for ( line <- lineIter )
			println(line)
			
		// to array
		val lines = src.getLines.toArray
		
		// 전체
		val contents = src.mkString				
	}
	
	def readHTTP() = {
		val src = Source.fromURL("http://google.com", "UTF-8")
		
		println(">> http ")
		
		for (line <- src.getLines )
			println(line)
			
		/* 내용이 나오다 에러나는데...
		 >> http 
<!doctype html><html itemscope="" itemtype="http://schema.org/WebPage" lang="ko"><head><meta content="/images/google_favicon_128.png" itemprop="image"><title>Google</title><script>(function(){
window.google={kEI:"mgyUU_e5Etjd8AXbhIHIDQ",getEI:function(a){for(var c;a&&(!a.getAttribute||!(c=a.getAttribute("eid")));)a=a.parentNode;return c||google.kEI},https:function(){return"https:"==window.location.protocol},kEXPI:"4791,17259,4000116,4007661,4007830,4008142,4009033,4009641,4010806,4010858,4010899,4011228,4011258,4011679,4012373,4012504,4013414,4013591,4013723,4013758,4013787,4013823,4013920,4013967,4013979,4014016,4014093,4014431,4014515,4014636,4014671,4014810,4014813,4014991,4015234,4015260,4015266,4015339,4015550,4015587,4015633,4015772,4016127,4016309,4016367,4016373,4016487,4016824,4016855,4016882,4016933,4016976,4017063,4017135,4017148,4017224,4017278,4017280,4017284,4017298,4017544,4017595,4017612,4017639,4017681,4017694,4017710,4017742,4017818,4017821,4017824,4017856,4017913,4017922,4017963,4017981,4017982,4018009,4018019,4018030,4018089,4018126,4018159,4018175,4018181,4018283,4018363,4018424,4018480,4018513,4018519,4018554,4018566,4018569,4018610,4018620,4018935,8300012,8300027,8300029,8500223,8500252,8500256,8500272,8500306,8500331,8500357,8500365,8500379,8500394,8500400,8500409,8500421,8500433,8500444,10200012,10200029,10200048,10200053,10200083,10200120,10200134,10200136,10200155,10200160,10200164,10200184,10200211,10200221,10200228,10200246,10200248,10200261,10200271,10200273,10200293,10200299,10200330,10200333,10200334,10200337,10200345",kCSI:{e:"4791,17259,4000116,4007661,4007830,4008142,4009033,4009641,4010806,4010858,4010899,4011228,4011258,4011679,4012373,4012504,4013414,4013591,4013723,4013758,4013787,4013823,4013920,4013967,4013979,4014016,4014093,4014431,4014515,4014636,4014671,4014810,4014813,4014991,4015234,4015260,4015266,4015339,4015550,4015587,4015633,4015772,4016127,4016309,4016367,4016373,4016487,4016824,4016855,4016882,4016933,4016976,4017063,4017135,4017148,4017224,4017278,4017280,4017284,4017298,4017544,4017595,4017612,4017639,4017681,4017694,4017710,4017742,4017818,4017821,4017824,4017856,4017913,4017922,4017963,4017981,4017982,4018009,4018019,4018030,4018089,4018126,4018159,4018175,4018181,4018283,4018363,4018424,4018480,4018513,4018519,4018554,4018566,4018569,4018610,4018620,4018935,8300012,8300027,8300029,8500223,8500252,8500256,8500272,8500306,8500331,8500357,8500365,8500379,8500394,8500400,8500409,8500421,8500433,8500444,10200012,10200029,10200048,10200053,10200083,10200120,10200134,10200136,10200155,10200160,10200164,10200184,10200211,10200221,10200228,10200246,10200248,10200261,10200271,10200273,10200293,10200299,10200330,10200333,10200334,10200337,10200345",ei:"mgyUU_e5Etjd8AXbhIHIDQ"},authuser:0,ml:function(){},kHL:"ko",time:function(){return(new Date).getTime()},log:function(a,c,b,e,d){var f=
new Image,h=google.lc,g=google.li,k="",l="";f.onerror=f.onload=f.onabort=function(){delete h[g]};h[g]=f;b||-1!=c.search("&ei=")||(k="&ei="+google.getEI(e));b=b||"/"+(d||"gen_204")+"?atyp=i&ct="+a+"&cad="+c+k+l+"&zx="+google.time();a=/^http:/i;a.test(b)&&google.https()?(google.ml(Error("GLMM"),!1,{src:b}),delete h[g]):(f.src=b,google.li=g+1)},lc:[],li:0,y:{},x:function(a,c){google.y[a.id]=[a,c];return!1},load:function(a,c,b){google.x({id:a+m++},function(){google.load(a,c,b)})}};var m=0;
})();
(function(){google.sn="webhp";google.timers={};google.startTick=function(a,b){google.timers[a]={t:{start:google.time()},bfr:!!b};};google.tick=function(a,b,g){google.timers[a]||google.startTick(a);google.timers[a].t[b]=g||google.time()};google.startTick("load",!0);
try{}catch(d){}})();

		Exception in thread "main" java.nio.charset.MalformedInputException: Input length = 1
			at java.nio.charset.CoderResult.throwException(Unknown Source)
			at sun.nio.cs.StreamDecoder.implRead(Unknown Source)
			at sun.nio.cs.StreamDecoder.read(Unknown Source)
			at java.io.InputStreamReader.read(Unknown Source)
			at java.io.BufferedReader.fill(Unknown Source)
			at java.io.BufferedReader.readLine(Unknown Source)
			at java.io.BufferedReader.readLine(Unknown Source)
			at scala.io.BufferedSource$BufferedLineIterator.hasNext(BufferedSource.scala:72)
			at scala.collection.Iterator$class.foreach(Iterator.scala:743)
			at scala.collection.AbstractIterator.foreach(Iterator.scala:1174)
			at BasicCourse.Ch5File$.readHTTP(Ch5File.scala:29)
			at BasicCourse.Ch5File$.main(Ch5File.scala:44)
			at BasicCourse.Ch5File.main(Ch5File.scala)

		 */
	}
	
	def writeFile() = {
		// new
		val out = new PrintWriter("numbers.txt")
		for (i <- 1 to 10) out.println(i)
		
		out.print("%6d %10.2f".format(10, 5.5))
		out.close()
	}
	
	
	// TODO : dir 순회
	
	
	def main(args: Array[String]): Unit = {
		readFile()
		// readHTTP()
		writeFile()
		
	}

}