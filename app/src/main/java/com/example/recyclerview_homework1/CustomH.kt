package com.example.recyclerview_homework1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_homework1.databinding.ItemRowLayouthBinding

class CustomH(context : Context,itemList : ArrayList<itemcls>) : RecyclerView.Adapter<CustomH.MyViewHolder>() {

    var context = context
    var itemlist = itemList


    override fun onCreateViewHolder(
        p0: ViewGroup,
        p1: Int
    ): MyViewHolder {
        var itemRowLayouthBinding : ItemRowLayouthBinding
        itemRowLayouthBinding = ItemRowLayouthBinding.inflate(LayoutInflater.from(context),p0,false)

        var myViewHolder = MyViewHolder(itemRowLayouthBinding.root)
        return  myViewHolder
    }

    override fun onBindViewHolder(
        p0: MyViewHolder,
        p1: Int
    ) {
        var item =itemlist.get(p1)
        var myViewHolder =p0
        myViewHolder.itemRowLayouthBinding.apply {
            this?.imgH?.setImageResource(item.imgId)
            this?.textH?.text = item.title
        }

    }

    override fun getItemCount(): Int {
        return itemlist.size
    }

    class MyViewHolder(view : View): RecyclerView.ViewHolder(view){
        var itemRowLayouthBinding : ItemRowLayouthBinding?=null

        init {
            itemRowLayouthBinding = ItemRowLayouthBinding.bind(view)
        }
    }

}