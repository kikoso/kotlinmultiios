package co.touchlab.kurgan.architecture.database.sqlite.plain

expect abstract class SQLiteProgram{
    fun bindNull(index:Int)
    fun bindLong(index:Int, value:Long)
    fun bindDouble(index:Int, value:Double)
    fun bindString(index:Int, value:String)
    fun bindBlob(index:Int, value:ByteArray)
    fun clearBindings()
    fun bindAllArgsAsStrings(bindArgs:Array<String>)
}

expect abstract class SQLiteClosable{
    fun close()
}