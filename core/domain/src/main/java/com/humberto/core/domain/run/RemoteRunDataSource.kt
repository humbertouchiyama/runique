package com.humberto.core.domain.run

import com.humberto.core.domain.util.DataError
import com.humberto.core.domain.util.EmptyResult
import com.humberto.core.domain.util.Result

interface RemoteRunDataSource {
    suspend fun getRuns(): Result<List<Run>, DataError.Network>
    suspend fun postRun(run: Run, mapPicture: ByteArray): Result<Run, DataError.Network>
    suspend fun deleteRun(id: String): EmptyResult<DataError.Network>
}