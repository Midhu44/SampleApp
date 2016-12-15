/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
 
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import java.io.FileInputStream;
 
/**
* @author kodehelp
*
*/
public class SFTPinJava {
 
/**
*
*/
public SFTPinJava() {
// TODO Auto-generated constructor stub
}
 
/**
* @param args
*/
public static void main(String[] args) {
String SFTPHOST = "192.168.1.179";
int    SFTPPORT = 12032;
String SFTPUSER = "admin";
String SFTPPASS = "Password1";
String SFTPWORKINGDIR = "/MSCVP_TP/";
 
Session     session     = null;
Channel     channel     = null;
ChannelSftp channelSftp = null;
 
try{
            JSch jsch = new JSch();
            session = jsch.getSession(SFTPUSER,SFTPHOST,SFTPPORT);
            session.setPassword(SFTPPASS);
            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);
            session.connect();
            channel = session.openChannel("sftp");
            channel.connect();
            channelSftp = (ChannelSftp)channel;
            channelSftp.cd(SFTPWORKINGDIR);
            File f = new File("E:\\jana.txt");
            channelSftp.put(new FileInputStream(f), f.getName());
}catch(Exception ex){
ex.printStackTrace();
}
 
}
 
}