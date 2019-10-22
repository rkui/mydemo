package com.wrk.day05.scala

import scala.io.Source
import scala.collection.mutable
object WordCount02 {
  def main(args: Array[String]): Unit = {
    val source=Source.fromFile("D:\\学习资料\\Scala\\words.txt")
    val lines=source.getLines().toList

    val temp=  lines.flatMap(line=>  line.split(" ").map(word=>  (word,1))).groupBy(_._1).map(temp=>  (temp._1,temp._2.size))


    val sum=lines.flatMap(line=>line.split(" ").map(word=> (word,1))).groupBy(_._1).map(temp=>(temp._1,{
      var sum=0
      for(count<-temp._2){
        sum+=count._2
      }
      sum
    }))

   // val sum1 = lines.flatMap(line => line.split(" ").map(word => (word,1))).groupBy(_._1).map(temp => (temp._1,temp._2.map(value => value._2).reduceLeft(_ + _)))
    val sum2=  lines.flatMap(line=>  line.split(" ").map(word=>  (word,1))).groupBy(_._1).map(temp=>  (temp._1,temp._2.map(value => value._2).reduceLeft(_ + _)))



  }
}
