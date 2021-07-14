public class MatchedBrackets {
    public static final String YES = "YES";
    public static final String NO = "NO";

    /**
     * 괄호로만 구성된 문자열을 입력받아 괄호 짝이 올바르게 구성되어 있으면 "YES"
     * 아니면 "NO" 을 리턴한다.
     *
     * 3 종류의 괄호를 입력으로 받을 수 있다.
     *  - 대괄호 : []
     *  - 중괄호 : {}
     *  - 소괄호 : ()
     *
     * 1) matchBrackets("()()");
     *   - 괄호 짝이 맞기 때문에 "YES" 리턴
     *
     * 2) matchBrackets("({[}]");
     *   - 괄호 짝이 맞지 않기 때문에 "NO" 리턴
     *
     * 3) matchBrackets("({}[(){}])");
     *   - 괄호 짝이 맞기 때문에 "YES" 리턴
     *
     * @param text
     * @return
     */
    public static String matchBrackets(String text) {
        return YES;
    }
}
