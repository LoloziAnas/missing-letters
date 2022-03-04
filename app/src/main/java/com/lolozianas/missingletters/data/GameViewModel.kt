package com.lolozianas.missingletters.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class GameViewModel : ViewModel() {

    private val _score = MutableLiveData<Int>(15)
    val score: LiveData<Int> = _score

    private val _word = MutableLiveData<String>("Football")
    val word: LiveData<String> = _word

    private val _currentWordCount = MutableLiveData<String>()
    val currentWordCount: LiveData<String> = _currentWordCount


    fun getNextWord() {
        // Get a random word from the wordList
        val randomWord = allWordsList.random()
        // Convert the word to array of chars
        val tempChar = randomWord[Random(randomWord.length - 1).nextInt()]
    }
}