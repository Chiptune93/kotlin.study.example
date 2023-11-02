package `Part6-NPE`

import FileContentProcessor
import java.io.File

class FileIndexer : FileContentProcessor {
    // 단순이 내용 표기 이므로 내용은 널이 될 수 있지만 파일은 널이 될 수 없음.
    // 파일의 각 줄은 널일 수 없으므로 리스트의 원소는 널이 될 수 없다.
    override fun processContents(path: File, binaryContents: ByteArray?, textContents: List<String>?) {
        TODO("Not yet implemented")
    }
}
