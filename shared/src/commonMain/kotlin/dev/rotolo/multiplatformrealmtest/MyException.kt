package dev.rotolo.multiplatformrealmtest

import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey

class MyException: RealmObject {
    @PrimaryKey
    var id: Int = 0
    var message: String = ""
}