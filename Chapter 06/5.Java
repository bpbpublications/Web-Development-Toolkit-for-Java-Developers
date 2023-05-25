HttpSession session = request.getSession(false);
if (session == null) {
  printMessageSayingCartIsEmpty();
} else {
  extractCartAndPrintContents(session);
}
