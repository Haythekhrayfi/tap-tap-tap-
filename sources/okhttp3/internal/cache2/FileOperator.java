package okhttp3.internal.cache2;

import fd.j0;
import java.io.IOException;
import java.nio.channels.FileChannel;
import qd.c;

/* JADX INFO: loaded from: classes3.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        j0.i(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j10, c cVar, long j11) throws IOException {
        j0.i(cVar, "sink");
        if (j11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j11 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j10, j11, cVar);
            j10 += jTransferTo;
            j11 -= jTransferTo;
        }
    }

    public final void write(long j10, c cVar, long j11) throws IOException {
        j0.i(cVar, "source");
        if (j11 < 0 || j11 > cVar.f34879d) {
            throw new IndexOutOfBoundsException();
        }
        while (j11 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(cVar, j10, j11);
            j10 += jTransferFrom;
            j11 -= jTransferFrom;
        }
    }
}
