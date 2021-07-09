https://developer.android.com/topic/libraries/view-binding#kotlin
1.07.2021


private lateinit var xd: ActivityMainBinding

override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        xd = ActivityMainBinding.inflate(layoutInflater)
        val view = xd.root
        setContentView(view)
    }


//instance xd


## build.gradle(Nodule: KOTLN.app)->
//build -> rebuildProject


android{

.....

buildFeatures {
        viewBinding true
    }

}

