<jsp:useBean id="s1" class="studentinformation.StudentBean"/>
<jsp:setProperty name="s1" property="id" />
<jsp:setProperty name="s1" property="name" />
<jsp:setProperty name="s1" property="program" />
<jsp:setProperty name="s1" property="semester" />
<jsp:setProperty name="s1" property="marks1" />
<jsp:setProperty name="s1" property="marks2" />
<jsp:setProperty name="s1" property="marks3" />
With
<jsp:useBean id="s1" class="studentinformation.StudentBean"/>
<jsp:setProperty name="s1" property="*" />
