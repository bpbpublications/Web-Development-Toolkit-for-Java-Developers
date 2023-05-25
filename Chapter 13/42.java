public  class  CustomerValidator  implements  Validator  {
	      private  final  Validator  addressValidator;
	      public  CustomerValidator(Validator  addressValidator)  {
	            if  (addressValidator  ==  null)  {
	                    throw  new  IllegalArgumentException("The  supplied  [Validator]  is  required  and  must  not  be  null.");
	            }
	            if  (!addressValidator.supports(Address.class))  {
	                    throw  new  IllegalArgumentException(
	                        "The  supplied  [Validator]  must  support  the  validation  of  [Address]  instances.");
	            }
	            this.addressValidator  =  addressValidator;
	      }
	
	      public  boolean  supports(Class  clazz)  {
	            return  Customer.class.isAssignableFrom(clazz);
	      }
	      public  void  validate(Object  target,  Errors  errors)  {
	            ValidationUtils.rejectIfEmptyOrWhitespace(errors,  "firstName",  "field.required");
	            ValidationUtils.rejectIfEmptyOrWhitespace(errors,  "surname",  "field.required");
	            Customer  customer  =  (Customer)  target;
	            try  {
	                    errors.pushNestedPath("address");
	                    ValidationUtils.invokeValidator(this.addressValidator,  customer.getAddress(),  errors);
	            }  finally  {
	                    errors.popNestedPath();
	            }
	      }
	}