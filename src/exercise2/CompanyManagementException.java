package exercise2;

public class CompanyManagementException extends Exception {
    public static final String REMOVE_EMPLOYEE = "REMOVE_EMPLOYEE";

    private String message;

    public CompanyManagementException(String code) {
        switch (code) {
            case REMOVE_EMPLOYEE:
                this.message = "Cannot remove an employee who does not exist";
                break;
            default:
                this.message = "Unknown error!";
        }
    }

    @Override
    public String getMessage() {
        return message;
    }
}
