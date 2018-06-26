package device_management;

import Behaviours.IInput;

public class Mouse implements IInput {

    private String type;
    private int buttons;

    public Mouse(String type, int buttons){
        this.type = type;
        this.buttons = buttons;
    }

    public String getType() {
        return type;
    }

    public int getButtons() {
        return buttons;
    }

    public String move(String direction){
        return "The Mouse is moved: " + direction;
    }

    public String click(){
        return "The Mouse clicked the button";
    }

    public String sendData(){
        return "The Mouse did something.";
    }
}
