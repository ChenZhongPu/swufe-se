import com.google.common.base.Splitter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {
    public List<String> toList(String s) {
        return Splitter.on("-").trimResults().splitToList(s);
    }

    public List<String> toList2(String s) {
        return Arrays.stream(s.split("-")).
                map(String::trim).
                collect(Collectors.toList());
    }
}
