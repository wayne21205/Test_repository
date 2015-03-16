package test_2014_8_29;

import java.util.EnumSet;


public class MultiEnumType {

	public static enum MODAL_BUTTONS {
		SAVE, UPDATE, CANCEL, DELETE
	}

	public static enum MODAL_SETTINGS {

		NEW_MODAL_WINDOW(EnumSet.of(MODAL_BUTTONS.SAVE, MODAL_BUTTONS.UPDATE,
				MODAL_BUTTONS.CANCEL)), 
		EDIT_MODAL_WINDOW(EnumSet.of(
				MODAL_BUTTONS.UPDATE, MODAL_BUTTONS.CANCEL)), 
		DELETE_MODAL_WINDOW(EnumSet.of(MODAL_BUTTONS.CANCEL, MODAL_BUTTONS.DELETE));

		/*
		 *  The description type in Enum (This case, I use the type of EnumSet<MODAL_BUTTONS> ) 
		 */
		private EnumSet<MODAL_BUTTONS> buttons;

		
		MODAL_SETTINGS(EnumSet<MODAL_BUTTONS> buttons) {
			this.buttons = buttons;
		}

		
		EnumSet<MODAL_BUTTONS> getBtns() {
			return this.buttons;
		}
		
		/*
		 * Overriding toString() will let the result of 'print MODAL_SETTINGS.xxx' turn into EnumSet  
		 * 
		 * (non-Javadoc)
		 * @see java.lang.Enum#toString()
		 */
		@Override
		public String toString() {
			return buttons.toString();
		}
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String... args) {
    	
        System.out.println(MODAL_SETTINGS.NEW_MODAL_WINDOW.getBtns()); //[SAVE, UPDATE, CANCEL]
        
        //If Not override toString()
        System.out.println(MODAL_SETTINGS.NEW_MODAL_WINDOW);  //NEW_MODAL_WINDOW
        //If override toString()
        System.out.println(MODAL_SETTINGS.NEW_MODAL_WINDOW);  //[SAVE, UPDATE, CANCEL]
        
        System.out.println(MODAL_SETTINGS.EDIT_MODAL_WINDOW.getBtns()); //[UPDATE, CANCEL]
        System.out.println(MODAL_SETTINGS.DELETE_MODAL_WINDOW.getBtns()); //[CANCEL, DELETE]
   }

}
