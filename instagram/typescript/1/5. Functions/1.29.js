var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Listing1_29;
(function (Listing1_29) {
    var HandlerFactory = (function () {
        function HandlerFactory() {
        }
        // getHandler(type: 'Random'): RandomHandler;
        // getHandler(type: 'Reversed'): ReversedHandler;
        //  getHandler(type: string): Handler; // non-specialized signature
        HandlerFactory.prototype.getHandler = function (type) {
            switch (type) {
                case 'Random':
                    return new RandomHandler();
                case 'Reversed':
                    return new ReversedHandler();
                default:
                    return new Handler();
            }
        };
        return HandlerFactory;
    }());
    var Handler = (function () {
        function Handler() {
        }
        Handler.prototype.handle = function () {
            console.log('Handled!');
        };
        return Handler;
    }());
    var ReversedHandler = (function (_super) {
        __extends(ReversedHandler, _super);
        function ReversedHandler() {
            return _super !== null && _super.apply(this, arguments) || this;
        }
        ReversedHandler.prototype.handle = function () {
            console.log('!deldnaH');
        };
        return ReversedHandler;
    }(Handler));
    var RandomHandler = (function (_super) {
        __extends(RandomHandler, _super);
        function RandomHandler() {
            return _super !== null && _super.apply(this, arguments) || this;
        }
        RandomHandler.prototype.handle = function () {
            console.log('daH!denl');
        };
        return RandomHandler;
    }(Handler));
    console.log(new HandlerFactory().getHandler("Random"));
})(Listing1_29 || (Listing1_29 = {}));
