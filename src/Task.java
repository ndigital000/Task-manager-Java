public class Task {
    String name;
    boolean completed;

    //Costruttore della classe Task
    public Task(String name){
        this.name=name;
        this.completed=false;
        // Imposto completed a false di default;
    }

    //Metodo getter per ottenere il nome
    public String getName(){
        return name;
    }
    //Metodo gettere per ottene lo 'stato' completed
    public boolean isCompleted(){
        return completed;
    }

    //Metodo setter per completed
    // Non serve per il nome perchè il nome è sempre quello
    // Completed può variare da False a True
    // Tipo di ritorno void perchè non ritorna niente, sempre public
    public void setCompleted(){
        this.completed=true;

    }

}
