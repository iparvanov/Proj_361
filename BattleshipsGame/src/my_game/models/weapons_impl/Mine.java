package my_game.models.weapons_impl;

import my_game.models.game_components.GameObject;
import my_game.models.game_components.Ship.ShipDirection;
import my_game.util.Vector2;

public class Mine extends GameObject {
	
	int amount;
	
	public Vector2[] getMineZone(Vector2 pos, ShipDirection direction) {
		int x = pos.x;
		int y = pos.y;
		Vector2[] range = new Vector2[6];
		
		if (direction == ShipDirection.North || direction == ShipDirection.East){
			if (direction == ShipDirection.North){
				x = pos.y;
				y = pos.x;
			}
			
			range[0] = new Vector2(x-1, y-1) ;
			range[1] = new Vector2(x, y-1) ;
			range[2] = new Vector2(x-2, y) ;
			range[3] = new Vector2(x+1, y) ;
			range[4] = new Vector2(x-1, y+1) ;
			range[5] = new Vector2(x, y+1) ;
		}
		else{
			if (direction == ShipDirection.South){
				x = pos.y;
				y = pos.x;
			}
			
			range[0] = new Vector2(x+1, y-1) ;
			range[1] = new Vector2(x, y-1) ;
			range[2] = new Vector2(x+2, y) ;
			range[3] = new Vector2(x-1, y) ;
			range[4] = new Vector2(x+1, y+1) ;
			range[5] = new Vector2(x, y+1) ;
		}
		return range;
	}

	public Mine() {
		super();
		this.amount = 5;
	}

	public int getAmount() {
		return amount;
	}

	public void increaseAmount() {
		amount++;
	}
	
	public void decreaseAmount() {
		amount--;
	}
}