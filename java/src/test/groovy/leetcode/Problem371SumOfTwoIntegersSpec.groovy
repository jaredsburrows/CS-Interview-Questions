package leetcode

import spock.lang.Specification
import spock.lang.Unroll

final class Problem371SumOfTwoIntegersSpec extends Specification {
    @Unroll def "getSum"() {
        expect:
        Problem371SumOfTwoIntegers.getSum(a, b) == c

        where:
        a  | b  || c
        0  | 0  || 0
        1  | 2  || 3
        15 | 32 || 47
    }
}
