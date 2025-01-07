package dokdogalmaegi.flyweight

object TextStyleFactory {
    private val styles = mutableMapOf<String, TextStyle>()

    private fun getStyleKey(font: String, size: Int, color: TextColor): String {
        return "$font[]$size[]$color"
    }

    fun getStyle(font: String, size: Int, color: TextColor): TextStyle {
        return styles.computeIfAbsent(getStyleKey(font, size, color)) {
            println("Creating new TextStyle")
            TextStyle(font, size, color)
        }
    }
}