listUI = findViewById(R.id.listeUI); //ListView

        ArrayList<String> liste = new ArrayList();  //List

        liste.add("bir");
        liste.add("iki");
        liste.add("uc");
        liste.add("dort");

        listeAdapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, liste);  //android.R
        listUI.setAdapter(listeAdapter);

  	listUI.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int index, long id) {
        	//liste.get(index)    
	
            }
        });

    }
