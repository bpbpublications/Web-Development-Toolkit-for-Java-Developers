<HTML>
	<HEAD><TITLE>Random Numbers</TITLE></HEAD>
	<BODY>
	<H1>Random Numbers</H1>
		<UL><%
			int n = example.NumberGenerator.randomNumber(100);						for(inti=0; i<n; i++)
			 { 
				out.println("<LI>" + example.NumberGenerator.randomNumber(100));
			 }
			%>
		</UL>
	</BODY>
</HTML>
