package com.example.capstoneproject.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.capstoneproject.R

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnMoveActivity: Button = findViewById(R.id.join)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity: Button = findViewById(R.id.log)
        btnMoveWithDataActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.join -> {
                val moveIntent = Intent(this@LoginActivity, JoinActivity::class.java)
                startActivity(moveIntent)
            }

            R.id.log -> {
                val moveWithDataIntent = Intent(this@LoginActivity, UserActivity::class.java)
                moveWithDataIntent.putExtra(UserActivity.EXTRA_NAME, "")
                startActivity(moveWithDataIntent)
            }
        }

    }
}