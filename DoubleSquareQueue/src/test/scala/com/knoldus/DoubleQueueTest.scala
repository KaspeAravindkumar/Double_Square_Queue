package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class DoubleQueueTest extends AnyFlatSpec {
  val doubleQueue = new DoubleQueue
  val squareQueue = new SquareQueue

  "DoubleQueue" should "Double the items before appending" in {
    val res = doubleQueue.enqueue(2)
    assert(res == List(4))
  }

  it should "remove the first added element" in{
    doubleQueue.empty
     doubleQueue.enqueue(3)
    doubleQueue.enqueue(4)
    val res = doubleQueue.dequeue
    assert(res == List(8))
  }

  it should "check the list is empty are not" in{
    doubleQueue.empty
    val res = doubleQueue.isEmpty
    assert(res == true)
  }

  it should "false to remove from empty list" in{
    val res = doubleQueue.dequeue
    assert(res == "No element found")
  }

  it should "false as the list appended is only single element" in{
    val res = doubleQueue.enqueue(26)
    assert(!(res == List(3,4,52)))
  }

  it should "fail as the list is not empty" in{
    doubleQueue.enqueue(10)
    val res = doubleQueue.isEmpty
    assert(!(res == true))
  }

  "SquareQueue" should "square the items before appending" in {
    val res = squareQueue.enqueue(3)
    assert(res == List(9))
  }

  it should "remove the first added element" in{
    squareQueue.empty
    squareQueue.enqueue(4)
    squareQueue.enqueue(5)
    val res = squareQueue.dequeue
    assert(res == List(25))
  }

  it should "check the list is empty are not" in{
    squareQueue.empty
    val res = squareQueue.isEmpty
    assert(res == true)
  }

  it should "false to remove from empty list" in{
    val res = squareQueue.dequeue
    assert(res == "No element found")
  }

  it should "false as list appended is only single element" in{
    val res = squareQueue.enqueue(5)
    assert(!(res == List(3,4,25)))
  }

  it should "fail as the list is not empty queue" in{
    squareQueue.enqueue(10)
    val res = squareQueue.isEmpty
    assert(!(res == true))
  }

}
