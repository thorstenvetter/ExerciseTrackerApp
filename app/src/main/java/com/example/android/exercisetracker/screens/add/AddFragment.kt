package com.example.android.exercisetracker.screens.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.View.INVISIBLE
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.android.exercisetracker.R
import com.example.android.exercisetracker.databinding.FragmentAddBinding

class AddFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {

        val binding: FragmentAddBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_add, container, false)

        val addViewModel = ViewModelProvider(this).get(AddViewModel::class.java)
        binding.addViewModel = addViewModel
        binding.lifecycleOwner = this

        addViewModel.eventSessionNoTimerStarted.observe(viewLifecycleOwner, Observer { hasStarted ->
            if (hasStarted) {
                binding.startButton.visibility = INVISIBLE
                binding.timeTextView.visibility = INVISIBLE
                binding.timerEditText.visibility = INVISIBLE
                Toast.makeText(context, "Exercise started without timer!", Toast.LENGTH_SHORT).show()
            }
        })

        addViewModel.eventSessionStarted.observe(viewLifecycleOwner, Observer {
            if (it) {
                binding.timerEditText.visibility = INVISIBLE
                binding.startButton.text = getString(R.string.start)
            }
        })

        addViewModel.eventSessionPaused.observe(viewLifecycleOwner, Observer {
            if (it) {
                binding.startButton.text = getString(R.string.pause)
                binding.timerEditText.visibility = INVISIBLE
            }
        })

        addViewModel.navigateToList.observe(viewLifecycleOwner, Observer {
            if (it == true) {
                this.findNavController().navigateUp()
                addViewModel.doneNavigating()
            }
        })

        return binding.root
    }
}