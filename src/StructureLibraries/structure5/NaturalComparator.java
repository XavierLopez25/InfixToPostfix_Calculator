package structure5;

import java.util.Comparator;

public class NaturalComparator implements Comparator {

   public int compare(Comparable a, Comparable b) {
      return a.compareTo(b);
   }

   @Override
   public int compare(Object o1, Object o2) {
      return 0;
   }

   public boolean equals(Object b) {
      return b != null && b instanceof NaturalComparator;
   }
}
