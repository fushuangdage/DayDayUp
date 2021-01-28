//package com.example.daydayup.view
//
//import android.R
//import android.content.Context
//import android.support.v7.widget.GridLayoutManager
//import android.support.v7.widget.RecyclerView
//import android.support.v7.widget.StaggeredGridLayoutManager
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import androidx.recyclerview.widget.GridLayoutManager
//import androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
//import androidx.recyclerview.widget.RecyclerView
//import androidx.recyclerview.widget.StaggeredGridLayoutManager
//import com.star.common_utils.R
//import com.star.common_utils.utils.UIUtil
//
///**
// * @author xueshanshan
// * @date 2019/4/18
// */
//class BaseRecyclerViewAdapter<Model> internal constructor(
//    private val mContext: Context,
//    baseRecyclerView: BaseRecyclerView<Model>
//) :
//    RecyclerView.Adapter<BaseRecyclerViewHolder>(), View.OnClickListener {
//    private val mBaseRecyclerView: BaseRecyclerView<Model>
//    private var mOnBaseRecyclerViewListener: OnBaseRecyclerViewListener<Model>? = null
//    private var mNeedItemClick = false
//    private var mHeaderView: View? = null
//    private var mFooterView: View? = null
//    fun setOnBaseRecyclerViewListener(
//        onBaseRecyclerViewListener: OnBaseRecyclerViewListener<Model>?,
//        needItemClick: Boolean
//    ) {
//        mOnBaseRecyclerViewListener = onBaseRecyclerViewListener
//        mNeedItemClick = needItemClick
//    }
//
//    fun setHeaderView(header: View?) {
//        mHeaderView = header
//        notifyDataSetChanged()
//    }
//
//    fun setFooterView(footer: View?) {
//        mFooterView = footer
//        notifyDataSetChanged()
//    }
//
//    override fun onCreateViewHolder(
//        parent: ViewGroup,
//        viewType: Int
//    ): BaseRecyclerViewHolder {
//        if (viewType == ITEM_TYPE_HEADER) {
//            UIUtil.removeViewFromParent(mHeaderView)
//            return BaseRecyclerViewHolder(mHeaderView)
//        }
//        if (viewType == ITEM_TYPE_FOOTER) {
//            UIUtil.removeViewFromParent(mFooterView)
//            return BaseRecyclerViewHolder(mFooterView)
//        }
//        var holder: BaseRecyclerViewHolder? = null
//        if (mOnBaseRecyclerViewListener != null) {
//            val itemView: View = LayoutInflater.from(mContext)
//                .inflate(mOnBaseRecyclerViewListener.getItemLayoutId(), parent, false)
//            holder = BaseRecyclerViewHolder(itemView)
//            //            mOnBaseRecyclerViewListener.onViewHolderCreated(holder);
//            if (mNeedItemClick) {
//                holder.itemView.setOnClickListener(this)
//            }
//        }
//        return holder
//    }
//
//    override fun onBindViewHolder(
//        holder: BaseRecyclerViewHolder,
//        position: Int
//    ) {
//        var position = position
//        val type = getItemViewType(position)
//        if (type == ITEM_TYPE_HEADER || type == ITEM_TYPE_FOOTER) {
//            // 不做处理
//        } else {
//            position -= if (mHeaderView != null) 1 else 0
//            val item: Model = mBaseRecyclerView.getDatas().get(position)
//            holder.itemView.setTag(R.id.recycler_item_tag, item)
//            if (mOnBaseRecyclerViewListener != null) {
//                mOnBaseRecyclerViewListener.onBindView(holder, item, position)
//            }
//        }
//    }
//
//    override fun getItemCount(): Int {
//        var size: Int = mBaseRecyclerView.getDatas().size()
//        if (mHeaderView != null) {
//            size++
//        }
//        if (mFooterView != null) {
//            size++
//        }
//        return size
//    }
//
//    override fun getItemViewType(position: Int): Int {
//        // 根据索引获取当前View的类型，以达到复用的目的
//        // 根据位置的索引，获取当前position的类型
//        if (mHeaderView != null && position == 0) {
//            return ITEM_TYPE_HEADER
//        }
//        if (mHeaderView != null && mFooterView != null && position == mBaseRecyclerView.getDatas()
//                .size() + 1
//        ) {
//            // 有头部和底部时，最后底部的应该等于size+!
//            return ITEM_TYPE_FOOTER
//        } else if (mHeaderView == null && mFooterView != null && position == mBaseRecyclerView.getDatas()
//                .size()
//        ) {
//            // 没有头部，有底部，底部索引为size
//            return ITEM_TYPE_FOOTER
//        }
//        return ITEM_TYPE_NORMAL
//    }
//
//    override fun onClick(v: View) {
//        if (mOnBaseRecyclerViewListener != null) {
//            mOnBaseRecyclerViewListener.onItemClick(v, v.getTag(R.id.recycler_item_tag) as Model)
//        }
//    }
//
//    override fun onViewAttachedToWindow(holder: BaseRecyclerViewHolder) {
//        super.onViewAttachedToWindow(holder)
//        val position: Int = holder.getLayoutPosition()
//        val itemViewType = getItemViewType(position)
//        if (holder.itemView.getLayoutParams() is StaggeredGridLayoutManager.LayoutParams &&
//            (itemViewType == ITEM_TYPE_HEADER || itemViewType == ITEM_TYPE_FOOTER)
//        ) {
//            val params =
//                holder.itemView.getLayoutParams() as StaggeredGridLayoutManager.LayoutParams
//            params.isFullSpan = true
//        }
//    }
//
//    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
//        super.onAttachedToRecyclerView(recyclerView)
//        val manager = recyclerView.layoutManager
//        if (manager is GridLayoutManager) {
//            val gridManager = manager
//            gridManager.spanSizeLookup = object : SpanSizeLookup() {
//                override fun getSpanSize(position: Int): Int {
//                    //占用的单元格数 header 和 Footer占用多个单元格
//                    val itemViewType = getItemViewType(position)
//                    return if (itemViewType == ITEM_TYPE_NORMAL) {
//                        1
//                    } else {
//                        gridManager.spanCount
//                    }
//                }
//            }
//        }
//    }
//
//    companion object {
//        // item 的三种类型
//        const val ITEM_TYPE_NORMAL = 1 // 正常的item类型
//        protected const val ITEM_TYPE_HEADER = 2 // header
//        protected const val ITEM_TYPE_FOOTER = 3 // footer
//    }
//
//    init {
//        mBaseRecyclerView = baseRecyclerView
//    }
//}