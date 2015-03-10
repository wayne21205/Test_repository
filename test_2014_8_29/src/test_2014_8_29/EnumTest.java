package test_2014_8_29;

import java.util.EnumSet;


public class EnumTest {

	
public static enum MODAL_BUTTONS {
    SAVE, UPDATE, CANCEL, DELETE
}


public static enum MODAL_SETTINGS {
	
    NEW_MODAL_WINDOW(EnumSet.of(MODAL_BUTTONS.SAVE, MODAL_BUTTONS.UPDATE, MODAL_BUTTONS.CANCEL)),
    EDIT_MODAL_WINDOW(EnumSet.of(MODAL_BUTTONS.UPDATE, MODAL_BUTTONS.CANCEL)),
    DELETE_MODAL_WINDOW(EnumSet.of(MODAL_BUTTONS.CANCEL, MODAL_BUTTONS.DELETE));

    private EnumSet<MODAL_BUTTONS> buttons;
    
    MODAL_SETTINGS(EnumSet<MODAL_BUTTONS> buttons){
        this.buttons = buttons;
    }
    
    EnumSet<MODAL_BUTTONS> getBtns() {
        return this.buttons;
    }
}

	public static void main(String... args) {
    	
    	/** [SAVE, UPDATE]
			[UPDATE, CANCEL]
			[CANCEL, DELETE] */
    	
        System.out.println(MODAL_SETTINGS.NEW_MODAL_WINDOW.getBtns()); //[SAVE, UPDATE, CANCEL]
        System.out.println(MODAL_SETTINGS.NEW_MODAL_WINDOW);  //NEW_MODAL_WINDOW
        System.out.println(MODAL_SETTINGS.EDIT_MODAL_WINDOW.getBtns()); //[UPDATE, CANCEL]
        System.out.println(MODAL_SETTINGS.DELETE_MODAL_WINDOW.getBtns()); //[CANCEL, DELETE]
   }

}
