package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends Writer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public StringBuilder f2075d = new StringBuilder(128);

    public k0(String str) {
        this.f2074c = str;
    }

    public final void a() {
        if (this.f2075d.length() > 0) {
            Log.d(this.f2074c, this.f2075d.toString());
            StringBuilder sb2 = this.f2075d;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.f2075d.append(c10);
            }
        }
    }
}
