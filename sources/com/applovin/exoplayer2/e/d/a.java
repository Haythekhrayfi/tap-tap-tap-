package com.applovin.exoplayer2.e.d;

import com.applovin.exoplayer2.e.g.g;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f5304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f5305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f5306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5307e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.applovin.exoplayer2.g.f.b f5309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i f5310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f5311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private g f5312j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f5303a = new y(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f5308f = -1;

    private static com.applovin.exoplayer2.g.f.b a(String str, long j10) throws IOException {
        b bVarA;
        if (j10 == -1 || (bVarA = e.a(str)) == null) {
            return null;
        }
        return bVarA.a(j10);
    }

    private void a() {
        a((com.applovin.exoplayer2.g.a.InterfaceC0092a) com.applovin.exoplayer2.l.a.b(this.f5309g));
        this.f5305c = 5;
    }

    private void a(com.applovin.exoplayer2.g.a.InterfaceC0092a... interfaceC0092aArr) {
        ((j) com.applovin.exoplayer2.l.a.b(this.f5304b)).a(1024, 4).a(new v.a().e("image/jpeg").a(new com.applovin.exoplayer2.g.a(interfaceC0092aArr)).a());
    }

    private int b(i iVar) throws IOException {
        this.f5303a.a(2);
        iVar.d(this.f5303a.d(), 0, 2);
        return this.f5303a.i();
    }

    private void b() {
        a(new com.applovin.exoplayer2.g.a.InterfaceC0092a[0]);
        ((j) com.applovin.exoplayer2.l.a.b(this.f5304b)).a();
        this.f5304b.a(new com.applovin.exoplayer2.e.v.b(-9223372036854775807L));
        this.f5305c = 6;
    }

    private void c(i iVar) throws IOException {
        this.f5303a.a(2);
        iVar.d(this.f5303a.d(), 0, 2);
        iVar.c(this.f5303a.i() - 2);
    }

    private void d(i iVar) throws IOException {
        int i10;
        this.f5303a.a(2);
        iVar.b(this.f5303a.d(), 0, 2);
        int i11 = this.f5303a.i();
        this.f5306d = i11;
        if (i11 == 65498) {
            if (this.f5308f == -1) {
                b();
                return;
            }
            i10 = 4;
        } else if ((i11 >= 65488 && i11 <= 65497) || i11 == 65281) {
            return;
        } else {
            i10 = 1;
        }
        this.f5305c = i10;
    }

    private void e(i iVar) throws IOException {
        this.f5303a.a(2);
        iVar.b(this.f5303a.d(), 0, 2);
        this.f5307e = this.f5303a.i() - 2;
        this.f5305c = 2;
    }

    private void f(i iVar) throws IOException {
        String strB;
        if (this.f5306d == 65505) {
            y yVar = new y(this.f5307e);
            iVar.b(yVar.d(), 0, this.f5307e);
            if (this.f5309g == null && "http://ns.adobe.com/xap/1.0/".equals(yVar.B()) && (strB = yVar.B()) != null) {
                com.applovin.exoplayer2.g.f.b bVarA = a(strB, iVar.d());
                this.f5309g = bVarA;
                if (bVarA != null) {
                    this.f5308f = bVarA.f6409d;
                }
            }
        } else {
            iVar.b(this.f5307e);
        }
        this.f5305c = 0;
    }

    private void g(i iVar) throws IOException {
        if (iVar.b(this.f5303a.d(), 0, 1, true)) {
            iVar.a();
            if (this.f5312j == null) {
                this.f5312j = new g();
            }
            c cVar = new c(iVar, this.f5308f);
            this.f5311i = cVar;
            if (this.f5312j.a(cVar)) {
                this.f5312j.a(new d(this.f5308f, (j) com.applovin.exoplayer2.l.a.b(this.f5304b)));
                a();
                return;
            }
        }
        b();
    }

    @Override // com.applovin.exoplayer2.e.h
    public int a(i iVar, u uVar) throws IOException {
        int i10 = this.f5305c;
        if (i10 == 0) {
            d(iVar);
            return 0;
        }
        if (i10 == 1) {
            e(iVar);
            return 0;
        }
        if (i10 == 2) {
            f(iVar);
            return 0;
        }
        if (i10 == 4) {
            long jC = iVar.c();
            long j10 = this.f5308f;
            if (jC != j10) {
                uVar.f6134a = j10;
                return 1;
            }
            g(iVar);
            return 0;
        }
        if (i10 != 5) {
            if (i10 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f5311i == null || iVar != this.f5310h) {
            this.f5310h = iVar;
            this.f5311i = new c(iVar, this.f5308f);
        }
        int iA = ((g) com.applovin.exoplayer2.l.a.b(this.f5312j)).a(this.f5311i, uVar);
        if (iA == 1) {
            uVar.f6134a += this.f5308f;
        }
        return iA;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f5305c = 0;
            this.f5312j = null;
        } else if (this.f5305c == 5) {
            ((g) com.applovin.exoplayer2.l.a.b(this.f5312j)).a(j10, j11);
        }
    }

    @Override // com.applovin.exoplayer2.e.h
    public void a(j jVar) {
        this.f5304b = jVar;
    }

    @Override // com.applovin.exoplayer2.e.h
    public boolean a(i iVar) throws IOException {
        if (b(iVar) != 65496) {
            return false;
        }
        int iB = b(iVar);
        this.f5306d = iB;
        if (iB == 65504) {
            c(iVar);
            this.f5306d = b(iVar);
        }
        if (this.f5306d != 65505) {
            return false;
        }
        iVar.c(2);
        this.f5303a.a(6);
        iVar.d(this.f5303a.d(), 0, 6);
        return this.f5303a.o() == 1165519206 && this.f5303a.i() == 0;
    }

    @Override // com.applovin.exoplayer2.e.h
    public void c() {
        g gVar = this.f5312j;
        if (gVar != null) {
            gVar.c();
        }
    }
}
