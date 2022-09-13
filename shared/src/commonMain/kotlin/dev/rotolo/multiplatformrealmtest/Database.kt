package dev.rotolo.multiplatformrealmtest

import io.realm.kotlin.Realm
import io.realm.kotlin.RealmConfiguration


class Database {
    companion object{
        lateinit var realm: Realm

        fun initRealm(){
            var configuration = RealmConfiguration.Builder(setOf(
                MyException::class,
            ))
                .schemaVersion(3)
                .deleteRealmIfMigrationNeeded()
                .build()
            realm = Realm.open(configuration)
        }
    }
}