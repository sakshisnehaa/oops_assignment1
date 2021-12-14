package OOPS1
import scala.collection.mutable.ListBuffer

trait Queue {

  def enqueue(pushedElement : Int)

  def dequeue(q: ListBuffer[Int]) : Int ={

    val removedElement = q(0)
    q.remove(0)
    removedElement
  }

}
