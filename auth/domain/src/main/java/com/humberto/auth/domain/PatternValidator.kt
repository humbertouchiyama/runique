package com.humberto.auth.domain

interface PatternValidator {
    fun matches(value: String): Boolean
}