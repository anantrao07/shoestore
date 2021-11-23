package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.FragmentShoeListBinding

class ShoeListFragment : Fragment() {

    private val viewModel: ShoesViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val binding: FragmentShoeListBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_list, container, false)
        binding.shoeListViewModel = viewModel
        binding.addNewShoeItem.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_shoeListFragment_to_shoeDetailFragment)
        }
        binding.logoutButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_shoeListFragment_to_loginFragment)
        }
        binding.shoeListViewModel?.populateShoeList()

        return binding.root
    }
}