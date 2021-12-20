package samantha.example.meatshops

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val b1: Button = findViewById(R.id.btn1)
        val b2: Button = findViewById(R.id.btn2)
        val b3: Button = findViewById(R.id.btn3)
        val b4: Button = findViewById(R.id.btn4)
        val b5: Button = findViewById(R.id.btn5)
        val b6: Button = findViewById(R.id.btn6)

        b1.setOnClickListener {
            fun onClick(){
                val i = Intent(this, Category::class.java)
                startActivity(i)
            }
        }
    }
}