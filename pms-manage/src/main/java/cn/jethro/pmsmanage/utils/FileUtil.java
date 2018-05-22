package cn.jethro.pmsmanage.utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Enumeration;
import java.util.Properties;

import org.springframework.web.multipart.MultipartFile;

public class FileUtil {  
	  
    public static String UPLOAD_DIR;  
    
    public static String TMP_DIR;
      
    static {  
          
        Properties properties = new Properties();  
        
        properties.put("WIN_UPLOAD_DIR", "F:\\upload");
        properties.put("NIX_UPLOAD_DIR", "/root/html/prod/upload");
        
        Properties properties1 = new Properties();  
        
        properties1.put("WIN_UPLOAD_DIR", "F:\\tmp");
        properties1.put("NIX_UPLOAD_DIR", "/root/html/prod/tmp");
          
          
        String osType = System.getProperty("os.name").toLowerCase();  
          
        if (osType.indexOf("win") >= 0) {  
            UPLOAD_DIR = properties.getProperty("WIN_UPLOAD_DIR");  
            TMP_DIR = properties1.getProperty("WIN_UPLOAD_DIR"); 
        } else if (osType.indexOf("mac") >= 0) {  
            UPLOAD_DIR = properties.getProperty("MAC_UPLOAD_DIR");  
        } else if (osType.indexOf("nix") >= 0 || osType.indexOf("nux") >= 0) {  
            UPLOAD_DIR = properties.getProperty("NIX_UPLOAD_DIR");  
            TMP_DIR = properties1.getProperty("NIX_UPLOAD_DIR"); 
        } else if (osType.indexOf("sunos") >= 0) {  
            UPLOAD_DIR = properties.getProperty("SOL_UPLOAD_DIR");  
        } else {  
            throw new InternalError("Your system is not supported!");  
        }  
          
    }  
      
    public static byte[] readIntoByteArray(String fileName) throws IOException {  
        FileInputStream fis = null;  
          
        File file = new File(fileName);  
          
        if (Integer.MAX_VALUE <= file.length()) {  
            throw new RuntimeException("File is too big, and length = " + file.length());  
        }  
          
        try {  
            fis = new FileInputStream(file);  
            ByteBuffer bb = ByteBuffer.allocate((int)file.length());  
              
            int bytesRead = fis.getChannel().read(bb);  
              
            if (bytesRead != file.length()) {  
                throw new IOException("Error occurred while reading file, bytes = " + bytesRead);  
            }  
              
            return bb.array();  
        } catch (IOException e) {  
            throw new IOException(e.getLocalizedMessage());  
        } finally {  
            if (fis != null) {  
                fis.close();  
            }  
        }  
          
    }  
      
    /* 
     * http://stackoverflow.com/questions/326390/how-to-create-a-java-string-from-the-contents-of-a-file 
     */  
    public static String readIntoString(InputStream is, String encoding) throws IOException {  
        final char[] buffer = new char[0x2000];  
          
        StringBuilder out = new StringBuilder();  
          
        Reader in = new InputStreamReader(is, encoding != null ? encoding : "UTF-8");  
          
        int read;  
          
        do {  
            read = in.read(buffer, 0, buffer.length);  
              
            if (read > 0) {  
                out.append(buffer, 0, read);  
            }  
              
        } while (read >= 0);  
          
        return out.toString();  
    }  
      
    public static void deleteDir(String filePath) {  
        File file = new File(filePath);  
        if (file.exists() && file.isDirectory()) {  
            if (file.listFiles().length == 0) {  
                file.delete();  
            } else {  
                File[] deleteFile = file.listFiles();  
                int i = file.listFiles().length;  
                for (int j = 0; j < i; j ++) {  
                    if (deleteFile[j].isDirectory()) {  
                        deleteDir(deleteFile[j].getAbsolutePath());  
                    }  
                    deleteFile[j].delete();  
                }  
                file.delete();  
            }  
        }  
    }  
    
    //获取本机的IP地址
    public static String getIPv4(){
    	
    	Enumeration allNetInterfaces;
    	InetAddress ip = null;
		try {
			allNetInterfaces = NetworkInterface.getNetworkInterfaces();
			while (allNetInterfaces.hasMoreElements())
			{
				NetworkInterface netInterface = (NetworkInterface) allNetInterfaces.nextElement();
				System.out.println(netInterface.getName());
				Enumeration addresses = netInterface.getInetAddresses();
				while (addresses.hasMoreElements())
				{
					ip = (InetAddress) addresses.nextElement();
					if (ip != null && ip instanceof Inet4Address)
					{
						System.out.println("本机的IP = " + ip.getHostAddress());
					}
				}
			}
		} catch (SocketException e) {
			e.printStackTrace();
		}
		
		return ip.getHostAddress();
    }
    
    public static String getImageUrl(MultipartFile file,String name){

    	String savePath="";
		//获取根目录对应的真实物理路径  
		File uploadPath = new File(FileUtil.UPLOAD_DIR);
	    File  tempPath = new File(FileUtil.TMP_DIR);
	    //临时目录  
	    if (!tempPath.exists()) {  
	    	tempPath.mkdir();  
	    }  
	    //在系统启动的时候，就开始初始化，在初始化时，检查上传图片的文件夹和存放临时文件的文件夹是否存在，如果不存在，就创建       
        //如果目录不存在  
        if (!uploadPath.exists()) {  
            //创建目录  
            uploadPath.mkdir();  
        }  
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                BufferedOutputStream stream =
                        new BufferedOutputStream(new FileOutputStream(new File(uploadPath,name + ".jpg")));
                stream.write(bytes);
                stream.close();
                savePath =uploadPath+"\\"+name + ".jpg";
                return  savePath;
            } catch (Exception e) {
                return "You failed to upload " + name + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload " + name + " because the file was empty.";
        }
    
    }
}  
