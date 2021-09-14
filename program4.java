class Student{
    int answers[];
    private int result = 0;

    Student(int answers[]){
        this.answers = answers;
    }

    void calculateResult(int answer_keys[]){
        if(answers.length == answer_keys.length){
            for(int i=0;i<answers.length;i++){
                if(answers[i]==answer_keys[i]){
                    result+=1;
                }
            }
        }
        System.out.println("Result: "+result+"/"+answers.length);
    }
}

public class program4{

    public static void main(String[] args){
        
        int[] answer_keys={1,2,3,4,4,3,2,1,4,4};
        Student s1= new Student(new int[]{1,2,3,4,4,3,2,1,4,1});
        Student s2= new Student(new int[]{1,4,1,3,4,1,2,3,4,2});
        s1.calculateResult(answer_keys);
        s2.calculateResult(answer_keys);
    }

}
