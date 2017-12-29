package techpaliyal.com.curlanimation

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var arr= ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arr.add(R.drawable.img1)
        arr.add(R.drawable.img2)
        arr.add(R.drawable.img3)
        arr.add(R.drawable.img4)
        arr.add(R.drawable.img5)

        CurlActivity(this).load(curlV,arr)
    }
}
