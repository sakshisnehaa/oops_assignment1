package OOPS1
import scala.collection.mutable.ListBuffer

class DoubleQueue(q : ListBuffer[Int]) extends Queue {

  override def enqueue(pushedElement: Int): Unit = {

    q += (pushedElement * 2)
  }

}

class SquareQueue(q: ListBuffer[Int]) extends Queue {

  override def enqueue(pushedElement: Int): Unit = {

    q += (pushedElement * pushedElement)
  }

}