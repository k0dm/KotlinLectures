package lecture7

import lecture7.streams.Streams
import java.io.BufferedInputStream
import java.io.File
import java.io.InputStream
import java.net.URL

object Main {

    const val URL = "https://samplelib.com/lib/preview/mp4/sample-5s.mp4"

    @JvmStatic
    fun main(args: Array<String>) {
        BufferedInputStream(URL(URL).openStream()).use {
            File("someVideo1.mp4").copyInputStreamToFile(it)
        }

        Streams(
            BufferedInputStream(URL(URL).openStream()),
            File("someVideo2.mp4").outputStream()
        ) { inputStream, outputStream ->
            inputStream.copyTo(outputStream)
        }.start()

    }

    private fun File.copyInputStreamToFile(inputStream: InputStream) {
        this.outputStream().use { fileOut ->
            inputStream.copyTo(fileOut)
        }
    }
}