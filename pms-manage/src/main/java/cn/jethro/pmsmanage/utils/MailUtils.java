package cn.jethro.pmsmanage.utils;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;

/**
 * 发送邮件工具类
 * 
 * @author seawind
 * 
 */
public class MailUtils {
	private static String targetSMTP = "smtp.163.com";// SMTP服务器地址
	private static String user = "ordosmskt@163.com"; // 发件账户
	private static String pass = "ordosmsktGR"; // 发件密码

	// 创建邮件服务器链接会话
	public static Session createSession() {
		Properties properties = new Properties();
		properties.put("mail.transport.protocol", "smtp");
		properties.put("mail.smtp.host", targetSMTP);
		properties.put("mail.smtp.auth", "true");// 连接认证
		properties.put("mail.debug", "true");// 在控制台显示连接日志信息
		Session session = Session.getInstance(properties);// 与邮件服务器连接会话

		return session;
	}

	// 发送邮件
	public static void sendMail(Session session, Message message)
			throws Exception {
		Transport transport = session.getTransport();
		transport.connect(user, pass);
		transport.sendMessage(message, message.getAllRecipients());
	}
}
