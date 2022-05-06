package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        playGame()
        newGame()
    }

    private fun playGame() {
        val b1 = findViewById<Button>(R.id.btn_0)
        val b2 = findViewById<Button>(R.id.btn_1)
        val b3 = findViewById<Button>(R.id.btn_2)
        val b4 = findViewById<Button>(R.id.btn_3)
        val b5 = findViewById<Button>(R.id.btn_4)
        val b6 = findViewById<Button>(R.id.btn_5)
        val b7 = findViewById<Button>(R.id.btn_6)
        val b8 = findViewById<Button>(R.id.btn_7)
        val b9 = findViewById<Button>(R.id.btn_8)
        val currPlayer = findViewById<TextView>(R.id.player)
        b1.setOnClickListener {
            if (currPlayer.text.contains("X")) {
                b1.text = "X"
                b1.isEnabled = false
                switch()
            } else if (currPlayer.text.contains("O")) {
                b1.text = "O"
                b1.isEnabled = false
                switch()
            }
        }
        b2.setOnClickListener {
            if (currPlayer.text.contains("X")) {
                b2.text = "X"
                b2.isEnabled = false
                switch()
            } else if (currPlayer.text.contains("O")) {
                b2.text = "O"
                b2.isEnabled = false
                switch()
            }
        }
        b3.setOnClickListener {
            if (currPlayer.text.contains("X")) {
                b3.text = "X"
                b3.isEnabled = false
                switch()
            } else if (currPlayer.text.contains("O")) {
                b3.text = "O"
                b3.isEnabled = false
                switch()
            }
        }
        b4.setOnClickListener {
            if (currPlayer.text.contains("X")) {
                b4.text = "X"
                b4.isEnabled = false
                switch()
            } else if (currPlayer.text.contains("O")) {
                b4.text = "O"
                b4.isEnabled = false
                switch()
            }
        }
        b5.setOnClickListener {
            if (currPlayer.text.contains("X")) {
                b5.text = "X"
                b5.isEnabled = false
                switch()
            } else if (currPlayer.text.contains("O")) {
                b5.text = "O"
                b5.isEnabled = false
                switch()
            }
        }
        b6.setOnClickListener {
            if (currPlayer.text.contains("X")) {
                b6.text = "X"
                b6.isEnabled = false
                switch()
            } else if (currPlayer.text.contains("O")) {
                b6.text = "O"
                b6.isEnabled = false
                switch()
            }
        }
        b7.setOnClickListener {
            if (currPlayer.text.contains("X")) {
                b7.text = "X"
                b7.isEnabled = false
                switch()
            } else if (currPlayer.text.contains("O")) {
                b7.text = "O"
                b7.isEnabled = false
                switch()
            }
        }
        b8.setOnClickListener {
            if (currPlayer.text.contains("X")) {
                b8.text = "X"
                b8.isEnabled = false
                switch()
            } else if (currPlayer.text.contains("O")) {
                b8.text = "O"
                b8.isEnabled = false
                switch()
            }
        }
        b9.setOnClickListener {
            if (currPlayer.text.contains("X")) {
                b9.text = "X"
                b9.isEnabled = false
                switch()
            } else if (currPlayer.text.contains("O")) {
                b9.text = "O"
                b9.isEnabled = false
                switch()
            }
        }
    }

    fun switch(){
        val currPlayer = findViewById<TextView>(R.id.player)
        if(currPlayer.text.contains("X")) {
            currPlayer.text = "Player O's Turn"
        }
        else if(currPlayer.text.contains("O")) {
            currPlayer.text = "Player X's Turn"
        }
    }

    fun newGame(){
        val btn = arrayOf(
            findViewById<Button>(R.id.btn_0),
            findViewById<Button>(R.id.btn_1),
            findViewById<Button>(R.id.btn_2),
            findViewById<Button>(R.id.btn_3),
            findViewById<Button>(R.id.btn_4),
            findViewById<Button>(R.id.btn_5),
            findViewById<Button>(R.id.btn_6),
            findViewById<Button>(R.id.btn_7),
            findViewById<Button>(R.id.btn_8)
        )
        val currPlayer = findViewById<TextView>(R.id.player)
        val newGame = findViewById<Button>(R.id.newGame)
        newGame.setOnClickListener{
            currPlayer.text = ("Player X's turn")

            for (btn in btn){
                btn.isEnabled = true
                btn.text = ""
            }
        }
    }
}