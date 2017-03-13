public final class Anagram {
    
     public static char[] charArray;

    public Anagram(String word) {
        charArray = word.toCharArray();
        doAnagram(charArray.length);
    }
    
    public void changeOrder(int newsize) {
        int myString;
        int pointAt = charArray.length - newsize;
        char myKey = charArray[pointAt];

        for (myString = pointAt + 1; myString < charArray.length; myString++) {
            charArray[myString - 1] = charArray[myString];
        }

        charArray[myString - 1] = myKey;
        
    }

    public void doAnagram(int newsize) {
        if (newsize == 1) {
            return;
        }
        for (int i = 0; i < newsize; i++) {
            doAnagram(newsize - 1);
            if (newsize == 2) {
                var();
            }
            changeOrder(newsize);
            
        }
    }

    public void var() {
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Anagram test1 = new Anagram("HARIS");

        
    }
}