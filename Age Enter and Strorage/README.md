## SharedPreferences sp;

sp = this.getPreferences(Context.MODE_PRIVATE); 

age = sp.getInt("Age",0);

sp.edit().putInt("Age",age).apply();  
