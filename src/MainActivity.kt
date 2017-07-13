import javax.imageio.ImageIO
import javax.swing.*
import java.awt.*
import java.io.File
import java.io.IOException

class MainActivity {
    private fun gir() {
        val j = JFrame("Gir")

        val gir = JLabel(ImageIcon("gir.gif"))
        try {
            j.iconImage = ImageIO.read(File("iGir.png"))
        } catch (exc: IOException) {
            exc.printStackTrace()
        }
        println("something") 
        j.add(gir)

        j.setSize(240, 200)
        val x = GraphicsEnvironment.getLocalGraphicsEnvironment().maximumWindowBounds.getHeight() - j.height
        val height = x.toInt()

        j.setLocation(0, height)
        j.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        j.isUndecorated = true
        j.background = Color(1.0f, 1.0f, 1.0f, 0.0f)
        j.isAlwaysOnTop = true
        // make the frame visible (activate the GUI frame)
        j.isVisible = true
    }

    companion object {

        @JvmStatic fun main(args: Array<String>) {

            val x = MainActivity()
            x.gir()
        }
    }
}
