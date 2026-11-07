package com.example.studentapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.studentapp.R

class StudentDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_student_detail, container, false)

        val tvInfo = view.findViewById<TextView>(R.id.tvStudentInfo)
        val studentName = arguments?.getString("STUDENT_NAME") ?: "Không rõ"
        tvInfo.text = "Chi tiết sinh viên: $studentName"

        val btnBack = view.findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            requireActivity().supportFragmentManager.popBackStack()
        }

        return view
    }
}