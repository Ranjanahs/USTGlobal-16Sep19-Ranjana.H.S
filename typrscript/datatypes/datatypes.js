var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var myname = "ranjana";
console.log(myname, typeof myname);
var age;
console.log(age, typeof age);
var mobileno = 123445566;
console.log(mobileno, typeof mobileno);
var address;
console.log(address, typeof address);
var addr;
addr = "asdfg";
addr = 890;
console.log(addr, typeof addr);
console.log(".......functions...........");
var a = function () {
    console.log("age is:26");
};
a();
console.log("...........constructor............");
var person = /** @class */ (function () {
    function person(name, age) {
        this.name = name;
        this.age = age;
    }
    return person;
}());
var per1 = new person('Ranjana', 22);
console.log(per1);
console.log("............inheritance...........");
var student = /** @class */ (function (_super) {
    __extends(student, _super);
    function student(name, age, rollno) {
        var _this = _super.call(this, name, age) || this;
        _this.rollno = rollno;
        return _this;
    }
    return student;
}(person));
var stu1 = new student("tms", 22, 4);
console.log(stu1);
