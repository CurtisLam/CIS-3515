import kotlin.math.sqrt

open class Triangle(_name: String) : Shape(_name) {

    var side1: Double = 0.0
    var side2: Double = 0.0
    var side3: Double = 0.0

    fun setDimensions(_side1:  Double, _side2: Double, _side3: Double){
        side1 = _side1
        side2 = _side2
        side3 = _side3
    }

    override fun printDimensions() {
        println("The three side of the $name are $side1, $side2 and $side3")
    }

    override fun getArea(): Double {
        val s: Double = (side1 + side2 + side3) / 2
        return sqrt((s * (s - side1) * (s - side2) * (s - side3)))
    }
}