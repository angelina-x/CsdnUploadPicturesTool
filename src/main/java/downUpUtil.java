import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class downUpUtil {

    public static void toUseKey(int keycode) throws AWTException {

        Robot robot = new Robot();
        robot.keyPress(keycode);
        robot.delay(20);
        robot.keyRelease(keycode);
        robot.delay(20);
    }

    public static void toMoveMouse() throws AWTException {
        Robot robot = new Robot();
        robot.mouseMove(580,180);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //8.移动鼠标到屏幕中央点击"上传图片"按钮
        robot.delay(1000);
        robot.mouseMove(683,360);
//        robot.mouseMove(807,230);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void toMoveMouseToInputUpload() throws AWTException {
        Robot robot = new Robot();
//        robot.mouseMove(800,230);
//        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        //按快捷键Ctrl+Shift+G打开上传图片
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_G);
        //8.移动鼠标到屏幕中央点击"上传图片"按钮
        robot.delay(300);
        robot.mouseMove(0,0);
        robot.mouseMove(750,375);
        robot.delay(100);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }

    public static void toMoveMouseToInputUploadTest() throws AWTException {
        Robot robot = new Robot();
        robot.delay(100);
        //Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_NUM_LOCK, false);
        //1.按下LEFT 光标向左移动两格
        downUpUtil.toUseKey(KeyEvent.VK_LEFT);
        downUpUtil.toUseKey(KeyEvent.VK_LEFT);
        //2.按住 SHIFT+Ctrl 再加上 两次LEFT ---选中图片路径
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_CONTROL);
        downUpUtil.toUseKey(KeyEvent.VK_LEFT);
        downUpUtil.toUseKey(KeyEvent.VK_LEFT);
        //*downUpUtil.toUseKey(KeyEvent.VK_LEFT);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        //3.ctrl+C 复制图片
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);


        //4.按住CTRL+三次RIGHT 跳转到行尾
        robot.keyPress(KeyEvent.VK_CONTROL);
        for (int i = 0; i < 3; i++) {
            robot.keyPress(KeyEvent.VK_RIGHT);
            robot.keyRelease(KeyEvent.VK_RIGHT);
        }
        robot.delay(1000);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        //5.按住SHIFT+CTRL 加上10次LEFT
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SHIFT);
        for (int i = 0; i < 10; i++) {
            downUpUtil.toUseKey(KeyEvent.VK_LEFT);
        }
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.delay(1000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(550);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

    }


}
