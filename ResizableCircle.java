class ResizableCircle extends Circle implements Resizable{
ResizableCircle(){
		//super(r);
        }	
ResizableCircle(double r){
		super(r);
        } 
      

	public void resize(int p){
		
		System.out.println("percent is="+p*1.2);
	}
}