package com.wrk.day05.scala
import scala.io.Source
import scala.collection.mutable
object WordCount {
  def main(args: Array[String]): Unit = {

    val source=Source.fromFile("D:\\学习资料\\Scala\\words.txt")
    val lines=source.getLines()
    val map:mutable.HashMap[String,Int]=mutable.HashMap()

    for(line<-lines){
     val words=line.split(" ")
      println(line)
      for (word<-words){
        println(word)
        if (map.getOrElse(word,"z")=="z"){
          map(word)=1
        }else{
          map(word)+=1
        }

      }
    }

    for ((k,v)<-map){
      println(s"$k-$v")
    }



  }

}
