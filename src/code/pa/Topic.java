package code.pa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Topic extends Entry {
    private String title;
    private static int idCounter;
    private Comment comment;
    private List<Comment> comments = new ArrayList<>();

    Topic(String title, String message) {
        this.title = title;
        setMessage(message);
        setCreationDate();
        setId(idCounter++);
    }

    Comment addComment(String message) {
        comment = new Comment(message);
        comments.add(comment);
        return comment;
    }

    List<Comment> getAllModeratedComments(){
        return comments.stream().filter(Comment::isModerated).collect(Collectors.toList());
    }

    List<Comment> getAllComments(){
        return comments;
    }

    String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Topic -  id: " + getId() + ", message: " + getMessage() + ", title: " + getTitle() +", creation date: "
                + getCreationDate();
    }
}
