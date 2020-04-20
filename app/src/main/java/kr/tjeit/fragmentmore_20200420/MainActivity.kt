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

        myTabLayout.setupWithViewPager(myViewPager)
    }

}
