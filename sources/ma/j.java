package ma;

import android.app.Activity;
import android.app.Application;
import fd.j0;
import java.util.Objects;
import jc.w;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends fa.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f33474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fa.s f33475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f33476c;

    public static final class a extends vc.l implements uc.l<Activity, w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f33477c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ fa.s f33478d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, fa.s sVar) {
            super(1);
            this.f33477c = hVar;
            this.f33478d = sVar;
        }

        @Override // uc.l
        public w invoke(Activity activity) {
            j0.i(activity, "it");
            h hVar = this.f33477c;
            h.a aVar = h.f33410y;
            hVar.g().k(4, null, "Update interstitial capping time", new Object[0]);
            this.f33477c.f().b();
            fa.l lVar = this.f33477c.f33431t;
            Objects.requireNonNull(lVar);
            lVar.f29485a = fa.l.a.b.f29487a;
            if (this.f33477c.f33418g.g(oa.b.H) == oa.b.EnumC0377b.GLOBAL) {
                this.f33477c.f33417f.o("interstitial_capping_timestamp", Long.valueOf(System.currentTimeMillis()));
            }
            fa.s sVar = this.f33478d;
            if (sVar != null) {
                sVar.b();
            }
            return w.f31842a;
        }
    }

    public j(h hVar, fa.s sVar, boolean z10) {
        this.f33474a = hVar;
        this.f33475b = sVar;
        this.f33476c = z10;
    }

    @Override // fa.s
    public void a() {
        this.f33474a.f33419h.f(com.zipoapps.ads.a.EnumC0215a.INTERSTITIAL, null);
    }

    @Override // fa.s
    public void b() {
    }

    @Override // fa.s
    public void c(fa.n nVar) {
        fa.l lVar = this.f33474a.f33431t;
        Objects.requireNonNull(lVar);
        lVar.f29485a = fa.l.a.b.f29487a;
        fa.s sVar = this.f33475b;
        if (sVar != null) {
            sVar.c(nVar);
        }
    }

    @Override // fa.s
    public void d() {
        fa.l lVar = this.f33474a.f33431t;
        Objects.requireNonNull(lVar);
        lVar.f29485a = fa.l.a.d.f29489a;
        if (this.f33476c) {
            com.zipoapps.premiumhelper.a aVar = this.f33474a.f33419h;
            com.zipoapps.ads.a.EnumC0215a enumC0215a = com.zipoapps.ads.a.EnumC0215a.INTERSTITIAL;
            KProperty<Object>[] kPropertyArr = com.zipoapps.premiumhelper.a.f28252m;
            aVar.h(enumC0215a, null);
        }
        fa.s sVar = this.f33475b;
        if (sVar != null) {
            sVar.d();
        }
        h hVar = this.f33474a;
        Application application = hVar.f33412a;
        a aVar2 = new a(hVar, this.f33475b);
        j0.i(application, "<this>");
        application.registerActivityLifecycleCallbacks(new gb.d(application, aVar2));
    }
}
