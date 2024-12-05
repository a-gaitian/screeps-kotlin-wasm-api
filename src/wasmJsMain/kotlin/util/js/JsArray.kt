package util.js

operator fun <T : JsAny?> JsArray<T>.get(index: Int): T? =
    jsArrayGet(this, index)

operator fun <T : JsAny?> JsArray<T>.set(index: Int, value: T) {
    jsArraySet(this, index, value)
}

@Suppress("RedundantNullableReturnType", "UNUSED_PARAMETER")
private fun <T : JsAny?> jsArrayGet(array: JsArray<T>, index: Int): T? =
    js("array[index]")

@Suppress("UNUSED_PARAMETER")
private fun <T : JsAny?> jsArraySet(array: JsArray<T>, index: Int, value: T) {
    js("array[index] = value")
}

/** Returns a new [Array] containing all the elements of this [JsArray]. */
fun <T : JsAny?> JsArray<T>.toArray(): Array<T> {
    @Suppress("UNCHECKED_CAST", "TYPE_PARAMETER_AS_REIFIED")
    return Array(this.length) { this[it] as T }
}

/** Returns a new [JsArray] containing all the elements of this [Array]. */
fun <T : JsAny?> Array<T>.toJsArray(): JsArray<T> {
    val destination = JsArray<T>()
    for (i in this.indices) {
        destination[i] = this[i]
    }
    return destination
}

/** Returns a new [List] containing all the elements of this [JsArray]. */
fun <T : JsAny?> JsArray<T>.toList(): List<T> {
    @Suppress("UNCHECKED_CAST")
    return List(length) { this[it] as T }
}

/** Returns a new [JsArray] containing all the elements of this [List]. */
fun <T : JsAny?> List<T>.toJsArray(): JsArray<T> {
    val destination = JsArray<T>()
    for (i in this.indices) {
        destination[i] = this[i]
    }
    return destination
}