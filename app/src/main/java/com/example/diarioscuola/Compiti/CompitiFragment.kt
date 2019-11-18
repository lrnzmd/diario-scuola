package com.example.diarioscuola.Compiti

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.diarioscuola.R


class CompitiFragment : Fragment() {

    companion object {
        fun newInstance() = CompitiFragment()
    }

    private lateinit var viewModel: CompitiViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.compiti_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CompitiViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
