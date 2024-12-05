package util.js

@JsName("Object")
open external class JsMap<T: JsAny> : JsAny {

    operator fun <T: JsAny> get(key: JsString): T?
    operator fun <T: JsAny> get(key: String): T?

    operator fun <T: JsAny> set(key: JsString, value: T)
    operator fun <T: JsAny> set(key: String, value: T)
}

fun JsMap<*>.keys() =
    JsObject.keys(this)

fun <T: JsAny> JsMap<T>.values() =
    JsObject.values<T>(this)

fun <T: JsAny> JsMap<T>.entries() =
    JsObject.entries<T>(this)

/**
 * Converts to Kotlin Map
 */
fun <T: JsAny> JsMap<T>.toMap() = mapOf(
    *entries()
        .toArray()
        .map { it.toPair() }
        .toTypedArray()
)

fun <T: JsAny> toJsMap(map: Map<String, T>) = JsMap<T>().apply {
    map.forEach { (key, value) -> this[key.toJsString()] = value }
}