import java.awt.*;
import java.awt.event.KeyEvent;

public class select1 {
    public void toSelectB() throws AWTException {
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
        robot.keyRelease(KeyEvent.VK_CONTROL);
        //5.按住SHIFT+CTRL 加上10次LEFT
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SHIFT);
        for (int i = 0; i < 10; i++) {
            downUpUtil.toUseKey(KeyEvent.VK_LEFT);
        }
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.delay(100);
        //------------------------我是一条分割线-----------------------------
        //6.移动到图片上传并且点击
        //downUpUtil.toMoveMouse();
        downUpUtil.toMoveMouseToInputUpload();
        //7.将图片名粘贴 ctrl+v
        robot.delay(1200);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        //8.按下 ALT+O 打开图片--结束
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_O);
        robot.delay(10);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_O);
    }

    public void toSelectA() throws AWTException {
        Robot robot = new Robot();
        robot.delay(100);
//        Toolkit.getDefaultToolkit().setLockingKeyState(KeyEvent.VK_NUM_LOCK, false);
        //1.按下LEFT 光标向左移动一格
        downUpUtil.toUseKey(KeyEvent.VK_LEFT);
        //2.按住 SHIFT+Ctrl 再加上 三次LEFT ---选中图片
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_CONTROL);
        downUpUtil.toUseKey(KeyEvent.VK_LEFT);
        downUpUtil.toUseKey(KeyEvent.VK_LEFT);
        downUpUtil.toUseKey(KeyEvent.VK_LEFT);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        //3.ctrl+C 复制图片
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_C);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_C);
        //4.按住CTRL+四次RIGHT 跳转到行尾
        robot.keyPress(KeyEvent.VK_CONTROL);
        for (int i = 0; i < 4; i++) {
            robot.keyPress(KeyEvent.VK_RIGHT);
            robot.keyRelease(KeyEvent.VK_RIGHT);
        }
        robot.keyRelease(KeyEvent.VK_CONTROL);
        //5.按住SHIFT+CTRL 加上12次LEFT
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_SHIFT);
        for (int i = 0; i < 10; i++) {
            downUpUtil.toUseKey(KeyEvent.VK_LEFT);
        }
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.delay(100);
        //------------------------我是一条分割线-----------------------------
        //6.移动到图片上传并且点击
        downUpUtil.toMoveMouse();

        //7.将图片名粘贴 ctrl+v
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.delay(10);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        //8.按下 ALT+O 打开图片--结束
        robot.delay(100);
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_O);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.keyRelease(KeyEvent.VK_O);
    }
}
