package com.wrk.day01.scala

object Work02 {

  def main(args: Array[String]): Unit = {


    var speed=setSpeed()
    var distance=setDistance()

    var time=getTime(speed,distance)
    println("时间为"+time+"h")
  }
  def getTime(speed:Double,distance:Double):Double={

    var time=distance/speed
    time
  }
  def setSpeed():Double={

    println("平均速度选择:1.默认     2.自定义")
    var flag=readInt()
    var speed=flag match {
      case 1=>{
        30.0
      }
      case 2=>{
        println("输入平均速度(Km/h)")
        val s=readDouble()
        s
      }
    }
    speed
  }
  def setDistance():Double={
    println("输入距离(Km)")
    var distance=readDouble()
    distance
  }
}
