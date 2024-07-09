package com.example.portfolioapp

data class Project(
    val projectName: String,
    val projectDesc: String,
    val projectImage: Int
)

val projects = listOf(
    Project("EyeWitness App", "Kotlin, Jetpack Compose, Firebase, Google Maps, CameraX, RestAPI", R.drawable.eyewitnessui),
    Project("Hostel Problems App", "Kotlin, Jetpack Compose, Firebase", R.drawable.ic_launcher_background),
    Project("WearOS Daily jokes", "Kotlin, Jetpack Compose, Git, Android Studio, MVVM Architecture", R.drawable.ic_launcher_background),
    Project("WhatsApp Clone", "Kotlin, Jetpack Compose, Git, Android Studio, MVVM Architecture", R.drawable.ic_launcher_background),
    Project("Location Tracker", "Kotlin, Jetpack Compose, Git, Android Studio, MVVM Architecture", R.drawable.ic_launcher_background),
    Project("Portfolio App", "Kotlin, Jetpack Compose, Git, Android Studio, MVVM Architecture", R.drawable.ic_launcher_background)
)


