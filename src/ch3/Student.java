package ch3;

public class Student {
    private String name;
    private int totalScore;
    private int countQuiz;

    public Student(String name) {
        this.name = name;
    }

    public void addQuiz(int score){
        totalScore += score;
        countQuiz++;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getAverageScore() {
        return totalScore / countQuiz;
    }
}
