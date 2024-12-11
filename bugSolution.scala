```scala
import scala.collection.mutable.ListBuffer

object Main extends App {
  val list = new ListBuffer[Int]()
  list += 1
  list += 2
  list += 3

  // Correct ways to convert to an immutable List
  val immutableList1 = list.to[List] //Explicit type conversion
  val immutableList2 = list.toList   //Standard method (generally safe, but potentially ambiguous)
  val immutableList3 = List(list:_*) //Using List.apply with a varargs parameter

  println(immutableList1)
  println(immutableList2)
  println(immutableList3)
}
```