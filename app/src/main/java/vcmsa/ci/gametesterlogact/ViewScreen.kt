package vcmsa.ci.gametesterlogact

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ViewScreen : AppCompatActivity() {
    private lateinit var btnDisplay: Button
    private lateinit var btnMain:Button
    private lateinit var btnQuit:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_view_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnDisplay = findViewById(R.id.btnDisplay)
        btnMain = findViewById(R.id.btnMain)
        btnQuit = findViewById(R.id.btnQuit)

        btnMain.setOnClickListener{ReturnToMain()}
        btnDisplay.setOnClickListener{DisplayDetails()}
        btnQuit.setOnClickListener{QuitApp()}
    }

    private fun ReturnToMain(){
        val intent = Intent(this, MainScreen::class.java)
        startActivity(intent)
    }

    private fun DisplayDetails(){

    }

    private fun QuitApp(){
        finishAffinity()
    }

}