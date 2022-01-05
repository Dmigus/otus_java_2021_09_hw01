import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;

public class HelloOtus {
    public static void main(String[] args) {
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        rangeSet.add(Range.lessThan(args.length));
        System.out.println("RangeSet content:");
        System.out.println(rangeSet);
    }
}
