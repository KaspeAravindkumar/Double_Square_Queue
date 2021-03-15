package com.knoldus

class DoubleQueue extends Queue {
  //function which doubles each element and then insert into the list
  override def enqueue(value: Int): List[Int] = {
    val element = value*2
     items = items :+ element
    items
  }

}

class SquareQueue extends Queue {
  //function which squares each element and then insert into the list
  override def enqueue(value: Int):List[Int] = {
    val element = math.pow(value, 2).toInt
    items = items :+ element
    items
  }
}

