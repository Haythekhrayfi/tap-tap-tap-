package com.applovin.exoplayer2.e.a;

import com.applovin.exoplayer2.a.p;
import com.applovin.exoplayer2.e.d;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.k.g;
import com.applovin.exoplayer2.l.ai;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f5222c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f5225f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final byte[] f5226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f5227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f5228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f5229j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f5230k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f5231l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f5232m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f5233n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f5234o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f5235p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f5236q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private j f5237r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private x f5238s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private v f5239t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f5240u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f5220a = p.f3999o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f5221b = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f5223d = ai.c("#!AMR\n");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte[] f5224e = ai.c("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f5222c = iArr;
        f5225f = iArr[8];
    }

    public a() {
        this(0);
    }

    public a(int i10) {
        this.f5227h = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f5226g = new byte[1];
        this.f5234o = -1;
    }

    private int a(int i10) throws com.applovin.exoplayer2.ai {
        if (b(i10)) {
            return this.f5228i ? f5222c[i10] : f5221b[i10];
        }
        StringBuilder sbA = defpackage.a.a("Illegal AMR ");
        sbA.append(this.f5228i ? "WB" : "NB");
        sbA.append(" frame type ");
        sbA.append(i10);
        throw com.applovin.exoplayer2.ai.b(sbA.toString(), null);
    }

    private static int a(int i10, long j10) {
        return (int) ((((long) (i10 * 8)) * 1000000) / j10);
    }

    private v a(long j10, boolean z10) {
        return new d(j10, this.f5233n, a(this.f5234o, 20000L), this.f5234o, z10);
    }

    private void a() {
        if (this.f5240u) {
            return;
        }
        this.f5240u = true;
        boolean z10 = this.f5228i;
        this.f5238s.a(new com.applovin.exoplayer2.v.a().f(z10 ? "audio/amr-wb" : "audio/3gpp").f(f5225f).k(1).l(z10 ? 16000 : 8000).a());
    }

    private void a(long j10, int i10) {
        v bVar;
        int i11;
        if (this.f5232m) {
            return;
        }
        int i12 = this.f5227h;
        if ((i12 & 1) == 0 || j10 == -1 || !((i11 = this.f5234o) == -1 || i11 == this.f5230k)) {
            bVar = new v.b(-9223372036854775807L);
        } else if (this.f5235p < 20 && i10 != -1) {
            return;
        } else {
            bVar = a(j10, (i12 & 2) != 0);
        }
        this.f5239t = bVar;
        this.f5237r.a(bVar);
        this.f5232m = true;
    }

    private static boolean a(i iVar, byte[] bArr) throws IOException {
        iVar.a();
        byte[] bArr2 = new byte[bArr.length];
        iVar.d(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private void b() {
        com.applovin.exoplayer2.l.a.a(this.f5238s);
        ai.a(this.f5237r);
    }

    private boolean b(int i10) {
        return i10 >= 0 && i10 <= 15 && (c(i10) || d(i10));
    }

    private boolean b(i iVar) throws IOException {
        int length;
        byte[] bArr = f5223d;
        if (a(iVar, bArr)) {
            this.f5228i = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f5224e;
            if (!a(iVar, bArr2)) {
                return false;
            }
            this.f5228i = true;
            length = bArr2.length;
        }
        iVar.b(length);
        return true;
    }

    private int c(i iVar) throws IOException {
        if (this.f5231l == 0) {
            try {
                int iD = d(iVar);
                this.f5230k = iD;
                this.f5231l = iD;
                if (this.f5234o == -1) {
                    this.f5233n = iVar.c();
                    this.f5234o = this.f5230k;
                }
                if (this.f5234o == this.f5230k) {
                    this.f5235p++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iA = this.f5238s.a((g) iVar, this.f5231l, true);
        if (iA == -1) {
            return -1;
        }
        int i10 = this.f5231l - iA;
        this.f5231l = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f5238s.a(this.f5236q + this.f5229j, 1, this.f5230k, 0, null);
        this.f5229j += 20000;
        return 0;
    }

    private boolean c(int i10) {
        return this.f5228i && (i10 < 10 || i10 > 13);
    }

    private int d(i iVar) throws IOException {
        iVar.a();
        iVar.d(this.f5226g, 0, 1);
        byte b10 = this.f5226g[0];
        if ((b10 & 131) <= 0) {
            return a((b10 >> 3) & 15);
        }
        throw com.applovin.exoplayer2.ai.b("Invalid padding bits for frame header " + ((int) b10), null);
    }

    private boolean d(int i10) {
        return !this.f5228i && (i10 < 12 || i10 > 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h[] d() {
        return new h[]{new a()};
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(i iVar, u uVar) throws IOException {
        b();
        if (iVar.c() == 0 && !b(iVar)) {
            throw com.applovin.exoplayer2.ai.b("Could not find AMR header.", null);
        }
        a();
        int iC = c(iVar);
        a(iVar.d(), iC);
        return iC;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        this.f5229j = 0L;
        this.f5230k = 0;
        this.f5231l = 0;
        if (j10 != 0) {
            v vVar = this.f5239t;
            if (vVar instanceof d) {
                this.f5236q = ((d) vVar).b(j10);
                return;
            }
        }
        this.f5236q = 0L;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.f5237r = jVar;
        this.f5238s = jVar.a(0, 1);
        jVar.a();
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(i iVar) throws IOException {
        return b(iVar);
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
    }
}
