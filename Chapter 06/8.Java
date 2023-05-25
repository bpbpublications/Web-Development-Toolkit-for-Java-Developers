HttpSession session = request.getSession();
if (session.isNew()) {
  doStuffForNewbies();
} else {
  doStuffForReturnVisitors();  // Wrong!
}

