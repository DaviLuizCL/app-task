package com.example.tasks_app.ui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tasks_app.databinding.FragmentTodoBinding

class TodoFragment : Fragment() {
    private var _binding: FragmentTodoBinding? = null

    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentTodoBinding.inflate(inflater, container, false)

        val fab = binding.floatingActionButton3
        if(fab != null){
            Log.d("TodoFragment", "FAB foi inflado")
        }else{
            Log.d("TodoFragment", "Fab não encontrado")
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}