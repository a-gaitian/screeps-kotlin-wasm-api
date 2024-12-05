package screeeps.api.global

typealias ResultCode = JsNumber

typealias ErrorCode = ResultCode

external val OK: ErrorCode // 0
external val ERR_NOT_OWNER: ErrorCode // -1
external val ERR_NO_PATH: ErrorCode // -2
external val ERR_NAME_EXISTS: ErrorCode // -3
external val ERR_BUSY: ErrorCode // -4
external val ERR_NOT_FOUND: ErrorCode // -5
external val ERR_NOT_ENOUGH_ENERGY: ErrorCode // -6
external val ERR_NOT_ENOUGH_RESOURCES: ErrorCode // -6
external val ERR_INVALID_TARGET: ErrorCode // -7
external val ERR_FULL: ErrorCode // -8
external val ERR_NOT_IN_RANGE: ErrorCode // -9
external val ERR_INVALID_ARGS: ErrorCode // -10
external val ERR_TIRED: ErrorCode // -11
external val ERR_NO_BODYPART: ErrorCode // -12
external val ERR_NOT_ENOUGH_EXTENSIONS: ErrorCode // -6
external val ERR_RCL_NOT_ENOUGH: ErrorCode // -14
external val ERR_GCL_NOT_ENOUGH: ErrorCode // -15

typealias FindCode = ResultCode

external val FIND_EXIT_TOP: FindCode //1
external val FIND_EXIT_RIGHT: FindCode //3
external val FIND_EXIT_BOTTOM: FindCode //5
external val FIND_EXIT_LEFT: FindCode //7
external val FIND_EXIT: FindCode //10
external val FIND_CREEPS: FindCode //101
external val FIND_MY_CREEPS: FindCode //102
external val FIND_HOSTILE_CREEPS: FindCode //103
external val FIND_SOURCES_ACTIVE: FindCode //104
external val FIND_SOURCES: FindCode //105
external val FIND_DROPPED_RESOURCES: FindCode //106
external val FIND_STRUCTURES: FindCode //107
external val FIND_MY_STRUCTURES: FindCode //108
external val FIND_HOSTILE_STRUCTURES: FindCode //109
external val FIND_FLAGS: FindCode //110
external val FIND_CONSTRUCTION_SITES: FindCode //111
external val FIND_MY_SPAWNS: FindCode //112
external val FIND_HOSTILE_SPAWNS: FindCode //113
external val FIND_MY_CONSTRUCTION_SITES: FindCode //114
external val FIND_HOSTILE_CONSTRUCTION_SITES: FindCode //115
external val FIND_MINERALS: FindCode //116
external val FIND_NUKES: FindCode //117
external val FIND_TOMBSTONES: FindCode //118
external val FIND_POWER_CREEPS: FindCode //119
external val FIND_MY_POWER_CREEPS: FindCode //120
external val FIND_HOSTILE_POWER_CREEPS: FindCode //121
external val FIND_DEPOSITS: FindCode //122
external val FIND_RUINS: FindCode //123