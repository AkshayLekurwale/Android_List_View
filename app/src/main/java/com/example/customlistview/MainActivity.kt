package com.example.customlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.customlistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.download1,R.drawable.download2,R.drawable.download3,R.drawable.download4,R.drawable.download5,
            R.drawable.download6, R.drawable.download1,R.drawable.download4,R.drawable.download2
        )
        val name = arrayOf(
            "Raj Patil","Anjali Raut","Rahul Mehta","Heer Khan","Mahesh Rokde","Om Patil",
            "Mangesh Mehta","Ramesh Mate","Sakshi Sinha"
        )

        val last_Message = arrayOf(
            "hi, how are you?", "Are you sure?","In meeting","I'l be there","come soon","not yet","is he?","yes you are right",
            "not yet"
        )

        val last_msg_time = arrayOf(
            "7:00 pm","7:00 pm","7:00 pm","7:00 pm","7:00 pm","7:00 pm","7:00 pm","7:00 pm","7:00 pm",
        )
        val phone_no = arrayOf(
            "92349082099","23539082099","67349082099","903569082099","45673482099",
            "3456472099","45645682099","35676082099","24532082099",
        )
        val country = arrayOf(
            "India","India","India","India","India",
            "India","India","India","India",
        )

        userArrayList = ArrayList()

        for(i in name.indices){
            val user = User(name[i],last_Message[i],last_msg_time[i],phone_no[i],country[i], imageId[i])
            userArrayList.add(user)
        }

        binding.listView.isClickable = true
        binding.listView.adapter = MyAdapter(this,userArrayList)
        binding.listView.setOnItemClickListener {parent,view,position,id->

            val name = name[position]
            val phone = phone_no[position]
            val country = country[position]
            val imageId = imageId[position]

            val i = Intent(this,activity_user::class.java)
            i.putExtra("name",name)
            i.putExtra("phone",phone)
            i.putExtra("country",country)
            i.putExtra("imageId",imageId)
            startActivity(i)
        }

    }
}