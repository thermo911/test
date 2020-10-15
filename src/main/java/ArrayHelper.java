import java.util.Arrays;

public class ArrayHelper {
    public boolean onlyOneFour(int[] a) {
        boolean one = false;
        boolean four = false;
        for(int i = 0; i<a.length; i++) {
            if(!one && a[i]==1) {
                one = true;
            }
            if(!four && a[i]==4) {
                four = true;
            }
            if(a[i]!=1 && a[i]!=4) {
                return false;
            }
        }
        return one && four;
    }

    public int[] getAfterFour(int[] a) {
        int i = 0;
        for(i = a.length-1; i>=0; i--) {
            if(a[i] == 4) {
                break;
            }
        }
        if(i == -1) {
            throw new RuntimeException();
        }
        int[] newA = Arrays.copyOfRange(a, i+1, a.length);

        return newA;
    }
}
