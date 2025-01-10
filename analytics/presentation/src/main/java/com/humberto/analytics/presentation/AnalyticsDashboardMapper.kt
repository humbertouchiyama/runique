package com.humberto.analytics.presentation

import com.humberto.analytics.domain.AnalyticsValues
import com.humberto.core.presentation.ui.formatted
import com.humberto.core.presentation.ui.toFormattedKm
import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds
import kotlin.time.DurationUnit

fun Duration.toFormattedTotalTime(): String {
    val days = toLong(DurationUnit.DAYS)
    val hours = toLong(DurationUnit.HOURS) % 24
    val minutes = toLong(DurationUnit.MINUTES) % 60

    return "${days}d ${hours}h ${minutes}m"
}

fun AnalyticsValues.toAnalyticsDashboardState(): AnalyticsDashboardState {
    return AnalyticsDashboardState(
        totalDistanceRun = (totalDistanceRun / 1000.0).toFormattedKm(),
        totalTimeRun = totalTimeRun.toFormattedTotalTime(),
        fastestEverRun = fastestEverRun.toFormattedKm(),
        avgDistance = avgDistancePerRun.toFormattedKm(),
        avgPace = avgPacePerRun.seconds.formatted(),
    )
}