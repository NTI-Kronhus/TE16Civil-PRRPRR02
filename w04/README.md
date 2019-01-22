## Laboration 1

Syftet med dessa laborationer är att ni ska lära er att använda koncept som arv, gränssnitt och overriding mer ingående. <br>
Ni ska även tänka på hur ni bygger upp och designar era klasser och även följa beprövade metoder.

Allting ni gör under dessa laborationer ska ni göra i ett repository som ska finnas på GitHub. <br>
När ni skapat ett gemensamt repo maila mig länken till det så jag vet vilken av er som "äger" repot.<br>
Efter avrje deluppgift *(A,B,C,D,E)* **SKA NI** ha gjort minst en commit till ert repo.

#### Uppgift A:

* Börja med att kopera/ladda ner följande Java-filer och kika lite i dem: [Volvo740.java](https://raw.githubusercontent.com/NTIGBG/TE16Civil-PRRPRR02/master/w04/Volvo740.java) och [Saab95.java](https://raw.githubusercontent.com/NTIGBG/TE16Civil-PRRPRR02/master/w04/Saab95.java). *Just nu verkar klasserna ha ganska mycket gemensamt, eftersom båda representerar bilar.*
* Skapa en arvshierarki där Volvo740 och Saab95 ingår som eliminerar all kod-duplicering och i görligaste mån följer open-closed-principen. *Gör dessa ändringar utan att ändra på klassernas funktionalitet.*
* I originalfilerna är alla metoder och variabler public, vilket exponerar allt till användaren. *Ändra synligheten på de metoder och variabler som användaren inte behöver se eller känna till.*

#### Uppgift B:

I denna uppgift fortsätter vi bygga på föregående genom att vi nu också implementerar ett interface kallat Movable.

* Skapa en fil Movable.java och ge interfacet följande metoder:
  * ```void move()```
  * ```void turnLeft()```
  * ```void turnRight()```
* Se till att era bilar implementerar interfacet Movable, med någon lämplig intern representation av deras riktning och position. 
* Metoden move ska fungera så att beroende på riktning ökas (eller minskas) bilens x- eller y-koordinat med dess currentSpeed.

#### Uppgift C:

* Använd Javadoc för att kommentera samtliga klasser och interfaces. Ni ska ha Javadoc för alla filer. 
* Det ska minst finnas Javadoc för själva klassen och alla dess publika metoder plus konstruktorer.

#### Uppgift D:

Bilklassernas metoder har för närvarande inget sätt att kontrollera hur mycket farten kan öka eller sänkas.<br> 
Skriv om metoder (och dokumentation) så att:

* ```gas()``` och ```break()``` bara accepterar värden i intervallet [0, 1],
* ```currentSpeed``` alltid ligger i intervallet [0, ```enginePower```],
* Anrop till ```gas()``` inte kan resultera i att farten sänks.
* Anrop till ```break()``` inte kan resultera i att farten höjs.
* Lägg även till två stycken egna bilmodeller utöver Volvo740 och Saab95.

#### Uppgift E:

* Skapa ett UML-diagram för er nuvarande design.
* Spara UML-diagrammet som en .html-fil i ert repo.
* Pusha allting till github.

#### Extra uppgift för mer utmaning:
* Lägg till en enkel command line controller genom vilken ni kan skapa bilar; gasa och bromsa bilar; avgöra var bilarna befinner sig; etc.
