package design.absfactory;

/**
 * Author :  suzeyu
 * Time   :  2016-11-20  下午8:22
 * Blog   :  http://szysky.com
 * GitHub :  https://github.com/suzeyu1992
 * ClassDescription :   高级轮胎类
 */
public class SUVTire implements ITire {
    @Override
    public void tire() {
        System.out.println("高级轮胎");
    }
}
