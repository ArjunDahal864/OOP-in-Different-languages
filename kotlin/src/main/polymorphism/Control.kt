package main.polymorphism

abstract class Control {
    fun click(){
        println("clicked")
    }

    abstract fun draw()
}