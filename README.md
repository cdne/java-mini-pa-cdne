# Java SE: Bonus OOP exercise

## Grading dimensions

The skills we are interested in now:

- Programming skills
- Java OOP

## Your task

### Forum Engine

Let's make the basics of a forum web application! The forum consists arbitrary number of topics. One topic can have a lot of comments. A comment can only appear when it has already been moderated. 

Tasks:

1. Clone the base repo, make sure you push all your changes at the end!
1. Create 4 classes: `Forum`, `Entry`, `Topic`, `Comment` 
   - The `Forum` is the main class, its constructor has no arguments.    
   - The `Entry` is an abstract class, `Topic` and `Comment` are extending it. The `Topic` and `Comment` classes have the  `creationDate`, `message` and `id` fields in common.  
   - When we create a `Topic` we must pass its `title` and its `message` to it, then it sets its creation date and id automatically
   - When we create a `Comment` we must pass its `message` to it. Then it sets its creation date and id the same way as a `Topic` 
1. Ensure that we can have only one `Forum` instance, the `Forum` can have many `Topic`s, a `Topic` can have many `Comments`s. Use `addXxxx` functions where the `xxxx` part is the type's name regarding to the addition.
Example: addTopic method under Forum.
1. The Comment has an `moderated` logical flag, which is `false` in the beginning. We can change its value by the `toggleModeration` function call which has no parameters.
1. The `Topic`'s `getModeratedComments` function only returns those `Comment` instances, which `moderated` flag is equal to `true`.
1. Test your code by making a few sample instances and printing them out. (hint: add `toString` functions) 
1. Bonus: Write unit tests for the `Topic` class
