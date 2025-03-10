package basic_quiz_application;

class Main{
    public static void main(String[] args) {
        QuestionService service = new QuestionService();
        service.playQuiz();
        service.printScore();
    }
}