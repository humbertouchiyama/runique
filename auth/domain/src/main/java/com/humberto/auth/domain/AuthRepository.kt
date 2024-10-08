package com.humberto.auth.domain

import com.humberto.core.domain.util.DataError
import com.humberto.core.domain.util.EmptyResult

interface AuthRepository {
    suspend fun login(email: String, password: String): EmptyResult<DataError.Network>
    suspend fun register(email: String, password: String): EmptyResult<DataError.Network>
}