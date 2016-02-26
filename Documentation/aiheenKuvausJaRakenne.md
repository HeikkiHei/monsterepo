## **Aihe:** Monster generator

**Aihekuvaus:**    
Toteutetaan ohjelma, joka satunnaisgeneroi hirviöitä ja NPC-hahmoja roolipeliä varten.   
Tarkoituksena on kehittää järjestelmä, jolla pystytään luomaan satunnainen hahmo Dungeons and Dragons 5 edition mukaisesti, toki hieman soveltaen.

Hahmoille generoidaan erilaisia ominaisuuksia, kuten hahmoluokka, nimi, statistiikka (voima, nopeus, jne) sekä ase.

[Rakennekuvaus](rakennekuvaus.md)     
   
**Käyttäjät:**    
Ohjelma ei vaadi kirjautumista, joten käyttäjä on käyttäjä.
   
**Toiminnot:**   
- päätä tehdäänkö hirviö vai npc
- päätä luodun hahmon taso
- luo hahmo
   
**Luokkakaavio:**   
   
![Kaavion paikka](Monster_luokkakaavio.png "http://yuml.me/edit/24d1871f") 


**Sekvenssikaavio:**   
   
![Kaavion paikka](Monster_sekvenssikaavio.png "https://www.websequencediagrams.com/?lz=dGl0bGUgTW9uc3RlciBHZW5lcmF0b3IKCk1haW4tPiorR3JhcGhpY1VzZXJJbnRlcmZhY2U6IG5ldwoABhQtPgAaFnJ1bigpABsXKitBY3Rpb25MaXN0ZW5lckZvckdVSQBeBgAGFABMGAA6BgoAgQIWLT4ATxZsZXZlbAAFLmFsdCBidXR0b24AgQgXKisAgkEHZUNyZWF0dXIAgisGKABnBQCBbxcAgQgYZwBDBwphbHQgTlBDAIF6GABgEWNyZWF0ZSgpCgoAfRAtPiorAIEQCQCBeQcAEBNSYW5kb21OYW1lOgCDaQUANREAFgtyZXR1cm4AKAooKQoANQotPioARgZpemVyAEcFABAMABALZ2V0AG8GTGluZUZyb21JbnB1dEZpbABGCml6ZXIAJw1jaGFuZ2VGaWxlSW50b1N0cmluZ3MAIQ4AgRwOAIFNCSBTVFJJTkcKZGVzdHJveSAAgRoKAIEwDC0-LQCDPBEAMhIAglIRLT4Ag3IJbgBhCwCCThsAhCMIQ2xhc3MAghsLAAsNAIIzGAAWDwCBamoAgSgOAIJXBgCBPQ0AgkUhAIFSDgCCVRoAQRUAglwcAIV8BQB3EACFTxtSYWMAhWQGAAUKAIUiGAAWBgCEUGoAgRYFAIU0BlJhYwCFGCIAgTcFAIUmFACBYAoAhRYkcgBhCwCICBtXZWFwb24Ah04LAAsGAIg6CgCHaQ8AFwgAhxBqAIEbBwCHdgYAgSkGAIddIQCBPgcAgiwaADoOAIdmHHcAZQ0Ain0TAIhLF1N0cmVuZ3RoKCkAiEQdcwAgByBJTlQAMypEZXh0ZXJpdHkAPx9kACAIADEuQ29uc3RpdHV0aW8Aj3UFAIcNHAAgCwCBFi5JbnRlbGxpZ2VuY2UAggYfaQAgCwCBey5XaXNkb20AgmUfdwAgBQCBdC9oYXJpc21hAIF_IAAgBwCDSRYAkUAYAJByCAoAjQgLAI04EgAdCQCQEBVQcmludACTBwkAj28WABYOcHJpbnQAkW0IKCkKADUNAI43FQAtBQCPAwhlbHMAlQMJAJE3MgCOchMtAIF-H2VuZApub3RlIG92AJV0CgCTLQkKICAgAJNpBXRvaW1pbnRhAAwFdmllbMOkIGtlc2tlbgAeBXTDpGxsw6QgaGV0a2VsbMOkADQFbW9sZW1taXNzYSBzYW1hIAAlBgBEBm8KZW5kIG5vdGUAlUsXLQCWYRYAgiENAJZVLACDFAVPdXQAMxAAlhUYLU1haW46IEVYSVQAkhgJTWFpbgo&s=rose")    
HUOM: Sekvenssikaaviossa luokka Randomizer lopetetaan monesti, vaikka todellisuudessa luokkaa ei suljeta. Tämä johtuu kuvantekotyökalun rajoitteesta, ilman tätä kuva sekoaa.   