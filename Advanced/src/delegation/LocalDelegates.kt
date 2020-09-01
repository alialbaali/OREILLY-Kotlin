package delegation

/*'lazy' is a local delegate used for properties, which used to initialize first time it's accessed
* (so it initiated when we need it and call it)
* they don't have a backingField or initialization section, that's why we use a getter */

fun localDelegatedProperties() {


    val lazy by lazy { initiate() }


}

fun initiate(): String {
    return "Value"
}
