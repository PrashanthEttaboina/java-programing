var Students;
(function (Students) {
    Students[Students["Akhil"] = 0] = "Akhil";
    Students[Students["Ram"] = 1] = "Ram";
    Students[Students["Vishal"] = 2] = "Vishal";
    Students[Students["Prashanth"] = 3] = "Prashanth";
    Students[Students["Poojitha"] = 4] = "Poojitha";
})(Students || (Students = {}));
var c = Students.Vishal;
console.log(c);
console.log(Students[3]);
console.log(Students.Ram);
