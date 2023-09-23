class ColoredPoint(x: Double, y: Double, var color: String) : Point(x, y) {

    constructor(coordinates: Pair<Double, Double>, color: String) : this(coordinates.first, coordinates.second, color)

    override fun getInfo(): String {
        return "${super.getInfo()}, Цвет- $color"
        //запускает функцию getInfo наследованного класса Point
    }
}