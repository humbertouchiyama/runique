package com.humberto.analytics.presentation

sealed interface AnalyticsAction {
    data object OnBackClick: AnalyticsAction
}