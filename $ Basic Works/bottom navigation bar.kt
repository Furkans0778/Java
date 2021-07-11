//binding view olmasi iyi olur

frame layout olustur id => container  //your xml

container in  <com.google.android.material.bottomnavigation.BottomNavigationView  ->  Menu = #14

package klasorune bir 'frags' isminde klasor olustur

new -> Fragment -> Fragment(blank)  - frags file in (one,two,three)

res klasorunu altina menu->menu.xml olustur

//-------------------------------------
navigator menu->  #5

 <item
        android:id="@+id/one" 
        android:icon="@drawable/one"
        android:title="one" />
    <item
        android:id="@+id/two"
        android:icon="@drawable/two"
        android:title="two" />

//-------------------------------------------------

.kt dosyasinda degisken olustur (one,two)

    makeFrage(one)  //#38
        binding.navigator.setOnNavigationItemSelectedListener {  //#5 bottomNavBar id
            when(it.itemId){
                R.id.one ->makeFrage(one) //#17.satir -  38.satir  - 27.satir  - item id - fun - varrible
                R.id.two ->makeFrage(two) //#21.satir -  38.satir  - 27.satir  - item id - fun - varrible
            }
            true //zorunlu
        }
    //asil sayfa gecisini saglayan method
    private fun makeFrage(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(
                R.id.container, fragment  //frame layout #3
            )
            commit()
        }


//build.gradle(Module:)
dependencies {
    implementation 'com.google.android.material:material:1.2.0'
}
