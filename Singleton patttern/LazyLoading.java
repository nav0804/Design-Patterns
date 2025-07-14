/*
 * LAZY LOADING
 */

class JudgeAnalytics{
    private static JudgeAnalytics judgeAnalytics; // Object wont be loaded while class loading time
    private JudgeAnalytics(){ // again private controller
    }
    public static JudgeAnalytics getInstance(){ 
        if(judgeAnalytics == null){
            judgeAnalytics = new JudgeAnalytics();
        }
        return judgeAnalytics;
    }
}

public class LazyLoading {
    public static void main(String[] args) {
        JudgeAnalytics j1 = JudgeAnalytics.getInstance(); // For the first time the if case will be checked, and the instance will be created.
        JudgeAnalytics j2 = JudgeAnalytics.getInstance(); // For this the instance will be directly returned.
        System.out.println(j1); //JudgeAnalytics@7ad041f3
        System.out.println(j2); //JudgeAnalytics@7ad041f3
    }
}
