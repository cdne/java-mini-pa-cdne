package code.pa;


public class Comment extends Entry{
    private static int idCounter;
    private boolean moderated;

    Comment(String message){
        setMessage(message);
        setCreationDate();
        setId(idCounter++);
        moderated = false;
    }

    void toggleModeration(){
        moderated = true;
    }

    boolean isModerated() {
        return moderated;
    }

    @Override
    public String toString() {
        return "Comment -  id: " + getId() + ", message: " + getMessage() + ", creation date: "
                + getCreationDate() + ", moderated: " + moderated;
    }
}
