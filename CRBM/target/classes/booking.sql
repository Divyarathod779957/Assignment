-- --------------------------------------------------------
--
-- Table structure for table Booking
--
--------------------------------------------------------

CREATE TABLE crbm.booking (
    booking_id int PRIMARY KEY,
    room_id varchar(10) NOT NULL,
    booked_by varchar(100) NOT NULL,
    guest_id varchar(50) NOT NULL,
    guest_address varchar(500) NOT NULL,
    guest_contact varchar(20) NOT NULL,
    booked_for varchar(200) NOT NULL,
    booked_from TIMESTAMP NOT NULL,
    booked_to TIMESTAMP NOT NULL,
    reason varchar(200) NOT NULL,
    FOREIGN KEY(room_id)
       REFERENCES crbm.room(room_id)
  );
--------------------------------------------------------
--
-- Dumping data for table rooms
--
--------------------------------------------------------
INSERT INTO crbm.booking (booking_id, room_id, booked_by, guest_id, guest_address, guest_contact, booked_for, booked_from, booked_to, reason) VALUES
(1001, 101, 'Jon', '984756', 'London', '449937245', 'Weekends college', '2020-05-16 10:00:00', '2020-05-16 10:00:00', 'For college'),
(1002, 102, 'Jon', '984756', 'London', '449937245', 'Weekends college', '2020-05-16 10:00:00', '2020-05-16 10:00:00', 'For college'),
(1003, 103, 'Jon', '984756', 'London', '449937245', 'Weekends college', '2020-05-16 10:00:00', '2020-05-16 10:00:00', 'For college');
--------------------------------------------------------
