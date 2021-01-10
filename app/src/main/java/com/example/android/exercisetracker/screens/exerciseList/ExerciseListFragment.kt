package com.example.android.exercisetracker.screens.exerciseList

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.exercisetracker.R
import com.example.android.exercisetracker.databinding.ExerciseListFragmentBinding

class ExerciseListFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val binding: ExerciseListFragmentBinding = DataBindingUtil.inflate(layoutInflater, R.layout.exercise_list_fragment, container, false)

        //ListViewModel
        val exerciseListViewModel = ViewModelProvider(this).get(ExerciseListViewModel::class.java)

        //Recyclerview
//        binding.recyclerview.adapter = ExerciseListAdapter(ExerciseListAdapter.OnClickListener{
//            exerciseListViewModel.displayExercise(it)
//        })

        val adapter = ExerciseListAdapter()
        binding.recyclerview.adapter = adapter
        binding.recyclerview.layoutManager = LinearLayoutManager(requireContext())

//        exerciseListViewModel.readAllExercises.observe(viewLifecycleOwner, Observer { exercise ->
//            adapter.setData(exercise)
//        })

        binding.exerciseListViewModel = exerciseListViewModel
        binding.lifecycleOwner = this

        exerciseListViewModel.exercises.observe(viewLifecycleOwner, Observer { exercises ->
            adapter.submitList(exercises)
        })

//        exerciseListViewModel.navigateToExerciseAdd.observe(viewLifecycleOwner, Observer {
//            if (it == true) {
//                this.findNavController().navigate(
//                    ExerciseListFragmentDirections.actionExerciseListFragmentToExerciseAddFragment()
//                )
//                exerciseListViewModel.doneNavigating()
//            }
//        })

//        exerciseListViewModel.navigateToSessionList.observe(viewLifecycleOwner, Observer {
//            if (null != it){
//                this.findNavController().navigate(
//                        ExerciseListFragmentDirections.actionExerciseListFragmentToSessionListFragment(it)
//                )
//                exerciseListViewModel.displayExerciseComplete()
//            }
//        })

        return binding.root
    }
}