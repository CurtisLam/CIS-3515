class Circle(_name: String): Shape(_name) {

    val PI : Double = 3.14
    var radius: Double = 0.0

    fun setDimensions(_radius: Double){
        radius = _radius
    }

    override fun printDimensions() {
        println("The radius of the $name is $radius.")
    }

    override fun getArea(): Double {
        return PI * radius * radius
    }
}