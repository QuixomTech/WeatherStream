package com.quixom.apps.weatherstream.expandablerecyclerview

import android.content.Context
import android.support.annotation.CallSuper
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.View.OnClickListener

/**
 * @author akif
 * @see ExpandableItem
 */
class ExpandableRecyclerView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyle: Int = 0) : RecyclerView(context, attrs, defStyle) {

    override fun setLayoutManager(layout: RecyclerView.LayoutManager) {
        if (layout !is LinearLayoutManager) {
            throw IllegalArgumentException("lm manager must be an instance of LinearLayoutManager!")
        }
        super.setLayoutManager(layout)
    }

    override fun setAdapter(adapter: RecyclerView.Adapter<*>) {
        if (adapter !is Adapter<*>) {
            throw IllegalArgumentException("adapter must be an instance of ExpandableRecyclerView.Adapter!")
        }
        super.setAdapter(adapter)
    }

    abstract class Adapter<VH : RecyclerView.ViewHolder>(private val lm: LinearLayoutManager) : RecyclerView.Adapter<VH>() {
        private var currentPosition = -1

        @CallSuper
        override fun onBindViewHolder(holder: VH, position: Int) {
            val expandableItem: ExpandableItem = holder.itemView.findViewWithTag(ExpandableItem.TAG) ?: throw RuntimeException("WeatherViewItem of this adapter must contain ExpandableItem!")
            expandableItem.setOnClickListener(OnClickListener {
                currentPosition = holder.layoutPosition
                for (index in 0 until lm.childCount) {
                    if (index != currentPosition - lm.findFirstVisibleItemPosition()) {
                        val currentExpandableItem: ExpandableItem = lm.getChildAt(index).findViewWithTag(ExpandableItem.TAG)
                        currentExpandableItem.hide()
                    }
                }
                val expandableItem: ExpandableItem = lm.getChildAt(currentPosition - lm.findFirstVisibleItemPosition()).findViewWithTag(ExpandableItem.TAG)
                if (expandableItem.isOpened) {
                    expandableItem.hide()
                } else {
                    expandableItem.show()
                }
            })
            if (currentPosition != position && expandableItem.isOpened) {
                expandableItem.hideNow()
            } else if (currentPosition == position && !expandableItem.isOpened && !expandableItem.isClosedByUser) {
                expandableItem.showNow()
            }
        }
    }
}