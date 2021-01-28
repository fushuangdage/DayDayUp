package com.example.daydayup.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.daydayup.R

/**
 * Author: fushuang
 * Date: 2020/11/7 11:48 PM
 * Description:
 * Wiki:
 * History:
 * <author> <time> <version> <desc>
 */
class RvAdapter : RecyclerView.Adapter<RvViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        var inflate = LayoutInflater.from(parent.context).inflate(R.layout.list_item, null)
        inflate.setOnClickListener {
            it.visibility = View.GONE
        }
        var rvViewHolder = RvViewHolder(inflate);
        return rvViewHolder
    }

    override fun getItemCount(): Int {
        return 5
    }

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        log("fs666", "RvAdapter : 6666 position : $position")
    }


}

class RvViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}