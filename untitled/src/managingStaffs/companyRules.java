package managingStaffs;

public class companyRules {
    public static final int MAX_STAFF_COUNT = 50;
    public static enum KindsOfEmploy  {FULLTIME, CONTRACT}

    public static void   showProcedures(){
        System.out.println("Company members count is limit is " + MAX_STAFF_COUNT);
    }
}
