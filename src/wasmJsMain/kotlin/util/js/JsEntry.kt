package util.js

external class JsEntry<T: JsAny> : JsAny {
    operator fun <T: JsAny> get(key: JsNumber): T?
    operator fun <T: JsAny> get(key: Int): T?

    operator fun <T: JsAny> set(key: JsNumber, value: T)
    operator fun <T: JsAny> set(key: Int, value: T)
}

operator fun JsEntry<*>.component1(): JsString =
    get(0)!!

operator fun <T: JsAny> JsEntry<T>.component2(): T =
    get(1)!!

val JsEntry<*>.key: JsString
    get() = component1()

val <T: JsAny> JsEntry<T>.value: T
    get() = component2()

fun <T: JsAny> JsEntry<T>.toPair() =
    Pair(key.toString(), value)