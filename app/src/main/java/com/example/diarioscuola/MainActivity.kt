package com.example.diarioscuola

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button1 = findViewById(R.id.button1) as Button
        // set on-click listener
        button1.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@MainActivity, "Lezioni.", Toast.LENGTH_SHORT).show()
        }

        val button2 = findViewById(R.id.button2) as Button
        // set on-click listener
        button2.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@MainActivity, "Compiti.", Toast.LENGTH_SHORT).show()
        }

        val button3 = findViewById(R.id.button3) as Button
        // set on-click listener
        button3.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@MainActivity, "Impostazioni.", Toast.LENGTH_SHORT).show()
        }

        val button4 = findViewById(R.id.button4) as Button
        // set on-click listener
        button4.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@MainActivity, "Calendario.", Toast.LENGTH_SHORT).show()
        }

        val button5 = findViewById(R.id.button5) as Button
        // set on-click listener
        button5.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@MainActivity, "Calendario.", Toast.LENGTH_SHORT).show()
        }

        val button6 = findViewById(R.id.button6) as Button
        // set on-click listener
        button6.setOnClickListener {
            // your code to perform when the user clicks on the button
            Toast.makeText(this@MainActivity, "Calendario.", Toast.LENGTH_SHORT).show()
        }

    }
}
