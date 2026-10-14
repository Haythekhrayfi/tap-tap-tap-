package ch.qos.logback.core.joran.spi;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public enum ConsoleTarget {
    SystemOut("System.out", new OutputStream() { // from class: ch.qos.logback.core.joran.spi.ConsoleTarget.a
        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            System.out.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            System.out.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            System.out.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            System.out.write(bArr, i10, i11);
        }
    }),
    SystemErr("System.err", new OutputStream() { // from class: ch.qos.logback.core.joran.spi.ConsoleTarget.b
        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            System.err.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            System.err.write(i10);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            System.err.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            System.err.write(bArr, i10, i11);
        }
    });

    private final String name;
    private final OutputStream stream;

    ConsoleTarget(String str, OutputStream outputStream) {
        this.name = str;
        this.stream = outputStream;
    }

    public static ConsoleTarget findByName(String str) {
        for (ConsoleTarget consoleTarget : values()) {
            if (consoleTarget.name.equalsIgnoreCase(str)) {
                return consoleTarget;
            }
        }
        return null;
    }

    public String getName() {
        return this.name;
    }

    public OutputStream getStream() {
        return this.stream;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
