package kr.tjeit.fragmentmore_20200420

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.tjeit.fragmentmore_20200420.adapters.MyFragPagerAdapter

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        myViewPager.adapter = MyFragPagerAdapter(supportFragmentManager)

        myViewPager.offscreenPageLimit = 5 //돌려막을 플래그먼트 갯수를 본래보다 크게 5개 지정..

        myTabLayout.setupWithViewPager(myViewPager)
    }

}
