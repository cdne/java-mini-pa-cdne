package code.pa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Forum {
    private static Forum instance;
    private static List<Comment> commentList = new ArrayList<>();
    private static List<Topic> topicList = new ArrayList<>();
    private static Random random = new Random();

    private Forum() {
    }

    private static class ForumSingleton {
        private static final Forum instance = new Forum();
    }

    static Forum getInstance() {
        if (instance == null) {
            return ForumSingleton.instance;
        }
        return instance;
    }

    public static void main(String[] args) {
        Topic topic1 = addTopic("Computer Games", "Awesome computer games for all ages");
        Topic topic2 = addTopic("Programming", "All about programming languages");
        Topic topic3 = addTopic("Social", "Talk about everything you want, just don't break TOS");

        topicList.add(topic1);
        topicList.add(topic2);
        topicList.add(topic3);


        // add comments in topics
        for (int i = 0; i < 4; i++) {
            for (Topic topic : topicList) {
                topic.addComment(generateRandomString());
            }
        }

        // add random moderation to comments
        for (Topic topic : topicList)
            for (Comment comment : topic.getAllComments()) {
                int setTrueOrFalse = random.nextInt(2);
                if (setTrueOrFalse == 1) {
                    comment.toggleModeration();
                }
            }


        System.out.println(topic1);
        System.out.println("All comments in topic: " + topic1.getAllComments());
        System.out.println("Moderated comments: " + topic1.getAllModeratedComments());
        System.out.println();
        System.out.println(topic2);
        System.out.println("All comments in topic: " + topic2.getAllComments());
        System.out.println("Moderated comments: " + topic2.getAllModeratedComments());
        System.out.println();
        System.out.println(topic3);
        System.out.println("All comments in topic: " + topic3.getAllComments());
        System.out.println("Moderated comments: " + topic3.getAllModeratedComments());
    }

    static Topic addTopic(String title, String message) {
        return new Topic(title, message);
    }

    static String generateRandomString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        return random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

}
