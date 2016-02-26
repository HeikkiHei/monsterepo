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
   
![Kaavion paikka](Monster_sekvenssikaavio.png "https://www.websequencediagrams.com/?lz=dGl0bGUgTW9uc3RlciBHZW5lcmF0b3IKCk1haW4tPiorR3JhcGhpY1VzZXJJbnRlcmZhY2U6IG5ldwoABhQtPgAaFnJ1bigpABsXKitBY3Rpb25MaXN0ZW5lckZvckdVSQBeBgAGFABMGAA6BgoAgQIWLT4ATxZsZXZlbAAFLmFsdCBidXR0b24AgQgXKisAgkEHZUNyZWF0dXIAgisGKABnBSBJTlQAgXMXAIEMGGcARwcKYWx0IE5QQwCBfhgAZBFjcmVhdGUoKQoKAIEBEC0-KisAgRQJAIF9BwAQE1JhbmRvbU5hbWU6AINtBQA1EQAWC3JldHVybgAoCigpCgA1Ci0-KgBGBml6ZXIARwUAEAwAEAtnZXQAbwZMaW5lRnJvbUlucHV0RmlsZShGSUxFAEwIaXplcgArDWNoYW5nZUZpbGVJbnRvU3RyaW5ncwAhEgCBJA4AgVUJIFNUUklORwpkZXN0cm95IACBIgoAgTgMLT4tAINIEQAyEgCCWhEtPgCDfgluAGELAIJWGwCELwhDbGFzcwCCIwsACw0AgjsYABYPAIFqcgCBMA4Agl8GAIFFDQCCTSEAgVoOAIJdGgBBFQCCZBwAhgwFAHcQAIVfG1JhYwCFdAYABQoAhTIYABYGAIRYcgCBHgUAhUQGUmFjAIUoIgCBPwUAhTYUAIFoCgCFJiRyAGELAIggG1dlYXBvbgCHZgsACwYAiFIKAIgBDwAXCACHIHIAgSMHAIgOBgCBMQYAh3UhAIFGBwCCNBoAOg4Ah34cdwBlDQCLHRMAiGMXU3RyZW5ndGgoKQCIXB1zACAHIElOVAAzKkRleHRlcml0eQA_H2QAIAgAMS5Db25zdGl0dXRpbwCQGQUAhx0cACALAIEWLkludGVsbGlnZW5jZQCCBh9pACALAIF7Lldpc2RvbQCCZR93ACAFAIF0L2hhcmlzbWEAgX8gACAHAINaBQoAjG8LAI0fEgCRCwgAjRQUAJJyFgApCQplbHMAlCMJAJBTMgCOBhMtAFMfAJJIGFByaW50AJQhCW5ldygAkmIIKQCUHBcAJA5wcmludACTFQgoKQoAQw0AgH8ZADEFAJAjCGVuZApub3RlIG92AJYvCgCTaAkKICAgAJQkBXRvaW1pbnRhAAwFdmllbMOkIGtlc2tlbgAeBXTDpGxsw6QgaGV0a2VsbMOkADQFbW9sZW1taXNzYSBzYW1hIAAlBgBEBm8KZW5kIG5vdACCBhgtAJccFgCBMA0AlxAsAIInBU91dAAzEACWUBgtTWFpbjogRVhJVACSRwlNYWluCg&s=rose")    
HUOM: Sekvenssikaaviossa luokka Randomizer lopetetaan monesti, vaikka todellisuudessa luokkaa ei suljeta. Tämä johtuu kuvantekotyökalun rajoitteesta, ilman tätä kuva sekoaa.   