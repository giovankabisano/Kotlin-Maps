package com.giovankabisano.kotlinmaps

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = findNavController(R.id.main_nav_host_fragment)
        val navGraph = navController.navInflater.inflate(R.navigation.main_graph)
        navGraph.startDestination = R.id.mapsFragment
        navController.graph = navGraph
    }
}