package AssigmentCarpets;

public class RoomCarpet {
	public double area;
	public double carpetCost
	public double totalCost;
	
	public void Carpet() {
		RoomDimension Obj = new RoomDimension();
		area = Obj.getArea();
	}
	public double getTotalCost(double cost,double area) {
		totalCost=cost*area;
		return totalCost;
	}
	
	public String toString() {
		return "RoomCarpet [area=" + area + ", Carpet Cost=" + carpetCost + ", total Cost=" + totalCost + "]";
	}

}
