 var bir: String? = null  //if bir == null => null
 
        var iki: String? = null //if iki == null => null
        bir = null
        iki = null
        var uc = iki ?: bir ?: "3u de yok"
        println(uc)
        // bir e sorgu null?
        // iki ye sorgu null?
        // uc e atama
        // uc = iki ama iki null ise bir ama bir null ise "3u de yok"-> yazisini ata