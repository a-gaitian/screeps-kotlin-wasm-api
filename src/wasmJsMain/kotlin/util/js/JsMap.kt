package util.js

external interface JsMap<T: JsAny> : JsAny {
    operator fun <T: JsAny> get(key: JsString): T?
    operator fun <T: JsAny> get(key: JsNumber): T?
}

fun JsMap<*>.keys() =
    Object.keys(this)

fun <T: JsAny> JsMap<T>.values() =
    Object.values<T>(this)

fun <T: JsAny> JsMap<T>.entries() =
    Object.entries<T>(this)

/**
 * Converts to Kotlin Map
 */
fun <T: JsAny> JsMap<T>.toMap() = mapOf(
    *entries()
        .toArray()
        .map { it.toPair() }
        .toTypedArray()
)