import java.math.BigDecimal;
import java.text.CollationElementIterator;
import java.text.Collator;
import java.util.Comparator;
import java.util.List;

public final class SortLists implements Comparator<List<String>> {
/* Used some code from stack overflow here after some trial and error with other methods
Created my own Comparator for the array.sort function
The function goes through the content of each List, comparing it with the next List along
Comparison will compare first value of list, and if equal will compared second value, and so forth.
 If one list is shorter, and lists are equal up to that point, the shorter list sorts first.
 The sort is lexicographical for strings
 */
    private Collator collator = Collator.getInstance();

    @Override
    public int compare(List<String> o1, List<String> o2) {
        for (int i=0; ; i++) {
            if (i == o1.size()) {
                return i = (i == o2.size() ? 0 : -1);
            }
            if (i == o2.size()) {
                return 1;
            }
            String v1 = o1.get(i), v2 = o2.get(i);
            BigDecimal n1 = null, n2 = null;
            try {
                n1 = new BigDecimal(v1);
            } catch (@SuppressWarnings("unused") NumberFormatException unused) {}
            try { n2 = new BigDecimal(v2); }
            catch (@SuppressWarnings("unused") NumberFormatException unused) {}
            int cmp = (n1 == null ? (n2 == null ? this.collator.compare(v1, v2) : 1) : (n2 == null ? -1 : n1.compareTo(n2)));
            if (cmp != 0)
                return cmp;
        }
    }
}