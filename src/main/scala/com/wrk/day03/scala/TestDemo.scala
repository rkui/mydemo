package com.wrk.day03.scala

object TestDemo {
  def main(args: Array[String]): Unit = {

    val map = Map(("s1",83),("s2",87),("s3",94))

    for ((k,v)<-map){
      println(k)
      print(v)
    }

  }


}
