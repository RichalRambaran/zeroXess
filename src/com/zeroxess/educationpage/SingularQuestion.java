package com.zeroxess.educationpage;

public class SingularQuestion extends Question{
    private SingularAnswer singularAnswer;

    public SingularQuestion(String question, Integer points, String correctAnswer) {
        super(question, points);
        this.singularAnswer = new SingularAnswer(correctAnswer);
    }

    public SingularQuestion(String question, String correctAnswer) {
        super(question);
        this.singularAnswer = new SingularAnswer(correctAnswer);
    }

    @Override
    public Boolean checkAnswer() {
        return getUserAnswer().equals(singularAnswer.getCorrectAnswer());
    }

    public SingularAnswer getSingularAnswer() {
        return singularAnswer;
    }

    public void setSingularAnswer(SingularAnswer singularAnswer) {
        this.singularAnswer = singularAnswer;
    }
}
