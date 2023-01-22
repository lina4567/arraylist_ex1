
    import java.sql.SQLIntegrityConstraintViolationException;
    import java.util.HashMap;
 public class Main {
        public static void main(String[] args) {
            HashMap<String, Integer> examScores = new HashMap<String,Integer>();
            examScores.put("java",80);
            examScores.put("oprating system",78);
            examScores.put("statics and probablity",75);
            examScores.put("computer arch",85);
            System.out.println(examScores.toString());

        }

    }




