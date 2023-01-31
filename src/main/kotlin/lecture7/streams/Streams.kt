package lecture7.streams

import java.io.InputStream
import java.io.OutputStream

class Streams(
    private val inStream: InputStream,
    private val outStream: OutputStream,
    private val streamHandler: (InputStream, OutputStream) -> Unit
) {

    fun start() {
        inStream.use {
            outStream.use {
                streamHandler.invoke(inStream, outStream)
            }
        }
    }

}