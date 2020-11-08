/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAM
 */
public class Student  extends Person {
     private float scoreMath=0;
    private float scoreLiter=0;
    private float scoreGPA=0;
    public Student () {
    }


    public Student(String id, String name, byte age, String address, float scoreMath, float scoreLiter) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.address=address;
        this.scoreMath = scoreMath;
        this.scoreLiter = scoreLiter;
        this.scoreGPA=(scoreLiter+scoreMath)/2;
    }

    public float getScoreGPA() {
        return scoreGPA;
    }

    public void setScoreGPA(float scoreGPA) {
        this.scoreGPA = scoreGPA;
    }
    public float getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(float scoreMath) {
        this.scoreMath = scoreMath;
    }

    public float getScoreLiter() {
        return scoreLiter;
    }

    public void setScoreLiter(float scoreLiter) {
        this.scoreLiter = scoreLiter;
    }

    public float caculatorScoreGPA() {
        return (scoreMath+scoreLiter)/2;
    }

    @Override
    public String toString() {
        return "Student : "+"\n" + super.toString()+"\n"+"  scoreMath = " + scoreMath + ",  scoreLiter=" + scoreLiter + ",  scoreGPA=" + scoreGPA + '.';
    }
    
}
