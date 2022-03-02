package com.lolozianas.missingletters.ui.game

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.lolozianas.missingletters.R
import com.lolozianas.missingletters.databinding.FragmentStartBinding


/**
 * [StartFragment] a fragment that gives the user to navigate to SettingsFragment to change
 * setting's app and to start the game.
 */
class StartFragment : Fragment() {

    private var _binding: FragmentStartBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentStartBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // Assign the start fragment
        binding.startFragment = this
    }

    /**
     * Navigate to startFragment to start the game
     * */
    fun startGame() {
        findNavController().navigate(R.id.action_startFragment_to_frameFragment)
    }

    /**
     * Navigate to settingsFragment to make changes on the game
     * */
    fun settings() {
        findNavController().navigate(R.id.action_startFragment_to_settingsFragment)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}