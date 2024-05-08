package id.allana.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnArcade = findViewById<Button>(R.id.btn_arcade)
        val btnFps = findViewById<Button>(R.id.btn_fps)
        val btnFamily = findViewById<Button>(R.id.btn_family)
        val btnShooter = findViewById<Button>(R.id.btn_shooter)
        val btnSport = findViewById<Button>(R.id.btn_sport)
        val btnRacing = findViewById<Button>(R.id.btn_racing)
        val btnMorePopularAppsGames = findViewById<Button>(R.id.btn_more_popular_apps_games)


        btnArcade.setOnClickListener {
            btnArcade.setBackgroundColor(resources.getColor(R.color.blue))
        }

        btnFps.setOnClickListener {
            btnFps.setBackgroundColor(resources.getColor(R.color.red))
        }

        btnFamily.setOnClickListener {
            btnFamily.setBackgroundColor(resources.getColor(R.color.blue))
        }

        btnShooter.setOnClickListener {
            btnShooter.setBackgroundColor(resources.getColor(R.color.red))
        }

        btnSport.setOnClickListener {
            btnSport.setBackgroundColor(resources.getColor(R.color.blue))
        }

        btnRacing.setOnClickListener {
            btnRacing.setBackgroundColor(resources.getColor(R.color.red))
        }

        btnMorePopularAppsGames.setOnClickListener {
            btnMorePopularAppsGames.setBackgroundColor(resources.getColor(R.color.red))
        }


    }
}