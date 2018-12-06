package com.haider.android.firstselfappfootball

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    var realScore = 0
    var braScore = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BarcelonaGoal.setOnClickListener {
            BarcaTeam()
        }
        realGoal.setOnClickListener {
            RealmadridTeam()
        }
        resetButton.setOnClickListener {
            resetmatch()
        }
        finishbutton.setOnClickListener {
            finishmatch()
        }
    }

    fun RealmadridTeam() {
        realScore++
        textGoalReal.text = realScore.toString()
    }

    fun BarcaTeam() {
        braScore++
        textGoalbarca.text = braScore.toString()
    }

    fun resetmatch() {
        realScore = 0
        braScore = 0
        textGoalReal.text = realScore.toString()
        textGoalbarca.text = braScore.toString()
    }

    fun finishmatch() {
        val finalscore: String
        if (braScore > realScore) {
            finalscore = "Barcelona Win!"
        } else if (realScore > braScore) {
            finalscore = "Realmadrid Win!"
        } else {
            finalscore = "Draw!"
        }
        Toast.makeText(this, finalscore?.toString(), Toast.LENGTH_LONG).show()

    }
}













