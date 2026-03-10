import java.util.ArrayList;

public class TaskManager {
    ArrayList <Task> tasks; //Qui dichiaro e basta la nostra Arraylist, con il costruttore la creo veramente
    //Costruttore:
    // Ha solo uno scopo: inizializzare la lista(ArrayList) vuota;
    // Senza il costruttore tasks (l'arraylist) sarebbe null e il programma crasherebbe;
    public TaskManager(){
        tasks=new ArrayList<>();
    }

    //Metodo per creare oggetto  Task e aggiungerlo alla lista:
    public void addTask(String name){
        //Creo un nuovo oggetto di tipo task, il name arriverà dall'utente esterno che inserirà il task
        Task task = new Task(name);
        //Lo aggiungo al mio arrayList di tasks;
        tasks.add(task);
    }



    //Metodo che stampa tutti i task con il loro stato:
    //  Voglio ottenere questo formato stampa:
    // Es: 1. [✓] Studiare Java
    //     2. [ ] Fare la spesa
    //quindi formato: numero task attuale, stato task(completata o no), nome della task.
    public void showTasks(){
        //Questo metodo deve stampare tutti i task dell'ArrayList:
        // Creo variabile che servirà per stampare il numero appartenente alla task corrente

        int numeroTaskAttuale= 1;
        //Ciclo for per accedere a tutti gli elementi dell'ArrayList:
        for(Task task: tasks ){
            //Le tre cose che servono per il nostro formato stampa:
            // (Spunta verrà usato con un if basato sullo stato di completed: true o false)

            String spunta;
            String nomeTask=task.getName();
            boolean statoTask=task.isCompleted();

            if (statoTask){
                spunta="[✓]";
            } else{
                spunta="[ ]";
            }
            System.out.println(numeroTaskAttuale + ". " + spunta + " " + nomeTask );
            numeroTaskAttuale++;
        }
    }

    //Ora il metodo che ci permette di segnare come completato un Task ogni volta che l'utente lo completa.
    // completeTask prenderà come parametro la posizione del task nella lista, e lo segna come completato.
    public void completeTask(int index){
        //Costrutto try catch:
        // Ci serve nel caso in cui l'utente inserisce un index non valido
        try{
            Task task = tasks.get(index);
            //Il task ora tramite il setter verrà segnato come completato
            task.setCompleted();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Errore: indice non valido,task non trovato");

        }        //prendo quindi il task che devo segnare come completato alla posizione index

    }

    //Metodo che invece serve per eliminare un task dall'arrayList di tasks
    public void deleteTask(int index){
        //Costrutto try catch:
        // Ci serve nel caso in cui l'utente inserisce un index non valido
        try{
            //Rimuovo l'oggetto nell'arrayList task nella posizione index
            tasks.remove(index);
        }catch (IndexOutOfBoundsException e){
            System.out.println("Errore: indice non valido,task non trovato");

        }

    }

}
