package com.algebra.broadcastsender

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState)
        setContentView( R.layout.activity_main )

        val bSendBroadcast: Button          = findViewById( R.id.bSendBroadcast )
        val bSendBroadcastWithExtra: Button = findViewById( R.id.bBcastWithExtra )

        bSendBroadcast.setOnClickListener {
            val intent = Intent( )
            intent.action = "com.algebra.Broadcast"
            sendBroadcast(intent)
        }

        bSendBroadcastWithExtra.setOnClickListener {
            val intent = Intent( )
            intent.action = "com.algebra.BroadcastWithValue"
            intent.putExtra( "com.algebra.BroadcastWithValue.Extra", "Value from Broadcast Sender project" )
            sendBroadcast( intent )
        }
    }
}
