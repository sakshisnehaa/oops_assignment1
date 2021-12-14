package OOPS1

import java.util.Scanner
import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks._

object MainClass {
  def main(args: Array[String]): Unit = {

    val queue = new ListBuffer[Int]
    breakable {
      while (true) {
        println("\nPress")
        println("1: To Insert  for Double of an element")
        println("2: To Insert  for square of an element")
        println("3:For delete an element")
        println("4:  For Display the Queue")
        println("5: Exit")
        val sc = new Scanner(System.in)
        val choice = sc.nextInt()
        choice match {
          case 1 =>
            println("\nEnter the Element to be Pushed into queue")
            val pushedElement = sc.nextInt()
            val doubleQueue = new DoubleQueue(queue)
            doubleQueue.enqueue(pushedElement)

          case 2 =>
            println("\nEnter the Element to be Pushed")
            val pushedElement = sc.nextInt()
            val squareQueue = new SquareQueue(queue)
            squareQueue.enqueue(pushedElement)
          case 3 =>

            if (queue.size == 0) println("\nEmpty Queue")
            else {
              val squareQueue = new SquareQueue(queue)
              val poppedElement = squareQueue.dequeue(queue)
              println("Deleted Element is : " + poppedElement)
            }
          case 4 =>
            if (queue.size == 0) println("\nEmpty Queue")
            else {
              println("\n Queue")
              for (loopVariable <- queue)
                print(loopVariable + " ")
              println()

            }
          case 5 =>
            println("Exiting")
            break
          case _ =>
            println("Wrong Choice. Enter again")
        }
      }
    }
  }
}