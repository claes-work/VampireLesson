# VampireLesson

Clone this repository by opening a git bash in the target directory and typing the command:\
"git clone https://github.com/claes-work/VampireLesson.git"

There are three classes to use:
- Main
- Vampire
- VampireFamily

# Git commands

Du hast noch keine git bash Terminal installiert?
https://gitforwindows.org/

Um das Terminal zu öffnen, kannst du entweder in der Windows Suche nach "Git Bash" suchen und in deinen Ordner navigieren, oder du öffnest deinen Order, machst einen Rechtsklick und wählst "Git Bash Here".

#### Navigieren:

```ls``` \
(Listet dir alle Ordner des Pfades auf, in dem du dich befindest)

```cd mein-ordner-name``` \
(navigiert in ein Verzeichnis, das sich in deinem aktuellen Pfad befindet)


```cd ..``` \
(springt einen Ordner nach oben)
___

#### Repository erstellen:

```git init``` \
Initialisiert ein neues git repository in einem bestimmten Ordner\
(Kannst du auch in einem Ordner machen, wo du bereits Datein hast)

```git remote add origin https://github.com/mein-account/repo-name.git``` \
Erstellt die Verknüpfung zu einem Git Repository, dass du über Github erstellt hast.


Alternativ:\
```git clone https://github.com/mein-account/repo-name.git``` \
Kopiert ein Git Repository, dass du über Github erstellt hast. Der clone Befehl benötigt keine vorherige Initialisierung durch "Git init". Er kann sowohl ein leeres Repository, als auch ein bestehendes Repository kopieren. 
Empfiehlt sich **nicht**, wenn du local schon Datein hast und diese zu dem Repository hinzufügen willst. Demnach nur nutzen wenn, du entweder ein bestehendes Repo kopieren willst, oder ein neues erstellst, bevor du das erste Mal Datein anlegst.
___

#### Datein hochladen (pushen):

```git add pfad/zu/meiner/datei``` \
Fügt eine Datei hinzu. (Die Datei ist noch nicht hochgeladen, nur vorgemerkt)

```git add .``` \
Fügt alle Datein in dem aktuellen Verzeichnis hinzu. Für den Anfang in Ordnung, sollte man aber eher nicht machen. 

```git commit -m "Mein super coole commit Nachricht, die erklärt, was ich gemacht habe"``` \
Muss zwangsläufig definiert werden und gibt die Nachricht an für alle Datein, die du im Vorfeld mit ```git add``` hinzugefügt hast.

```git push origin master``` \
Läd die commits die im Vorfeld getätigt wurden zu dem Verknüpften repository hoch. (Das wort "master" ist der name des Branches. In Firmen hast du meist einen Branch für "develop" und master ist dann nur das, was wirklich auf einem live System liegt. Für uns erstmal egal.)
___

#### Datein ziehen (pullen):

```git pull origin master``` \
Holt sich alle aktuellen Änderungen, die du noch nicht local hast.\
**VORSICHT** (Wenn mehrere Leute am Projekt arbeiten):\
Bevor du einen push durchführt immer deine Änderungen commiten und dann **erst pullen** bevor du den push ausführst.\
Sonst könnte es passieren, dass du in einen "Merge-Konflikt" kommst, weil die Datein auf dem System eventuell Änderungen haben, die du überschreiben würdest.
___

#### Sonstiges

```git status``` \
Gibt dir den aktuellen Status aus. Enthält unter anderem die Informationen über:
- Aktuelle nicht gepushte Änderungen
- Auf welchem Branch du dich befindest
___

Grundsätzlich muss man keinen einzigen dieser Befehle benutzen, da moderne Entwicklungsumgebungen wie "IntelliJ IDEA" für alle diese Dinge visuelle Benutzer Oberflächen haben.
Zumindest das clonen oder erstellen einer Verknüpfung zu einem Repository benutze ich eher über die Kommandozeile (ist einfach schneller).
