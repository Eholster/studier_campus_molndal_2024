# Inlämningsuppgift: Bankapplikation

## Översikt:

Du ska skapa en enkel bankapplikation i Java som hanterar kunder och deras bankkonton. Applikationen ska använda
objektorienterade principer och ArrayList för att lagra och hantera data. Du kommer även att implementera linjär sökning
och sortering baserat på saldo. Uppgiften inkluderar att skriva kod, använda GIT för versionshantering, samt skapa
dokumentation i Markdown-format.

## Krav:

### 1. **Klass: Customer (Kund)**

Skapa en klass `Customer` som representerar en kund i banken. Varje kund ska ha följande attribut:

- **Kundens namn** (`name`) – sträng.
- **Kundens personnummer** (`socialSecurityNumber`) – sträng (eller lämplig datatyp för unika identifierare).

Metoder:

- Implementera en metod som returnerar kundens namn.
- Implementera en metod som returnerar kundens personnummer.

### 2. **Klass: BankAccount (Bankkonto)**

Skapa en klass `BankAccount` som representerar ett bankkonto. Varje bankkonto ska ha följande attribut:

- **Kontonummer** (`accountNumber`) – unikt nummer för varje konto (kan vara ett heltal).
- **Saldo** (`balance`) – aktuellt saldo på kontot.
- **Kontoinnehavare** – en referens till ett `Customer`-objekt.

Metoder:

- **Sätta in pengar** (`deposit(amount)`): Öka saldot med det givna beloppet.
- **Ta ut pengar** (`withdraw(amount)`): Minska saldot med det givna beloppet om det finns tillräckligt med pengar.
- **Visa kontoinformation** (`showAccountDetails()`): Visa kontonummer, kundnamn och saldo.

### 3. **Klass: Bank**

Skapa en klass `Bank` som hanterar alla bankkonton. Banken ska ha:

- En `ArrayList<BankAccount>` för att lagra alla konton.

Metoder:

- **Lägg till ett nytt bankkonto** (`addAccount(BankAccount account)`): Lägg till ett bankkonto i banken.
- **Söka efter ett bankkonto (Linjär sökning)**: Implementera en linjär sökning som söker efter ett konto baserat på
  kundens namn eller personnummer och returnerar kontoinformation.
- **Visa alla bankkonton** (`showAllAccounts()`): Visa information om alla konton (kontonummer, kundnamn och saldo).
- **Sortera konton baserat på saldo**: Implementera en Bubble Sort metod som sorterar alla konton i banken baserat på
  saldo i fallande ordning (högst saldo först).

---

## Detaljerade Funktionella Krav:

### 1. **Kund och Konto**

- Du ska skapa flera kunder och tilldela dem bankkonton.
- Varje kund kan ha ett eller flera konton.
- Sätt in och ta ut pengar från konton, samt visa kontoinformation.

### 2. **Linjär sökning**

- Implementera linjär sökning för att hitta och visa ett specifikt bankkonto baserat på kundens personnummer eller namn.
  Om kontot inte hittas, returnera ett lämpligt meddelande.

### 3. **Sortering av konton**

- Sortera konton i fallande ordning baserat på saldo och visa resultatet. Använd en linjär sorteringsalgoritm för att
  hantera sorteringen.

### 4. **ArrayList**

- Alla samlingar av objekt (konton) ska hanteras med `ArrayList`.

---

## Krav på Dokumentation:

För att klara G-nivån i kursen ska du också:

1. **Kommentera i din kod**: Använd korta och relevanta kommentarer som förklarar vad dina metoder gör.
2. **Dokumentation i Markdown**: Fyll i svar på frågorna i `personal_reflections.md` för att reflektera över din
   inlärningsprocess.
3. **Versionshantering med GIT**:

- Använd GIT för att spåra dina ändringar under utvecklingens gång.
- Se till att göra frekventa commit-meddelanden med beskrivande namn.
- Lämna in uppgiften via SchoolHub med all kod och dokumentation.

---

## Steg-för-steg Arbetsgång:

1. **Skapa klasserna `Customer`, `BankAccount`, och `Bank`.** Börja med att implementera grundläggande metoder som att
   skapa konton och visa kontoinformation.
2. **Implementera insättnings- och uttagsfunktionalitet.** Säkerställ att det går att sätta in och ta ut pengar från
   konton och att saldot uppdateras korrekt.
3. **Linjär sökning.** Implementera en metod för att söka efter ett konto baserat på kundens namn eller personnummer och
   visa kontoinformationen.
4. **Sortering.** Implementera sortering av konton baserat på saldo.
5. **Testa och förbättra.** Testa din applikation och se till att den hanterar olika scenarier, som tomma listor, för
   låga saldon, eller försök att ta ut för mycket pengar.

---

## Bästa Praxis:

- **Clean Code:** Använd tydliga och beskrivande namn på klasser, metoder och variabler. Håll dina metoder korta och
  fokuserade på en enda uppgift.
- **Modularisering:** Se till att varje klass har sitt eget ansvar. Kunden bör t.ex. inte känna till kontots interna
  funktionalitet.
- **Kommentera kod:** Lägg till kommentarer som beskriver vad dina metoder gör, särskilt för mer komplexa delar.
- **Testa ofta:** Testa varje funktion när du implementerar den för att säkerställa att allt fungerar korrekt.
- **Versionshantering:** Använd GIT genom hela processen och gör frekventa commits med beskrivande meddelanden. Använd
  funktioner som `branching` för att hantera olika versioner av din kod.

---

## Inlämningskrav:

- Applikationen ska vara komplett och körbar.

---

## Bedömningskriterier (G-nivå):

Den studerande kan:

- redogöra för syntax, flöde och logik inom objektorienterad programmering i Java.
- redogöra för arbetsmetodik och hur struktur byggs i versionshanteringsverktyget GIT.
- redogöra för namngivning och kodstruktur av klasser, metoder och variabler enligt clean code.
- beskriva funktionen i kod.
- redogöra för markdown taggar och dess användning.
- använda sig av versionshanteringsverktyget Git i utvecklingsprojekt på ett korrekt sätt.
- använda sig av datastrukturer i sin utveckling av applikationer.
- skriva korta och relevanta kodkommentarer.
