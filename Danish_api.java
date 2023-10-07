organization, 
fb or google,
roles : ceo , manager, 
on user table 

@RestConttroller
public class RolesController{

private final Role ceo = new Role ("CEO");
private final Role Manager = new Role ("Manager");
private final Role teamLead = new Role("Team Lead");

public RolesController{
ceo.addViewabaleRole(manager);
ceo.addViewabaleRole(teamlead);
manager.addViewabaleRole(teamLead);

}

@GetMapping ("/viewableRoles")

public List<Role> getViewableRoles (@RequestParam String role){

switch(role){
case "CEO":
return ceo.getViewableRoles;
case "Manager":
return manager.getViewableRoles;
case "Teamlead":
return teamlead.getViewableRoles;
default:

return new ArrayList<>();

}
}

}

