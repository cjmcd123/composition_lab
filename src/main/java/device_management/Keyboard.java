package device_management;

import Behaviours.IInput;

public class Keyboard implements IInput {

    private String type;
    private boolean numPad;

    public Keyboard(String type, boolean numPad){
        this.type = type;
        this.numPad = numPad;
    }

    public String getType() {
        return type;
    }

    public boolean isNumPad() {
        return numPad;
    }

    public String type(String data){
        return "You typed '" + data + "' into the keyboard.";
    }

    public String sendData(){
        return "Sending Data from keyboard... .. .";
    }
}
