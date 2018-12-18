package com.wstszx.jetpacksimple

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation.findNavController
import com.wstszx.jetpacksimple.ui.main.MainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

    }

    override fun onSupportNavigateUp() =
        findNavController(this, R.id.fragment).navigateUp() || super.onSupportNavigateUp()


}
