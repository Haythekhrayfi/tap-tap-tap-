package ch.qos.logback.core;

import androidx.activity.k;
import androidx.activity.result.c;
import ch.qos.logback.core.recovery.ResilientFileOutputStream;
import ch.qos.logback.core.util.ContextUtil;
import ch.qos.logback.core.util.EnvUtil;
import ch.qos.logback.core.util.FileSize;
import ch.qos.logback.core.util.FileUtil;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Map;
import q2.a;

/* JADX INFO: loaded from: classes.dex */
public class FileAppender<E> extends OutputStreamAppender<E> {
    public static String COLLISION_WITH_EARLIER_APPENDER_URL = "http://logback.qos.ch/codes.html#earlier_fa_collision";
    public static final long DEFAULT_BUFFER_SIZE = 8192;
    public boolean append = true;
    public String fileName = null;
    private boolean prudent = false;
    private boolean initialized = false;
    private boolean lazyInit = false;
    private FileSize bufferSize = new FileSize(DEFAULT_BUFFER_SIZE);

    private String getAbsoluteFilePath(String str) {
        return (!EnvUtil.isAndroidOS() || new File(str).isAbsolute()) ? str : FileUtil.prefixRelativePath(this.context.getProperty(CoreConstants.DATA_DIR_KEY), str);
    }

    private void safeWrite(E e10) throws IOException {
        ResilientFileOutputStream resilientFileOutputStream = (ResilientFileOutputStream) getOutputStream();
        FileChannel channel = resilientFileOutputStream.getChannel();
        if (channel == null) {
            return;
        }
        boolean zInterrupted = Thread.interrupted();
        FileLock fileLockLock = null;
        try {
            fileLockLock = channel.lock();
            long jPosition = channel.position();
            long size = channel.size();
            if (size != jPosition) {
                channel.position(size);
            }
            super.writeOut(e10);
        } catch (IOException e11) {
            resilientFileOutputStream.postIOFailure(e11);
        } finally {
            if (fileLockLock != null && fileLockLock.isValid()) {
                fileLockLock.release();
            }
            if (zInterrupted) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void addErrorForCollision(String str, String str2, String str3) {
        StringBuilder sbA = a.a("'", str, "' option has the same value \"", str2, "\" as that given for appender [");
        sbA.append(str3);
        sbA.append("] defined earlier.");
        addError(sbA.toString());
    }

    public boolean checkForFileCollisionInPreviousFileAppenders() {
        Map map;
        boolean z10 = false;
        if (this.fileName == null || (map = (Map) this.context.getObject(CoreConstants.FA_FILENAME_COLLISION_MAP)) == null) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (this.fileName.equals(entry.getValue())) {
                addErrorForCollision("File", (String) entry.getValue(), (String) entry.getKey());
                z10 = true;
            }
        }
        if (this.name != null) {
            map.put(getName(), this.fileName);
        }
        return z10;
    }

    public String getFile() {
        return this.fileName;
    }

    public boolean getLazy() {
        return this.lazyInit;
    }

    public boolean isAppend() {
        return this.append;
    }

    public boolean isPrudent() {
        return this.prudent;
    }

    public boolean openFile(String str) throws IOException {
        String absoluteFilePath = getAbsoluteFilePath(str);
        this.lock.lock();
        try {
            File file = new File(absoluteFilePath);
            if (!FileUtil.createMissingParentDirectories(file)) {
                addError("Failed to create parent directories for [" + file.getAbsolutePath() + "]");
            }
            ResilientFileOutputStream resilientFileOutputStream = new ResilientFileOutputStream(file, this.append, this.bufferSize.getSize());
            resilientFileOutputStream.setContext(this.context);
            setOutputStream(resilientFileOutputStream);
            return true;
        } finally {
            this.lock.unlock();
        }
    }

    public final String rawFileProperty() {
        return this.fileName;
    }

    public void setAppend(boolean z10) {
        this.append = z10;
    }

    public void setBufferSize(FileSize fileSize) {
        StringBuilder sbA = defpackage.a.a("Setting bufferSize to [");
        sbA.append(fileSize.toString());
        sbA.append("]");
        addInfo(sbA.toString());
        this.bufferSize = fileSize;
    }

    public void setFile(String str) {
        this.fileName = str == null ? null : str.trim();
    }

    public void setLazy(boolean z10) {
        this.lazyInit = z10;
    }

    public void setPrudent(boolean z10) {
        this.prudent = z10;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0082  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // ch.qos.logback.core.OutputStreamAppender, ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String strA;
        String file = getFile();
        boolean z10 = true;
        if (file != null) {
            String absoluteFilePath = getAbsoluteFilePath(file);
            addInfo("File property is set to [" + absoluteFilePath + "]");
            if (this.prudent && !isAppend()) {
                setAppend(true);
                addWarn("Setting \"Append\" property to true on account of \"Prudent\" mode");
            }
            if (!this.lazyInit) {
                if (checkForFileCollisionInPreviousFileAppenders()) {
                    addError("Collisions detected with FileAppender/RollingAppender instances defined earlier. Aborting.");
                    strA = COLLISION_WITH_EARLIER_APPENDER_URL;
                } else {
                    try {
                        openFile(absoluteFilePath);
                    } catch (IOException e10) {
                        StringBuilder sbA = c.a("openFile(", absoluteFilePath, ",");
                        sbA.append(this.append);
                        sbA.append(") failed");
                        addError(sbA.toString(), e10);
                    }
                }
                if (z10) {
                }
                super.start();
            }
            setOutputStream(new NOPOutputStream());
            z10 = false;
            if (z10) {
                super.start();
            }
        }
        strA = k.a(defpackage.a.a("\"File\" property not set for appender named ["), this.name, "]");
        addError(strA);
        if (z10) {
            super.start();
        }
    }

    @Override // ch.qos.logback.core.OutputStreamAppender, ch.qos.logback.core.UnsynchronizedAppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        super.stop();
        Map<String, String> filenameCollisionMap = ContextUtil.getFilenameCollisionMap(this.context);
        if (filenameCollisionMap == null || getName() == null) {
            return;
        }
        filenameCollisionMap.remove(getName());
    }

    @Override // ch.qos.logback.core.OutputStreamAppender
    public void subAppend(E e10) {
        if (!this.initialized && this.lazyInit) {
            this.initialized = true;
            if (checkForFileCollisionInPreviousFileAppenders()) {
                addError("Collisions detected with FileAppender/RollingAppender instances defined earlier. Aborting.");
                addError(COLLISION_WITH_EARLIER_APPENDER_URL);
            } else {
                try {
                    openFile(getFile());
                    super.start();
                } catch (IOException e11) {
                    this.started = false;
                    StringBuilder sbA = defpackage.a.a("openFile(");
                    sbA.append(this.fileName);
                    sbA.append(",");
                    sbA.append(this.append);
                    sbA.append(") failed");
                    addError(sbA.toString(), e11);
                }
            }
        }
        super.subAppend(e10);
    }

    @Override // ch.qos.logback.core.OutputStreamAppender
    public void writeOut(E e10) throws IOException {
        if (this.prudent) {
            safeWrite(e10);
        } else {
            super.writeOut(e10);
        }
    }
}
