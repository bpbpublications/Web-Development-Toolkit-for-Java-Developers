<%
            int sem=0;
            double marks1=0, marks2=0, marks3=0;
            try {
                sem = Integer.parseInt(request.getParameter("studentsemester"));
                marks1 = Double.parseDouble(request.getParameter("marks1"));
                marks2 = Double.parseDouble(request.getParameter("marks2"));
                marks3 = Double.parseDouble(request.getParameter("marks3"));
            } catch (NumberFormatException nfe) {

            }
        %>
<jsp:setProperty name="s1" property="semester" value='<%=sem%>'/>
<jsp:setProperty name="s1" property="marks1" value='<%=marks1%>'/>
<jsp:setProperty name="s1" property="marks2" value='<%=marks2%>'/>
<jsp:setProperty name="s1" property="marks3" value='<%=marks3%>'/>
<jsp:setProperty name="s1" property="grade" value="Default" />

