package com.wrk.day02.scala

object WorkDay02 {

  def main(args: Array[String]): Unit = {

    var a=readInt()
    var b=readInt()
    var c=readInt()
    println(getResult(a,b,c,add,multi))


  }


  val add: ((Int, Int) => Int) = { (x, y) => x + y }

  val multi=((x:Int,y:Int)=>x*y)

  def getResult(a:Int,b:Int,c:Int,f1:(Int,Int)=>Int,f2:(Int,Int)=>Int):Int={

    f2(f1(a,b),c)


  }

}