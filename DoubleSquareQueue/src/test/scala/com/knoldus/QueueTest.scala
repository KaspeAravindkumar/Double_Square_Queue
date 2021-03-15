package com.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class QueueTest extends AnyFlatSpec {

  val queueList=new Object with Queue

  //TestCase for empty Queue
  "Queue" should " be empty for empty queue" in{
    val res=queueList.isEmpty
    assert(res==true)
  }

  //TestCase for enqueue
  it should " be add the value for enqueue" in{
    val res = queueList.enqueue(2)
    assert(res == List(2))
  }

  //TestCase for dequeue
  it should " be able remove the value" in{
    queueList.empty
    queueList.enqueue(8)
    queueList.enqueue(9)
    val res = queueList.dequeue
    assert(res == List(9))
  }

  //TestCase for empty dequeue
  it should " fail to remove the value from empty Queue" in{
    queueList.empty
    val res = queueList.dequeue
    assert(res =="No element found")
  }

  //TestCase for deleting all the elements
  it should "delete all the elements in queue" in{
    queueList.enqueue(6)
    queueList.empty
    assert(queueList.isEmpty)
  }

  it should "fail because the list is not empty" in{
    queueList.enqueue(10)
    val res = queueList.isEmpty
    assert(!(res==true))
  }

  it should " fail as the list is not empty Queue" in{
    queueList.empty
    queueList.enqueue(15)
    val res = queueList.dequeue
    assert(!(res =="No element found"))
  }

  it should " fail as the list is appended only with single element" in{
    queueList.empty
    val res =queueList.enqueue(32)
    assert(!(res ==List(1,2,32)))
  }
}

