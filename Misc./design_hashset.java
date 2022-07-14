// HashSet : Design Hashset
// Leetcode : https://leetcode.com/problems/design-hashset/

class MyHashSet {

    HashSet<Integer> hset;
    public MyHashSet() {
        hset = new HashSet<Integer>();
    }
    
    public void add(int key) {
        hset.add(key);
    }
    
    public void remove(int key) {
        hset.remove(key);
    }
    
    public boolean contains(int key) {
        return hset.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
