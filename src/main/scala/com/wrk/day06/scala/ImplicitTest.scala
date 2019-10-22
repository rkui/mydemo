package com.wrk.day06.scala
import scala.io.{BufferedSource, Source}

object ImplicitTest {

  implicit class ttt(bufferedSource: BufferedSource){

     def XXXs():String={
      bufferedSource.mkString
    }
     def getList:List[String]={
      bufferedSource.getLines().toList
    }
  }


  def main(args: Array[String]): Unit = {
    val lines:List[String]=Source.fromFile("D:\\学习资料\\Scala\\words.txt")  getList;

    println(lines)
  }




}
