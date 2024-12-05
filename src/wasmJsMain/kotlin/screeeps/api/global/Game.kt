package screeeps.api.global

import screeeps.api.prototypes.ConstructionSite
import util.js.JsMap

external object Game : JsAny {

    val constructionSites: JsMap<ConstructionSite>
}