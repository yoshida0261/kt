object DataProviderManager {
  fun registerDataProvider(provider: DataProvider){
    //...
  }
  val allDataProviders: Collection<DataProvider>
  get()//...
}

class MyClass{
  companion object Factory{
    fun create(): MyClass = MyClass()
  }
}

fun main(args: Array<String>){
  DataProviderManager.registerDataProvider(dataProvider)
  val instance = MyClass.create()

} 
