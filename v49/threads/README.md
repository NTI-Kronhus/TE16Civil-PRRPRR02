## Uppgift - Timer
- Skapa en klass Timer, vars uppgift är att fungera som en timer som räknar ned från en viss tid.
- Timer ska implementera Runnable, och ha en Thread som en privat instansvariabel.
- Det ska vara möjligt att starta en Timer genom att anropa metoden *start(int time)*. Där *time* är definerad i sekunder.
- Timern ska räkna ned varje sekund från *time* i konsolen och skriva **KLART!** när tiden är ute.
- En Timer som är startad ska inte kunna startas igen förrän den är klart. 
- Det ska också vara möjligt att stoppa Timern manuellt med *stop()*.
    - Detta gör du enklast genom att sätta den privata tråden till null och låta *run()* kontrollera detta.
- Lägg även till så att du kan starta och stoppa klockan via konsolen.
### Extra
- Gör så att Timer skriver ut antal timmar, minuter och sekunder istället för bara sekunder.
- Gör så man kan ställa in så att Timern körs i bakgrunden eller alltid skriver ut tiden varje sekund.
- Gör så att man i ditt huvudprogram kan skapa flera timers och köra dem parralellt.
