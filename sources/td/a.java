package td;

import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;

/* JADX INFO: loaded from: classes3.dex */
public class a extends Writer implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f35893c;

    public a() {
        this.f35893c = new StringBuilder();
    }

    public a(int i10) {
        this.f35893c = new StringBuilder(i10);
    }

    public a(StringBuilder sb2) {
        this.f35893c = sb2 == null ? new StringBuilder() : sb2;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c10) {
        this.f35893c.append(c10);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.f35893c.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i10, int i11) {
        this.f35893c.append(charSequence, i10, i11);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(char c10) throws IOException {
        this.f35893c.append(c10);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public String toString() {
        return this.f35893c.toString();
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.f35893c.append(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i10, int i11) {
        if (cArr != null) {
            this.f35893c.append(cArr, i10, i11);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence) throws IOException {
        this.f35893c.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i10, int i11) throws IOException {
        this.f35893c.append(charSequence, i10, i11);
        return this;
    }
}
