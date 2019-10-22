package com.wrk.day03.scala

class Point(xPotision:Int,yPotision:Int){

  println("ssssssssssssssssssss")
  var x:Int=xPotision
  var y:Int=yPotision

  def move(x:Int,y:Int): Unit ={

    this.x=x+1
    this.y=y+1
    println("坐标为"+this.x+this.y)
  }

}
object Point{
  def main(args: Array[String]): Unit = {

    val point1=new Point(3,4)


    point1.move(3,4)

    val point2=Point(3,5)
    println(point2)
    val point3=Point(7)

    println(point2.x)
    println(point3.x)
  }

  def apply(xPotision: Int, yPotision: Int): Point ={

    println("diaoy")
    new Point(xPotision, yPotision)
  }

  def apply(xPotision: Int): Point ={

    println("111111")
    new Point(xPotision,yPotision=1)}

}

