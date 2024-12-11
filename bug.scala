```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val list = new ListBuffer[Int]()
  list += 1
  list += 2
  list += 3

  // Incorrect way to convert to an immutable List
  val immutableList = list.toList //This will return a List(1,2,3) which is correct.

  // Correct ways to convert to an immutable List
  val immutableList2 = list.to[List] 
  val immutableList3 = list.toList

  println(immutableList)
  println(immutableList2)
  println(immutableList3)
}
```