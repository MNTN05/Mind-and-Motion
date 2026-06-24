package com.mindandmotion.app

import android.app.Application
import com.mindandmotion.app.di.AppContainer

class MindAndMotionApp : Application() {

    lateinit var container: AppContainer
        private set

    override fun onCreate() {
        super.onCreate()
        container = AppContainer(applicationContext)
    }
}
