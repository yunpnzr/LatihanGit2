class TriangleArea(){
    fun triangeArea(base: Int,tall: Int): Int = base*tall*1/2
    fun trianglePerimeter(width: Int) = width*3
}

class Circle(private var radius: Double) {

    fun calculateArea(): Double{
        return Math.PI * radius * radius
    }

    fun calculateCircumfence(): Double{
        return Math.PI * 2 * radius
    }
}

fun main() {
    val circle = Circle(10.0)
    println("Area : ${circle.calculateArea()}")
    println("Circumfence : ${circle.calculateCircumfence()}")
    println(TriangleArea().triangeArea(2,2))
    println(TriangleArea().trianglePerimeter(2))
}