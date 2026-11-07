package com.example.studentapp
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Nếu muốn khởi tạo Fragment bằng code (thay vì dùng FragmentContainerView định nghĩa sẵn name):
        /*
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, com.ute.studentapp.ui.StudentListFragment())
                .commit()
        }
        */
    }
}