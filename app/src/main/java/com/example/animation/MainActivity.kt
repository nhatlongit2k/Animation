package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var btAlpha: Button
    lateinit var btRotate: Button
    lateinit var btScale: Button
    lateinit var btTranslate: Button
    lateinit var btCombine: Button
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btAlpha = findViewById(R.id.bt_alpha_anim)
        btRotate = findViewById(R.id.bt_rotate_anim)
        btScale = findViewById(R.id.bt_scale_anime)
        btTranslate = findViewById(R.id.bt_translate_anime)
        btCombine = findViewById(R.id.bt_combine_anim)

        imageView = findViewById(R.id.img_view)

        val animAlpha: Animation = AnimationUtils.loadAnimation(this, R.anim.anim_alpha)
        val animRotate: Animation = AnimationUtils.loadAnimation(this, R.anim.anim_rotate)
        val animeScale: Animation = AnimationUtils.loadAnimation(this, R.anim.anim_scale)
        val animTranslate: Animation = AnimationUtils.loadAnimation(this, R.anim.anim_translate)
        val animCombine: Animation = AnimationUtils.loadAnimation(this, R.anim.anim_combine)
        btAlpha.setOnClickListener {
            imageView.startAnimation(animAlpha)
        }
        btRotate.setOnClickListener {
            imageView.startAnimation(animRotate)
        }
        btScale.setOnClickListener {
            imageView.startAnimation(animeScale)
        }
        btTranslate.setOnClickListener {
            imageView.startAnimation(animTranslate)
        }
        btCombine.setOnClickListener {
            imageView.startAnimation(animCombine)
        }
    }
}