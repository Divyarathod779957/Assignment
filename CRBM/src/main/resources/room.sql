-- --------------------------------------------------------
--
-- Table structure for table `crbm.room`
--
--------------------------------------------------------
CREATE TABLE crbm.room (
      room_id varchar(10) PRIMARY KEY,
      name varchar(100) NOT NULL,
      capacity bigint NOT NULL,
      room_type varchar(100) NOT NULL,
      available_from TIMESTAMP NOT NULL,
      available_to TIMESTAMP NOT NULL,
      available_for  varchar(100) NOT NULL,
      is_available boolean DEFAULT true
  );
ALTER TABLE ONLY crbm.room ADD CONSTRAINT x1room UNIQUE (room_id);

-- --------------------------------------------------------
--
-- Dumping data for table rooms
--
--------------------------------------------------------
INSERT INTO crbm.room (room_id, name, capacity, room_type, available_from, available_to, available_for, is_available) VALUES
(101, 'Class CreateRoom', 30, 'class', '2020-05-16 10:00:00', '2020-05-17 20:00:00', 'Weekends', true),
(102, 'Sports', 200, 'auditorium','2020-05-16 10:00:00', '2020-05-17 20:00:00', 'Weekends', true),
(103, 'dining hall', 200, 'cafeteria','2020-05-16 10:00:00', '2020-05-17 20:00:00', 'Weekends', true);
--
-- --------------------------------------------------------