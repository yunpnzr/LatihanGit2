class TriangleArea(){
    fun triangeArea(base: Int,tall: Int): Int = base*tall*1/2
    fun trianglePerimeter(width: Int) = width*3
}

fun main() {
    println(TriangleArea().triangeArea(2,2))
    println(TriangleArea().trianglePerimeter(2))
}