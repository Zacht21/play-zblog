package controllers;

import play.mvc.With;
import controllers.Secure;

@Check("admin")
@With(Secure.class)
public class Users extends CRUD {    
}