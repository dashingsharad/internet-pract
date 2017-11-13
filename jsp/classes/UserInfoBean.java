package c3;

public class UserInfoBean
 {
   private String username;
   private String dob;
   private String emailadd;
   private String gender;
   private int lucky;
   private String[] food;
  
   
   private boolean usernameValid;
   private boolean dobValid;
   private boolean emailaddValid;
   private boolean genderValid;
   private boolean luckyValid;
   private boolean foodValid;
   private boolean valid;
   private boolean pizzaSelected;	  
   private boolean pastaSelected;
   private boolean chineseSelected;
   
   public UserInfoBean()
	{
		username=dob=emailadd=gender=null;
		lucky=0;
		luckyValid=usernameValid=dobValid=emailaddValid=genderValid=foodValid=valid=pizzaSelected=pastaSelected=chineseSelected=false;
		
		
	}

   private boolean isFoodTypeSelected(String f)
	{
		if(food==null)
		{
		       return false;
		}
		
		 	boolean  selected=false;
			for(int i=0;i<food.length;i++)
			 {
				if(food[i].equals(f))
				 {
					selected=true;
					break;
				 }
			 }
			return selected;
		 
	}

   public boolean isPizzaSelected()
	{
		if(isFoodTypeSelected("z"))
		  pizzaSelected=true;
		else
		  pizzaSelected=false;

		return pizzaSelected;
	}


    public boolean isPastaSelected()
	{
		if(isFoodTypeSelected("p"))
		  pastaSelected=true;
		else
		  pastaSelected=false;

		return pastaSelected;
	}


     public boolean isChineseSelected()
	{
		if(isFoodTypeSelected("c"))
		  chineseSelected=true;
		else
		  chineseSelected=false;

		return chineseSelected;
	}

   public void setUsername(String s)
	{
		username=s;
	}

   public String getUsername()
	{
		return(username);
	}

   public void setDob(String s)
	{
		dob=s;
	}

   public String getDob()
	{
		return(dob);
	}

   public void setEmailadd(String s)
	{
		emailadd=s;
	}

   public String getEmailadd()
	{
		return(emailadd);
	}

   public void setGender(String s)
	{
		gender=s;
	}

   public String getGender()
	{
		return(gender);
	}

   public void setLucky(int s)
	{
		lucky=s;
	}

   public int getLucky()	{
		return(lucky);
	}

   public void setFood(String[] f)
	{
		food=new String[f.length];
		/*for(int i=0;i<f.length;i++)
		 {
			food[i]=f[i];
		 }*/
		System.arraycopy(f,0,food,0,f.length);
	}

   public String[] getFood()
	{
		return(food);
	}

   public boolean isUsernameValid()
	{
		if(username==null)
	   	  usernameValid=false;
		else
		  usernameValid=true;

	  	return usernameValid;
	}

   public boolean isDobValid()
	{
		if(dob==null)
	   	  dobValid=false;
		else
		  dobValid=true;

	  	return dobValid;
	}

   public boolean isEmailaddValid()
	{
		if(emailadd==null)
	   	  emailaddValid=false;
		else
		  emailaddValid=true;

	  	return emailaddValid;
	}

   public boolean isGenderValid()
	{
		if(!gender.equals("m")&&!gender.equals("f"))
	   	  genderValid=false;
		else
		  genderValid=true;

	  	return genderValid;
	}

   public boolean isLuckyValid()
	{     
               
		
		if(lucky<1||lucky>100)
	   	  luckyValid=false;
		else
		  luckyValid=true;

	  	return luckyValid;
	}

   public boolean isFoodValid()
	{
		if(!isPizzaSelected()&&!isPastaSelected()&&!isChineseSelected())
	   	  foodValid=false;
		else
		  foodValid=true;

	  	return(foodValid);
	}
   public boolean isValid()
	{
		if(isUsernameValid()&&isDobValid()&&isEmailaddValid()&&isGenderValid()&&isLuckyValid()&&isFoodValid())
		  valid=true;
		else
		  valid=false;
		return valid;
	}
 
}
