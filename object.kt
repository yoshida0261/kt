
fun countClicks(window: JComponent){
  var clickCount =0
  var enterCount =0

  window.addMouseListener(object : MouseAdapter(){
    override fun mouseClick(e: MouseEvent){
    
      clickCount++
    }
    override fun mouseEnterred(e: MouseEvent){
       enterCount++
    }
  })
}


fun main(args : Array<String>){
    
}
