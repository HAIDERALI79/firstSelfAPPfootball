package com.haider.android.firstselfappfootball

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    var RealScore = 0
    var braScore = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BarcelonaGoal.setOnClickListener {
            BarcaTeam()
        }
        RealGoal.setOnClickListener {
            RealmadridTeam()
        }
        ResetButton.setOnClickListener {
            resetmatch()
        }
        Finishbutton.setOnClickListener {
            finishmatch()
        }
    }

    fun RealmadridTeam() {
        RealScore++
        TextGoalReal.text = RealScore.toString()
    }

    fun BarcaTeam() {
        braScore++
        TextGoalbarca.text = braScore.toString()
    }

    fun resetmatch() {
        RealScore = 0
        braScore = 0
        TextGoalReal.text = RealScore.toString()
        TextGoalbarca.text = braScore.toString()
    }

    fun finishmatch() {
        val finalscore: String
        if (braScore > RealScore) {
            finalscore = "Barcelona Win!"
        } else if (RealScore > braScore) {
            finalscore = "Realmadrid Win!"
        } else {
            finalscore = "Draw!"
        }
        Toast.makeText(this, finalscore?.toString(), Toast.LENGTH_LONG).show()

    }
}













