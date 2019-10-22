package com.wrk.day02.scala

import scala.collection.mutable.ArrayBuffer

object ArrayTest {

  def main(args: Array[String]): Unit = {
    val array=Array[Double](1,2,3,4,5)

    val arrayBuffer=new ArrayBuffer[Double]()

    arrayBuffer++=array
   println(arrayBuffer)
    for (i<-0 to array.length-1 by(1)){
      arrayBuffer.append(array(i)*array(i))
    }
    println(arrayBuffer)
    arrayBuffer.sortWith(_<_)
    println(arrayBuffer)
  }
}
