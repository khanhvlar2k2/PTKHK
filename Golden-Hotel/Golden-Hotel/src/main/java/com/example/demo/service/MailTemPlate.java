package com.example.demo.service;

public class MailTemPlate {
 public static String DEFAULT_TEMPLATE = 
			"<!DOCTYPE html>\r\n" + 
			"\r\n" + 
			"<html lang=\"en\" xmlns:o=\"urn:schemas-microsoft-com:office:office\" xmlns:v=\"urn:schemas-microsoft-com:vml\">\r\n" + 
			"<head>\r\n" +
			"<title></title>\r\n" + 
			"<meta content=\"text/html; charset=utf-8\" http-equiv=\"Content-Type\"/>\r\n" + 
			"<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\"/>\r\n" + 
			"<!--[if mso]><xml><o:OfficeDocumentSettings><o:PixelsPerInch>96</o:PixelsPerInch><o:AllowPNG/></o:OfficeDocumentSettings></xml><![endif]-->\r\n" + 
			"<!--[if !mso]><!-->\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Bitter\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Cabin\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Open+Sans\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Roboto\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Permanent+Marker\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Roboto+Slab\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Merriweather\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Droid+Serif\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\" type=\"text/css\"/>\r\n" + 
			"<!--<![endif]-->\r\n" + 
			"<style>\r\n" + 
			"		* {\r\n" + 
			"			box-sizing: border-box;\r\n" + 
			"		}\r\n" + 
			"\r\n" + 
			"		body {\r\n" + 
			"			margin: 0;\r\n" + 
			"			padding: 0;\r\n" + 
			"		}\r\n" + 
			"\r\n" + 
			"		a[x-apple-data-detectors] {\r\n" + 
			"			color: inherit !important;\r\n" + 
			"			text-decoration: inherit !important;\r\n" + 
			"		}\r\n" + 
			"\r\n" + 
			"		#MessageViewBody a {\r\n" + 
			"			color: inherit;\r\n" + 
			"			text-decoration: none;\r\n" + 
			"		}\r\n" + 
			"\r\n" + 
			"		p {\r\n" + 
			"			line-height: inherit\r\n" + 
			"		}\r\n" + 
			"\r\n" + 
			"		.desktop_hide,\r\n" + 
			"		.desktop_hide table {\r\n" + 
			"			mso-hide: all;\r\n" + 
			"			display: none;\r\n" + 
			"			max-height: 0px;\r\n" + 
			"			overflow: hidden;\r\n" + 
			"		}\r\n" + 
			"\r\n" + 
			"		.menu_block.desktop_hide .menu-links span {\r\n" + 
			"			mso-hide: all;\r\n" + 
			"		}\r\n" + 
			"\r\n" + 
			"		@media (max-width:660px) {\r\n" + 
			"			.desktop_hide table.icons-inner {\r\n" + 
			"				display: inline-block !important;\r\n" + 
			"			}\r\n" + 
			"\r\n" + 
			"			.icons-inner {\r\n" + 
			"				text-align: center;\r\n" + 
			"			}\r\n" + 
			"\r\n" + 
			"			.icons-inner td {\r\n" + 
			"				margin: 0 auto;\r\n" + 
			"			}\r\n" + 
			"\r\n" + 
			"			.row-content {\r\n" + 
			"				width: 100% !important;\r\n" + 
			"			}\r\n" + 
			"\r\n" + 
			"			.column .border,\r\n" + 
			"			.mobile_hide {\r\n" + 
			"				display: none;\r\n" + 
			"			}\r\n" + 
			"\r\n" + 
			"			table {\r\n" + 
			"				table-layout: fixed !important;\r\n" + 
			"			}\r\n" + 
			"\r\n" + 
			"			.stack .column {\r\n" + 
			"				width: 100%;\r\n" + 
			"				display: block;\r\n" + 
			"			}\r\n" + 
			"\r\n" + 
			"			.mobile_hide {\r\n" + 
			"				min-height: 0;\r\n" + 
			"				max-height: 0;\r\n" + 
			"				max-width: 0;\r\n" + 
			"				overflow: hidden;\r\n" + 
			"				font-size: 0px;\r\n" + 
			"			}\r\n" + 
			"\r\n" + 
			"			.desktop_hide,\r\n" + 
			"			.desktop_hide table {\r\n" + 
			"				display: table !important;\r\n" + 
			"				max-height: none !important;\r\n" + 
			"			}\r\n" + 
			"		}\r\n" + 
			"	</style>\r\n" + 
			"</head>\r\n" + 
			"<body style=\"background-color: #fffaf2; margin: 0; padding: 0; -webkit-text-size-adjust: none; text-size-adjust: none;\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"nl-container\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #fffaf2; background-image: none; background-position: top left; background-size: auto; background-repeat: no-repeat;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-1\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #ffffff; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 20px; padding-bottom: 30px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"image_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"width:100%;padding-right:0px;padding-left:0px;\">\r\n" + 
			"<div align=\"center\" style=\"line-height:10px\"><a href=\"www.example.com\" style=\"outline:none\" tabindex=\"-1\" target=\"_blank\"><img alt=\"K&M SHOP\" src=\"images/Screenshot_2022-06-15_011159.png\" style=\"display: block; height: auto; border: 0; width: 126px; max-width: 100%;\" title=\"K&M SHOP\" width=\"126\"/></a></div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-2\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #f9ecdc; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 15px; padding-bottom: 5px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"15\" cellspacing=\"0\" class=\"image_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<div align=\"center\" style=\"line-height:10px\"><a href=\"www.example.com\" style=\"outline:none\" tabindex=\"-1\" target=\"_blank\"><img alt=\"stars icon\" src=\"images/stars.png\" style=\"display: block; height: auto; border: 0; width: 160px; max-width: 100%;\" title=\"stars icon\" width=\"160\"/></a></div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-3\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #f9ecdc; color: #000000; background-position: center top; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 15px; padding-bottom: 0px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"text_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding-top:15px;\">\r\n" + 
			"<div style=\"font-family: sans-serif\">\r\n" + 
			"<div class=\"txtTinyMce-wrapper\" style=\"font-family: Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif; font-size: 12px; mso-line-height-alt: 18px; color: #2b2d49; line-height: 1.5;\">\r\n" + 
			"<p style=\"margin: 0; font-size: 14px; text-align: center; mso-line-height-alt: 45px; letter-spacing: 2px;\"><span style=\"font-size:30px;caret-color:#152a6d;\"><strong>THANK YOU FOR BUYING</strong></span></p>\r\n" + 
			"<p style=\"margin: 0; font-size: 14px; text-align: center; mso-line-height-alt: 33px; letter-spacing: 2px;\"><span style=\"font-size:22px;\"><em><span style=\"caret-color:#152a6d;\">FOR YOUR ATTRIBUTE</span></em></span></p>\r\n" + 
			"</div>\r\n" + 
			"</div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"image_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"width:100%;padding-right:0px;padding-left:0px;\">\r\n" + 
			"<div align=\"center\" style=\"line-height:10px\"><a href=\"www.example.com\" style=\"outline:none\" tabindex=\"-1\" target=\"_blank\"><img alt=\"Independence Day Banner Image\" src=\"images/1009.jpg\" style=\"display: block; height: auto; border: 0; width: 576px; max-width: 100%;\" title=\"Independence Day Banner Image\" width=\"576\"/></a></div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-4\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #f9ecdc; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 10px; padding-bottom: 5px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"text_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<div style=\"font-family: sans-serif\">\r\n" + 
			"<div class=\"txtTinyMce-wrapper\" style=\"font-family: Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif; font-size: 12px; mso-line-height-alt: 18px; color: #2b2d49; line-height: 1.5;\">\r\n" + 
			"<p style=\"margin: 0; font-size: 14px; text-align: center; mso-line-height-alt: 45px;\"><span style=\"font-size:30px;caret-color:#152a6d;\"><strong>FREE SHIPPING +</strong></span></p>\r\n" + 
			"<p style=\"margin: 0; font-size: 14px; text-align: center;\"><span style=\"color:#152a6d;\"><span style=\"caret-color:#152a6d;font-size:30px;\"><span style=\"color:#a31731;\"><strong><span style=\"color:#a31731;\">30%</span> OFF</strong></span></span></span></p>\r\n" + 
			"</div>\r\n" + 
			"</div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"text_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding-left:30px;padding-right:30px;padding-top:20px;\">\r\n" + 
			"<div style=\"font-family: sans-serif\">\r\n" + 
			"<div class=\"txtTinyMce-wrapper\" style=\"font-size: 12px; font-family: Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif; mso-line-height-alt: 14.399999999999999px; color: #2b2d49; line-height: 1.2;\">\r\n" + 
			"<p style=\"margin: 0; font-size: 14px; text-align: center;\"><span style=\"font-size:16px;color:#2b2d49;\">IF YOU HAVE ANY QUESTION OF US, JUST CONTACT</span></p>\r\n" + 
			"</div>\r\n" + 
			"</div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"text_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding-top:40px;padding-bottom:20px;\">\r\n" + 
			"<div style=\"font-family: sans-serif\">\r\n" + 
			"<div class=\"txtTinyMce-wrapper\" style=\"font-family: Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif; font-size: 12px; mso-line-height-alt: 14.399999999999999px; color: #2b2d49; line-height: 1.2;\">\r\n" + 
			"<p style=\"margin: 0; font-size: 14px; text-align: center;\"><span style=\"font-size:30px;caret-color:#152a6d;\"><strong>STARTED DELIVERY</strong></span></p>\r\n" + 
			"</div>\r\n" + 
			"</div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-5\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #f9ecdc; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"33.333333333333336%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"empty_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding-right:0px;padding-bottom:5px;padding-left:0px;padding-top:5px;\">\r\n" + 
			"<div></div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"<td class=\"column column-2\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"33.333333333333336%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"empty_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding-right:0px;padding-bottom:5px;padding-left:0px;padding-top:5px;\">\r\n" + 
			"<div></div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"<td class=\"column column-3\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"33.333333333333336%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"empty_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding-right:0px;padding-bottom:5px;padding-left:0px;padding-top:5px;\">\r\n" + 
			"<div></div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-6\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #f9ecdc; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 0px; padding-bottom: 0px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"button_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"text-align:center;padding-top:35px;padding-bottom:50px;\">\r\n" + 
			"<div align=\"center\">\r\n" + 
			"<!--[if mso]><v:roundrect xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" href=\"https://www.example.com\" style=\"height:44px;width:208px;v-text-anchor:middle;\" arcsize=\"21%\" strokeweight=\"0.75pt\" strokecolor=\"#2B2D49\" fillcolor=\"#2b2d49\"><w:anchorlock/><v:textbox inset=\"0px,0px,0px,0px\"><center style=\"color:#ffffff; font-family:Tahoma, sans-serif; font-size:16px\"><![endif]--><a href=\"https://www.example.com\" style=\"text-decoration:none;display:inline-block;color:#ffffff;background-color:#2b2d49;border-radius:9px;width:auto;border-top:1px solid #2B2D49;font-weight:400;border-right:1px solid #2B2D49;border-bottom:1px solid #2B2D49;border-left:1px solid #2B2D49;padding-top:5px;padding-bottom:5px;font-family:Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif;text-align:center;mso-border-alt:none;word-break:keep-all;\" target=\"_blank\"><span style=\"padding-left:20px;padding-right:20px;font-size:16px;display:inline-block;letter-spacing:2px;\"><span style=\"font-size: 16px; line-height: 2; word-break: break-word; mso-line-height-alt: 32px;\">TAKE YOUR PICK</span></span></a>\r\n" + 
			"<!--[if mso]></center></v:textbox></v:roundrect><![endif]-->\r\n" + 
			"</div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-7\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #ffffff; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 0px; padding-bottom: 0px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"image_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"width:100%;padding-right:0px;padding-left:0px;padding-top:40px;padding-bottom:20px;\">\r\n" + 
			"<div align=\"center\" style=\"line-height:10px\"><a href=\"www.example.com\" style=\"outline:none\" tabindex=\"-1\" target=\"_blank\"><img alt=\"your-logo\" src=\"images/logo_14.png\" style=\"display: block; height: auto; border: 0; width: 144px; max-width: 100%;\" title=\"your-logo\" width=\"144\"/></a></div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-8\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #ffffff; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 0px; padding-bottom: 10px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"social_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding-left:20px;padding-right:20px;text-align:center;\">\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"social-table\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"168px\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding:0 5px 0 5px;\"><a href=\"https://www.example.com\" target=\"_blank\"><img alt=\"Facebook\" height=\"32\" src=\"images/facebook2x.png\" style=\"display: block; height: auto; border: 0;\" title=\"Facebook\" width=\"32\"/></a></td>\r\n" + 
			"<td style=\"padding:0 5px 0 5px;\"><a href=\"https://www.example.com\" target=\"_blank\"><img alt=\"Twitter\" height=\"32\" src=\"images/twitter2x.png\" style=\"display: block; height: auto; border: 0;\" title=\"Twitter\" width=\"32\"/></a></td>\r\n" + 
			"<td style=\"padding:0 5px 0 5px;\"><a href=\"https://www.example.com\" target=\"_blank\"><img alt=\"Instagram\" height=\"32\" src=\"images/instagram2x.png\" style=\"display: block; height: auto; border: 0;\" title=\"Instagram\" width=\"32\"/></a></td>\r\n" + 
			"<td style=\"padding:0 5px 0 5px;\"><a href=\"https://www.example.com\" target=\"_blank\"><img alt=\"LinkedIn\" height=\"32\" src=\"images/linkedin2x.png\" style=\"display: block; height: auto; border: 0;\" title=\"LinkedIn\" width=\"32\"/></a></td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-9\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #ffffff; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 0px; padding-bottom: 0px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"10\" cellspacing=\"0\" class=\"text_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; word-break: break-word;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<div style=\"font-family: sans-serif\">\r\n" + 
			"<div class=\"txtTinyMce-wrapper\" style=\"font-size: 14px; font-family: Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif; mso-line-height-alt: 16.8px; color: #4a4a4a; line-height: 1.2;\">\r\n" + 
			"<p style=\"margin: 0; text-align: center;\">Your Street 12, 34567 AB City</p>\r\n" + 
			"<p style=\"margin: 0; text-align: center;\">info@example.com</p>\r\n" + 
			"<p style=\"margin: 0; text-align: center;\">(+1) 123 456 789</p>\r\n" + 
			"</div>\r\n" + 
			"</div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-10\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; background-color: #ffffff; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 5px; padding-bottom: 5px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"menu_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"color:#4a4a4a;font-family:inherit;font-size:14px;text-align:center;padding-bottom:40px;\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"text-align:center;font-size:0px;\">\r\n" + 
			"<div class=\"menu-links\">\r\n" + 
			"<!--[if mso]>\r\n" + 
			"<table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\" style=\"\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"padding-top:5px;padding-right:5px;padding-bottom:5px;padding-left:5px\">\r\n" + 
			"<![endif]--><a href=\"www.example.com\" style=\"padding-top:5px;padding-bottom:5px;padding-left:5px;padding-right:5px;display:inline-block;color:#4a4a4a;font-family:Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif;font-size:14px;text-decoration:none;letter-spacing:normal;\">Unsubscribe</a>\r\n" + 
			"<!--[if mso]></td><td><![endif]--><span class=\"sep\" style=\"font-size:14px;font-family:Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif;color:#4a4a4a;\">| </span>\r\n" + 
			"<!--[if mso]></td><![endif]-->\r\n" + 
			"<!--[if mso]></td><td style=\"padding-top:5px;padding-right:5px;padding-bottom:5px;padding-left:5px\"><![endif]--><a href=\"www.example.com\" style=\"padding-top:5px;padding-bottom:5px;padding-left:5px;padding-right:5px;display:inline-block;color:#4a4a4a;font-family:Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif;font-size:14px;text-decoration:none;letter-spacing:normal;\">Manage Preferences</a>\r\n" + 
			"<!--[if mso]></td></tr></table><![endif]-->\r\n" + 
			"</div>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row row-11\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td>\r\n" + 
			"<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"row-content stack\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; color: #000000; width: 640px;\" width=\"640\">\r\n" + 
			"<tbody>\r\n" + 
			"<tr>\r\n" + 
			"<td class=\"column column-1\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; font-weight: 400; text-align: left; vertical-align: top; padding-top: 5px; padding-bottom: 5px; border-top: 0px; border-right: 0px; border-bottom: 0px; border-left: 0px;\" width=\"100%\">\r\n" + 
			"<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"icons_block\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"vertical-align: middle; color: #9d9d9d; font-family: inherit; font-size: 15px; padding-bottom: 5px; padding-top: 5px; text-align: center;\">\r\n" + 
			"<table cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt;\" width=\"100%\">\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"vertical-align: middle; text-align: center;\">\r\n" + 
			"<!--[if vml]><table align=\"left\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"display:inline-block;padding-left:0px;padding-right:0px;mso-table-lspace: 0pt;mso-table-rspace: 0pt;\"><![endif]-->\r\n" + 
			"<!--[if !vml]><!-->\r\n" + 
			"<table cellpadding=\"0\" cellspacing=\"0\" class=\"icons-inner\" role=\"presentation\" style=\"mso-table-lspace: 0pt; mso-table-rspace: 0pt; display: inline-block; margin-right: -4px; padding-left: 0px; padding-right: 0px;\">\r\n" + 
			"<!--<![endif]-->\r\n" + 
			"<tr>\r\n" + 
			"<td style=\"vertical-align: middle; text-align: center; padding-top: 5px; padding-bottom: 5px; padding-left: 5px; padding-right: 6px;\"><a href=\"https://www.designedwithbee.com/\" style=\"text-decoration: none;\" target=\"_blank\"><img align=\"center\" alt=\"Designed with BEE\" class=\"icon\" height=\"32\" src=\"images/bee.png\" style=\"display: block; height: auto; margin: 0 auto; border: 0;\" width=\"34\"/></a></td>\r\n" + 
			"<td style=\"font-family: Montserrat, Trebuchet MS, Lucida Grande, Lucida Sans Unicode, Lucida Sans, Tahoma, sans-serif; font-size: 15px; color: #9d9d9d; vertical-align: middle; letter-spacing: undefined; text-align: center;\"><a href=\"https://www.designedwithbee.com/\" style=\"color: #9d9d9d; text-decoration: none;\" target=\"_blank\">Designed with BEE</a></td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table>\r\n" + 
			"</td>\r\n" + 
			"</tr>\r\n" + 
			"</tbody>\r\n" + 
			"</table><!-- End -->\r\n" + 
			"</body>\r\n" + 
			"</html>";
 public static String FEEDBACKTEMPLATE= "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional //EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n" + 
 		"<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\r\n" + 
 		"<head>\r\n" + 
 		"<!--[if gte mso 9]>\r\n" + 
 		"<xml>\r\n" + 
 		"  <o:OfficeDocumentSettings>\r\n" + 
 		"    <o:AllowPNG/>\r\n" + 
 		"    <o:PixelsPerInch>96</o:PixelsPerInch>\r\n" + 
 		"  </o:OfficeDocumentSettings>\r\n" + 
 		"</xml>\r\n" + 
 		"<![endif]-->\r\n" + 
 		"  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n" + 
 		"  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
 		"  <meta name=\"x-apple-disable-message-reformatting\">\r\n" + 
 		"  <!--[if !mso]><!--><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"><!--<![endif]-->\r\n" + 
 		"  <title></title>\r\n" + 
 		"  \r\n" + 
 		"    <style type=\"text/css\">\r\n" + 
 		"      @media only screen and (min-width: 620px) {\r\n" + 
 		"  .u-row {\r\n" + 
 		"    width: 600px !important;\r\n" + 
 		"  }\r\n" + 
 		"  .u-row .u-col {\r\n" + 
 		"    vertical-align: top;\r\n" + 
 		"  }\r\n" + 
 		"\r\n" + 
 		"  .u-row .u-col-100 {\r\n" + 
 		"    width: 600px !important;\r\n" + 
 		"  }\r\n" + 
 		"\r\n" + 
 		"}\r\n" + 
 		"\r\n" + 
 		"@media (max-width: 620px) {\r\n" + 
 		"  .u-row-container {\r\n" + 
 		"    max-width: 100% !important;\r\n" + 
 		"    padding-left: 0px !important;\r\n" + 
 		"    padding-right: 0px !important;\r\n" + 
 		"  }\r\n" + 
 		"  .u-row .u-col {\r\n" + 
 		"    min-width: 320px !important;\r\n" + 
 		"    max-width: 100% !important;\r\n" + 
 		"    display: block !important;\r\n" + 
 		"  }\r\n" + 
 		"  .u-row {\r\n" + 
 		"    width: 100% !important;\r\n" + 
 		"  }\r\n" + 
 		"  .u-col {\r\n" + 
 		"    width: 100% !important;\r\n" + 
 		"  }\r\n" + 
 		"  .u-col > div {\r\n" + 
 		"    margin: 0 auto;\r\n" + 
 		"  }\r\n" + 
 		"}\r\n" + 
 		"body {\r\n" + 
 		"  margin: 0;\r\n" + 
 		"  padding: 0;\r\n" + 
 		"}\r\n" + 
 		"\r\n" + 
 		"table,\r\n" + 
 		"tr,\r\n" + 
 		"td {\r\n" + 
 		"  vertical-align: top;\r\n" + 
 		"  border-collapse: collapse;\r\n" + 
 		"}\r\n" + 
 		"\r\n" + 
 		"p {\r\n" + 
 		"  margin: 0;\r\n" + 
 		"}\r\n" + 
 		"\r\n" + 
 		".ie-container table,\r\n" + 
 		".mso-container table {\r\n" + 
 		"  table-layout: fixed;\r\n" + 
 		"}\r\n" + 
 		"\r\n" + 
 		"* {\r\n" + 
 		"  line-height: inherit;\r\n" + 
 		"}\r\n" + 
 		"\r\n" + 
 		"a[x-apple-data-detectors='true'] {\r\n" + 
 		"  color: inherit !important;\r\n" + 
 		"  text-decoration: none !important;\r\n" + 
 		"}\r\n" + 
 		"\r\n" + 
 		"table, td { color: #000000; } #u_body a { color: #0000ee; text-decoration: underline; } @media (max-width: 480px) { #u_column_1 .v-col-padding { padding: 0px 0px 30px !important; } #u_content_heading_1 .v-font-size { font-size: 24px !important; } #u_content_heading_7 .v-font-size { font-size: 24px !important; } #u_column_2 .v-col-padding { padding: 30px 0px !important; } #u_content_heading_10 .v-font-size { font-size: 24px !important; } #u_column_3 .v-col-padding { padding: 30px 0px !important; } #u_content_button_1 .v-size-width { width: 50% !important; } #u_column_4 .v-col-padding { padding: 30px 0px !important; } }\r\n" + 
 		"    </style>\r\n" + 
 		"  \r\n" + 
 		"  \r\n" + 
 		"\r\n" + 
 		"<!--[if !mso]><!--><link href=\"https://fonts.googleapis.com/css?family=Playfair+Display:400,700&display=swap\" rel=\"stylesheet\" type=\"text/css\"><link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700&display=swap\" rel=\"stylesheet\" type=\"text/css\"><!--<![endif]-->\r\n" + 
 		"\r\n" + 
 		"</head>\r\n" + 
 		"\r\n" + 
 		"<body class=\"clean-body u_body\" style=\"margin: 0;padding: 0;-webkit-text-size-adjust: 100%;background-color: #ffffff;color: #000000\">\r\n" + 
 		"  <!--[if IE]><div class=\"ie-container\"><![endif]-->\r\n" + 
 		"  <!--[if mso]><div class=\"mso-container\"><![endif]-->\r\n" + 
 		"  <table id=\"u_body\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;min-width: 320px;Margin: 0 auto;background-color: #ffffff;width:100%\" cellpadding=\"0\" cellspacing=\"0\">\r\n" + 
 		"  <tbody>\r\n" + 
 		"  <tr style=\"vertical-align: top\">\r\n" + 
 		"    <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\r\n" + 
 		"    <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td align=\"center\" style=\"background-color: #ffffff;\"><![endif]-->\r\n" + 
 		"    \r\n" + 
 		"\r\n" + 
 		"<div class=\"u-row-container\" style=\"padding: 0px;background-color: #fbf4ec\">\r\n" + 
 		"  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\r\n" + 
 		"    <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\r\n" + 
 		"      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: #fbf4ec;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\r\n" + 
 		"      \r\n" + 
 		"<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" class=\"v-col-padding\" style=\"width: 600px;padding: 0px 0px 40px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\" valign=\"top\"><![endif]-->\r\n" + 
 		"<div id=\"u_column_1\" class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\r\n" + 
 		"  <div style=\"height: 100%;width: 100% !important;\">\r\n" + 
 		"  <!--[if (!mso)&(!IE)]><!--><div class=\"v-col-padding\" style=\"height: 100%; padding: 0px 0px 40px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;\"><!--<![endif]-->\r\n" + 
 		"  \r\n" + 
 		"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\r\n" + 
 		"  <tbody>\r\n" + 
 		"    <tr>\r\n" + 
 		"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\r\n" + 
 		"        \r\n" + 
 		"<table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n" + 
 		"  <tr>\r\n" + 
 		"    <td style=\"padding-right: 0px;padding-left: 0px;\" align=\"center\">\r\n" + 
 		"      \r\n" + 
 		"      <img align=\"center\" border=\"0\" src=\"https://img.freepik.com/premium-vector/thank-you-hand-lettering-thank-you-with-decorative-graphic_136321-1421.jpg?w=2000\" alt=\"image\" title=\"image\" style=\"outline: none;text-decoration: none;-ms-interpolation-mode: bicubic;clear: both;display: inline-block !important;border: none;height: auto;float: none;width: 100%;max-width: 544px;\" width=\"544\"/>\r\n" + 
 		"      \r\n" + 
 		"    </td>\r\n" + 
 		"  </tr>\r\n" + 
 		"</table>\r\n" + 
 		"\r\n" + 
 		"      </td>\r\n" + 
 		"    </tr>\r\n" + 
 		"  </tbody>\r\n" + 
 		"</table>\r\n" + 
 		"\r\n" + 
 		"<table id=\"u_content_heading_1\" style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\r\n" + 
 		"  <tbody>\r\n" + 
 		"    <tr>\r\n" + 
 		"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 10px 4px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\r\n" + 
 		"        \r\n" + 
 		"  <h1 class=\"v-font-size\" style=\"margin: 0px; line-height: 140%; text-align: center; word-wrap: break-word; font-weight: normal; font-family: 'Playfair Display',serif; font-size: 32px;\"><strong>Thank You</strong></h1>\r\n" + 
 		"\r\n" + 
 		"      </td>\r\n" + 
 		"    </tr>\r\n" + 
 		"  </tbody>\r\n" + 
 		"</table>\r\n" + 
 		"\r\n" + 
 		"<table id=\"u_content_heading_7\" style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\r\n" + 
 		"  <tbody>\r\n" + 
 		"    <tr>\r\n" + 
 		"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:0px 10px 10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\r\n" + 
 		"        \r\n" + 
 		"  <h1 class=\"v-font-size\" style=\"margin: 0px; line-height: 100%; text-align: center; word-wrap: break-word; font-weight: normal; font-family: 'Playfair Display',serif; font-size: 32px;\"><strong>For Your FEEDBACK</strong></h1>\r\n" + 
 		"\r\n" + 
 		"      </td>\r\n" + 
 		"    </tr>\r\n" + 
 		"  </tbody>\r\n" + 
 		"</table>\r\n" + 
 		"\r\n" + 
 		"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\r\n" + 
 		"  <tbody>\r\n" + 
 		"    <tr>\r\n" + 
 		"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 20px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\r\n" + 
 		"        \r\n" + 
 		"  <h1 class=\"v-font-size\" style=\"margin: 0px; line-height: 140%; text-align: center; word-wrap: break-word; font-weight: normal; font-family: 'Montserrat',sans-serif; font-size: 14px;\">WE ARE ON THE WAY TO DELEVERY BEST EXPERIENCE TO OUR CUSTOMERS, SO YOUR FEEDBACK WILL HELP US A LOT ON DOING THAT!</h1>\r\n" + 
 		"\r\n" + 
 		"      </td>\r\n" + 
 		"    </tr>\r\n" + 
 		"  </tbody>\r\n" + 
 		"</table>\r\n" + 
 		"\r\n" + 
 		"  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\r\n" + 
 		"  </div>\r\n" + 
 		"</div>\r\n" + 
 		"<!--[if (mso)|(IE)]></td><![endif]-->\r\n" + 
 		"      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\r\n" + 
 		"    </div>\r\n" + 
 		"  </div>\r\n" + 
 		"</div>\r\n" + 
 		"\r\n" + 
 		"\r\n" + 
 		"\r\n" + 
 		"<div class=\"u-row-container\" style=\"padding: 0px;background-color: transparent\">\r\n" + 
 		"  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\r\n" + 
 		"    <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\r\n" + 
 		"      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: transparent;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\r\n" + 
 		"      \r\n" + 
 		"<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" class=\"v-col-padding\" style=\"width: 600px;padding: 50px 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->\r\n" + 
 		"<div id=\"u_column_2\" class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\r\n" + 
 		"  <div style=\"height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\r\n" + 
 		"  <!--[if (!mso)&(!IE)]><!--><div class=\"v-col-padding\" style=\"height: 100%; padding: 50px 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\r\n" + 
 		"  \r\n" + 
 		"<table id=\"u_content_heading_10\" style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\r\n" + 
 		"  <tbody>\r\n" + 
 		"    <tr>\r\n" + 
 		"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:0px 10px 10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\r\n" + 
 		"        \r\n" + 
 		"  <h1 class=\"v-font-size\" style=\"margin: 0px; line-height: 100%; text-align: center; word-wrap: break-word; font-weight: normal; font-family: 'Playfair Display',serif; font-size: 32px;\"><strong>Your feedback will help us a lot !</strong></h1>\r\n" + 
 		"\r\n" + 
 		"      </td>\r\n" + 
 		"    </tr>\r\n" + 
 		"  </tbody>\r\n" + 
 		"</table>\r\n" + 
 		"\r\n" + 
 		"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\r\n" + 
 		"  <tbody>\r\n" + 
 		"    <tr>\r\n" + 
 		"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 10px 5px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\r\n" + 
 		"        \r\n" + 
 		"  <h1 class=\"v-font-size\" style=\"margin: 0px; line-height: 100%; text-align: center; word-wrap: break-word; font-weight: normal; font-family: 'Playfair Display',serif; font-size: 25px;\"><strong>THANK YOU SO MUCH</strong></h1>\r\n" + 
 		"\r\n" + 
 		"      </td>\r\n" + 
 		"    </tr>\r\n" + 
 		"  </tbody>\r\n" + 
 		"</table>\r\n" + 
 		"\r\n" + 
 		"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\r\n" + 
 		"  <tbody>\r\n" + 
 		"    <tr>\r\n" + 
 		"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 20px 0px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\r\n" + 
 		"        \r\n" + 
 		"  <h1 class=\"v-font-size\" style=\"margin: 0px; line-height: 140%; text-align: center; word-wrap: break-word; font-weight: normal; font-family: 'Montserrat',sans-serif; font-size: 14px;\">attractive makeup essential product</h1>\r\n" + 
 		"\r\n" + 
 		"      </td>\r\n" + 
 		"    </tr>\r\n" + 
 		"  </tbody>\r\n" + 
 		"</table>\r\n" + 
 		"\r\n" + 
 		"  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\r\n" + 
 		"  </div>\r\n" + 
 		"</div>\r\n" + 
 		"<!--[if (mso)|(IE)]></td><![endif]-->\r\n" + 
 		"      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\r\n" + 
 		"    </div>\r\n" + 
 		"  </div>\r\n" + 
 		"</div>\r\n" + 
 		"\r\n" + 
 		"\r\n" + 
 		"\r\n" + 
 		"<div class=\"u-row-container\" style=\"padding: 0px;background-color: #fbf4ec\">\r\n" + 
 		"  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\r\n" + 
 		"    <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\r\n" + 
 		"      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: #fbf4ec;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\r\n" + 
 		"      \r\n" + 
 		"<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" class=\"v-col-padding\" style=\"width: 600px;padding: 50px 0px 35px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->\r\n" + 
 		"<div id=\"u_column_3\" class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\r\n" + 
 		"  <div style=\"height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\r\n" + 
 		"  <!--[if (!mso)&(!IE)]><!--><div class=\"v-col-padding\" style=\"height: 100%; padding: 50px 0px 35px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\r\n" + 
 		"  \r\n" + 
 		"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\r\n" + 
 		"  <tbody>\r\n" + 
 		"    <tr>\r\n" + 
 		"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:0px 10px 10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\r\n" + 
 		"        \r\n" + 
 		"  <h1 class=\"v-font-size\" style=\"margin: 0px; line-height: 100%; text-align: center; word-wrap: break-word; font-weight: normal; font-family: 'Playfair Display',serif; font-size: 32px;\"><strong>Need Help?</strong></h1>\r\n" + 
 		"\r\n" + 
 		"      </td>\r\n" + 
 		"    </tr>\r\n" + 
 		"  </tbody>\r\n" + 
 		"</table>\r\n" + 
 		"\r\n" + 
 		"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\r\n" + 
 		"  <tbody>\r\n" + 
 		"    <tr>\r\n" + 
 		"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 20px 0px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\r\n" + 
 		"        \r\n" + 
 		"  <h1 class=\"v-font-size\" style=\"margin: 0px; line-height: 140%; text-align: center; word-wrap: break-word; font-weight: normal; font-family: 'Montserrat',sans-serif; font-size: 14px;\">Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</h1>\r\n" + 
 		"\r\n" + 
 		"      </td>\r\n" + 
 		"    </tr>\r\n" + 
 		"  </tbody>\r\n" + 
 		"</table>\r\n" + 
 		"\r\n" + 
 		"<table id=\"u_content_button_1\" style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\r\n" + 
 		"  <tbody>\r\n" + 
 		"    <tr>\r\n" + 
 		"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\r\n" + 
 		"        \r\n" + 
 		"  <!--[if mso]><style>.v-button {background: transparent !important;}</style><![endif]-->\r\n" + 
 		"<div align=\"center\">\r\n" + 
 		"  <!--[if mso]><v:roundrect xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:w=\"urn:schemas-microsoft-com:office:word\" href=\"http://localhost:8080/home/index\" style=\"height:42px; v-text-anchor:middle; width:209px;\" arcsize=\"9.5%\"  stroke=\"f\" fillcolor=\"#dc9663\"><w:anchorlock/><center style=\"color:#FFFFFF;font-family:arial,helvetica,sans-serif;\"><![endif]-->  \r\n" + 
 		"    <a href=\"http://localhost:8080/home/index\" target=\"_blank\" class=\"v-button v-size-width\" style=\"box-sizing: border-box;display: inline-block;font-family:arial,helvetica,sans-serif;text-decoration: none;-webkit-text-size-adjust: none;text-align: center;color: #FFFFFF; background-color: #dc9663; border-radius: 4px;-webkit-border-radius: 4px; -moz-border-radius: 4px; width:36%; max-width:100%; overflow-wrap: break-word; word-break: break-word; word-wrap:break-word; mso-border-alt: none;\">\r\n" + 
 		"      <span style=\"display:block;padding:10px 20px;line-height:120%;\"><strong><span style=\"font-size: 18px; line-height: 21.6px; font-family: 'Playfair Display', serif;\">Call Us</span></strong></span>\r\n" + 
 		"    </a>\r\n" + 
 		"  <!--[if mso]></center></v:roundrect><![endif]-->\r\n" + 
 		"</div>\r\n" + 
 		"\r\n" + 
 		"      </td>\r\n" + 
 		"    </tr>\r\n" + 
 		"  </tbody>\r\n" + 
 		"</table>\r\n" + 
 		"\r\n" + 
 		"  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\r\n" + 
 		"  </div>\r\n" + 
 		"</div>\r\n" + 
 		"<!--[if (mso)|(IE)]></td><![endif]-->\r\n" + 
 		"      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\r\n" + 
 		"    </div>\r\n" + 
 		"  </div>\r\n" + 
 		"</div>\r\n" + 
 		"\r\n" + 
 		"\r\n" + 
 		"\r\n" + 
 		"<div class=\"u-row-container\" style=\"padding: 0px;background-color: #000000\">\r\n" + 
 		"  <div class=\"u-row\" style=\"Margin: 0 auto;min-width: 320px;max-width: 600px;overflow-wrap: break-word;word-wrap: break-word;word-break: break-word;background-color: transparent;\">\r\n" + 
 		"    <div style=\"border-collapse: collapse;display: table;width: 100%;height: 100%;background-color: transparent;\">\r\n" + 
 		"      <!--[if (mso)|(IE)]><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"padding: 0px;background-color: #000000;\" align=\"center\"><table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:600px;\"><tr style=\"background-color: transparent;\"><![endif]-->\r\n" + 
 		"      \r\n" + 
 		"<!--[if (mso)|(IE)]><td align=\"center\" width=\"600\" class=\"v-col-padding\" style=\"width: 600px;padding: 35px 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\" valign=\"top\"><![endif]-->\r\n" + 
 		"<div id=\"u_column_4\" class=\"u-col u-col-100\" style=\"max-width: 320px;min-width: 600px;display: table-cell;vertical-align: top;\">\r\n" + 
 		"  <div style=\"height: 100%;width: 100% !important;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\">\r\n" + 
 		"  <!--[if (!mso)&(!IE)]><!--><div class=\"v-col-padding\" style=\"height: 100%; padding: 35px 0px;border-top: 0px solid transparent;border-left: 0px solid transparent;border-right: 0px solid transparent;border-bottom: 0px solid transparent;border-radius: 0px;-webkit-border-radius: 0px; -moz-border-radius: 0px;\"><!--<![endif]-->\r\n" + 
 		"  \r\n" + 
 		"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\r\n" + 
 		"  <tbody>\r\n" + 
 		"    <tr>\r\n" + 
 		"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 45px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\r\n" + 
 		"        \r\n" + 
 		"  <div style=\"color: #ffffff; line-height: 140%; text-align: center; word-wrap: break-word;\">\r\n" + 
 		"    <p style=\"font-size: 14px; line-height: 140%;\"><span style=\"font-family: Montserrat, sans-serif; font-size: 14px; line-height: 19.6px;\">Hope you happy when using our services!</span></p>\r\n" + 
 		"  </div>\r\n" + 
 		"\r\n" + 
 		"      </td>\r\n" + 
 		"    </tr>\r\n" + 
 		"  </tbody>\r\n" + 
 		"</table>\r\n" + 
 		"\r\n" + 
 		"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\r\n" + 
 		"  <tbody>\r\n" + 
 		"    <tr>\r\n" + 
 		"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\r\n" + 
 		"        \r\n" + 
 		"<div align=\"center\">\r\n" + 
 		"  <div style=\"display: table; max-width:110px;\">\r\n" + 
 		"  <!--[if (mso)|(IE)]><table width=\"110\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\"><tr><td style=\"border-collapse:collapse;\" align=\"center\"><table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"border-collapse:collapse; mso-table-lspace: 0pt;mso-table-rspace: 0pt; width:110px;\"><tr><![endif]-->\r\n" + 
 		"  \r\n" + 
 		"    \r\n" + 
 		"    <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 5px;\" valign=\"top\"><![endif]-->\r\n" + 
 		"    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"width: 32px !important;height: 32px !important;display: inline-block;border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 5px\">\r\n" + 
 		"      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\r\n" + 
 		"        <a href=\"https://facebook.com/\" title=\"Facebook\" target=\"_blank\">\r\n" + 
 		"        </a>\r\n" + 
 		"      </td></tr>\r\n" + 
 		"    </tbody></table>\r\n" + 
 		"    <!--[if (mso)|(IE)]></td><![endif]-->\r\n" + 
 		"    \r\n" + 
 		"    <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 5px;\" valign=\"top\"><![endif]-->\r\n" + 
 		"    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"width: 32px !important;height: 32px !important;display: inline-block;border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 5px\">\r\n" + 
 		"      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\r\n" + 
 		"        <a href=\"https://instagram.com/\" title=\"Instagram\" target=\"_blank\">\r\n" + 
 		"        </a>\r\n" + 
 		"      </td></tr>\r\n" + 
 		"    </tbody></table>\r\n" + 
 		"    <!--[if (mso)|(IE)]></td><![endif]-->\r\n" + 
 		"    \r\n" + 
 		"    <!--[if (mso)|(IE)]><td width=\"32\" style=\"width:32px; padding-right: 0px;\" valign=\"top\"><![endif]-->\r\n" + 
 		"    <table align=\"left\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" width=\"32\" height=\"32\" style=\"width: 32px !important;height: 32px !important;display: inline-block;border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;margin-right: 0px\">\r\n" + 
 		"      <tbody><tr style=\"vertical-align: top\"><td align=\"left\" valign=\"middle\" style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top\">\r\n" + 
 		"        <a href=\"https://pinterest.com/\" title=\"Pinterest\" target=\"_blank\">\r\n" + 
 		"        </a>\r\n" + 
 		"      </td></tr>\r\n" + 
 		"    </tbody></table>\r\n" + 
 		"    <!--[if (mso)|(IE)]></td><![endif]-->\r\n" + 
 		"    \r\n" + 
 		"    \r\n" + 
 		"    <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\r\n" + 
 		"  </div>\r\n" + 
 		"</div>\r\n" + 
 		"\r\n" + 
 		"      </td>\r\n" + 
 		"    </tr>\r\n" + 
 		"  </tbody>\r\n" + 
 		"</table>\r\n" + 
 		"\r\n" + 
 		"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\r\n" + 
 		"  <tbody>\r\n" + 
 		"    <tr>\r\n" + 
 		"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\r\n" + 
 		"        \r\n" + 
 		"  <table height=\"0px\" align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"59%\" style=\"border-collapse: collapse;table-layout: fixed;border-spacing: 0;mso-table-lspace: 0pt;mso-table-rspace: 0pt;vertical-align: top;border-top: 1px solid #ffffff;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n" + 
 		"    <tbody>\r\n" + 
 		"      <tr style=\"vertical-align: top\">\r\n" + 
 		"        <td style=\"word-break: break-word;border-collapse: collapse !important;vertical-align: top;font-size: 0px;line-height: 0px;mso-line-height-rule: exactly;-ms-text-size-adjust: 100%;-webkit-text-size-adjust: 100%\">\r\n" + 
 		"          <span>&#160;</span>\r\n" + 
 		"        </td>\r\n" + 
 		"      </tr>\r\n" + 
 		"    </tbody>\r\n" + 
 		"  </table>\r\n" + 
 		"\r\n" + 
 		"      </td>\r\n" + 
 		"    </tr>\r\n" + 
 		"  </tbody>\r\n" + 
 		"</table>\r\n" + 
 		"\r\n" + 
 		"<table style=\"font-family:arial,helvetica,sans-serif;\" role=\"presentation\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\" border=\"0\">\r\n" + 
 		"  <tbody>\r\n" + 
 		"    <tr>\r\n" + 
 		"      <td style=\"overflow-wrap:break-word;word-break:break-word;padding:10px 45px;font-family:arial,helvetica,sans-serif;\" align=\"left\">\r\n" + 
 		"        \r\n" + 
 		"  <div style=\"color: #ffffff; line-height: 140%; text-align: center; word-wrap: break-word;\">\r\n" + 
 		"    <p style=\"font-size: 14px; line-height: 140%;\">0365587493 - 125/9/6 An phu dong 09 - QUAN 12</p>\r\n" + 
 		"  </div>\r\n" + 
 		"\r\n" + 
 		"      </td>\r\n" + 
 		"    </tr>\r\n" + 
 		"  </tbody>\r\n" + 
 		"</table>\r\n" + 
 		"\r\n" + 
 		"  <!--[if (!mso)&(!IE)]><!--></div><!--<![endif]-->\r\n" + 
 		"  </div>\r\n" + 
 		"</div>\r\n" + 
 		"<!--[if (mso)|(IE)]></td><![endif]-->\r\n" + 
 		"      <!--[if (mso)|(IE)]></tr></table></td></tr></table><![endif]-->\r\n" + 
 		"    </div>\r\n" + 
 		"  </div>\r\n" + 
 		"</div>\r\n" + 
 		"\r\n" + 
 		"\r\n" + 
 		"    <!--[if (mso)|(IE)]></td></tr></table><![endif]-->\r\n" + 
 		"    </td>\r\n" + 
 		"  </tr>\r\n" + 
 		"  </tbody>\r\n" + 
 		"  </table>\r\n" + 
 		"  <!--[if mso]></div><![endif]-->\r\n" + 
 		"  <!--[if IE]></div><![endif]-->\r\n" + 
 		"</body>\r\n" + 
 		"\r\n" + 
 		"</html>\r\n" + 
 		"";
}
