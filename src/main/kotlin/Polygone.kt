class Polygon(start: Point, end: Point, vararg var vertices: Point) : Line(start, end) {
    //принимает переменное количество параметров одного типа
    constructor(startCoordinates: Pair<Double, Double>, endCoordinates: Pair<Double, Double>, vararg vertices: Pair<Double, Double>)
            : this(Point(startCoordinates), Point(endCoordinates), *vertices.map { Point(it) }.toTypedArray())

    override fun getInfo(): String {
        val verticesInfo = vertices.joinToString(", ") { "(${it.x}, ${it.y})" }
        return "Вершины: [$verticesInfo]"
    }

    // Метод для перемещения по оси OX
    fun moveX(distance: Double) {
        start.x += distance
        end.x += distance
        vertices.forEach { it.x += distance }
    }

    // Метод для перемещения по оси OY
    fun moveY(distance: Double) {
        start.y += distance
        end.y += distance
        vertices.forEach { it.y += distance }
    }

    // Метод для перемещения по обеим осям одновременно
    fun moveXY(deltaX: Double, deltaY: Double) {
        moveX(deltaX)
        moveY(deltaY)
    }
}