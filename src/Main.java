import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //1) Creiamo un oggetto TaskManager
        TaskManager taskManager = new TaskManager();
        //2) Creiamo uno scanner per leggere l'input dell'utente
        Scanner sc= new Scanner(System.in);

        //3) Scriviamo un ciclo while:
        //  un menù che continua finchè l'utente non sceglie di uscire

        // variabile booleana che ci serve per far terminare il menù
        boolean running= true;

        while(running){
            // 1) Mostra il menù
            System.out.println("======= TASK MANAGER =======");
            System.out.println("1. Aggiungi Task ");
            System.out.println("2. Visualizza tutti i task ");
            System.out.println("3. Segna task come completato ");
            System.out.println("4. Elimina task ");
            System.out.println("0. Esci ");
            System.out.println("============================");
            // 2) Leggi l'input dell'utente
            int scelta= sc.nextInt();
            sc.nextLine();
            // 3) Esegui l'azione
            // (La scelta varia da 0 a 4, creaimo uno switch con le 4 scelte)

            switch (scelta){
                case 1: //Aggiungi task
                    System.out.println("Inserisci il nome del task: ");
                    String nome= sc.nextLine();
                    taskManager.addTask(nome);
                    System.out.println("Task aggiunto!");
                    break;
                case 2://Visualizza tutti i task = metodo showTasks()
                    taskManager.showTasks();
                    break;
                case 3://Segna task come completato= metodo completeTask()
                    System.out.println("Inserire l'indice del task da segnare come completato: ");
                    taskManager.showTasks();
                    int sceltaTaskCompletato= sc.nextInt();
                    taskManager.completeTask(sceltaTaskCompletato-1);
                    System.out.println("Task completato!");
                    break;
                case 4: // Elimina  task = metodo deleteTask();
                    System.out.println("Inserire l'indice del task da eliminare: ");
                    int sceltaTaskEliminare= sc.nextInt();
                    taskManager.deleteTask(sceltaTaskEliminare-1);
                    System.out.println("Task eliminato!");
                    break;

                case 0:// Se utente digita 0 --> running diventa false, il while termina.
                    System.out.println("Chiusura Menù");
                    running=false;

            }

        }




    }
}
