package com.example.democonstraint20.recyclerliner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.democonstraint20.R
import com.trunghoang.generalapp.DoubleRecyclerFragment
import com.trunghoang.generalapp.DoubleRecyclerLinear

class LinearActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        openFragment(DoubleRecyclerLinear.newInstance())
    }

    private fun openFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .add(R.id.constraintMain, fragment)
            .commit()
    }
}
