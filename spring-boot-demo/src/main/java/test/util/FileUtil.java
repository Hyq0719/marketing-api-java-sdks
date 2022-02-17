package test.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author hyq0719
 * @date 2022/2/11 10:51 下午
 */
public class FileUtil {

  public static String getFileMD5(File file) {
    try {
      FileInputStream fis = new FileInputStream(file);
      MessageDigest md = MessageDigest.getInstance("MD5");
      byte[] buffer = new byte[1024];
      int length = -1;
      while ((length = fis.read(buffer, 0, 1024)) != -1) {
        md.update(buffer, 0, length);
      }
      BigInteger bigInt = new BigInteger(1, md.digest());
      return bigInt.toString(16);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }
}
