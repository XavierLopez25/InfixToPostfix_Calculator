package structure5;

import java.util.Iterator;
import structure5.AbstractStructure;
import structure5.OrderedStructure;
import structure5.RedBlackTree;

public class RedBlackSearchTree extends AbstractStructure implements OrderedStructure {

   protected RedBlackTree root = new RedBlackTree();
   protected int count = 0;


   public boolean isEmpty() {
      return this.root.isEmpty();
   }

   public void clear() {
      this.root = new RedBlackTree();
      this.count = 0;
   }

   @Override
   public void add(Object var1) {

   }

   @Override
   public Object remove(Object var1) {
      return null;
   }

   public int size() {
      return this.count;
   }

   public void add(Comparable value) {
      this.root = this.root.add(value);
      ++this.count;
   }

   public Comparable remove(Comparable value) {
      if(this.root.contains(value)) {
         this.root = this.root.remove(value);
         --this.count;
         return value;
      } else {
         return null;
      }
   }

   public boolean contains(Comparable value) {
      return this.root.contains(value);
   }

   public boolean isRedBlack() {
      return this.root.consistency();
   }

   public Iterator iterator() {
      return this.root.iterator();
   }

   public String treeString() {
      return this.root.treeString();
   }

   public String toString() {
      return this.root.toString();
   }

   public int hashCode() {
      return this.root.hashCode();
   }
}
