package com.humberto.core.domain.run

import com.humberto.core.domain.util.DataError
import com.humberto.core.domain.util.EmptyResult
import kotlinx.coroutines.flow.Flow

interface RunRepository {
    fun getRuns(): Flow<List<Run>>
    suspend fun fetchRuns(): EmptyResult<DataError>
    suspend fun upsertRun(run: Run, mapPicture: ByteArray): EmptyResult<DataError>
    suspend fun deleteRun(id: RunId)
}