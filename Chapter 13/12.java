	public class ExampleBean {
	
	    // a private constructor
	    private ExampleBean(...) {
	      ...
	    }
	    
	    // a static factory method; the arguments to this method can be
	    // considered the dependencies of the bean that is returned,
	    // regardless of how those arguments are actually used.
	    public static ExampleBean createInstance (
	            AnotherBean anotherBean, YetAnotherBean yetAnotherBean, int i) {
	
	        ExampleBean eb = new ExampleBean (...);
	        // some other operations...
	        return eb;
	    }
	}
	
	}
