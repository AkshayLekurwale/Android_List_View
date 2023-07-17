package com.example.customlistview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context : Activity,private val arrayList: ArrayList<User>) : ArrayAdapter<User>(context,
                R.layout.list_item,arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)

        val view : View = inflater.inflate(R.layout.list_item,null)

        val imageView : ImageView = view.findViewById(R.id.profile_pic)
        val username : TextView = view.findViewById(R.id.person_name)
        val lastMessage : TextView = view.findViewById(R.id.last_message)
        val lastMsgTime : TextView = view.findViewById(R.id.msg_time)

        imageView.setImageResource(arrayList[position].image_id)
        username.text = (arrayList[position].name)
        lastMessage.text = (arrayList[position].last_Message)
        lastMsgTime.text = (arrayList[position].last_Msg_time)


        return view
    }

}