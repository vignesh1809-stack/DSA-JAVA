import java.util.LinkedList;

public class HashTable {
        private class Entry{
            private int key;
            private String value;

            public Entry(int key,String value){
                this.key =key;
                this.value=value;
            }

            public String toString(){
                return key + " = "+value;
            }
        }

        private LinkedList<Entry>[] entries = new LinkedList[16];

        public void  put(int key,String value){
            var entry = getEntry(key);
            var bucket = getCreateBucket(key);

            if(entry != null){
                entry.value =value;
                return;
            }

            bucket.addLast(new Entry(key,value));
        }

    public String get(int key){
        var entry = getEntry(key);
        return entry == null ? null : entry.value;
    }

        public void remove(int key){
            var entry=getEntry(key);
            var bucket= getCreateBucket(key);
            if(entry ==null){
                throw new IllegalStateException();
            }
            bucket.remove(entry);
        }

        private Entry getEntry(int key){
            var bucket = getCreateBucket(key);
            if(bucket!=null){
                for(Entry entry:bucket){
                    if(entry.key ==key){
                        return entry;
                    }
                }
            }
            return null;
        }

        private LinkedList<Entry> getCreateBucket(int key){
            int index=hashKey(key);
            if(entries[index] == null){
                entries[index] = new  LinkedList<>();
            }
            return entries[index];

        }

        private int hashKey(int key){
            return key%entries.length;
        }

}
