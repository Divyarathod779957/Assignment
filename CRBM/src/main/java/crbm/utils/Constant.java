package crbm.utils;

public interface Constant {
    // Data base
    String DRIVER_NAME = "com.mysql.jdbc.Driver";
    String DB_URL = "jdbc:mysql://localhost:3306/crbm";
    String DB_USER_NAME = "root";
    String DB_PASS = "root";

    String USER_NAME = "01";
    String PASSWORD = "01";

    // FONT
    String FONT = "Helvetica";

    // Generic Action  Labels
    String LOGIN = "Login";
    String LOGOUT = "Logout";
    String BACK = "Back";
    String DELETE = "Delete";

    String TITLE = "College CreateRoom Booking Management";
    // Action Labels
    String MANAGER_LOGIN = "Manager Login";
    String MANAGER_MENU = "Menu";
    String ADD_CLERK = "Add ClerkLogin";
    String VIEW_CLERK = "View Clerks";
    String DELETE_CLERK = "Delete ClerkLogin";

    String CLERK_LOGIN = "ClerkLogin Login";
    String ADD_ROOM = "Add CreateRoom";
    String VIEW_ALL_ROOMS = "View All Rooms";
    String BOOK_ROME = "Book CreateRoom";
    String VIEW_BOOKINGS = "View Bookings";
    String VIEW_HISTORY_BOOKINGS= "View History Bookings";
    String CANCEL_BOOKINGS= "Cancel Bookings";

    // Input labels
    String ENTER_NAME = "Enter Name:";
    String ENTER_PASS = "Enter Password:";
    String ENTER_ID = "Enter Id:";
    String NAME = "Name:";
    String PASS = "Password:";
    String EMAIL = "Email:";
    String ADDRESS = "Address:";
    String CITY = "City:";
    String CONTACT_NO = "Contact No:";
    String ROOM_NO = "CreateRoom No:";
    String CAPACITY = "Capacity:";
    String ROOM_TYPE = "CreateRoom Type:";
    String AVAILABLE_START_DATE = "Available Start Date:";
    String AVAILABLE_END_DATE= "Available End Date:";
    String AVAILABLE_FOR = "Available For:";
    String IS_AVAILABLE = "Is Available:";
    String CANCEL_BOOKING = "Cancel Booking";
    String BOOKING_ID = "Booking Id:";
    String BOOKED_BY = "Booked By:";
    String BOOKED_GUEST_ID = "Booked Guest Id:";
    String BOOKED_GUEST_ADDRESS = "Booked Guest Address:";
    String BOOKED_GUEST_CONTACT = "Booked Guest Contact :";
    String BOOKED_FOR = "Booked For:";
    String FROM = "From:";
    String TO = "To:";
    String REASON = "Reason:";


    // Alert Msg
    String LOGIN_INVALID = "Sorry, Username or Password Error";
    String ID_NOT_NULL = "Id can't be blank";
    String CLERK_DELETE_SUCCESS = "ClerkLogin deleted successfully!";
    String UNABLE_TO_DELETE = "Unable to delete given id!";
    String CLERK_SUCCESS = "ClerkLogin added successfully!";
    String UNABLE_SAVE = "Sorry, unable to save!";
    String ROOM_ADDED = "Rooms added successfully!";
    String BOOKING_CANCEL_SUCCESS = "Booking Canceled successfully!";
    String SORRY_UNABLE_TO_CANCEL = "Sorry, unable to Cancel booking!";


    // Alert TITLE
    String LOGIN_ERROR = "Login Error!";
    String UNABLE_RO_BOOK_ROOM = "Sorry, unable to Book CreateRoom!" ;
    String ROOM_SUCCESS = "CreateRoom Booked successfully!";
    String OVER_LAP_BOOK_ROOM = "Booking not allowed for selected Start date!" ;
    // NOTE
    String BEFORE_CANCEL = "Note: Please check before canceling booking!";
    String CHECK_GUEST = "Note: Check Guest id Carefully before booking CreateRoom!!";
    String PLS_ADD_ROOMS= "Please add Rooms!";

}
