package com.example.tasks_app.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.tasks_app.R
import com.example.tasks_app.databinding.FragmentLoginBinding
import com.example.tasks_app.databinding.FragmentSplashBinding

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListener()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun initListener() {
        binding.btnCreateAccount.setOnClickListener(){
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }
        binding.btnRecoveryAccount.setOnClickListener(){
            findNavController().navigate(R.id.action_loginFragment_to_recoveryAccountFragment2)
        }

        binding.btnLogin.setOnClickListener(){
            findNavController().navigate(R.id.action_global_homeFragment)
        }
    }


    }
