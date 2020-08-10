public boolean equals(Object x){
	if (this == x){return true;}
	if (this == null){return true;}
	if (this.getClass() != x.getClass()){return false;}
	Date that = (Date) x;
	if(this.day != that.day){return false};
	return true;
}