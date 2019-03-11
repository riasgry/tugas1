package com.example.dice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val putarButton: Button = findViewById(R.id.btn_r)
        putarButton.text = "Let's GO!"
        putarButton.setOnClickListener {
            kocokDadu()
            kocokDadu2()
        }
    }

    private fun kocokDadu2() {
        val randomInt2 = Random().nextInt(13)+1
        val drawableResource = when (randomInt2){
            1-> R.drawable.w_1
            2-> R.drawable.w_2
            3-> R.drawable.w_3
            4-> R.drawable.w_4
            5-> R.drawable.w_5
            6-> R.drawable.w_6
            7-> R.drawable.w_7
            8-> R.drawable.w_8
            9-> R.drawable.w_9
            10-> R.drawable.w_10
            11-> R.drawable.w_11
            12-> R.drawable.w_12
            else
            -> R.drawable.w_13
        }

        val diceImage2 : ImageView = findViewById(R.id.w_image)
        diceImage2.setImageResource(drawableResource)
    }


    private fun kocokDadu() {
        val randomInt = Random().nextInt(45)+1
        val drawableResource = when (randomInt){
            1-> R.drawable.l_1
            2-> R.drawable.l_2
            3-> R.drawable.l_3
            4-> R.drawable.l_4
            5-> R.drawable.l_5
            6-> R.drawable.l_6
            7-> R.drawable.l_7
            8-> R.drawable.l_8
            9-> R.drawable.l_9
            10-> R.drawable.l_10
            11-> R.drawable.l_11
            12-> R.drawable.l_12
            13-> R.drawable.l_13
            14-> R.drawable.l_14
            15-> R.drawable.l_15
            16-> R.drawable.l_16
            17-> R.drawable.l_17
            18-> R.drawable.l_18
            19-> R.drawable.l_19
            20-> R.drawable.l_20
            21-> R.drawable.l_21
            22-> R.drawable.l_22
            23-> R.drawable.l_23
            24-> R.drawable.l_24
            25-> R.drawable.l_25
            26-> R.drawable.l_26
            27-> R.drawable.l_27
            28-> R.drawable.l_28
            29-> R.drawable.l_29
            30-> R.drawable.l_30
            31-> R.drawable.l_31
            32-> R.drawable.l_32
            33-> R.drawable.l_33
            34-> R.drawable.l_34
            35-> R.drawable.l_35
            36-> R.drawable.l_36
            37-> R.drawable.l_37
            38-> R.drawable.l_38
            39-> R.drawable.l_39
            40-> R.drawable.l_40
            41-> R.drawable.l_41
            42-> R.drawable.l_42
            43-> R.drawable.l_43
            44-> R.drawable.l_44
            else
            -> R.drawable.l_45

        }

        val diceImage : ImageView = findViewById(R.id.l_image)
        diceImage.setImageResource(drawableResource)
    }

}
