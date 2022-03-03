package com.lolozianas.missingletters.ui.game

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.lolozianas.missingletters.R
import com.lolozianas.missingletters.databinding.FragmentSettingsBinding


/**
 * A simple [Fragment] subclass.
 * create an instance of this fragment.
 */
class SettingsFragment : Fragment() {

    // Instance of binding object to access to the fragment_settings.xml layout
    private var _binding: FragmentSettingsBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSettingsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // Assign setting fragment
        binding.settingsFragment = this
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun navigateToStart() {
        findNavController().navigate(R.id.action_settingsFragment_to_startFragment)
    }


}