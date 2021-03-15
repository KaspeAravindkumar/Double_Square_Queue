package com.knoldus

trait Queue {
    var items: List[Int]= Nil

    //function to check if queue is empty
    def isEmpty: Boolean = items.isEmpty

    //function to add values in queue
    def enqueue(value: Int): List[Int]  = {
      items = items :+ value
      items
    }

    //function to remove values from queue
    def dequeue: Any =  {
      if( items.isEmpty) {
          "No element found"
      } else{
         items = items.tail
        items
      }
    }

    //function to delete all elements from stack
    def empty: Any = items = List()

  }
