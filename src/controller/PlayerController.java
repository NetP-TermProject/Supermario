package controller;
import java.awt.event.KeyEvent;

public class PlayerController implements Controller {

	private boolean upPressed, downPressed, leftPressed, rightPressed;
	private boolean spacePressed;
	private boolean isControllerOn = true;
	
	@Override
	public void initKey() {
		this.upPressed = false;
		this.downPressed = false;
		this.leftPressed = false;
		this.rightPressed = false;
		this.spacePressed = false;
	}
	
	@Override
	public void setControllerOn(boolean isControllerOn) {
		this.isControllerOn = isControllerOn;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_W) {
			upPressed = true;
		}
		if(code == KeyEvent.VK_S) {
			downPressed = true;
		}
		if(code == KeyEvent.VK_A) {
			leftPressed = true;
		}
		if(code == KeyEvent.VK_D) {
			rightPressed = true;
		}
		if(code == KeyEvent.VK_SPACE) {
			spacePressed = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_W) {
			upPressed = false;
		}
		if(code == KeyEvent.VK_S) {
			downPressed = false;
		}
		if(code == KeyEvent.VK_A) {
			leftPressed = false;
		}
		if(code == KeyEvent.VK_D) {
			rightPressed = false;
		}
		if(code == KeyEvent.VK_SPACE) {
			spacePressed = false;
		}
	}

	@Override
	public boolean getUpPressed() {
		return upPressed;
	}

	@Override
	public boolean getDownPressed() {
		return downPressed;
	}

	@Override
	public boolean getLeftPressed() {
		return leftPressed;
	}

	@Override
	public boolean getRightPressed() {
		return rightPressed;
	}

	@Override
	public boolean getSpacePressed() {
		return spacePressed;
	}

}
