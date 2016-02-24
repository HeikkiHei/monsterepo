## **Aihe:** Monster generator

**Rakennekuvaus:**    
Ohjelmaa käytetään graafisen käyttöliittymän kautta, jonka aktivoi Main-metodi.   
Graafisessa käyttöliittymässä on yksi radionappipari, jolla valitaan luotavan hahmon tyyppi, joko hirviö tai NPC.   
Radionappien lisäksi on yksi liuku, asetettu välille 1-10. Tällä valitaan hahmon taso.   
Lisäksi yksi nappi, jolla ohjelma tuottaa hahmon tulosteen käyttöliittymäruudulle.
   
Graafista käyttöliittymää kuuntelee yksi ActionListener, jonka tehtävänä on käytännössä kuunnella viimeksi mainitun napin painallusta.   
Kun nappia painetaan, tarkastetaan myös radionappien ja liu'un tila ja tehdään sen perusteella valinta, millainen hahmo luodaan.   

Hahmo luodaan GenerateCreature-luokassa, joka nimensä mukaisesti luo hahmon. Luokka kutsuu luokkia, jotka luovat pseudorandomoituja (eli näennäisesti satunnaisia) tietoja hahmolle.   
Näiden lisäksi luokassa itsessään on hahmon määritettyyn tasoon liittyviä metodeita, jotka luovat hahmolle tietoja. Nämäkin ovat pseudorandomeita, eli ne ovat sidottu hahmon tasoon ja kymmentahoiseen noppaan.   

Tiedonluontiluokat eivät luo random-tietoa, vaan hakevat satunnaista riviä niille annetusta tiedostosta ja antavat tämän rivin takaisin GenerateCreaturelle. Nämä luokat antavat hahmolle nimen, hahmoluokan, rodun ja aseen.   
Näiden luokkien rivinluvun ja -haun tekee luokka Randomizer, jota kutsutaan luokkien metodeissa.   

Kun kaikki tieto on haettu ja/tai luotu, GenerateCreature palauttaa luodun hahmon toStringin ja ActionListener syöttää sen graafisen käyttöliittymän tulostusruudulle.   

