# Gioco_Sedie

**Gioco_Sedie** è un'applicazione Java che simula il gioco delle sedie, in cui i giocatori devono sedersi sulle sedie. Il gioco inizia con un numero di giocatori e termina quando tutte le sedie sono occupate. Ogni giocatore è rappresentato da un thread anche la classe Display è un thread, durante il gioco uno dei giocatori viene eliminato appena tutte le sedie sono occupate.

## Funzionalità

- **Input del numero di giocatori**: scegliere quanti giocatori parteciperanno al gioco.
- **Simulazione**: ogni giocatore è rappresentato da un thread e si siede su una sedia in modo casuale.
- **Eliminazione del giocatori**: una volta che tutte le sedie sono occupate, un giocatore viene eliminato.

## Come funziona

1. L'utente inserisce in input un numero di giocatori.
2. Vengono create un numero di sedie pari al numero di giocatori meno uno (ad esempio 9 sedie per 10 giocatori).
3. Ogni giocatore è rappresentato da un thread che tenta di sedersi su una delle sedie disponibili.
4. Il gioco continua finché tutte le sedie sono occupate e un solo giocatore rimane.

## Requisiti

- **Java**.
- **Un IDEE**.

## Crediti
- **@mciuchetti**
