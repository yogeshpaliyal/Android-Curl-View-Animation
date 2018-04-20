# Android Curl View Animation

[![](https://jitpack.io/v/yogeshpaliyal/Android-Curl-View-Animation.svg)](https://jitpack.io/#yogeshpaliyal/Android-Curl-View-Animation)

**Step 1.** Add the JitPack repository to your build file 
Add it in your root build.gradle at the end of repositories:
```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  
  **Step 2.** Add the dependency
  ``` gradle
  dependencies {
	        compile 'com.github.yogeshpaliyal:Android-Curl-View-Animation:-SNAPSHOT'
	}
  ```
  
  **Step 3.** Add Curl View To Your Layout
  ``` xml  
<techpaliyal.com.curlviewanimation.CurlView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
	app:horizontal_two_page="false"
        android:id="@+id/curlView"/>
```
**Step 4.** Create Int Array (JAVA)
```java 
 Java        ArrayList<Integer> arrImages=new ArrayList<Integer>();
 
 Kotlin      var arrImages=ArrayList<Int>()
 ```
 **Step 5.** Load Array(Both Java & Kotlin)
```java
  arrImages.add(R.drawable.img1);
  arrImages.add(R.drawable.img2);
  arrImages.add(R.drawable.img3);
  ...
  ```
  **Step 6.**
  ```Kotlin
  CurlActivity(this).load(curlView,array)
  ```
  
  **Full Activity Code**
  ```Kotlin
  package techpaliyal.com.curlanimationlibrarytest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import techpaliyal.com.curlviewanimation.CurlActivity

class MainActivity : AppCompatActivity() {
    var array=ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        array.add(R.drawable.img1)
        array.add(R.drawable.img2)
        array.add(R.drawable.img3)
        array.add(R.drawable.img4)
        array.add(R.drawable.img5)
        
        CurlActivity(this).load(curlView,array)
    }
}
```
