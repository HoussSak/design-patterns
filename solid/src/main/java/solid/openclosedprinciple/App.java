package solid.openclosedprinciple;

public class App {

    public static void main(String[] args) {

        InterviewQuestionProcessor.process(new AlgorithmsInterviewQuestions());
        InterviewQuestionProcessor.process(new AIInterviewQuestions());
        InterviewQuestionProcessor.process(new FinanceInterviewQuestions());
        InterviewQuestionProcessor.process(new ComputerScienceInterviewQuestions());

    }
}
