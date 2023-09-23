fun main() {
    // Создание экземпляров классов
    val point = Point(1.4, 2.0)
    val coloredPoint = ColoredPoint(3.0, 4.0, "Красный")
    val line = Line(Point(4.0,1.0),Point(5.0,4.0))
    val coloredLine = ColoredLine(point, coloredPoint, "Синий")

    // Создание массива с элементами базового класса Shape
    val shapes = arrayOf<Steriometry>(point, coloredPoint, line, coloredLine)

    // Использование элементов массива
    for (shape in shapes) {
        println(shape.getInfo())
    }
    // Создание экземпляра класса Polygon параметрами
    val polygon = Polygon(point, coloredPoint, Point(5.0, 6.0), Point(7.0, 8.0))

    // Использование экземпляра класса Polygon
    println(polygon.getInfo())

    // Изменение полей и вызов методов
    polygon.moveX(2.0)
    polygon.moveY(3.0)
    polygon.moveXY(1.0, 2.0)

    println("После перемещение: ${polygon.getInfo()}")
}