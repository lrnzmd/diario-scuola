package com.example.diarioscuola

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import com.example.diarioscuola.Appunti.Appunti
import com.example.diarioscuola.Calendario.Calendario
import com.example.diarioscuola.Compiti.Compiti
import com.example.diarioscuola.Impostazioni.Impostazioni
import com.example.diarioscuola.Lezioni.Lezioni
import com.example.diarioscuola.News.News

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button1 = findViewById(R.id.button1) as Button
        button1.setOnClickListener {val intent = Intent(this, Lezioni::class.java)
            startActivity(intent)
        }

        val button2 = findViewById(R.id.button2) as Button
        button2.setOnClickListener {val intent = Intent(this, Compiti::class.java)
            startActivity(intent)
        }

        val button3 = findViewById(R.id.button3) as Button
       button3.setOnClickListener {val intent = Intent(this, Appunti::class.java)
            startActivity(intent)
        }

        val button4 = findViewById(R.id.button4) as Button
        button4.setOnClickListener {val intent = Intent(this, Calendario::class.java)
            startActivity(intent)
        }

        val button5 = findViewById(R.id.button5) as Button
        button5.setOnClickListener {val intent = Intent(this, Impostazioni::class.java)
            startActivity(intent)
        }

        val button6 = findViewById(R.id.button6) as Button
        button6.setOnClickListener {
            val intent = Intent(this, News::class.java)
            startActivity(intent)
        }

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean  {
        // Handle item selection

        return when (item.itemId) {
            R.id.button_home -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                true
            }

            R.id.button_compiti -> {
                val intent = Intent(this, Compiti::class.java)
                startActivity(intent)
                true
            }

            R.id.button_lezioni -> {
                val intent = Intent(this, Lezioni::class.java)
                startActivity(intent)
                true
            }

            R.id.button_calendario -> {
                val intent = Intent(this, Calendario::class.java)
                startActivity(intent)
                true
            }

            R.id.button_appunti -> {
                val intent = Intent(this, Appunti::class.java)
                startActivity(intent)
                true
            }

            R.id.button_news -> {
                val intent = Intent(this, News::class.java)
                startActivity(intent)
                true
            }

            R.id.button_impostazioni -> {
                val intent = Intent(this, Impostazioni::class.java)
                startActivity(intent)
                true
            }


            else -> super.onOptionsItemSelected(item)
        }
    }

}
