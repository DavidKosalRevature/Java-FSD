var Book = /** @class */ (function () {
    function Book() {
    }
    Book.prototype.getBookInfo = function () {
        console.log("Book: Title=" + this.title + ", Author=" + this.author + ", Price=" + this.price);
    };
    return Book;
}());
var book1 = new Book();
book1.title = 'Title 1';
book1.author = 'Author 1';
book1.price = 1000;
var book2 = new Book();
book2.title = 'Title 2';
book2.author = 'Author 2';
book2.price = 2000;
book1.getBookInfo();
book2.getBookInfo();
