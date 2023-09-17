package com.example.dz18

class PresenterImpl : Presenter {
    private var myVIew: View? = null
    private var model: Model = ModelImpl
    override fun generateCountNumber() {
        model.setCount()
        myVIew?.updateCount(model.getCount())
    }

    override fun setView(view: View) {
        myVIew = view
        view.updateCount(model.getCount())
    }
}