CREATE OR REPLACE PROCEDURE getStudentName 
	   (STUDENT_ID IN NUMBER, STUDENT_NAME OUT VARCHAR) AS
	BEGIN
		   SELECT name INTO STUDENT_NAME
		   FROM Student
		   WHERE ID = STUDENT_ID;
	END;


CallableStatement cstmt = null;
	try {
		   String SQL = "{call getStudentName (? ?)}";
		   cstmt = con.prepareCall(SQL);
		   . . .
	}
	catch (SQLException e) {
		   . . .
	}
