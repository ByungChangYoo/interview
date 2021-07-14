import java.util.Collections;
import java.util.List;

public class LongestText {
    /**
     * 입력 문자열에서 길이가 가장 긴 서브 문자열을 찾아 리스트로 리턴한다.
     *
     * - 같은 문자가 연속해 나올 때 이를 하나의 서브 문자열이라고 한다.
     *
     * <p>
     * 동일 길이의 서브 문자열이 다수 존재하는 경우 모두 리스트에 추가해 리턴한다.
     *
     * <p>
     * 1) getLongestText("AABBCCCD")
     *  - ["CCC"] 을 리턴한다.
     * <pre>
     *   서브 문자열 : 길이
     *   "AA"      : 2
     *   "BB"      : 2
     *   "CCC"     : 3
     *   "D"       : 1
     * </pre>
     *
     * 2) getLongestText("ABCD")
     *  - ["A", "B", "C", "D"] 을 리턴한다.
     * <pre>
     *   서브 문자열 : 길이
     *   "A"       : 1
     *   "B"       : 1
     *   "C"       : 1
     *   "D"       : 1
     * </pre>
     *
     * @param text
     * @return
     */
    public static List<String> getLongestText(String text) {
        return Collections.emptyList();
    }
}
