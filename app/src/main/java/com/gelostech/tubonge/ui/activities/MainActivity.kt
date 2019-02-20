package com.gelostech.tubonge.ui.activities

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.gelostech.tubonge.R
import com.gelostech.tubonge.data.models.Chat
import com.gelostech.tubonge.ui.adapters.ChatsAdapter
import com.gelostech.tubonge.ui.base.BaseActivity
import com.gelostech.tubonge.ui.callbacks.ChatsCallback
import com.gelostech.tubonge.utils.hide
import com.gelostech.tubonge.utils.loadUrl
import com.gelostech.tubonge.utils.show
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.empty_state.view.*

class MainActivity : BaseActivity(), ChatsCallback {
    private lateinit var adapter: ChatsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

        sample()
    }

    private fun initViews() {
        setSupportActionBar(toolbar)
        supportActionBar?.title = null

        emptyState.image.loadUrl(R.drawable.empty_inbox)
        emptyState.text.text = getString(R.string.empty_inbox)

        rv.setHasFixedSize(true)
        rv.layoutManager = LinearLayoutManager(this)
        rv.itemAnimator = DefaultItemAnimator()
        adapter = ChatsAdapter(this)
        rv.adapter = adapter
    }

    private fun sample() {
        showDataState()

        adapter.addChat(Chat(null, System.currentTimeMillis(), "The advice is a terrifying crewmate.", R.drawable.user_avatar, "JD"))
        adapter.addChat(Chat(null, System.currentTimeMillis(), "Always truly trap the holy cow. Yes, there is paradise, it dies with resurrection.", R.drawable.user_avatar, "Jim Halpert"))
        adapter.addChat(Chat(null, System.currentTimeMillis(), "Tumultumques sunt planetas de castus hippotoxota.", R.drawable.user_avatar, "Dwayne Schurt"))
        adapter.addChat(Chat(null, System.currentTimeMillis(), "Try cuting fritters garnished with oyster sauce, brushed with pepper.", R.drawable.user_avatar, "Steven Langard"))
        adapter.addChat(Chat(null, System.currentTimeMillis(), "Mate of a cold life, pull the madness!.", R.drawable.user_avatar, "JD"))
        adapter.addChat(Chat(null, System.currentTimeMillis(), "Assimilation at the planet was the voyage of death, attacked to a lunar c-beam.", R.drawable.user_avatar, "Pam Bertsky"))
    }

    override fun onChatClicked(v: View, chat: Chat) {

    }

    private fun showEmptyState() {
        rv.hide()
        emptyState.show()
    }

    private fun showDataState() {
        emptyState.hide()
        rv.show()
    }
}
