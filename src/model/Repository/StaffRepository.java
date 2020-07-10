package model.Repository;

import model.Staff;
import model.UserDetails;

import java.io.IOException;
import java.util.Set;

public interface StaffRepository {


        void addStaff(Staff staff) throws Exception ;

        void deleteStaff(int id) throws Exception;

        void editStaff(Staff staff) throws Exception;

        void editStaffUserDetails(int staffID, UserDetails userDetails) throws Exception;

        Staff getStaffByID(int id);

        Set<Staff> getAllStaff();

        boolean isExist(int id);

        Staff getStaffByUserName(String userName)throws Exception;


        //edit



    }

