package com.example.android.exercisetracker.screens.sessionAdd

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
import com.example.android.exercisetracker.databinding.FragmentSessionAddBinding

class SessionAddFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {

        val binding: FragmentSessionAddBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_session_add, container, false)

        val sessionAddViewModel = ViewModelProvider(this).get(SessionAddViewModel::class.java)
        binding.sessionAddViewModel = sessionAddViewModel
        binding.lifecycleOwner = this

        sessionAddViewModel.eventSessionNoTimerStarted.observe(viewLifecycleOwner, Observer { hasStarted ->
            if (hasStarted) {
                binding.startButton.visibility = INVISIBLE
                binding.timeTextView.visibility = INVISIBLE
                binding.timerEditText.visibility = INVISIBLE
                Toast.makeText(context, "Exercise started without timer!", Toast.LENGTH_SHORT).show()
            }
        })

        sessionAddViewModel.eventSessionStarted.observe(viewLifecycleOwner, Observer {
            if (it) {
                binding.timerEditText.visibility = INVISIBLE
                binding.startButton.text = getString(R.string.pause)
            }
        })

        sessionAddViewModel.eventSessionPaused.observe(viewLifecycleOwner, Observer {
            if (it) {
                binding.startButton.text = getString(R.string.start)
                binding.timerEditText.visibility = INVISIBLE
            }
        })

        sessionAddViewModel.navigateToList.observe(viewLifecycleOwner, Observer {
            if (it == true) {
                this.findNavController().navigateUp()
                sessionAddViewModel.doneNavigating()
            }
        })

        return binding.root
    }
}