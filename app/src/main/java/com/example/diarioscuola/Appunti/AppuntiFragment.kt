package com.example.diarioscuola.Appunti

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.diarioscuola.R


class AppuntiFragment : Fragment() {

    companion object {
        fun newInstance() = AppuntiFragment()
    }

    private lateinit var viewModel: AppuntiViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.appunti_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AppuntiViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
