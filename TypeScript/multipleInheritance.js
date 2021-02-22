var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var A = /** @class */ (function () {
    function A(a) {
        this.a = a;
    }
    A.prototype.methoda = function () {
        console.log("This method is from class A and the value of a is " + this.a);
    };
    return A;
}());
var B = /** @class */ (function (_super) {
    __extends(B, _super);
    function B(a, b) {
        var _this = _super.call(this, a) || this;
        _this.b = b;
        return _this;
    }
    B.prototype.methodb = function () {
        console.log("This method is from class B and the value of b is " + this.b);
    };
    return B;
}(A));
var C = /** @class */ (function (_super) {
    __extends(C, _super);
    function C(name, a, b) {
        var _this = _super.call(this, a, b) || this;
        _this.name = name;
        console.log("name is" + _this.name);
        return _this;
    }
    C.prototype.methodc = function () {
        console.log("values send from class C ");
    };
    return C;
}(B));
var x = new C("Prashanth", 10, "Hello World!!");
x.methoda();
x.methodb();
x.methodc();
