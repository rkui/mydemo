package com.wrk.day04.scala

object ArrayTest extends  App {

  var array=Array(1,2,3,4,5)

  exchange(array)

  def exchange(array:Array[Int]):Unit={

    var len=array.length
    val myArray=new Array[Int](len)

    if (len/2==1){
      len=len-1
      myArray(len)=array(len)

    }


    for (i <- 0 to len-1 by(2)){

      myArray(i)=array(i+1)
    }

    for(j<- 1 to len by(2)){
      myArray(j)=array(j-1)
    }

    for (k<-myArray){
      println(k)
    }
  }

}
