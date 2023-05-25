Cookie userCookie = new Cookie("user", "uid");
userCookie.setMaxAge(60*60*24*365); // Store cookie for 1 year
response.addCookie(userCookie);
