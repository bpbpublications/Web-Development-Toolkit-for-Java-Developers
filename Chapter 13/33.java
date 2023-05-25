public  class  EmailBean  implements  ApplicationContextAware  {
	        private  List  blackList;
        	private  ApplicationContext  ctx;
	        public  void  setBlackList(List  blackList)  {
	                this.blackList  =  blackList;
	        }
	        public  void  setApplicationContext(ApplicationContext  ctx)  {
	                this.ctx  =  ctx;
	        }
	        public  void  sendEmail(String  address,  String  text)  {
	                if  (blackList.contains(address))  {
	                        BlackListEvent  evt  =  new  BlackListEvent(address,  text);
	                        ctx.publishEvent(evt);
	                        return;
	                }
	                //  send  email...
	        }
	}
	public  class  BlackListNotifier  implements  ApplicationListener  {
	        private  String  notificationAddress;
	        public  void  setNotificationAddress(String  notificationAddress)  {
	                this.notificationAddress  =  notificationAddress;
	        }
	        public  void  onApplicationEvent(ApplicationEvent  evt)  {
	                if  (evt  instanceof  BlackListEvent)  {
	                        //  notify  appropriate  person...
	                }
	        }
	}