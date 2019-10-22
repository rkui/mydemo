package com.wrk.day05.scala
import javax.swing.text.AbstractDocument.Content

import scala.io.Source

object FlowCount {
  def main(args: Array[String]): Unit = {

    val source=Source.fromFile("D:\\学习资料\\Scala\\flow.txt")
    val lines=source.getLines().toList

    val f:((String,List[Array[String]]))=>((String,Int,Int,Int))=(content)=>{
//      val upFlow = content._2
//      var upFlowSum = 0
//      for(array <- upFlow){
//        upFlowSum += array(1).toInt
//      }
      (content._1,content._2.map(_(1).toInt).sum,content._2.map(_(2).toInt).sum,content._2.map(_(1).toInt).sum + content._2.map(_(2).toInt).sum)    }

    val result=lines.map(_.split(",")).groupBy(_(0)).map(f)

    println(result)



  }
}
