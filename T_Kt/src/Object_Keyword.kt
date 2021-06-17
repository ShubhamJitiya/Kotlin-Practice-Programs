data class Book(var name: String, var price: Int)

object BookShelf
{
    var books = arrayListOf<Book>()

    fun showBooks()
    {
        for (i in books)
        {
            println(i)
        }
    }
}

fun main() {
    BookShelf.books.add(Book("Java", 50))
    BookShelf.books.add(Book("SQL", 40))
    BookShelf.books.add(Book("Kotlin", 80))
}