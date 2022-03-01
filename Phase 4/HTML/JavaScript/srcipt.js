function Student(name, designation, yearOfBirth) {
  this.name = name;
  this.designation = designation;
  this.yearOfBirth = yearOfBirth;
}

Student.prototype.calculateAge = function () {
  console.log("The Current age is:" + (2022 - this.yearOfBirth));
};
console.log(Student.prototype);

let Student1 = new Student("Raj", "React Developer", 1998);
console.log(Student1);
Student1.calculateAge();

let Student2 = new Student("Akshay", "Backend Developer", 1999);
console.log(Student2);
Student2.calculateAge();

let Student3 = new Student("Guru", "Node Js", 1999);
console.log(Student3);
Student3.calculateAge();

let Student4 = new Student("Nikita", "MongoDB", 1998);
console.log(Student4);
Student4.calculateAge();
