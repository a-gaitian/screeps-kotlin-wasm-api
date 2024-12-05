package util.js

external interface JsEntry<T: JsAny> : JsMap<T>

operator fun JsEntry<*>.component1(): JsString =
    get(0.toJsNumber())!!

operator fun <T: JsAny> JsEntry<T>.component2(): T =
    get(1.toJsNumber())!!

val JsEntry<*>.key: JsString
    get() = component1()

val <T: JsAny> JsEntry<T>.value: T
    get() = component2()

fun <T: JsAny> JsEntry<T>.toPair() =
    Pair(key.toString(), value)