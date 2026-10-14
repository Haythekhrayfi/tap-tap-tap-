package m3;

import e3.j;
import java.io.InputStream;
import java.util.Objects;
import l3.g;
import l3.m;
import l3.n;
import l3.o;
import l3.r;

/* JADX INFO: loaded from: classes.dex */
public class a implements n<g, InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d3.d<Integer> f33181b = d3.d.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m<g, g> f33182a;

    /* JADX INFO: renamed from: m3.a$a, reason: collision with other inner class name */
    public static class C0354a implements o<g, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m<g, g> f33183a = new m<>(500);

        @Override // l3.o
        public n<g, InputStream> a(r rVar) {
            return new a(this.f33183a);
        }
    }

    public a() {
        this(null);
    }

    public a(m<g, g> mVar) {
        this.f33182a = mVar;
    }

    @Override // l3.n
    public /* bridge */ /* synthetic */ boolean a(g gVar) {
        return true;
    }

    @Override // l3.n
    public n.a<InputStream> b(g gVar, int i10, int i11, d3.e eVar) {
        g gVar2 = gVar;
        m<g, g> mVar = this.f33182a;
        if (mVar != null) {
            m.b<g> bVarA = m.b.a(gVar2, 0, 0);
            g gVarA = mVar.f32161a.a(bVarA);
            bVarA.b();
            g gVar3 = gVarA;
            if (gVar3 == null) {
                m<g, g> mVar2 = this.f33182a;
                Objects.requireNonNull(mVar2);
                mVar2.f32161a.d(m.b.a(gVar2, 0, 0), gVar2);
            } else {
                gVar2 = gVar3;
            }
        }
        return new n.a<>(gVar2, new j(gVar2, ((Integer) eVar.c(f33181b)).intValue()));
    }
}
