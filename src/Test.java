public class Test {
    public static void main(String[] args) {

        Thread thread=new Thread();
        thread.run();
        Test inc = new Test();
        int i = 0;
        inc.fermin(i);
        i=i ++;
        System.out.println(i);

    }
    public void fermin(int i){
        i++;
    }


}
