class MyClass {
  var initialized=1
  var stringRepresentation: String
  get() = this.toString()
  Set(value){
    setDataFromString(value)
  }
  var setterVisibility: String = "abc"
    private set

  var setterWithAnnotation: Any?
    @Inject set

  val simple: Int?
  val inferredType = 1
  val isEmpty: Boolean
    get() = this.size == 0

  var counter=0
    set(value){
      if(value >= 0)
        field = value
   }
}
