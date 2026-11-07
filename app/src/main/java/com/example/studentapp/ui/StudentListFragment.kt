package com.example.studentapp.ui
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.studentapp.R

class StudentListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_student_list, container, false)

        val btnDetail = view.findViewById<Button>(R.id.btnDetail)
        btnDetail.setOnClickListener {
            // Chuyển sang Fragment chi tiết
            val detailFragment = StudentDetailFragment().apply {
                arguments = Bundle().apply {
                    putString("STUDENT_NAME", "Nguyễn Văn A")
                }
            }

            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, detailFragment)
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}