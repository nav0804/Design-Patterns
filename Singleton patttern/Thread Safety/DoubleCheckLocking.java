/*
 * THREAD SAFETY
 * 2. Double - check locking
 */

 class JudgeAnalytics{
    private static volatile JudgeAnalytics judgeAnalytics;
    private JudgeAnalytics(){

    }
    public static JudgeAnalytics getInstance(){
        if(judgeAnalytics == null){ // first check
            synchronized (JudgeAnalytics.class) {
                if(judgeAnalytics == null){ // second check
                    judgeAnalytics = new JudgeAnalytics();
                }
            }
        }
        return judgeAnalytics;
    }
 }

public class DoubleCheckLocking {
    public static void main(String[] args) {
        JudgeAnalytics j1 = JudgeAnalytics.getInstance();
        JudgeAnalytics j2 = JudgeAnalytics.getInstance();
        System.out.println(j1); //JudgeAnalytics@7ad041f3
        System.out.println(j2); //JudgeAnalytics@7ad041f3
    }    
}
