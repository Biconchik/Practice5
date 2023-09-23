class ColoredLine(start: Point, end: Point, var color: String) : Line(start, end) {

    constructor(startCoordinates: Pair<Double, Double>, endCoordinates: Pair<Double, Double>, color: String) : this(Point(startCoordinates), Point(endCoordinates), color)

    override fun getInfo(): String {
        return "${super.getInfo()}, Цвет: $color"
    }
}