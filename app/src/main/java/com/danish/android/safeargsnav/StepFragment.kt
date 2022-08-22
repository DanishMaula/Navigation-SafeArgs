package com.danish.android.safeargsnav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class StepFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val safeArgs: StepFragmentArgs by navArgs()
        val flowStepNumber = safeArgs.flowStepNumber


        return when (flowStepNumber) {
            1 -> inflater.inflate(R.layout.fragment_step, container, false)
            2 -> inflater.inflate(R.layout.fragment_step_two, container, false)
            else -> inflater.inflate(R.layout.fragment_step, container, false)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.next_button).setOnClickListener {
            findNavController().navigate(R.id.action_stepFragmentTwo_to_stepFragment)
        }
    }

}
