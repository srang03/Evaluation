package com.srang03.text27

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setFrag(0)

        button_01.setOnClickListener {
            setFrag(0)
        }

        button_02.setOnClickListener {
            setFrag(1)
        }

        button_03.setOnClickListener {
            setFrag(2)
        }
    }

    fun setFrag(fragment: Int){
        val fragmentSet = supportFragmentManager.beginTransaction()
        // 프래그먼트 트랜잭션 : 프래그먼트 추가, 삭제, 교체 가능
        // fragmentManager를 통해 프래그먼트 트랜잭션 설정 가능
        // beginTransaction()을 호출하여 프래그먼트 트랜잭션 작업을 시작 가능

        when(fragment){
            0 -> {
                fragmentSet.replace(R.id.frame_layout, Fragment01()).commit()
            }

            1 -> {
                fragmentSet.replace(R.id.frame_layout, Fragment02()).commit()
            }

            2 -> {
                fragmentSet.replace(R.id.frame_layout, Fragment03()).commit()
            }
        }
    }
}
