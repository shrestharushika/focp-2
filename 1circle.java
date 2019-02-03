class Circle implements GeometricObject{
	double r=1.0;
	Circle(double rr){
	    r=rr;
}
        public double getPerimeter(){
		return 2*3.14*r;
	}
        public double getarea(){
		return 2*3.14*r*r;
		}
  }