package org.example.hot100;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * @Author: WeiJ
 * @CreateDate: 2024/4/10 10:34 //创建时间
 * @Version: 1.0    //版本号
 */
public class ImageSender {
    public static void main(String[] args) {
        try {
            // 读取图片到 BufferedImage 对象
            BufferedImage originalImage = readImage("C:\\Users\\jiewei6\\Desktop\\Work_Space\\FAQ\\培训材料\\培训材料\\1.png");
            // 将 BufferedImage 转换为字节数组
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(originalImage, "jpg", baos);
            byte[] imageBytes = baos.toByteArray();
            app(imageBytes);
            System.out.println("图片已转换为字节数组并传递给接收方。");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void app(byte[] ags) {
        byte[] imageBytes = ags;

        // 将字节数组转换为 BufferedImage 对象
        ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
        BufferedImage recoveredImage = null;
        try {
            recoveredImage = ImageIO.read(bais);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 将恢复的图像保存到文件（或者进行其他操作）
        try {
            ImageIO.write(recoveredImage, "jpg", new File("recovered.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("字节数组已转换回图片。");

    }
    // 自定义方法：读取图片并返回 BufferedImage 对象
    private static BufferedImage readImage(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new IOException("图片文件不存在: " + filePath);
        }
        return ImageIO.read(new FileInputStream(file));
    }
}