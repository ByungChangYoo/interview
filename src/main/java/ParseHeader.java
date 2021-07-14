import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ParseHeader {
    /**
     * HTTP 헤더를 파싱하여 맵으로 리턴한다.
     *
     * HTTP 헤더는 여러개 필드로 구성되며 일반적으로 아래와 같은 포맷이다.
     *
     *  name:value\r\n
     *  name:value\r\n
     *  name:value\r\n
     *
     *  - 필드는 이름(name)과 값(value)으로 구성되며  ':' 문자로 구분한다.
     *  - 각각의 필드는 개행 문자("\r\n")로 구분한다.
     *
     *
     * 1) parseHeader("A:A\r\nB:B\r\nC:C")
     *  - 아래와 같은 맵을 리턴한다.
     * <pre>
     *   key : value
     *   A   : [A]
     *   B   : [B]
     *   C   : [C]
     * </pre>
     *
     * 2) parseHeader("A:A1\r\nB:B1\r\nC:C1\r\nA:A2\r\nB:B2\r\nC:C2")
     *  - 아래와 같은 맵을 리턴한다.
     * <pre>
     *   key : value
     *   A   : [A1, A2]
     *   B   : [B1, B2]
     *   C   : [C1, C2]
     * </pre>
     *
     * @param header
     * @return
     */
    public static Map<String, List<String>> parseHeader(String header) {
        return Collections.emptyMap();
    }
}
