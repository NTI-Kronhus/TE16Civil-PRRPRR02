## Laboration 2

Syftet med denna laboration är att öva på olika verktyg för polymorfism och återanvändning av kod: arv vs delegering, superklasser vs interfaces, och principer för subklasser. <br>
Tanken är att ni ska fortsätta på den lösning ni gjort i laboration 1. <br>
<br>
Se till att noga läsa igenom instruktionerna och att följa de regler och krav som uppgifterna föreskriver. <br>
Börja med att kolla igenom hela beskrivningen och se vad som krävs för att få godkänt, samt med att ladda ner de filer som behövs.<br>
<br>
Koden ni skriver i denna labb kommer senare att användas i laboration 3.<br>
<br>
Ta fram er lösning från laboration 1 och fortsätta därifrån. Är ni inte klara med laboration 1 bör ni göra den först.

### Uppgift A
* Skapa en representation av en Scania-lastbil med modellnamn Scania.<br>
  Ge den rimliga startvärden för relevanta fält. Lägg den i filen Scania.java i samma mapp.

* Scania ska införlivas i er arvs-hierarki från tidigare, men ha ytterligare funktionalitet: 
  * Den har ett flak som kan höjas och sänkas.
  * Införliva detta i er design så att vi kan hålla reda på vilken vinkel flaket har för närvarande, samt funktioner för att höja och sänka det.<br>
    Följande förhållanden ska gälla:<br>
    * Vinkeln på flaket kan inte vara lägre än 0 eller högre än 70.
    * Flaket kan enbart ha en annan vinkel än 0 om lastbilen står stilla.
  * Lägg allt i Scania.java och skriv Javadoc för klassen och metoderna.

### Uppgift B

* Skapa en representation av en biltransport - dvs en långtradare som kan transportera bilar på flaket. <br>
  Ge den ett valfritt modellnamn och filnamn.
* Biltransporten ska på lämpligt sätt införlivas i er arvshierarki från tidigare. Likt Scania-lastbilen har den ett “flak” i form av en ramp som går att höja och sänka. Införliva detta i er design på lämpligt sätt.

* Bilar ska kunna lastas på och av biltransporten. Biltransporten har ett maximalt antal bilar som den kan lasta. 
* Bilar som ska lastas på biltransporten får inte vara för stora (gör ett eget antagande).<br>
  Följande förhållanden ska gälla:
  * Biltransportens ramp har endast två lägen, uppe eller nere.
  * Rampen kan endast vara nere om biltransporten står stilla.
  * Bilar kan endast lastas om rampen är nere, och de befinner sig rimligt nära biltransporten (gör ett eget antagande, de exakta detaljerna är inte viktiga).
  * Bilar kan endast lastas av om rampen är nere. De bör då hamna rimligt nära biltransporten.
  * Bilar kan endast lastas av i omvänd ordning från hur de lastades, dvs den sista bilen som lastades måste vara först att lossas.
  * Biltransporten ska inte kunna lasta på sig själv.
  * Under det att en bil är lastad på biltransporten ska dess position i världen alltid vara densamma som biltransportens position.
* Viktiga saker att ha i åtanke under den här uppgiften:
  * Undvik kodduplicering för funktionalitet som är gemensam för flera olika klasser, ex. lastbil och biltransport.
  * Kom ihåg att skriva Javadoc-dokumentation för all kod ni skrivit.

### Uppgift C

* Skapa en representation av en bilfärja - dvs en färja på vilken det går att lasta bilar. <br>
  Notera att bilfärjan inte är en bil (doh), men att många av de metoder vi hittills använt för olika sorters bilar bör gå att applicera även på färjan. <br>
  Hur åstadkommer ni bäst detta?

* På bilfärjan gäller samma regler som för biltransporten, med undantaget att bilar lossas i samma ordning som de lastades, dvs den första bilen som lastades måste vara först att lossas (first-in-first-out).
* Viktiga saker att ha i åtanke under den här uppgiften:
  * Undvik kodduplicering för funktionalitet som är gemensam för ex. bilfärjan och biltransporten.
 
### Extra uppgifter för mer utmaning
  * Låt bilfärjan ha ett antal olika filer i vilka bilarna kan befinna sig. För varje fil gäller att bilarna i den filen enbart kan lastas av i samma ordning som de lastades på (first-in-first-out), men bilar från olika filer kan lastas av i olika ordning (även omväxlande mellan filerna).
  * Utöka er command line controller till att hantera alla nya element.
