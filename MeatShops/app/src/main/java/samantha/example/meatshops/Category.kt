package samantha.example.meatshops

import android.content.Context
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteStatement
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Category : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        val ed1: EditText = findViewById(R.id.user)
        val ed2: EditText = findViewById(R.id.Password)
        val b1: Button = findViewById(R.id.btn1)
        val b2: Button = findViewById(R.id.btn2)

        fun insert() {
            val any = try {
                val category: String = ed1.getText().toString()
                val description: String = ed2.getText().toString()
                val db: SQLiteDatabase =
                    openOrCreateDatabase("superpos", Context.MODE_PRIVATE, null)
                db.execSQL("CREATE TABLE IF NOT EXISTS category(id INTEGER PRIMARY KEY AUTOINCREMENT,category VARCHAR,catdes VARCHAR)")
                val sql: String = "insert into category (category,catdes)values(?,?)"
                val statement: SQLiteStatement? = db.compileStatement(sql)
                statement?.bindString(1, category)
                statement?.bindString(1, description)
                statement?.execute()
                Toast.makeText(this, "category created", Toast.LENGTH_LONG).show()
                ed1.setText("")
                ed2.setText("")
                ed1.requestFocus()
            } catch (e: Exception) {
                Toast.makeText(this, "category failed", Toast.LENGTH_LONG).show()
            }
        }

        b1.setOnClickListener {
            fun onClick(){
                insert()
            }
        }
        b2.setOnClickListener {
            fun onClick() {
                val i = Intent(this, Category::class.java)
                startActivity(i)
            }
        }


        }
    }
