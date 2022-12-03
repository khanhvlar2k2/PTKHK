
package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.DAO_Empolyee;
import com.example.demo.entity.Empolyee;
import com.example.demo.service.MailerService;

@Controller
@RequestMapping("security")
public class Controller_Security {

	@Autowired
	private DAO_Empolyee serviceAcc;
	@Autowired
	JavaMailSender sender;

	@Autowired
	MailerService mailer;

	@GetMapping({ "login/form" })
	public String login(Model model) {
		model.addAttribute("title", "Login");
		return "security/login";
	}

	@GetMapping({ "login/formz" })
	public String login2(Model model) {
		model.addAttribute("message", "Please login to continue ?");
		model.addAttribute("title", "Login");
		return "security/login";
	}

	@GetMapping("login/success")
	public String loginSuccess(Model model) {
		model.addAttribute("message", "Successful login");
		model.addAttribute("title", "Login Success");
		return "security/login";
	}

	@GetMapping("login/error")
	public String loginError(Model model, HttpServletRequest request) {
		model.addAttribute("title", "Login");
		model.addAttribute("message", "Incorrect account information ?");
		return "security/login";
	}

	@GetMapping("unauthorized")
	public String unauthorized(Model model) {
		model.addAttribute("message", "Access is denied");
		model.addAttribute("title", "Access Denied");
		return "security/unauthorized";
	}

	@GetMapping("logoff/success")
	public String logoffSuccess(Model model) {
		model.addAttribute("title", "Login");
		model.addAttribute("message", "You are logged out!");
		return "security/login";
	}

	@GetMapping("/forget-pass")
	public String getforgotPass(Model model) {
		model.addAttribute("title", "Reset Password");
		return "security/forget-pass";

	}

	@PostMapping("/forget-pass")
	public String postforgotPass(Model model, @RequestParam("emailff") String email,Empolyee account) {
		try {
			  account = serviceAcc.finbyEmailname(email);	
				if (account.getEmail().equals(email)) {
					Random rdn = new Random();
					String passramdom = String.valueOf(rdn.nextInt(999999));
					account.setPassword(passramdom);
					serviceAcc.save(account);
					mailer.send(email, "Mail ForgotPassword từ GOLDEN HOTEL",
							"<!DOCTYPE html>"+
									""+
									"<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">"+
									""+
									"<head>"+
									"    <meta charset=\"utf-8\">"+
									"    <meta name=\"viewport\" content=\"width=device-width\">"+
									"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">"+
									"    <meta name=\"x-apple-disable-message-reformatting\">"+
									"    <title></title>"+
									""+
									"    <link href=\"https://fonts.googleapis.com/css?family=Roboto:400,600\" rel=\"stylesheet\" type=\"text/css\">"+
									""+
									""+
									""+
									"    <style>"+
									"        html,"+
									"        body {"+
									"            margin: 0 auto !important;"+
									"            padding: 0 !important;"+
									"            height: 100% !important;"+
									"            width: 100% !important;"+
									"            font-family: 'Roboto', sans-serif !important;"+
									"            font-size: 14px;"+
									"            margin-bottom: 10px;"+
									"            line-height: 24px;"+
									"            color: #8094ae;"+
									"            font-weight: 400;"+
									"        }"+
									"        "+
									"        * {"+
									"            -ms-text-size-adjust: 100%;"+
									"            -webkit-text-size-adjust: 100%;"+
									"            margin: 0;"+
									"            padding: 0;"+
									"        }"+
									"        "+
									"        table,"+
									"        td {"+
									"            mso-table-lspace: 0pt !important;"+
									"            mso-table-rspace: 0pt !important;"+
									"        }"+
									"        "+
									"        table {"+
									"            border-spacing: 0 !important;"+
									"            border-collapse: collapse !important;"+
									"            table-layout: fixed !important;"+
									"            margin: 0 auto !important;"+
									"        }"+
									"        "+
									"        table table table {"+
									"            table-layout: auto;"+
									"        }"+
									"        "+
									"        a {"+
									"            text-decoration: none;"+
									"        }"+
									"        "+
									"        img {"+
									"            -ms-interpolation-mode: bicubic;"+
									"        }"+
									"    </style>"+
									""+
									"</head>"+
									""+
									"<body width=\"100%\" style=\"margin: 0; padding: 0 !important; mso-line-height-rule: exactly; background-color: #f5f6fa;\">"+
									"    <center style=\"width: 100%; background-color: #f5f6fa;\">"+
									"        <table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bgcolor=\"#f5f6fa\">"+
									"            <tr>"+
									"                <td style=\"padding: 40px 0;\">"+
									"                    <table style=\"width:100%;max-width:620px;margin:0 auto;\">"+
									"                        <tbody>"+
									"                            <tr>"+
									"                                <td style=\"text-align: center; padding-bottom:25px\">"+
									"                                    <a href=\"#\"><img style=\"width: 150px;\" src=\"https://media-cdn.tripadvisor.com/media/photo-s/0e/2a/64/0f/logo-gold-hotel.jpg\" alt=\"\"></a>"+
									""+
									"                                </td>"+
									"                            </tr>"+
									"                        </tbody>"+
									"                    </table>"+
									"                    <table style=\"width:100%;max-width:620px;margin:0 auto;background-color:#ffffff;\">"+
									"                        <tbody>"+
									"                            <tr>"+
									"                                <td style=\"text-align:center;padding: 30px 30px 15px 30px;\">"+
									"                                    <h2 style=\"font-size: 18px; color: #6576ff; font-weight: 600; margin: 0;\">Reset Password</h2>"+
									"                                </td>"+
									"                            </tr>"+
									"                            <tr>"+
									"                                <td style=\"text-align:center;padding: 0 30px 20px\">"+
									"                                    <p style=\"margin-bottom: 10px;\">Hi "+account.getFullname()+"</p>"+
									"                                    <p style=\"margin-bottom: 25px;\">We have sent you a new password. Please enter your password below and change it when you have successfully logged in.</p>"+
									"                                    <a href=\"#\" style=\"background-color:#6576ff;border-radius:4px;color:#ffffff;display:inline-block;font-size:13px;font-weight:600;line-height:44px;text-align:center;text-decoration:none;text-transform: uppercase; padding: 0 25px\"> "+account.getPassword()+"</a>"+
									"                                </td>"+
									"                            </tr>"+
									"                            <tr>"+
									"                                <td style=\"text-align:center;padding: 20px 30px 40px\">"+
									"                                    <p>If you did not make this request, please contact us or ignore this message.</p>"+
									"                                    <p style=\"margin: 0; font-size: 13px; line-height: 22px; color:#9ea8bb;\">This is an automatically generated email please do not reply to this email. If you face any issues, please contact us at techmindhelps@gmail.com</p>"+
									"                                </td>"+
									"                            </tr>"+
									"                        </tbody>"+
									"                    </table>"+
									"                    <table style=\"width:100%;max-width:620px;margin:0 auto;\">"+
									"                        <tbody>"+
									"                            <tr>"+
									"                                <td style=\"text-align: center; padding:25px 20px 0;\">"+
									"                                    <p style=\"font-size: 13px;\">Copyright Â© 2021 Golden Hotel. All rights reserved. <br> Template Made By <a style=\"color: #6576ff; text-decoration:none;\" href=\"\">Golden Hotel</a>.</p>"+
									"                                    <ul style=\"margin: 10px -4px 0;padding: 0;\">"+
									"                                        <li style=\"display: inline-block; list-style: none; padding: 4px;\">"+
									"                                            <a style=\"display: inline-block; height: 30px; width:30px;border-radius: 50%; background-color: #ffffff\" href=\"#\"><img style=\"width: 30px\" src=\"https://th.bing.com/th/id/OIP.ckeUFk-yid0vfWnd56w7wAHaHa?w=172&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7\" alt=\"brand\"></a>"+
									"                                        </li>"+
									"                                        <li style=\"display: inline-block; list-style: none; padding: 4px;\">"+
									"                                            <a style=\"display: inline-block; height: 30px; width:30px;border-radius: 50%; background-color: #ffffff\" href=\"#\"><img style=\"width: 30px\" src=\"https://th.bing.com/th/id/OIP.FPjQ2OolWgNHEDLXkIf98AHaF2?w=212&h=180&c=7&r=0&o=5&dpr=1.3&pid=1.7\" alt=\"brand\"></a>"+
									"                                        </li>"+
									"                                        <li style=\"display: inline-block; list-style: none; padding: 4px;\">"+
									"                                            <a style=\"display: inline-block; height: 30px; width:30px;border-radius: 50%; background-color: #ffffff\" href=\"#\"><img style=\"width: 30px\" src=\"https://www.bing.com/th?id=OIP.89-qn3WSctd18VcFfvZdBAHaHa&w=250&h=250&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2\" alt=\"brand\"></a>"+
									"                                        </li>"+
									"                                        <li style=\"display: inline-block; list-style: none; padding: 4px;\">"+
									"                                            <a style=\"display: inline-block; height: 30px; width:30px;border-radius: 50%; background-color: #ffffff\" href=\"#\"><img style=\"width: 30px\" src=\"https://www.bing.com/th?id=OIP.Sbs-M2-y31gNoj9n-IIeowHaHa&w=249&h=250&c=8&rs=1&qlt=90&o=6&dpr=1.3&pid=3.1&rm=2\" alt=\"brand\"></a>"+
									"                                        </li>"+
									"                                    </ul>"+
									"                                    <p style=\"padding-top: 15px; font-size: 12px;\">This email was sent to you as a registered user of"+
									"                                        <a style=\"color: #6576ff; text-decoration:none;\" href=\"\"></a>. To update your emails preferences <a style=\"color: #6576ff; text-decoration:none;\" href=\"#\">click here</a>.</p>"+
									"                                </td>"+
									"                            </tr>"+
									"                        </tbody>"+
									"                    </table>"+
									"                </td>"+
									"            </tr>"+
									"        </table>"+
									"    </center>"+
									"</body>"+
									""+
									"</html>"
										


					);	
					model.addAttribute("title", "Successfully");
					model.addAttribute("messageS","Email sent successfully. Please check your email for password !!");

				}else {
				
					model.addAttribute("message","Please enter input email!!");
				}
			
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("title", "Failed");
			model.addAttribute("message","Account does not exist!");
		}

		return "security/forget-pass";
	}

}
