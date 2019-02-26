## Laboration 3

Syftet med denna laboration är att bekanta er med Unit-testing vilket innebär att man skriver olika tester 
för att säkerställa så attkoden fungerar som man tänkt sig.<br> 
Dessa tester är även bra att ha när du lägger till funktionalitet i din kod eller refaktorerar den så att du 
enkelt kan se ifall ändringarna du gjort inte har ändrat den tidigare funktionaliteten.<br>

Ta fram er lösning från laboration 2 och fortsätt därifrån. Är ni inte klara med laboration 2 bör ni göra den först.

### Uppgift A
1. Ladda hem nyaste versionen av Eclipse [här](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2018-12/R/eclipse-inst-win64.exe)
2. Installera filen och öppna sedan samma workspace som tidigare för att se alla dina projekt som vanligt.
3. I ditt projekt som högerklicka på projektet och välj properties.
    * Välj sedan Java Build Path 
    * Välj fliken Libraries
    * Klicka på Add Library...
    * Välj JUnit
    * Markera JUnit 5 och klicka Finish
    * Apply and close
4. Nu har du lagt till JUnit 5 i ditt projekt och kan börja skriva dina tester.

### Uppgift B
1. Skriv ett test som testar er Volvo740. Testet ska innehålla alla specfikationer från föregående labbar:
    * Gasa/bromsa med olika värden.
    * Köra med bilen.
    * Svänga flera gånger. (Och sedan köra)
    * Testa så att maxfarten inte kan överskridas.
    * Testa så att bilen inte kan ha en negativ hastighet.
2. Skriv ett test som säkerställer att turbon i Saab95 fungerar. <br>
*(Eftersom koden för att köra bilar finns i en gemensam superklass så __måste__ du inte testa den för Saaben också. <br>
OBS! Hade Saaben ändrat beteendet från superklassen eller tidigare tester så måste just den delen testas också. <br>
Som tubon i detta fall.)*
3. Eftersom en Scania körs på samma sätt som de andra bilarna men har ett flak som ytterligare funktionalitet så får du skriva ett test som ser till att Scanian fungerar som den ska med sitt flak.
4. Skriv sedan ett test för er biltransport och ta även med transport av en annan bil i ert test.
5. Skriv slutligen ett test för er båt. *(Du behöver bara testa det som skiljer sig från biltransporten)*
6. När följande tester är gjorda så borde följande klasser (eller motsvarande) ha 100% code coverage:
    * Vehicle.java
    * Car.java
    * Volvo740.java
    * Saab95.java
    * Scania.java
    * Ferry.java
    * CarTransport.java
    * Flatbed.java
    * CarLoader.java


### Extra uppgifter för mer utmaning
  * Skriv tester som testar närmare 100% av er kod.
