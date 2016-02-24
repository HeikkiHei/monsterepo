## **Aihe:** Monster generator

**Rakennekuvaus:**    
Ohjelmaa k�ytet��n graafisen k�ytt�liittym�n kautta, jonka aktivoi Main-metodi.   
Graafisessa k�ytt�liittym�ss� on yksi radionappipari, jolla valitaan luotavan hahmon tyyppi, joko hirvi� tai NPC.   
Radionappien lis�ksi on yksi liuku, asetettu v�lille 1-10. T�ll� valitaan hahmon taso.   
Lis�ksi yksi nappi, jolla ohjelma tuottaa hahmon tulosteen k�ytt�liittym�ruudulle.
   
Graafista k�ytt�liittym�� kuuntelee yksi ActionListener, jonka teht�v�n� on k�yt�nn�ss� kuunnella viimeksi mainitun napin painallusta.   
Kun nappia painetaan, tarkastetaan my�s radionappien ja liu'un tila ja tehd��n sen perusteella valinta, millainen hahmo luodaan.   

Hahmo luodaan GenerateCreature-luokassa, joka nimens� mukaisesti luo hahmon. Luokka kutsuu luokkia, jotka luovat pseudorandomoituja (eli n�enn�isesti satunnaisia) tietoja hahmolle.   
N�iden lis�ksi luokassa itsess��n on hahmon m��ritettyyn tasoon liittyvi� metodeita, jotka luovat hahmolle tietoja. N�m�kin ovat pseudorandomeita, eli ne ovat sidottu hahmon tasoon ja kymmentahoiseen noppaan.   

Tiedonluontiluokat eiv�t luo random-tietoa, vaan hakevat satunnaista rivi� niille annetusta tiedostosta ja antavat t�m�n rivin takaisin GenerateCreaturelle. N�m� luokat antavat hahmolle nimen, hahmoluokan, rodun ja aseen.   
N�iden luokkien rivinluvun ja -haun tekee luokka Randomizer, jota kutsutaan luokkien metodeissa.   

Kun kaikki tieto on haettu ja/tai luotu, GenerateCreature palauttaa luodun hahmon toStringin ja ActionListener sy�tt�� sen graafisen k�ytt�liittym�n tulostusruudulle.   

