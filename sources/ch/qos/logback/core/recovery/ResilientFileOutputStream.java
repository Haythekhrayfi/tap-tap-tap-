package ch.qos.logback.core.recovery;

import defpackage.a;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public class ResilientFileOutputStream extends ResilientOutputStreamBase {
    private File file;
    private FileOutputStream fos;

    public ResilientFileOutputStream(File file, boolean z10, long j10) throws FileNotFoundException {
        this.file = file;
        this.fos = new FileOutputStream(file, z10);
        this.os = new BufferedOutputStream(this.fos, (int) j10);
        this.presumedClean = true;
    }

    public FileChannel getChannel() {
        if (this.os == null) {
            return null;
        }
        return this.fos.getChannel();
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    public String getDescription() {
        StringBuilder sbA = a.a("file [");
        sbA.append(this.file);
        sbA.append("]");
        return sbA.toString();
    }

    public File getFile() {
        return this.file;
    }

    @Override // ch.qos.logback.core.recovery.ResilientOutputStreamBase
    public OutputStream openNewOutputStream() throws IOException {
        this.fos = new FileOutputStream(this.file, true);
        return new BufferedOutputStream(this.fos);
    }

    public String toString() {
        StringBuilder sbA = a.a("c.q.l.c.recovery.ResilientFileOutputStream@");
        sbA.append(System.identityHashCode(this));
        return sbA.toString();
    }
}
