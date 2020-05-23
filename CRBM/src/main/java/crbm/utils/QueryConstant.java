package crbm.utils;

public interface QueryConstant {

    String USER_INSERT = "insert into users(name, password, email, address, city, contact) values(?,?,?,?,?,?)";
    String USER_DELETE = "delete from users where id=?";
    String USER_LOGIN_SELECT = "select * from users where name=? and password=?";
    String USER_SELECT = "select * from users";

    String ROOM_INSERT = "insert into room(room_id, name, capacity, room_type, available_from, available_to, available_for, is_available) values(?,?,?,?,?,?,?,?)";
    String ROOM_SELECT_ACTIVE = "select room_id from room where is_available=?";
    String BOOKING_INSERT = "insert into booking(room_id, booked_by, guest_id, guest_address, guest_contact, booked_for, booked_from, booked_to, reason) values(?,?,?,?,?,?,?,?,?)";
    String BOOKING_DELETE = "delete from booking where booking_id=?";

    String ROOM_BOOKING_VALIDATE1 = "select * from booking a,  room b WHERE ? < b.available_to AND a.room_id = ? ";
    String ROOM_BOOKING_VALIDATE2 = "select * from booking WHERE ? < booked_to AND room_id = ? ";

    String ROOM_SELECT = "select * from room ";
    String ROOM_PAST_SELECT = "select * from booking where booked_to <= now()";
    String ROOM_CURRENT_SELECT = "select * from booking where booked_to >= now()";

}
