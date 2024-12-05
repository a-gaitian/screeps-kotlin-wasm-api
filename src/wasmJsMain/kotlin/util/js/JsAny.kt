package util.js

/**
 * View JS object as a map
 */
fun <T: JsAny> JsAny.asJsMap() =
    this.unsafeCast<JsMap<T>>()

fun <T: JsAny> JsAny.toMap() =
    asJsMap<T>().toMap()
