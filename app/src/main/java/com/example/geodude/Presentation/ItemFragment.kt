package com.example.geodude.Presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.lifecycle.ViewModelProvider
import com.example.geodude.Model.Item
import com.example.geodude.R

class ItemFragment : Fragment() {

    val viewModel by lazy { ViewModelProvider(this).get(ItemViewModel::class.java)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_item, container, false)
    }

    fun getItem(){
        viewModel.loadItems()
        viewModel.items.observe(viewLifecycleOwner) {
            //success and failure cases
        }
    }


}