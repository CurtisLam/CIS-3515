class Square(_name: String): Shape(_name) {

    var length = 0.0
    var height = 0.0

    fun setDimensions(_length: Double, _height: Double){
        length = _length
        height = _height
    }

    override fun printDimensions() {
       println("The dimensions of $name is $length by $height")
    }

    override fun getArea(): Double {
        return length * height
    }
}