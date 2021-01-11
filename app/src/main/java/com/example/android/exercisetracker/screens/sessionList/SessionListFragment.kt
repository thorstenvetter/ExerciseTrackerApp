package com.example.android.exercisetracker.screens.sessionList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.exercisetracker.R
import com.example.android.exercisetracker.databinding.FragmentSessionListBinding

class SessionListFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentSessionListBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_session_list, container, false)

        @Suppress("UNUSED_VARIABLE")
        val application = requireNotNull(activity).application

        //Recyclerview
        val adapter = SessionListAdapter()
        binding.recyclerview.adapter = adapter
        binding.recyclerview.layoutManager = LinearLayoutManager(requireContext())

        //ListViewModel
        val sessionListViewModel = ViewModelProvider(this).get(SessionListViewModel::class.java)
        binding.sessionListViewModel = sessionListViewModel
        sessionListViewModel.readAllData.observe(viewLifecycleOwner, Observer { session ->
            adapter.setData(session)
        })
        binding.lifecycleOwner = this

        sessionListViewModel.navigateToAdd.observe(viewLifecycleOwner, Observer {
            if (it == true) {
                this.findNavController().navigate(
                        SessionListFragmentDirections.actionSessionListFragmentToSessionAddFragment()
                )
                sessionListViewModel.doneNavigating()
            }
        })

        return binding.root
    }
}