package okhttp3.internal.io;

import ch.qos.logback.core.joran.action.Action;
import fd.j0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Logger;
import qd.a0;
import qd.b0;
import qd.n;
import qd.o;
import qd.p;
import qd.y;

/* JADX INFO: loaded from: classes3.dex */
public interface FileSystem {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            public y appendingSink(File file) throws FileNotFoundException {
                j0.i(file, Action.FILE_ATTRIBUTE);
                try {
                    return o.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return o.a(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(File file) throws IOException {
                j0.i(file, Action.FILE_ATTRIBUTE);
                if (!file.delete() && file.exists()) {
                    throw new IOException(j0.p("failed to delete ", file));
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(File file) throws IOException {
                j0.i(file, "directory");
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException(j0.p("not a readable directory: ", file));
                }
                int i10 = 0;
                int length = fileArrListFiles.length;
                while (i10 < length) {
                    File file2 = fileArrListFiles[i10];
                    i10++;
                    if (file2.isDirectory()) {
                        deleteContents(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException(j0.p("failed to delete ", file2));
                    }
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(File file) {
                j0.i(file, Action.FILE_ATTRIBUTE);
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(File file, File file2) throws IOException {
                j0.i(file, "from");
                j0.i(file2, "to");
                delete(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            @Override // okhttp3.internal.io.FileSystem
            public y sink(File file) throws FileNotFoundException {
                j0.i(file, Action.FILE_ATTRIBUTE);
                try {
                    return o.f(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return o.f(file, false, 1, null);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(File file) {
                j0.i(file, Action.FILE_ATTRIBUTE);
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            public a0 source(File file) throws FileNotFoundException {
                j0.i(file, Action.FILE_ATTRIBUTE);
                Logger logger = p.f34912a;
                return new n(new FileInputStream(file), b0.NONE);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    y appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    y sink(File file) throws FileNotFoundException;

    long size(File file);

    a0 source(File file) throws FileNotFoundException;
}
