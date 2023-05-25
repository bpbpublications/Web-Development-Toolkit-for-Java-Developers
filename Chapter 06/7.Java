HttpSession session = request.getSession();
SomeClass value =
  (SomeClass)session.getAttribute("key");
if (value == null) { // No such object already in session
  value = new SomeClass(...);
  session.setAttribute("key", value);
}
 codetomanipulatethevalue (value);
