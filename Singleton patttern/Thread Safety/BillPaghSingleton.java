/*
 * THREAD SAFETY 
 * 3. Bill Pagh Singleton
 */

 class JudgeAnalytics{ 
    private JudgeAnalytics(){

    }

    private static class Holder{
        private static final JudgeAnalytics judgeAnalytics = new JudgeAnalytics();
    }

    public static JudgeAnalytics getInstance(){
        return Holder.judgeAnalytics;
    }
 }

public class BillPaghSingleton {
    public static void main(String[] args) {
        JudgeAnalytics j1 = JudgeAnalytics.getInstance();
        JudgeAnalytics j2 = JudgeAnalytics.getInstance();
        System.out.println(j1); //JudgeAnalytics@7ad041f3
        System.out.println(j2); //JudgeAnalytics@7ad041f3 
    }
}


/*
 * When the class is loaded into system, the Holder class doesn't get loaded.  
 */