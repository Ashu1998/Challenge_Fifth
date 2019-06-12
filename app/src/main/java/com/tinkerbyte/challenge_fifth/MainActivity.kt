package com.tinkerbyte.challenge_fifth

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun myFun(v: View){
        val selectedId: Int = mRadioGroup.checkedRadioButtonId
        val mRadioButton: RadioButton = findViewById(selectedId)
        when(mRadioButton){
            first->{ mTextView.text = "You have selected First Button"

            }
            second->{ mTextView.text = "You have selected Second Button"

            }
            third->{ mTextView.text = "You have selected Third Button"

            }
            fourth->{ mTextView.text = "You have selected Fourth Button"
            }
            else -> {
                mTextView.text = "Nothing Selected"
            }
        }

    }

}
