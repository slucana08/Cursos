package com.kotlin.cursos.cursos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cursos_textView.setOnClickListener {
            content_TextView.text = "${getString(R.string.app_name) + " :" +
                    "\n1. " + getString(R.string.angular) +
                    "\n2. " + getString(R.string.android) +
                    "\n3. " + getString(R.string.php) +
                    "\n4. " + getString(R.string.java)}"
            var myToast = Toast.makeText(this,getString(R.string.android),Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.CENTER,500,0)
            myToast.show()
        }
    }
}
