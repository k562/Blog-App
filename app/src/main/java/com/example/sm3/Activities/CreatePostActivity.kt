package com.example.sm3.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.sm3.R
import daos.PostDao

class CreatePostActivity : AppCompatActivity() {

    private lateinit var postDao: PostDao
    lateinit var postButton : Button
    lateinit var postInput : EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)



        postDao = PostDao()
        postButton = findViewById(R.id.postButton)
        postInput = findViewById(R.id.postInput)

        postButton.setOnClickListener {
            val input = postInput.text.toString().trim()
            if(input.isNotEmpty()) {
                postDao.addPost(input)
                Toast.makeText(this@CreatePostActivity, "Post created", Toast.LENGTH_SHORT).show()
                finish()
            }
        }

    }
}