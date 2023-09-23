open class Line(var start: Point, var end: Point) : Steriometry() {
    override fun getInfo(): String {
        return "Линия начало - (${start.x}, ${start.y}) конец - (${end.x}, ${end.y})"
    }
}
