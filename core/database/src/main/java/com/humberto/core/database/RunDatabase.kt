package com.humberto.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.humberto.core.database.dao.AnalyticsDao
import com.humberto.core.database.dao.RunDao
import com.humberto.core.database.dao.RunPendingSyncDao
import com.humberto.core.database.entity.DeletedRunSyncEntity
import com.humberto.core.database.entity.RunEntity
import com.humberto.core.database.entity.RunPendingSyncEntity

@Database(
    entities = [
        RunEntity::class,
        RunPendingSyncEntity::class,
        DeletedRunSyncEntity::class
    ],
    version = 1
)
abstract class RunDatabase: RoomDatabase() {

    abstract val runDao: RunDao
    abstract val runPendingSyncDao: RunPendingSyncDao
    abstract val analyticsDao: AnalyticsDao
}