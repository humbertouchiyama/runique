package com.humberto.auth.data

import com.humberto.auth.domain.AuthRepository
import com.humberto.core.data.networking.post
import com.humberto.core.domain.util.DataError
import com.humberto.core.domain.util.EmptyResult
import io.ktor.client.HttpClient

class AuthRepositoryImpl(
    private val httpClient: HttpClient
): AuthRepository {

    override suspend fun register(email: String, password: String): EmptyResult<DataError.Network> {
        return httpClient.post<RegisterRequest, Unit>(
            route = "/register",
            body = RegisterRequest(
                email = email,
                password = password
            )
        )
    }
}