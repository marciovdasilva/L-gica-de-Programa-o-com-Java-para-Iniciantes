package UsandoBibliotecaDeEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {

	static void enviar(String emailPara, String assunto, String mensagem) throws EmailException {

		Email email = new SimpleEmail();
		email.setHostName("smtp.office365.com");
		email.setSmtpPort(587);
		email.setAuthenticator(new DefaultAuthenticator("marciov.dasilva@hotmail.com", "M@rc!062"));
		email.setFrom("Exerc�cio L�gica <marciov.dasilva@hotmail.com>");
		email.setSubject(assunto);
		email.setMsg(mensagem);
		email.addTo(emailPara);
		email.setStartTLSEnabled(true);
		email.setDebug(true);
		email.send();
	}
	
}
