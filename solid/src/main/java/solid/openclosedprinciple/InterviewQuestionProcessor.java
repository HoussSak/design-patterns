package solid.openclosedprinciple;

public class InterviewQuestionProcessor {
    public static void process(InterviewQuestion question) {

        // Violation of Open-closed principle

      //  if (question instanceof AlgorithmsInterviewQuestions) {
      //      AlgorithmsInterviewQuestions algQuestion = (AlgorithmsInterviewQuestions) question;
      //      algQuestion.executeAlgorithm();
      //  } else if (question instanceof AIInterviewQuestions) {
      //      AIInterviewQuestions aiQuestion = (AIInterviewQuestions) question;
      //      aiQuestion.executeAi();
      //  } else if (question instanceof FinanceInterviewQuestions) {
      //      FinanceInterviewQuestions financeQuestion = (FinanceInterviewQuestions) question;
      //      financeQuestion.executeFinance();
      //  }

        question.execute();

    }
}
