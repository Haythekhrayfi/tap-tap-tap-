package com.yandex.mobile.ads.impl;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class tb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f25306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f25307b;

    public static final class a extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FileOutputStream f25308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f25309b = false;

        public a(File file) throws FileNotFoundException {
            this.f25308a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f25309b) {
                return;
            }
            this.f25309b = true;
            this.f25308a.flush();
            try {
                this.f25308a.getFD().sync();
            } catch (IOException e10) {
                p90.b("AtomicFile", "Failed to sync file descriptor:", e10);
            }
            this.f25308a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.f25308a.flush();
        }

        @Override // java.io.OutputStream
        public final void write(int i10) throws IOException {
            this.f25308a.write(i10);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.f25308a.write(bArr);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f25308a.write(bArr, i10, i11);
        }
    }

    public tb(File file) {
        this.f25306a = file;
        this.f25307b = new File(file.getPath() + ".bak");
    }

    public final void a() {
        this.f25306a.delete();
        this.f25307b.delete();
    }

    public final void a(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.close();
        this.f25307b.delete();
    }

    public final boolean b() {
        return this.f25306a.exists() || this.f25307b.exists();
    }

    public final FileInputStream c() throws FileNotFoundException {
        if (this.f25307b.exists()) {
            this.f25306a.delete();
            this.f25307b.renameTo(this.f25306a);
        }
        return new FileInputStream(this.f25306a);
    }

    public final OutputStream d() throws IOException {
        if (this.f25306a.exists()) {
            if (this.f25307b.exists()) {
                this.f25306a.delete();
            } else if (!this.f25306a.renameTo(this.f25307b)) {
                StringBuilder sbA = v60.a("Couldn't rename file ");
                sbA.append(this.f25306a);
                sbA.append(" to backup file ");
                sbA.append(this.f25307b);
                p90.d("AtomicFile", sbA.toString());
            }
        }
        try {
            return new a(this.f25306a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f25306a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                StringBuilder sbA2 = v60.a("Couldn't create ");
                sbA2.append(this.f25306a);
                throw new IOException(sbA2.toString(), e10);
            }
            try {
                return new a(this.f25306a);
            } catch (FileNotFoundException e11) {
                StringBuilder sbA3 = v60.a("Couldn't create ");
                sbA3.append(this.f25306a);
                throw new IOException(sbA3.toString(), e11);
            }
        }
    }
}
