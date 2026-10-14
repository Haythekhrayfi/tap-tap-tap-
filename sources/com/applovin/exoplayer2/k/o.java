package com.applovin.exoplayer2.k;

import android.content.Context;
import android.net.Uri;
import com.applovin.exoplayer2.l.ai;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<aa> f7450b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f7451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f7452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f7453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f7454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private i f7455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i f7456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i f7457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i f7458j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private i f7459k;

    public static final class a implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f7460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i.a f7461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private aa f7462c;

        public a(Context context) {
            this(context, new q.a());
        }

        public a(Context context, i.a aVar) {
            this.f7460a = context.getApplicationContext();
            this.f7461b = aVar;
        }

        @Override // com.applovin.exoplayer2.k.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public o a() {
            o oVar = new o(this.f7460a, this.f7461b.a());
            aa aaVar = this.f7462c;
            if (aaVar != null) {
                oVar.a(aaVar);
            }
            return oVar;
        }
    }

    public o(Context context, i iVar) {
        this.f7449a = context.getApplicationContext();
        this.f7451c = (i) com.applovin.exoplayer2.l.a.b(iVar);
    }

    private void a(i iVar) {
        for (int i10 = 0; i10 < this.f7450b.size(); i10++) {
            iVar.a(this.f7450b.get(i10));
        }
    }

    private void a(i iVar, aa aaVar) {
        if (iVar != null) {
            iVar.a(aaVar);
        }
    }

    private i d() {
        if (this.f7456h == null) {
            ab abVar = new ab();
            this.f7456h = abVar;
            a(abVar);
        }
        return this.f7456h;
    }

    private i e() {
        if (this.f7452d == null) {
            s sVar = new s();
            this.f7452d = sVar;
            a(sVar);
        }
        return this.f7452d;
    }

    private i f() {
        if (this.f7453e == null) {
            c cVar = new c(this.f7449a);
            this.f7453e = cVar;
            a(cVar);
        }
        return this.f7453e;
    }

    private i g() {
        if (this.f7454f == null) {
            f fVar = new f(this.f7449a);
            this.f7454f = fVar;
            a(fVar);
        }
        return this.f7454f;
    }

    private i h() {
        if (this.f7455g == null) {
            try {
                i iVar = (i) Class.forName("com.applovin.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                this.f7455g = iVar;
                a(iVar);
            } catch (ClassNotFoundException unused) {
                com.applovin.exoplayer2.l.q.c("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating RTMP extension", e10);
            }
            if (this.f7455g == null) {
                this.f7455g = this.f7451c;
            }
        }
        return this.f7455g;
    }

    private i i() {
        if (this.f7457i == null) {
            h hVar = new h();
            this.f7457i = hVar;
            a(hVar);
        }
        return this.f7457i;
    }

    private i j() {
        if (this.f7458j == null) {
            x xVar = new x(this.f7449a);
            this.f7458j = xVar;
            a(xVar);
        }
        return this.f7458j;
    }

    @Override // com.applovin.exoplayer2.k.g
    public int a(byte[] bArr, int i10, int i11) throws IOException {
        return ((i) com.applovin.exoplayer2.l.a.b(this.f7459k)).a(bArr, i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    @Override // com.applovin.exoplayer2.k.i
    public long a(l lVar) throws IOException {
        i iVarJ;
        com.applovin.exoplayer2.l.a.b(this.f7459k == null);
        String scheme = lVar.f7392a.getScheme();
        if (ai.a(lVar.f7392a)) {
            String path = lVar.f7392a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                iVarJ = e();
            } else {
                iVarJ = f();
            }
        } else if ("asset".equals(scheme)) {
            iVarJ = f();
        } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme)) {
            iVarJ = g();
        } else if ("rtmp".equals(scheme)) {
            iVarJ = h();
        } else if ("udp".equals(scheme)) {
            iVarJ = d();
        } else if ("data".equals(scheme)) {
            iVarJ = i();
        } else {
            iVarJ = ("rawresource".equals(scheme) || "android.resource".equals(scheme)) ? j() : this.f7451c;
        }
        this.f7459k = iVarJ;
        return this.f7459k.a(lVar);
    }

    @Override // com.applovin.exoplayer2.k.i
    public Uri a() {
        i iVar = this.f7459k;
        if (iVar == null) {
            return null;
        }
        return iVar.a();
    }

    @Override // com.applovin.exoplayer2.k.i
    public void a(aa aaVar) {
        com.applovin.exoplayer2.l.a.b(aaVar);
        this.f7451c.a(aaVar);
        this.f7450b.add(aaVar);
        a(this.f7452d, aaVar);
        a(this.f7453e, aaVar);
        a(this.f7454f, aaVar);
        a(this.f7455g, aaVar);
        a(this.f7456h, aaVar);
        a(this.f7457i, aaVar);
        a(this.f7458j, aaVar);
    }

    @Override // com.applovin.exoplayer2.k.i
    public Map<String, List<String>> b() {
        i iVar = this.f7459k;
        return iVar == null ? Collections.emptyMap() : iVar.b();
    }

    @Override // com.applovin.exoplayer2.k.i
    public void c() throws IOException {
        i iVar = this.f7459k;
        if (iVar != null) {
            try {
                iVar.c();
            } finally {
                this.f7459k = null;
            }
        }
    }
}
