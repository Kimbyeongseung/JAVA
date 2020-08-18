
public class Room {
	int eventType;  //0 없음  1 이동 이벤트  2 출발지로 
	//3 지도 늘이기   
	int value;
	
	public Room(int eventType, int value) {		
		this.eventType = eventType;
		this.value = value;
	}
	
}
