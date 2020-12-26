package com.example.android.exercisetracker.screens.list

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
import com.example.android.exercisetracker.databinding.FragmentListBinding

class ListFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentListBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_list, container, false)

        //Recyclerview
        val adapter = ListAdapter()
        binding.recyclerview.adapter = adapter
        binding.recyclerview.layoutManager = LinearLayoutManager(requireContext())

        //ListViewModel
        val listViewModel = ViewModelProvider(this).get(ListViewModel::class.java)

        listViewModel.readAllData.observe(viewLifecycleOwner, Observer { session ->
            adapter.setData(session)
        })

        binding.listViewModel = listViewModel
        binding.lifecycleOwner = this

        listViewModel.navigateToAdd.observe(viewLifecycleOwner, Observer {
            if (it == true) {
                this.findNavController().navigate(
                        ListFragmentDirections.actionListFragmentToAddFragment()
                )
                listViewModel.doneNavigating()
            }
        })

        return binding.root
    }
}