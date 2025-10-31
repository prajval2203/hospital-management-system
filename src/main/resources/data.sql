INSERT INTO patient (name, gender, birth_Date, email, blood_group)
VALUES
    ('Arav Sharma', 'Male', '1998-03-27', 'aravsharmla04@gmail.com', 'AB_POSITIVE'),
    ('Tejas Katke', 'Male','2002-10-02', 'tejaskatke02@gmail.com', 'O_POSITIVE'),
    ('Prajval Gaikwad', 'Male','2003-06-12', 'prajvalgaikwad@gmail.com', 'A_NEGATIVE'),
    ('Aditi Bhagat', 'Female','2003-10-04', 'aditibhagat04@gmail.com', 'AB_POSITIVE'),
    ('Dhiraj Shinde', 'Male', '2001-01-22', 'dhirajshinde22@gmail.com', 'O_NEGATIVE');


INSERT INTO doctor (name, specialization, email)
VALUES
('Dr. Raskesh Mehta', 'Cardiology', 'rakeshmehta899@gmail.com'),
('Dr. Sneha Kapoor', 'Oncology', 'sneha533@gmail.com'),
('Dr. Arjun Nair', 'Dermatology', 'arjunnair226357@gmail.com');


INSERT INTO appointment (appointment_time, reason, doctor_id, patient_id)
VALUES
  ('2025-07-01 10:30:00', 'General Checkup', 1, 2),
  ('2025-07-02 11:00:00', 'Skin Rash', 2, 2),
  ('2025-07-03 09:45:00', 'Knee Pain', 3, 3),
  ('2025-07-04 14:00:00', 'Follow-up Visit', 1, 1),
  ('2025-07-05 16:15:00', 'Consultation', 1, 4),
  ('2025-07-06 08:30:00', 'Allergy Treatment', 2, 5);