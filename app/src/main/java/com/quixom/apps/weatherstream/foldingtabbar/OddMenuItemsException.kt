package client.yalantis.com.foldingtabbar

/**
 * Created by akif on 02/11/17
 */
class OddMenuItemsException : Exception() {
    override val message: String? = """Your menu should have non-odd size ¯\_(ツ)_/¯"""
}