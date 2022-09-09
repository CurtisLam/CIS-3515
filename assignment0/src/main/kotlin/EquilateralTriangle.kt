import kotlin.math.pow
import kotlin.math.sqrt

class EquilateralTriangle(_name: String) : Triangle(_name) {

    var side: Double = 0.0

    fun setDimensions(_side: Double){
        side = _side
    }

    override fun printDimensions() {
        println("The side of $name is $side")
    }

    override fun getArea(): Double {
        return (sqrt(3.0) / 4 * side.pow(2))
    }

}