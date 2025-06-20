package vcmsa.ci.gametesterlogact

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnStart:Button
    private lateinit var btnExit:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnStart = findViewById(R.id.btnStart)
        btnExit = findViewById(R.id.btnExit)

        btnStart.setOnClickListener{MainScr()}
        btnExit.setOnClickListener{Quit()}
    }

    private fun MainScr(){
        val intent = Intent(this, MainScreen::class.java)
        startActivity(intent)
    }

    private fun Quit(){
    finishAffinity()
    }

}