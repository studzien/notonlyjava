package com.example.helloscala
 
import android.os.Bundle
import android.app.Activity
import android.view.Menu
import android.util.Log
import android.widget.TextView
 
class MainActivity extends Activity {
        override def onCreate(savedInstanceState : Bundle) : Unit = {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
                var text : TextView = findViewById(R.id.message_field).asInstanceOf[TextView]
                text.setText("Hello World from Scala!")
        }
 
        override def onCreateOptionsMenu(menu : Menu) : Boolean = {
                getMenuInflater().inflate(R.menu.main, menu)
                return true
        }
}