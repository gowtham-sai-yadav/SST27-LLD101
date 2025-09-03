package exercise;

public class EmployeeLDAPAdaptor implements Employee {
  private final EmployeeLDAP employeeLDAP;

  public EmployeeLDAPAdaptor(EmployeeLDAP employeeLDAP) {
    this.employeeLDAP = employeeLDAP;
  }

  @Override
  public String getId() {
    return employeeLDAP.get("uid");
  }

  @Override
  public String getFirstName() {
    return employeeLDAP.get("givenName");
  }

  @Override
  public String getLastName() {
    return employeeLDAP.get("sn");
  }

  @Override
  public String getEmail() {
    return employeeLDAP.get("mail");
  }
}