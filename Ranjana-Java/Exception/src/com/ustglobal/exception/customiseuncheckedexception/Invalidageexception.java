package com.ustglobal.exception.customiseuncheckedexception;

public class Invalidageexception extends RuntimeException {
        String message="invalid age below 18years not allowed";
        public Invalidageexception() {
        }
        public Invalidageexception(String message){
        	this.message=message;
        }
        
        @Override
        public String getMessage() {
			return message;
		}
}
