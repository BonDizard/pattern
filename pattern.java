class O
{
	void ooo()
	{
	 for(int i=1;i<=5;i++)
	 {
			 for(int j=1;j<=5;j++)
				{
					if((i==5||j==5||i==1||j==1||(j==(5-i+1))))
						{
						    System.out.print("*");
						    
						}
					else 
					{
					    System.out.print(" ");}
				    }
				
				    System.out.println();
				    
    	}
	}}







class N
{
	void nnn()
	{
	 for(int i=1;i<=5;i++)
	 {
			 for(int j=1;j<=5;j++)
				{
					if((j==i)||(j==1)||(j==5))
						{
						    System.out.print("*");
						    
						}
			     
					    else
					    {
					    System.out.print(" ");}
					    
				    }
				
				    System.out.println();
				    
    	}
	
}
}




class D
{
	void ddd()
	{
	 for(int i=1;i<=5;i++)
	 {
			 for(int j=1;j<=5;j++)
				{
					if(((i==1)&&(j==5))||((j==5)&&(i==5))||((i==2)&&(j==2)||(j==3)||(j==4))||((i==3)&&(j==2)||(j==3)||(j==4))||((i==4)&&(j==2)||(j==3)||(j==4)))
					
						{
						    System.out.print(" ");
						    
						}
			     
					    else
					    {
					    System.out.print("*");}
					    
				    }
				
				    System.out.println();
				    
    	}
	
}
}






class B
{
	void bbb(){
	 for(int i=1;i<=5;i++)
	 {
			 for(int j=1;j<=5;j++)
				{
					if(((i==1)&&(j==5))||((j==5)&&(i==5))||((i==2)&&(j==2)||(j==3)||(j==4))||((i==4)&&(j==2)||(j==3)||(j==4)))
					
						{
						    System.out.print(" ");
						    
						}
			     
					    else
					    {
					    System.out.print("*");}
					    
				    }
				
				    System.out.println();
				    
    	
	}
}
}



class Pattern
{
	public static void main(String[] args)
{
	B b=new B();
	O o=new O();
	N n=new N();
	D d=new D();
	b.bbb();
	System.out.println();
	o.ooo();

	  System.out.println();
	 
	n.nnn();
	System.out.println();
	d.ddd();
	
}
}