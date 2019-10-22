package com.wrk.day06.scala

import scala.io.{BufferedSource, Source}

object ImplicitMethod {

  implicit class clss(array: Array[Int]){

    def method01:Int={
      val avg=(array.sum)/array.length
      avg
    }
  }

  def main(args: Array[String]): Unit = {

    val array:Array[Int]=Array(1,2,3)
    val avg:Int=array.method01

    println(avg)
  }

}



