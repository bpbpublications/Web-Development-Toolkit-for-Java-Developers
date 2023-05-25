<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD><TITLE>Wish for the Day</TITLE>
<LINK REL=STYLESHEET HREF="JSP-Styles.css" TYPE="text/css">
</HEAD>
<BODY>
	<% if (Math.random() < 0.5)
		 { %>
			<H1>Have a <I>nice</I>day!</H1>
		<% } else { %>
			<H1>Have a <I>lousy</I>day!</H1>
	<% } %>
</BODY>
</HTML>
