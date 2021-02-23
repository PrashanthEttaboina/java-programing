var myAdd = function (x, y) {
    return x + y;
};
console.log(myAdd(10, 20));
function add(x, y) {
    return x + y;
}
console.log("The sum of 10 and 20 is " + add(10, 20));
function disp_details(id, name, mail_id) {
    console.log("ID:", id);
    if (name != undefined)
        console.log("Name", name);
    if (mail_id != undefined)
        console.log("Email Id", mail_id);
}
disp_details(10);
disp_details(123, "Prashanth");
disp_details(111, "Vasanth", "vasanth@gmial.com");
function calculate_discount(price, rate) {
    if (rate === void 0) { rate = 0.50; }
    var discount = price * rate;
    console.log("Discount Amount: ", discount);
}
calculate_discount(1000);
calculate_discount(1000, 0.30);
var foo = function (x) {
    x = 10 + x; // lamda function
    console.log(x);
};
foo(100);
