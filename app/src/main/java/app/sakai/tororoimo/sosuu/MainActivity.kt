package app.sakai.tororoimo.sosuu

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    companion object {
        private const val QUESTION_COUNT: Int = 10
    }

    var random: Random = Random()
    val questions: IntArray = IntArray(QUESTION_COUNT)
    var point : Int = 0
    var answerCount: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 0 until QUESTION_COUNT) {
            val number = random.nextInt(1000)
            Log.d("Number", "Question" + number.toString())
            questions[i] = number
        }

        point = 0
        answerCount = 0

        textView.text = questions[answerCount].toString() + ""
        textView.setTextColor(Color.BLACK)
    }
    }
