package com.rezarinaldi.simpleviewmodel.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rezarinaldi.simpleviewmodel.model.Score

class CounterViewModel : ViewModel() {
    private var scoreMutableLiveData: MutableLiveData<Score> = MutableLiveData()
    private var score: Score = Score()

    val scoreLiveData: LiveData<Score>
        get() = scoreMutableLiveData

    fun addPointHome(point: Int) {
        score.homeScore += point
        scoreMutableLiveData.value = score
    }

    fun addPointAway(point: Int) {
        score.awayScore += point
        scoreMutableLiveData.value = score
    }

    fun resetPoint() {
        score.homeScore = 0
        score.awayScore = 0
        scoreMutableLiveData.value = score
    }
}