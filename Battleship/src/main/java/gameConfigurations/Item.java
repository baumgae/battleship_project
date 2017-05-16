package gameConfigurations;

public interface Item {
	
	public boolean isHidden(boolean hide);
	public int getScore();
	public boolean isDestroyed(boolean destroy);
	public int getID();
	
	//public String getIcon();
		
}
