package com.example.hw35

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class CounterFragment : Fragment() {
    private var textViewCounter: TextView? = null
    private var counter = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_counter, container, false)

        textViewCounter = view.findViewById(R.id.textViewCounter)
        val buttonIncrement = view.findViewById<Button>(R.id.buttonIncrement)
        val buttonDecrement = view.findViewById<Button>(R.id.buttonDecrement)

        buttonIncrement.setOnClickListener { v: View? ->
            counter++
            updateCounterTextView()
        }

        buttonDecrement.setOnClickListener { v: View? ->
            counter--
            updateCounterTextView()
        }

        return view
    }

    private fun updateCounterTextView() {
        textViewCounter!!.text = counter.toString()
    }
}