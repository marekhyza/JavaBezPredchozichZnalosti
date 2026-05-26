# AGENTS — rychlý průvodce pro AI kódovací agenty

Níže jsou koncentrátní, praktické směry pro agenty, kteří mají být okamžitě produktivní v tomto repozitáři.

## Rychlý checklist (před úpravami)
- Ověřit, že neexistuje `AGENTS.md`/`AGENT.md`/`.github/copilot-instructions.md` — (není zde).
- Zachovat strukturu balíčků: zdrojové soubory v `src/` mapují přímo na Java package deklarace.
- Nepřejmenovávat soubory ani balíčky — mnoho ukázkových tříd spoléhá na přesné umístění souborů.

## Velký obraz projektu
- Jedná se o edukační sbírku krátkých Java ukázek seskupených podle kapitol (adresáře `KapitolaDve`, `KapitolaTri`, ...). Každý soubor obvykle obsahuje samostatný `main` nebo malý příklad.
- Hlavní vstupní bod pro běh celého projektu: `src/Main.java` (pokud chcete spouštět celé demo). Jiné spouštěčové třídy jsou umístěny v podsložkách (např. `src/Pokusy/Day4a4.java`).

## Co si pohlídat při změnách kódu
- Package deklarace v top řádku musí odpovídat adresářové struktuře v `src/` (např. `package Pokusy;` v `src/Pokusy/Day4a4.java`).
- Mnoho tříd jsou jednoduché ukázky; při hromadných změnách (refaktoringu názvů) upravovat všechny soubory současně.
- Jazykové konvence: názvy souborů a proměnných jsou často v češtině (např. `jmena`, `nalezeno`) — dodržet sémantiku při generování kódu.

## Build / run / debug (konkrétní příkazy, PowerShell)
- Kompilace všech zdrojů z kořene projektu (PowerShell):

```powershell
New-Item -ItemType Directory -Force -Path out
Get-ChildItem -Path .\src -Recurse -Filter *.java | ForEach-Object { javac -d out $_.FullName }
```

- Spuštění hlavní třídy (`Main` v kořeni `src`):

```powershell
java -cp out Main
```

- Spuštění konkrétní ukázkové třídy (příklad `Day4a4`):

```powershell
# zkompilovat jen soubor
javac -d out src\Pokusy\Day4a4.java
# spustit (balíček Pokusy)
java -cp out Pokusy.Day4a4
```

- Doporučené IDE: IntelliJ IDEA — projekt je formátovaný jako jednoduché studijní zdrojové soubory (IDE automaticky nakonfiguruje classpath). Použijte "Open Directory" na kořen projektu.

## Testovací a ladicí poznámky
- Projekt nemá automatizované testy ani build system (pom.xml / build.gradle nejsou přítomny). Agenti by měli nepsat závislosti na konkrétních build nástrojích bez přidání konfiguračních souborů.
- Pro ladění malých změn kompilovat jen upravené soubory a spouštět cílovou třídu, aby se minimalizoval dopad na ostatní ukázky.

## Vzory a konvence v kódu
- Každá kapitola je samostatný adresář a obsahuje mnoho samostatných ukázek — změny navrhovat lokálně (per soubor) a ne globálně.
- Vzor: jednoduché `main` metody s `Scanner` pro vstup (viz `src/Pokusy/Day4a4.java`) — při generování testů nebo mocků zajistit simulaci vstupu.
- Nepoužívat komplexní závislosti: projekt je "vanilla" Java (standard library only). Pokud agent přidá knihovnu, přidejte i příslušné build manifesty.

## Integrace a externí body
- Žádné síťové služby ani DB připojení v repozitáři. Jestli navrhujete integraci (např. CI), přidejte soubory `pom.xml` nebo `build.gradle` a dokumentujte je v PR.

## Konkrétní soubory, které ilustrují pravidla
- `src/Main.java` — centrální spouštěč pro celý repozitář (pokud existuje).  
- `src/Pokusy/Day4a4.java` — ukázka CLI programu s `Scanner` (vstup řetězce, porovnání jmen).  
- adresáře `src/Kapitola*` — obsahují kapitoly s krátkými příklady; změny zde zachovat lokální charakter.

## Jak psát PR zprávy / commit messages (specifické doporučení)
- Upravujete-li jednu ukázku: commit message "Fix: <cesta> - stručný popis" (např. "Fix: src/Pokusy/Day4a4.java - nepřepisovat výstup v loopu").
- Refaktoring celé kapitoly: "Refactor: KapitolaCtyri - move helper methods" s popisem dopadu na další soubory.

---
Buďte opatrní: tento repozitář je výukový; cílem je zachovat ukázky jednoduché a srozumitelné.
