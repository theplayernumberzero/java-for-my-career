package basic_quiz_application;

import java.util.Scanner;

public class QuestionService {
    //5 sorumuz olacak
    Quesiton[] quesitons = new Quesiton[5];
    String[] selections = new String[5];

    public QuestionService(){
        quesitons[0] = new Quesiton(1, "what course do you taken now?", "Java", "Python", "Dart", "JavaScript", "Java");
        quesitons[1] = new Quesiton(2, "what is the best football club in Turkey?", "Sivasspor", "Galatasaray", "Fenerbahçe", "Trabzonspor", "Galatasaray");
        quesitons[2] = new Quesiton(3, "what is 2 + 3 ?", "4", "5", "6", "7", "5");
        quesitons[3] = new Quesiton(4, "who is best footballer of all time?", "Messi", "Benzama", "CR7", "Kaka", "CR7");
        quesitons[4] = new Quesiton(5, "what is the fifth month of year?", "January", "March", "September", "May", "May");
    }
    public void playQuiz(){
        int i = 0;
        for(Quesiton q : quesitons){
            System.out.println("Question No: " + q.getId());
            System.out.println("Question: " + q.getQuestion());
            System.out.println("Option 1: " + q.getOpt1());
            System.out.println("Option 2: " + q.getOpt2());
            System.out.println("Option 3: " + q.getOpt3());
            System.out.println("Option 4: " + q.getOpt4());

            System.out.print("Answer: ");
            Scanner sc = new Scanner(System.in);    //get input from user
            selections[i] = sc.nextLine();
            i++;
        }

        for(String s : selections){
            System.out.println(s);
        }
    }

    public void printScore(){
        int score = 0;

        for(int i = 0; i < quesitons.length;i++){
            if(selections[i].trim().equals(quesitons[i].getAnswer())){
                score++;
                
            }
        }
        System.out.println("\nYour score is: " + score);
    }
}
