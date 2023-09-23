open class Point(var x: Double, var y: Double) : Steriometry() {

    constructor(coordinates: Pair<Double, Double>) : this(coordinates.first, coordinates.second)

    override fun getInfo(): String {
        return "Точка с координатами ($x; $y)"
    }
}