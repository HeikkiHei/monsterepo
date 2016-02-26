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
   
![Kaavion paikka](Monster_sekvenssikaavio.png "https://www.websequencediagrams.com/?lz=dGl0bGUgTW9uc3RlciBHZW5lcmF0b3IKCk1haW4tPiorR3JhcGhpY1VzZXJJbnRlcmZhY2U6IG5ldwoABhQtPgAaFnJ1bigpABsXKitBY3Rpb25MaXN0ZW5lckZvckdVSQBeBgAGFABMGAA6BgoAgQIWLT4ATxZsZXZlbAAFLmFsdCBidXR0b24AgQgXKisAgkEHZUNyZWF0dXIAgisGKABnBQCBbxcAgQgYZwBDBwphbHQgTlBDAIF6GABgEWNyZWF0ZSgpCgoAfRAtPiorAIEQCQCBeQcAEBNSYW5kb21OYW1lOm5ldwoABQotPioAFgZpemVyABELaXplci0tPgAtC3IAOgkgU1RSSU5HCmRlc3Ryb3kgADcKAE0MLT4tAIIpEQAyEgCBPxEtPgCCXwluAGELAIE7GwCDEAhDbGFzcwCBVAsACw0AgUMlADwOAIFrBgBRDQCBWSEAZg4AgWkaAEEVAIFwHACDfQUAdxAAg1AbUmFjAINfDFIAhxcGAINJIgAzBQCDZQZSYWMAg0kiAFQFAINXFAB9CgCDRyRyAGELAIUmG1dlYXBvbgCFOAsACwYAhVgKAIUqHAA2BwCFQgYARAYAhSkhAFkHAIFHGgA6DgCFMhx3AGUNAIc2EwCGFxdTdHJlbmd0aCgpAIYQHXMAIAcgSU5UADMqRGV4dGVyaXR5AD8fZAAgCAAxLkNvbnN0aXR1dGlvAIwuBQCFRRwAIAsAgRYuSW50ZWxsaWdlbmNlAIIGH2kAIAsAgXsuV2lzZG9tAIJlH3cAIAUAgXQvaGFyaXNtYQCBfyAAIAcAg0kWAI15GACNKwgKAIpUCwCLBBIAHQkAjEkVUHJpbnQAj0AJAJAnBQAFIXByaW50AI4oCCgpCgA3DQCMBRUALQUAjFEIZWxzAJE-CQCNcjIAjEATLQCCAB9lbmQKbm90ZSBvdgCSLwoAj2gJCiAgIACQJAV0b2ltaW50YQAMBXZpZWzDpCBrZXNrZW4AHgV0w6RsbMOkIGhldGtlbGzDpAA0BW1vbGVtbWlzc2Egc2FtYSAAJQYARAZvCmVuZCBub3RlAJIGFy0AkxwWAIIhDQCTECwAgxQFT3V0ADMQAJJQGC1NYWluOiBFWElUAI9mCU1haW4K&s=rose")    
HUOM: Sekvenssikaaviossa luokka Randomizer lopetetaan monesti, vaikka todellisuudessa luokkaa ei suljeta. Tämä johtuu kuvantekotyökalun rajoitteesta, ilman tätä kuva sekoaa.   