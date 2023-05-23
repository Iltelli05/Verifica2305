# Verifica di Progettazione 23-05
## Tutorial per la creazione di una repository
### Creare una repository e file README.md
 - Creare una cartella sul Desktop (in questo caso: Verifica2305)
 - Aprire git bash (questa icona)

![gitBash](gitBash.png)

 - Una volta aperto eseguire il comando:
```cd $HOME/path/to/repName # path/to rappresenta il percorso per arrivare alla cartella, mentre repName rappresenta il nome della cartella```
 - Creare il file README sul blocco note, poi deve essere salvato nella cartella creata precedentemente e salvarlo come .md

![salvataggioREADME](salvataggioREADME.png)

 - Una volta salvato il file, fare l'accesso al sito https://github.com con il proprio username e la password
 - In alto a sinistra e cliccare su New per creare una nuova repository (Esempio nell'immagine sottostante)

![nuovaREP](nuovaRep.png)

 - Seguire le seguenti impostazioni per la creazione della repository sul sito

![impostazioni](impostazioni.png)

 - Cliccare su create in fondo alla pagina

### Configurazione della repository locale e sincronizzazione da git bash
 - Bisogna eseguire i seguenti comandi dal prompt di git bash:

```
git init # per inizializzare
git add README.md  # Inserimento del file README.md nell'area di staging
git commit -m "first commit"  # Creazione del primo commit, che serve a sincronizzare il repository locale con lo stage
git branch -M main  # Creazione del branch main, da usare come default
git remote add origin https://github.com/<username>/Esercitazione16maggio  # Connessione del repository remoto al repository locale
git push -u origin main  # Sincronizzazione del repository remoto con quello locale
```

### Aggiunti dei file alla repository (in questo caso esercitazione pre verifica di informatica del compagno Nicola Scardoni)
 - Scaricare i file dal compito di classroom

![compito](compito.png)

 - Estrarre i file dalla cartella zip nella cartella Verifica2305
 - una volta aggiunti tutti i file alla cartella bisogna tornare su git bash ed eseguire i seguenti comandi

```
git add . # aggiunta all'area di staging di tutti i file della cartella
git commit -m "commit dei file dell'esercitazione di informatica e del testo" # Creazione del commit, che serve a sincronizzare il repository locale con lo stage
git push -u origin main # Sincronizzazione del repository remoto con quello locale
```
 - Abbiamo finito ora sul sito nella nostra repository dovremmo trovarci in questa situazione:

![Finale](Finale.png)

# Commento del codice ed esposizione
