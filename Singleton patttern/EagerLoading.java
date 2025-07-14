/*
 * EAGER LOADING
 */

class JudgeAnalytics{
    private static final JudgeAnalytics judgeAnalytics = new JudgeAnalytics(); // This is done so that the instance loads during class loading time. Also final as it wont be changed further in the code anymore

    private JudgeAnalytics(){ // Private constructor just to make sure no one else creates the object for this class

    }

    public static JudgeAnalytics getInstance(){ // static because we dont want to declare an object to use the getInstance method.
        return judgeAnalytics;
    }

}

public class EagerLoading {
    public static void main(String[] args) {
        JudgeAnalytics j1 = JudgeAnalytics.getInstance();
        JudgeAnalytics j2 = JudgeAnalytics.getInstance();
        System.out.println(j1); //JudgeAnalytics@7ad041f3
        System.out.println(j2); //JudgeAnalytics@7ad041f3
    }
}

/*
 * This is the acutal singleton pattern achieved using eager loading
 * This is thread safe
 * 
 */