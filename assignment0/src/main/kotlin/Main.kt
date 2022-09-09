import java.util.Scanner

fun main(){
    var square = Square("square")
    var circle = Circle("circle")
    var triangle = Triangle("triangle")
    var equilateralTriangle = EquilateralTriangle("equilateral triangle")
    var shapes = listOf<Shape>(square,circle,triangle,equilateralTriangle)
    var reader = Scanner(System.`in`)

    println("Please enter the length and height for your square:")
    var length = reader.nextDouble()
    var height = reader.nextDouble()

    println("Enter the radius for your circle:")
    var radius = reader.nextDouble()

    println("Enter the 3 sides of the triangle:")
    var side1 = reader.nextDouble()
    var side2 = reader.nextDouble()
    var side3 = reader.nextDouble()

    println("Enter the side of the equilateral triangle:")
    var side = reader.nextDouble()

    //println("$length, $height, $radius, $side1, $side2, $side3, $side")

    square.setDimensions(length,height)
    circle.setDimensions(radius)
    triangle.setDimensions(side1,side2,side3)
    equilateralTriangle.setDimensions(side)

    for (shape in shapes){
        shape.printDimensions()
        println("The area of ${shape.name} is ${shape.getArea()}\n")
    }

}