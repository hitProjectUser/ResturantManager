package model;

import java.io.Serializable;
import java.time.LocalDate;


public abstract class Staff extends Person implements Serializable {
    private UserDetails userDetails;
    private BankDetails bankDetails;
    private static final long serialVersionUID = 1L;


    public Staff(Integer personId, String firstName, String lastName, LocalDate birthDate, Address address, UserDetails userDetails, BankDetails bankDetails,String mailAddress) {
        super(personId, firstName, lastName, birthDate, address,mailAddress);
        this.userDetails = userDetails;
        this.bankDetails = bankDetails;
    }

    public Staff(Integer personId, String userName, String password, Role role) {
        super(personId);
        this.userDetails = new UserDetails(userName, password, role);
    }

    public abstract double getWage();

    public void setBankDetails(BankDetails bankDetails) {
        this.bankDetails = bankDetails;
    }

    public Staff(Integer id) {
        super(id);
    }

    public Staff() {
        super();
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public Role getRole() {
        return userDetails.getRole();
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public BankDetails getBankDetails() {
        return bankDetails;
    }

    public boolean isManager() {

        return userDetails.getRole().equals(Role.manager);

    }
    public boolean isMinorWorker() {

        return userDetails.getRole().equals(Role.minorWorker);

    }


    public boolean isShiftManager() {

        return userDetails.getRole().equals(Role.shiftManager);

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + getPersonId();
        return result;
    }

    public boolean isPasswordCorrect(String curPassword) {
        UserDetails userDetails = this.getUserDetails();
        String password = userDetails.getPassword();

        if (curPassword.equals(password))
            return true;

        return false;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        // if (getClass() != obj.getClass())
       //     return false;
        Staff other = (Staff) obj;
        if (getPersonId() != other.getPersonId())
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[id=" + this.getPersonId() + ", first name=" + this.getFirstName() + ", last name =" + this.getLastName() + ", mail =" + this.getMailAddress()+"]";

    }
}
