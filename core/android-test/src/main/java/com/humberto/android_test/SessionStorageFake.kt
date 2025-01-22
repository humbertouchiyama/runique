package com.humberto.android_test

import com.humberto.core.domain.util.AuthInfo
import com.humberto.core.domain.util.SessionStorage

class SessionStorageFake: SessionStorage {

    private var authInfo: AuthInfo? = null

    override suspend fun get(): AuthInfo? {
        return authInfo
    }

    override suspend fun set(info: AuthInfo?) {
        authInfo = info
    }
}