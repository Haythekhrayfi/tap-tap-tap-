package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
final class by extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dd f12010a = new dd();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f12011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dr f12012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f12013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f12014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private FileOutputStream f12015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private dx f12016g;

    public by(File file, dr drVar) {
        this.f12011b = file;
        this.f12012c = drVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        write(new byte[]{(byte) i10});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        int iMin;
        while (i11 > 0) {
            if (this.f12013d == 0 && this.f12014e == 0) {
                int iA = this.f12010a.a(bArr, i10, i11);
                if (iA == -1) {
                    return;
                }
                i10 += iA;
                i11 -= iA;
                dx dxVarA = this.f12010a.a();
                this.f12016g = dxVarA;
                if (dxVarA.g()) {
                    this.f12013d = 0L;
                    this.f12012c.b(this.f12016g.h(), this.f12016g.h().length);
                    this.f12014e = this.f12016g.h().length;
                } else if (!this.f12016g.b() || this.f12016g.a()) {
                    byte[] bArrH = this.f12016g.h();
                    this.f12012c.b(bArrH, bArrH.length);
                    this.f12013d = this.f12016g.d();
                } else {
                    this.f12012c.a(this.f12016g.h());
                    File file = new File(this.f12011b, this.f12016g.c());
                    file.getParentFile().mkdirs();
                    this.f12013d = this.f12016g.d();
                    this.f12015f = new FileOutputStream(file);
                }
            }
            if (!this.f12016g.a()) {
                if (this.f12016g.g()) {
                    this.f12012c.a(this.f12014e, bArr, i10, i11);
                    this.f12014e += (long) i11;
                    iMin = i11;
                } else if (this.f12016g.b()) {
                    iMin = (int) Math.min(i11, this.f12013d);
                    this.f12015f.write(bArr, i10, iMin);
                    long j10 = this.f12013d - ((long) iMin);
                    this.f12013d = j10;
                    if (j10 == 0) {
                        this.f12015f.close();
                    }
                } else {
                    iMin = (int) Math.min(i11, this.f12013d);
                    int length = this.f12016g.h().length;
                    this.f12012c.a((((long) length) + this.f12016g.d()) - this.f12013d, bArr, i10, iMin);
                    this.f12013d -= (long) iMin;
                }
                i10 += iMin;
                i11 -= iMin;
            }
        }
    }
}
