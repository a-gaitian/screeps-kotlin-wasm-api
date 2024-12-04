package utility

operator fun <T: JsAny> JsArray<T>.iterator() = let { iterator {
    for (i in 0 until it.length) {
        yield(it[i]!!)
    }
}}

fun <T: JsAny> JsArray<T>.asIterable(): Iterable<T> = Iterable {
    this@asIterable.iterator()
}