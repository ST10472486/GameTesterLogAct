package vcmsa.ci.gametesterlogact

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainScreen : AppCompatActivity() {
    private lateinit var etDate: EditText
    private lateinit var etMinutes: EditText
    private lateinit var btnFPS:RadioButton
    private lateinit var btnRPG:RadioButton
    private lateinit var btnIndie:RadioButton
    private lateinit var btnFG:RadioButton
    private lateinit var btnRate1:RadioButton
    private lateinit var btnRate2:RadioButton
    private lateinit var btnRate3:RadioButton
    private lateinit var btnRate4:RadioButton
    private lateinit var btnRate5:RadioButton
    private lateinit var btnAdd: Button
    private lateinit var btnClear: Button
    private lateinit var btnDetails:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_screen)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        etDate = findViewById(R.id.etDate)
        etMinutes = findViewById(R.id.etMinutes)
        btnFPS = findViewById(R.id.btnFPS)
        btnRPG = findViewById(R.id.btnRPG)
        btnIndie = findViewById(R.id.btnIndie)
        btnFG = findViewById(R.id.btnFG)
        btnRate1 = findViewById(R.id.btnRate1)
        btnRate2 = findViewById(R.id.btnRate2)
        btnRate3 = findViewById(R.id.btnRate3)
        btnRate4 = findViewById(R.id.btnRate4)
        btnRate5 = findViewById(R.id.btnRate5)
        btnAdd = findViewById(R.id.btnAdd)
        btnClear = findViewById(R.id.btnClear)
        btnDetails = findViewById(R.id.btnDetails)
    }
}