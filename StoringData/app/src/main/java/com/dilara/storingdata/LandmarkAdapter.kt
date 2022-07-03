package com.dilara.storingdata

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dilara.storingdata.databinding.RecyclerRowBinding

class LandmarkAdapter(val landmarkList:ArrayList<Landmark>):RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder> (){
    class LandmarkHolder(val binding:RecyclerRowBinding):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        //layout ile bağlama işlemi yapılır.recyclerrow bağlama işlemi
        val binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        //bağlandıktan sonra ne olacak
        holder.binding.recyclerViewTextView.text=landmarkList.get(position).name
        holder.itemView.setOnClickListener{
            val intent= Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("Landmark",landmarkList.get(position))
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        //kaç tane oluşturucaz
        return landmarkList.size
    }
}