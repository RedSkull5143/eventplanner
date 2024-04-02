import com.google.common.base.Joiner;

import java.util.Arrays;

public class JoinStrings {
    public static void main(String[] args) {
        String joinedString= Joiner.on(",").join(Arrays.asList("Om Shinde","QualityKiosk","Full Stack Quality Engineer"));
        System.out.println(joinedString);
    }
}
