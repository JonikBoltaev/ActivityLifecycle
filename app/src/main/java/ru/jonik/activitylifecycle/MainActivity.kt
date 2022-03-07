package ru.jonik.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ru.jonik.activitylifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LifeCircle", "savedState: $savedInstanceState")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSecondActivity.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
        binding.btnMinimize.setOnClickListener {
            moveTaskToBack(false)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifeCircle", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifeCircle", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifeCircle", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifeCircle", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifeCircle", "onDestroy")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("LifeCircle", "onSaveInstanceState")
    }
}
