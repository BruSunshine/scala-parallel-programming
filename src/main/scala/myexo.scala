package myexo

sealed trait Shape

case class Rectangle(a: Int, b:Int) extends Shape
