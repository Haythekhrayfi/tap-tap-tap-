package c3;

import android.util.Log;
import androidx.recyclerview.widget.o;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer f3569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f3570c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3568a = new byte[256];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3571d = 0;

    public final boolean a() {
        return this.f3570c.f3558b != 0;
    }

    public c b() {
        if (this.f3569b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.f3570c;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) c());
        }
        if (sb2.toString().startsWith("GIF")) {
            this.f3570c.f3562f = f();
            this.f3570c.f3563g = f();
            int iC = c();
            c cVar = this.f3570c;
            cVar.f3564h = (iC & 128) != 0;
            cVar.f3565i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.f3570c.f3566j = c();
            c cVar2 = this.f3570c;
            c();
            Objects.requireNonNull(cVar2);
            if (this.f3570c.f3564h && !a()) {
                c cVar3 = this.f3570c;
                cVar3.f3557a = e(cVar3.f3565i);
                c cVar4 = this.f3570c;
                cVar4.f3567k = cVar4.f3557a[cVar4.f3566j];
            }
        } else {
            this.f3570c.f3558b = 1;
        }
        if (!a()) {
            boolean z10 = false;
            while (!z10 && !a() && this.f3570c.f3559c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 != 1) {
                        if (iC3 == 249) {
                            this.f3570c.f3560d = new b();
                            c();
                            int iC4 = c();
                            b bVar = this.f3570c.f3560d;
                            int i11 = (iC4 & 28) >> 2;
                            bVar.f3552g = i11;
                            if (i11 == 0) {
                                bVar.f3552g = 1;
                            }
                            bVar.f3551f = (iC4 & 1) != 0;
                            int iF = f();
                            if (iF < 2) {
                                iF = 10;
                            }
                            b bVar2 = this.f3570c.f3560d;
                            bVar2.f3554i = iF * 10;
                            bVar2.f3553h = c();
                            c();
                        } else if (iC3 != 254 && iC3 == 255) {
                            d();
                            StringBuilder sb3 = new StringBuilder();
                            for (int i12 = 0; i12 < 11; i12++) {
                                sb3.append((char) this.f3568a[i12]);
                            }
                            if (sb3.toString().equals("NETSCAPE2.0")) {
                                do {
                                    d();
                                    byte[] bArr = this.f3568a;
                                    if (bArr[0] == 1) {
                                        byte b10 = bArr[1];
                                        byte b11 = bArr[2];
                                        Objects.requireNonNull(this.f3570c);
                                    }
                                    if (this.f3571d <= 0) {
                                        break;
                                    }
                                } while (!a());
                            }
                        }
                    }
                    g();
                } else if (iC2 == 44) {
                    c cVar5 = this.f3570c;
                    if (cVar5.f3560d == null) {
                        cVar5.f3560d = new b();
                    }
                    cVar5.f3560d.f3546a = f();
                    this.f3570c.f3560d.f3547b = f();
                    this.f3570c.f3560d.f3548c = f();
                    this.f3570c.f3560d.f3549d = f();
                    int iC5 = c();
                    boolean z11 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    b bVar3 = this.f3570c.f3560d;
                    bVar3.f3550e = (iC5 & 64) != 0;
                    if (z11) {
                        bVar3.f3556k = e(iPow);
                    } else {
                        bVar3.f3556k = null;
                    }
                    this.f3570c.f3560d.f3555j = this.f3569b.position();
                    c();
                    g();
                    if (!a()) {
                        c cVar6 = this.f3570c;
                        cVar6.f3559c++;
                        cVar6.f3561e.add(cVar6.f3560d);
                    }
                } else if (iC2 != 59) {
                    this.f3570c.f3558b = 1;
                } else {
                    z10 = true;
                }
            }
            c cVar7 = this.f3570c;
            if (cVar7.f3559c < 0) {
                cVar7.f3558b = 1;
            }
        }
        return this.f3570c;
    }

    public final int c() {
        try {
            return this.f3569b.get() & 255;
        } catch (Exception unused) {
            this.f3570c.f3558b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.f3571d = iC;
        if (iC <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                int i12 = this.f3571d;
                if (i10 >= i12) {
                    return;
                }
                i11 = i12 - i10;
                this.f3569b.get(this.f3568a, i10, i11);
                i10 += i11;
            } catch (Exception e10) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbA = o.a("Error Reading Block n: ", i10, " count: ", i11, " blockSize: ");
                    sbA.append(this.f3571d);
                    Log.d("GifHeaderParser", sbA.toString(), e10);
                }
                this.f3570c.f3558b = 1;
                return;
            }
        }
    }

    public final int[] e(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f3569b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & 255) << 16) | (-16777216) | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f3570c.f3558b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f3569b.getShort();
    }

    public final void g() {
        int iC;
        do {
            iC = c();
            this.f3569b.position(Math.min(this.f3569b.position() + iC, this.f3569b.limit()));
        } while (iC > 0);
    }
}
