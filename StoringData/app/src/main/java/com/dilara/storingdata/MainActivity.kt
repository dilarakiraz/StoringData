package com.dilara.storingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.dilara.storingdata.databinding.ActivityDetailsBinding
import com.dilara.storingdata.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Handler

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var landmarkList:ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        landmarkList=ArrayList<Landmark>()

        //data

        val pisa=Landmark("Pisa","Italy",R.drawable.pisa)
        val colosseum=Landmark("Colosseum","Italy",R.drawable.colesseum)
        val eiffel=Landmark("Eiffel","France",R.drawable.eiffel)
        val londonBridge=Landmark("London Bridge","UK",R.drawable.londonbridge)

        landmarkList.add(pisa)
        landmarkList.add(colosseum)
        landmarkList.add(eiffel)
        landmarkList.add(londonBridge)

        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        val landmarkAdapter=LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter=landmarkAdapter

    }

}
