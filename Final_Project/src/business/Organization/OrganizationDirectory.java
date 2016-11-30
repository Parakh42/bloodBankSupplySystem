/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import java.util.ArrayList;
import business.Organization.Organization.Type;

/**
 *
 * @author PARAKH MAHAJAN
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Donor.getValue())){
            organization = new DonorOrganization();
            organizationList.add(organization);
        }
//        else if (type.getValue().equals(Type.Reception.getValue())){
//            organization = new ReceptionOrganization();
//            organizationList.add(organization);
//        }
//        else if (type.getValue().equals(Type.Reception.getValue())){
//            organization = new ReceptionOrganization();
//            organizationList.add(organization);
//        }
        
        return organization;
    }
    
}
