package com.example.recyclerviewtrain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.recyclerviewtrain.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudentData = arrayListOf(
            ListStudent("Riki", 20),
            ListStudent("Abdilah", 21),
            ListStudent("Dede", 22),
            ListStudent("Nurul", 22),
            ListStudent("Fadilah", 22),
            ListStudent("Rahmad", 22),
            ListStudent("Firman", 22),
        )
        // memanggil class adapter lalu isi data berupa arraylist
        val adapterStudent = StudentAdapter(listStudentData)
        // mengatur tata letak recycler view
        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        val gl = GridLayout(this)
        binding.rvView.layoutManager = lm
        binding.rvView.adapter = adapterStudent
    }

}