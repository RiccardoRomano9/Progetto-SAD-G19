# Progetto-SAD G19

## Repository del gruppo 19 

Per la realizzazione del prototipo abbiamo inserito direttamente il jar per l'avvio di Randoop e le librerie di Emma (compresi di jar) per l'ottenimento della coverage dei test automatici casuali generati da Randoop.
E' stato inoltre implementato uno script batch "robot.bat" per l'avvio di Randoop ed Emma, ed un eseguibile java per poter avviare direttamente il bat da Java "RunRobot.jar".

A scopo esemplificativo per la generazione dei test è stato usato il progetto "jipa", fornitoci in precedenza dal professore Porfirio Tramontana durante il corso di Software Testing.
Il time limit, ovvero il limite di tempo massimo per ogni sessione di test, è stato impostato a 20 secondi.
L'output della coverage e dei test generati è prodotto nella cartella e riporta anche data ed orario per poterlo distungere facilmente dalle successive sessioni di test.

Si noti che non è stato ancora implementato un path "universale" per quanto riguarda la java version 1.8 necessario per il funzionamento di Randoop ed Emma, il quale dovrà essere (per ora) modificato all'interno del file robot.bat .
L'obiettivo è quello di utilizzare Gitlab come repository dalla quale prelevare le classi caricate.
