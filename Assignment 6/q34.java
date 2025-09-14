class TestMain {
    void Reverse(){
        for(char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }
    }
    public static void main(String args[]) {
        TestMain obj = new TestMain();
        obj.Reverse();
    }
}