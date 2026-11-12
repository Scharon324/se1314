//Write a Java program which prints "a letter to your friend, explaining about your current course, your current interests/ hobbies and future plans.

import javax.swing.JOptionPane;
public class oop1_2_3_In_Windowed_Message_Box
{
    public static void main(String[] args) {
        String name = "Alice";
        String friendName = "Bob";

        String letter = "Dear " + friendName + ",\n\n"
                     + "I hope this letter finds you well. I wanted to share a bit about my current situation.\n\n"
                     + "At the moment, I am enrolled in a course called 'Introduction to Computer Science'. It's really interesting!\n"
                     + "I'm learning about different programming languages and data structures. So far, it has been quite challenging but also very rewarding.\n\n"
                     + "Apart from my studies, I have several hobbies that keep me busy. I love playing the piano and trying out new recipes in the kitchen. \n"
                     + "I also enjoy hiking and exploring new places during weekends.\n\n"
                     + "Looking ahead, I plan to continue my education by pursuing a degree in Software Engineering next year. \n"
                     + "After that, I hope to work in the tech industry for a few years before considering further studies or maybe starting my own company.\n\n"
                     + "Well, that's about me for now! It's been great talking to you, and I look forward to hearing from you soon.\n\n"
                     + "Best regards,\n"
                     + name;

        JOptionPane.showMessageDialog(null, letter, "Letter to " + friendName, JOptionPane.INFORMATION_MESSAGE);
    }
}