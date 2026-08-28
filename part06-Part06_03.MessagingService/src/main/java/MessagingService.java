import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> listaMex;

    public MessagingService() {
        listaMex = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {

            listaMex.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        ArrayList<Message> supporto = new ArrayList<>();
        for (Message mex : listaMex) {
            supporto.add(mex);
        }
        if (!supporto.isEmpty()) {
            return supporto;
        } else {
            return new ArrayList<>();
        }

    }
}
