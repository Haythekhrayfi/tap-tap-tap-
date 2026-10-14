package com.applovin.exoplayer2.e.e;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.e.i;
import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f5334a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<C0085a> f5335b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f5336c = new f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f5337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f5339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f5340g;

    /* JADX INFO: renamed from: com.applovin.exoplayer2.e.e.a$a, reason: collision with other inner class name */
    public static final class C0085a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f5341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f5342b;

        private C0085a(int i10, long j10) {
            this.f5341a = i10;
            this.f5342b = j10;
        }
    }

    private long a(i iVar, int i10) throws IOException {
        iVar.b(this.f5334a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f5334a[i11] & 255));
        }
        return j10;
    }

    private double b(i iVar, int i10) throws IOException {
        long jA = a(iVar, i10);
        return i10 == 4 ? Float.intBitsToFloat((int) jA) : Double.longBitsToDouble(jA);
    }

    private long b(i iVar) throws IOException {
        iVar.a();
        while (true) {
            iVar.d(this.f5334a, 0, 4);
            int iA = f.a(this.f5334a[0]);
            if (iA != -1 && iA <= 4) {
                int iA2 = (int) f.a(this.f5334a, iA, false);
                if (this.f5337d.b(iA2)) {
                    iVar.b(iA);
                    return iA2;
                }
            }
            iVar.b(1);
        }
    }

    private static String c(i iVar, int i10) throws IOException {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        iVar.b(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // com.applovin.exoplayer2.e.e.c
    public void a() {
        this.f5338e = 0;
        this.f5335b.clear();
        this.f5336c.a();
    }

    @Override // com.applovin.exoplayer2.e.e.c
    public void a(b bVar) {
        this.f5337d = bVar;
    }

    @Override // com.applovin.exoplayer2.e.e.c
    public boolean a(i iVar) throws IOException {
        com.applovin.exoplayer2.l.a.a(this.f5337d);
        while (true) {
            C0085a c0085aPeek = this.f5335b.peek();
            if (c0085aPeek != null && iVar.c() >= c0085aPeek.f5342b) {
                this.f5337d.c(this.f5335b.pop().f5341a);
                return true;
            }
            if (this.f5338e == 0) {
                long jA = this.f5336c.a(iVar, true, false, 4);
                if (jA == -2) {
                    jA = b(iVar);
                }
                if (jA == -1) {
                    return false;
                }
                this.f5339f = (int) jA;
                this.f5338e = 1;
            }
            if (this.f5338e == 1) {
                this.f5340g = this.f5336c.a(iVar, false, true, 8);
                this.f5338e = 2;
            }
            int iA = this.f5337d.a(this.f5339f);
            if (iA != 0) {
                if (iA == 1) {
                    long jC = iVar.c();
                    this.f5335b.push(new C0085a(this.f5339f, this.f5340g + jC));
                    this.f5337d.a(this.f5339f, jC, this.f5340g);
                    this.f5338e = 0;
                    return true;
                }
                if (iA == 2) {
                    long j10 = this.f5340g;
                    if (j10 <= 8) {
                        this.f5337d.a(this.f5339f, a(iVar, (int) j10));
                        this.f5338e = 0;
                        return true;
                    }
                    StringBuilder sbA = defpackage.a.a("Invalid integer size: ");
                    sbA.append(this.f5340g);
                    throw ai.b(sbA.toString(), null);
                }
                if (iA == 3) {
                    long j11 = this.f5340g;
                    if (j11 <= 2147483647L) {
                        this.f5337d.a(this.f5339f, c(iVar, (int) j11));
                        this.f5338e = 0;
                        return true;
                    }
                    StringBuilder sbA2 = defpackage.a.a("String element size: ");
                    sbA2.append(this.f5340g);
                    throw ai.b(sbA2.toString(), null);
                }
                if (iA == 4) {
                    this.f5337d.a(this.f5339f, (int) this.f5340g, iVar);
                    this.f5338e = 0;
                    return true;
                }
                if (iA != 5) {
                    throw ai.b("Invalid element type " + iA, null);
                }
                long j12 = this.f5340g;
                if (j12 == 4 || j12 == 8) {
                    this.f5337d.a(this.f5339f, b(iVar, (int) j12));
                    this.f5338e = 0;
                    return true;
                }
                StringBuilder sbA3 = defpackage.a.a("Invalid float size: ");
                sbA3.append(this.f5340g);
                throw ai.b(sbA3.toString(), null);
            }
            iVar.b((int) this.f5340g);
            this.f5338e = 0;
        }
    }
}
