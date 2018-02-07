package com.onmyway133.basicsample.main.ui

import android.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.onmyway133.basicsample.R
import kotlinx.android.synthetic.main.list_fragment.*

class ProductListFragment: Fragment() {
    enum class Tag {
        PRODUCT_LIST_VIEW_MODEL
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.list_fragment, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}