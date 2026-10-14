package va;

import android.os.Bundle;
import androidx.activity.i;
import fd.j0;
import java.util.Objects;
import jc.w;
import ma.h;
import vc.g;
import vc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0439a f36772c = new C0439a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static a f36773d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36775b;

    /* JADX INFO: renamed from: va.a$a, reason: collision with other inner class name */
    public static final class C0439a {
        public C0439a() {
        }

        public C0439a(g gVar) {
        }

        public final a a() {
            a aVar = a.f36773d;
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a(null);
            a.f36773d = aVar2;
            return aVar2;
        }
    }

    public static final class b extends l implements uc.a<w> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f36776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f36777d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, a aVar) {
            super(0);
            this.f36776c = j10;
            this.f36777d = aVar;
        }

        @Override // uc.a
        public w invoke() {
            h.a aVar = h.f33410y;
            Bundle bundleA = i.a(new jc.h("interstitial_loading_time", Long.valueOf(this.f36776c)), new jc.h("interstitials_count", Integer.valueOf(this.f36777d.f36775b)), new jc.h("ads_provider", aVar.a().f33421j.f28028e.name()));
            xe.a.b("AdsLoadingPerformance").a(bundleA.toString(), new Object[0]);
            com.zipoapps.premiumhelper.a aVar2 = aVar.a().f33419h;
            Objects.requireNonNull(aVar2);
            j0.i(bundleA, "params");
            aVar2.u(aVar2.b("Performance_interstitials", false, bundleA));
            return w.f31842a;
        }
    }

    public a() {
    }

    public a(g gVar) {
    }

    public final void b(long j10) {
        a(new b(j10, this));
    }
}
