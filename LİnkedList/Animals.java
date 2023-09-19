package LİnkedList;

public class Animals {
   private String habitat;
   private String species;
   private String nutrition;
   private double lifeTime;
   private double lowTemp;
   private double maxTemp;
   private int piece;
   private String descriptor;
   
   public Animals(String habitat,String species,String nutrition
		          ,double lifeTime,double lowTemp,double maxTemp,int piece,
		          String descriptor)
   {
	this.habitat=habitat; 
	this.species=species; 
	this.nutrition=nutrition; 
	this.lifeTime=lifeTime; 
	this.lowTemp=lowTemp; 
	this.maxTemp=maxTemp; 
	this.piece=piece; 
	this.descriptor=descriptor; 
   }
   
   
   
public String getHabitat() {
	return habitat;
}
public void setHabitat(String habitat) {
	this.habitat = habitat;
}
public String getSpecies() {
	return species;
}
public void setSpecies(String species) {
	this.species = species;
}
public String getNutrition() {
	return nutrition;
}
public void setNutrition(String nutrition) {
	this.nutrition = nutrition;
}
public double getLifeTime() {
	return lifeTime;
}
public void setLifeTime(int lifeTime) {
	this.lifeTime = lifeTime;
}
public double getLowTemp() {
	return lowTemp;
}
public void setLowTemp(int lowTemp) {
	this.lowTemp = lowTemp;
}
public double getMaxTemp() {
	return maxTemp;
}
public void setMaxTemp(int maxTemp) {
	this.maxTemp = maxTemp;
}
public int getPiece() {
	return piece;
}
public void setPiece(int piece) {
	this.piece = piece;
}
public String getHistory() {
	return descriptor;
}
public void setHistory(String descriptor) {
	this.descriptor = descriptor;
}

   @Override
	public String toString() {
		return "HABITAT:"+habitat+"\n"+"SPECIES:"+species+"\n"+"NUTRITION:"+nutrition+"\n"+
	           "LIFE TIME:"+lifeTime+"\n"+"TEMPERATURE RANGE:"+lowTemp+" - "+maxTemp+"\n"+"PIECE:"+piece
	           +"\n"+"DESCRIPTOR:"+descriptor;
	}
}
