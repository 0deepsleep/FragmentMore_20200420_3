package kr.tjeit.fragmentmore_20200420.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_board.*
import kr.tjeit.fragmentmore_20200420.R
import kr.tjeit.fragmentmore_20200420.adapters.PostAdapter
import kr.tjeit.fragmentmore_20200420.datas.Post

class BoardFragment : BaseFragment() {

    var mPostAdapter:PostAdapter? = null
    val mPostList = ArrayList<Post>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_board, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        mPostList.add(Post("삼성전자", 10, "조경진"))
        mPostList.add(Post("신라젠", 500, "김김김"))
        mPostList.add(Post("코오롱티슈진", 100000, "박박박"))
        mPostList.add(Post("테슬라", 18, "이이이"))
        mPostList.add(Post("페이스북", 1818, "조조조"))
        mPostList.add(Post("스타벅스", 28, "최최최"))
        mPostList.add(Post("LG전자", 19, "류류류"))
        mPostList.add(Post("삼성증권", 2000, "지지지"))
        mPostList.add(Post("스튜디오드래곤", 999999999, "차차차"))

        mPostAdapter = PostAdapter(mContext!!, R.layout.post_list_item, mPostList)
        boardListView.adapter = mPostAdapter


    }


}