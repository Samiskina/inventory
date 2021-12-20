package samantha.example.meatshops

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ed1:EditText = findViewById(R.id.user)
        val ed2:EditText = findViewById(R.id.Password)
        val b1:Button = findViewById(R.id.btn1)
        val b2:Button = findViewById(R.id.btn2)

        fun login(){
            val username = ed1.text.toString()
            val password = ed2.text.toString()

            if (username==("") || password==("")){
                Toast.makeText(this, "username or password is blank",Toast.LENGTH_LONG).show()
            }
            else if (username==("john") || password==("123")){
                val i = Intent(this, HomePage::class.java)
                startActivity(i)
            }
            else {
                Toast.makeText(this, "username or password don't match",Toast.LENGTH_LONG).show()
            }
        }
        b1.setOnClickListener {
            login()
        }
        b2.setOnClickListener {
            finish()
        }
    }
}