package sistem_birocratic.entity;

public class Client {
    private int id;
    private static int idCounter = 0;

    private Document document;

    public Client(Document document){
        id = idCounter++;
        this.document = document;
    }
}
