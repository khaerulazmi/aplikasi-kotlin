package com.example.mobileapps.ui.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mobileapps.R
import com.example.mobileapps.data.remote.response.Data
import com.example.mobileapps.databinding.FragmentHomeBinding
import org.koin.android.ext.android.inject

class HomeFragment : Fragment() {
    private lateinit var _binding: FragmentHomeBinding
    private val binding get() = _binding
    private val viewModel: HomeViewModel by inject()
    private var list: List<Data> = listOf()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        init()
        observeData()
        return binding.root
    }
    private fun observeData(){
        with(viewModel){
            observeMovie.observe(requireActivity()){
                it.let { data ->
                    list = data.body()?.data ?: listOf()
                    with(binding.musicList){
                        adapter = HomeAdapter(list)
                        Log.d("home", "adapter:$adapter")
                        layoutManager = LinearLayoutManager(requireContext())
                    }
                }
            }
        }
    }
    private fun init(){
        viewModel.getMovie()
    }
}