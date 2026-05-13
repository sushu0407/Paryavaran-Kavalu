package com.paryavaran.kavalu.utils

object EcoKarmaCalculator {
    fun calculateLevel(points: Int): Int = when {
        points < 100 -> 1
        points < 300 -> 2
        points < 600 -> 3
        points < 1000 -> 4
        points < 1500 -> 5
        else -> 6
    }

    fun getLevelName(level: Int): String = when (level) {
        1 -> "Eco Beginner"
        2 -> "Waste Warrior"
        3 -> "Clean Captain"
        4 -> "Green Guardian"
        5 -> "Environmental Hero"
        6 -> "Planet Protector"
        else -> "Eco Champion"
    }

    fun progressToNextLevel(points: Int): Int {
        val floor = listOf(0, 100, 300, 600, 1000, 1500).last { points >= it }
        val next = listOf(100, 300, 600, 1000, 1500, 2000).first { points < it }
        return (((points - floor).toFloat() / (next - floor)) * 100).toInt().coerceIn(0, 100)
    }
}
