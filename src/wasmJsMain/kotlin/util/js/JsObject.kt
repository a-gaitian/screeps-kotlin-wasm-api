package util.js

@JsName("Object")
external object Object : JsAny {

    fun keys(jsObject: JsAny): JsArray<JsString>

    fun <T: JsAny> values(jsObject: JsAny): JsArray<T>

    fun <T: JsAny> entries(jsObject: JsAny): JsArray<JsEntry<T>>
}