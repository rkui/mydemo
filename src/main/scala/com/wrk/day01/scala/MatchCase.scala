package com.wrk.day01.scala

object MatchCase {

  def main(args: Array[String]): Unit = {

    val score=readInt()
    val result=getLeave(score)
    println(result)

  }

  def getLeave(score: Int): Any = {

    var leave = score match {
      case bad if (bad < 65) => {
        println("不及格")
        "不及格"
      }
      case c if (c >= 65 && c < 75) => {
        println("C")
        "C"
      }
      case c if (c >= 75 && c < 85) => {
        println("B")
        "B"
      }
      case c if (c >= 85 && c < 95) => {
        println("A")
        "A"
      }
      case c if (c >= 95 && c <= 100) => {
        println("A+")
        "A+"
      }
      case _ => {
        println("无匹配")
        "无匹配"
      }

    }
    leave
  }
}




