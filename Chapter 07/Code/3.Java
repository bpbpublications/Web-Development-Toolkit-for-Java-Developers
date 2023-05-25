public void _jspService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
			response.setContentType("text/html"); 
			HttpSession session = request.getSession();
			JspWriter out = response.getWriter(); 
			out.println("<H1>A Random Number</H1>"); 	
			out.println(Math.random()); .
		 } 
