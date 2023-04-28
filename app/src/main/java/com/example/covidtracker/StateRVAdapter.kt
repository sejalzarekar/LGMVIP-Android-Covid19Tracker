package com.example.covidtracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItem
import androidx.recyclerview.widget.RecyclerView

class StateRVAdapter(private val stateList:List<stateModal>):
    RecyclerView.Adapter<StateRVAdapter.StatRVViewHolder>() {

    class StatRVViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        val stateNameTV: TextView= itemView.findViewById(R.id.idTVstate)
        val casesTV: TextView=itemView.findViewById(R.id.idTVcases)
        val deathsTV:TextView=itemView.findViewById(R.id.idTVDeaths)
        val recoveredTV:TextView=itemView.findViewById(R.id.idTVRecovered)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatRVViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.state_rv_item,parent,false)
        return StatRVViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return stateList.size
    }

    override fun onBindViewHolder(holder: StatRVViewHolder, position: Int) {
        val stateData = stateList[position]
        holder.casesTV.text = stateData.Cases.toString()
        holder.stateNameTV.text=stateData.state
        holder.deathsTV.text=stateData.Deaths.toString()
        holder.recoveredTV.text=stateData.Recovered.toString()


    }

}