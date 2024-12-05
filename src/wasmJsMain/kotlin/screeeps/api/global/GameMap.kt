package screeeps.api.global

import screeeps.api.prototypes.Room
import util.js.JsMap

/**
 * A global object representing world map. Use it to navigate between rooms
 */
external class GameMap : JsAny {

    /**
     * List all exits available from the room with the given name
     *
     * @param roomName the room name
     *
     * @return The exits information, or null if the room not found
     */
    fun describeExits(roomName: String): JsMap<JsString>?

    /**
     * Find the exit direction from the given room en route to another room
     *
     * @param fromRoom start room object
     * @param toRoom finish room object
     * @param opts An object with the pathfinding options
     *
     * @return The room direction constant, one of the following:
     *
     * [FIND_EXIT_TOP]
     *
     * [FIND_EXIT_RIGHT]
     *
     * [FIND_EXIT_BOTTOM]
     *
     * [FIND_EXIT_LEFT]
     *
     * Or one of the following error codes:
     *
     * [ERR_NO_PATH] - Path can not be found
     *
     * [ERR_INVALID_ARGS] - The location is incorrect
     */
    fun findExit(fromRoom: Room, toRoom: Room, opts: RouteOpts? = definedExternally): ResultCode
    /**
     * @see findExit
     */
    fun findExit(fromRoom: JsString, toRoom: JsString, opts: RouteOpts? = definedExternally): ResultCode

    /**
     * Find route from the given room to another room
     *
     * @param fromRoom start room object
     * @param toRoom finish room object
     * @param opts An object with the pathfinding options
     *
     * @return The route array or one of the following error codes:
     *
     * [ERR_NO_PATH] - Path can not be found
     */
    fun findRoute(fromRoom: Room, toRoom: Room, opts: RouteOpts? = definedExternally): JsAny
    /**
     * @see findRoute
     */
    fun findRoute(fromRoom: JsString, toRoom: JsString, opts: RouteOpts? = definedExternally): JsAny

    /**
     * @see routeCallback
     * @see mapRouteOpts
     */
    @JsName("Object")
    class RouteOpts : JsAny {

        /**
         * This callback can be used to calculate the cost of entering that room.
         * You can use this to do things like prioritize your own rooms, or avoid some rooms.
         * You can return a floating point cost or _Infinity_ to block the room
         */
        var routeCallback: (roomName: JsString, fromRoomName: JsString) -> JsNumber
    }

    class RouteEntry : JsAny {
        val exit: FindCode
        val room: JsString
    }
}

fun mapRouteOpts(routeCallback: (roomName: JsString, fromRoomName: JsString) -> JsNumber) =
    GameMap.RouteOpts().apply { this.routeCallback = routeCallback }