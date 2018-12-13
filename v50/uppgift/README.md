## Threads i Java

Skapa en tom textfil/docs och svara på frågorna i steg 3-7. <br>
Diskutera gärna resultaten med era grannar men jag vill att alla ska skriva koden och svaren!

### Counter
1. Skapa en ny klass Counter, vars uppgift är att kunna räkna. <br>
   Counter ska ha en privat heltalsvariabel och metod *count()* där den ökar heltalet med ett och skriver ut det till konsolen.
2. Skapa en till klass med en main-metod och skapa ett Runnable-objekt vars syfte är att 5 gånger anropa ett statisk objekt av typen Counter och dess *count()* metod.
3. Skapa sedan en for-loop som skapar och startar 10 Threads med ditt Runnable-objekt.
    - Kör din kod några gånger. Vad får du för resultat?
    - Varför tror du det blev det så?
4. Ändra *count()* så att den blir synchronized.
    - Var tror du händer nu?
    - Kör din kod några gånger. Vad får du för resultat?
    - Varför tror du det blev det så?
5. Ändra *count()* så att den **inte** längre är synchronized och att den istället returnerar värdet på heltalet.<br>
   Gör så att ditt Runnable-objekt skriver ut det returnerade värdet från din Counter istället.
    - Vad tror du händer nu?
    - Kör din kod några gånger. Vad får du för resultat?
    - Varför tror du det blev det så?
6. Ändra *count()* så att den blir synchronized.
    - Vad tror du händer nu?
    - Kör din kod några gånger. Vad får du för resultat?
    - Varför tror du det blev det så?
7. Ändra i ditt Runnable-objekt så att din Counter hamnar i ett synchronized-block och skriv ut värdet på *count()*.
    - Vad tror du händer nu?
    - Kör din kod några gånger. Vad får du för resultat?
    - Varför tror du det blev det så?

#### Vad kan du dra för slutats av alla dessa försök?

Skicka in dina svar och slutats till min mail joakim.ohlsson@ntig.se innan 20/12

Fastnar ni eller behöver fräscha upp minnet om Threads kan ni kolla på en Lynda-kurs [här](https://www.lynda.com/Java-tutorials/Welcome/534639/556663-4.html?autoplay=true).
