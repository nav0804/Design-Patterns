class JudgeAnalytics {
    int run = 0, submit = 0;
    void countRun(){
        run++;
    }
    // void countSubmit(){
    //     submit++;
    // }

    public int getRun(){
        return run;
    }

    public int getSubmit(){
        return submit;
    }
}

public class Singleton {
    public static void main(String[] args) {
        JudgeAnalytics j1 = new JudgeAnalytics();
        j1.countRun();
        System.out.println(j1.getRun());

        JudgeAnalytics j2 = new JudgeAnalytics();
        j2.countRun();
        System.out.println(j2.getRun());
    }
}


/* 
Since countRun function is called twice but since the call has been made from different object instances 
thats why the values are different for each getRun() 

Now this judgeAnalytics class will be called by many services across the code, so we need to have a single instance of it.

Therefore comes the singleton pattern. In there two patterns are present, Eager loading and lazy loading
*/