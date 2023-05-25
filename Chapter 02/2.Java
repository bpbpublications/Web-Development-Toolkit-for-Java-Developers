Statement stmt = con.createStatement();
String create_query = "CREATE TABLE CONTACT_INFO("
                    + "CONTACT_ID INTEGER NOT NULL, "
                    + "FIRST_NAME VARCHAR(20) NOT NULL, "
                    + "MIDDLE_NAME CHARACTER(1), "
                    + "LAST_NAME VARCHAR(30) NOT NULL, "
                    + "STREET VARCHAR(50) NOT NULL, "
                    + "CITY VARCHAR(30) NOT NULL, "
                    + "STATE VARCHAR(30) NOT NULL, "
                    + "ZIP VARCHAR(6) NOT NULL, " + "PRIMARY KEY (CONTACT_ID) " + " ) ";
