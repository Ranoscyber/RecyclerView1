package com.example.recyclerview_homework1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_homework1.databinding.ItemRowLayouthBinding
import com.example.recyclerview_homework1.databinding.ItemRowLayoutvBinding

class CustomV(context : Context,itemlist : ArrayList<itemcls>) : RecyclerView.Adapter<CustomV.MyViewHolder>() {

    var context = context

    var itemlist = itemlist


    override fun onCreateViewHolder(
        p0: ViewGroup,
        p1: Int
    ): MyViewHolder {
        var itemRowLayoutvBinding : ItemRowLayoutvBinding
        itemRowLayoutvBinding = ItemRowLayoutvBinding.inflate(LayoutInflater.from(context),p0,false)

        var myViewHolder = MyViewHolder(itemRowLayoutvBinding.root)

        return myViewHolder
    }

    override fun onBindViewHolder(
        p0: MyViewHolder,
        p1: Int
    ) {
        var item = itemlist.get(p1)
        var myViewHolder = p0

        myViewHolder.itemRowLayoutvBinding.apply {
            this?.imgV?.setImageResource(item.imgId)
            this?.textV?.text = item.title
        }
    }

    override fun getItemCount(): Int {
        return itemlist.size
    }

    class MyViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var itemRowLayoutvBinding : ItemRowLayoutvBinding?=null

        init {
            itemRowLayoutvBinding = ItemRowLayoutvBinding.bind(view)
        }
    }

}