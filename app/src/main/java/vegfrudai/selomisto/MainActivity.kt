package vegfrudai.selomisto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText = findViewById(R.id.tvText)
        tvText?.setText(number.toString())
        CreateSimpleDialog()

    }
    private var number:Int = 0
    private var tvText: TextView? = null
    private fun CreateSimpleDialog()
    {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Thid is alert dialog")
        builder.show()
    }
}