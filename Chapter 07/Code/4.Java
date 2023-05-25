<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
	<HTML><HEAD><TITLE>JSP Expressions</TITLE></HEAD>
	<BODY>
		<H2>JSP Expressions</H2>
		<UL><LI>Current time: <%= new java.util.Date() %>		
			<LI>Server: <%= application.getServerInfo() %>			
<LI>Session ID: <%= session.getId() %>
		</UL>
</BODY>
</HTML>
