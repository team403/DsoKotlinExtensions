package com.dso.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * @author Moriafly
 * @since 2021-09-06
 */
open class LifeActivity: AppCompatActivity() {

    lateinit var activityLife: ActivityLife

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityLife = ActivityLife.ON_CREATE
    }

    override fun onResume() {
        super.onResume()
        activityLife = ActivityLife.ON_RESUME
    }

    override fun onStart() {
        super.onStart()
        activityLife = ActivityLife.ON_START
    }

    override fun onPause() {
        super.onPause()
        activityLife = ActivityLife.ON_PAUSE
    }

    override fun onStop() {
        super.onStop()
        activityLife = ActivityLife.ON_STOP
    }

    override fun onDestroy() {
        super.onDestroy()
        activityLife = ActivityLife.ON_DESTROY
    }

    override fun onRestart() {
        super.onRestart()
        activityLife = ActivityLife.ON_RESTART
    }

}