package com.wrk.day02.scala


object SetTest {
  def main(args: Array[String]): Unit = {

    var set1=Set(1,2,3,4,5,6,7,8,9)
    var set2=Set(1,3,5,7,9,11)

    val s=set1.iterator
    while (s.hasNext){
      println(s.next())
    }

    val part=set1.splitAt(3)
    val part1=part._1
    val part2=part._2


  }







}
