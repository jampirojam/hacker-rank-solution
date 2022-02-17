select roll_number, name from student_information s inner join faculty_information f on s.advisor=f.employee_id where(f.gender='M' and f.salary>15000) or (f.gender='F' and f.salary>20000);
