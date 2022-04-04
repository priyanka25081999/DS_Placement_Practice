// Array : Design HashMap 
// Design a HashMap without using any built-in hash table libraries.
// Array based solution
// https://leetcode.com/problems/design-hashmap/

class MyHashMap {

    // Design the hashmap using an array
    int size = (int)Math.pow(10,6); // value<=10^6
    private int hmap[] = new int[size+1];
    
    public MyHashMap() {
        // Fill an array initially with -1
        Arrays.fill(hmap, -1);
    }
    
    public void put(int key, int value) {
        this.hmap[key] = value;
    }
    
    public int get(int key) {
        return this.hmap[key];
    }
    
    public void remove(int key) {
        this.hmap[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
