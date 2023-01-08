import java.util.UUID
import scala.util.chaining._

object Main extends App {

  def deduplicator(base: String) = base + "_" + UUID.randomUUID().toString()
  def timeAttacher(name: String) = name + "_" + System.currentTimeMillis()

  val initValue = "Hello"

  val transformedStr: String = timeAttacher(deduplicator(initValue))
  println(transformedStr)

  val pipedStr: String = initValue.pipe(deduplicator).pipe(timeAttacher)
  println(pipedStr)
  val pipedStr2: String = initValue pipe deduplicator  pipe timeAttacher 
  println(pipedStr2)
  
  val tappedStr = initValue.pipe(deduplicator).pipe(timeAttacher).tap(v => println("Final value: "+v)) 

}