APPBAR MENU YAPMA---

res altina klasor -> ac ayarlar.xml 
------------------------------------------
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">

<item android:id="@+id/upload" android:title="Gonderi Ekle"/>
    <item android:id="@+id/cikis" android:title="Cikis Yap"/>
</menu>

-------------------------------------------

Tanimlama--

@Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();  //MenuInlfater
        menuInflater.inflate(R.menu.ayarlar,menu);

        return super.onCreateOptionsMenu(menu);
    }

--------
Control - Ayarlari

 @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.upload){  //menu item id
		//olacak olay  sayfa gecisi Intent?

        }else if(item.getItemId()==R.id.cikis){
            auth.signOut();
            Intent intent = new Intent(anaSayfa.this,Giris.class);
            startActivity(intent);
            finish();       //geri tusunu iptal eder 

        }
        return super.onOptionsItemSelected(item);
    }


