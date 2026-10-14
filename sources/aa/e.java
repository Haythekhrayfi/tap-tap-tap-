package aa;

import com.android.billingclient.api.x;

/* JADX INFO: loaded from: classes.dex */
public class e extends com.yandex.metrica.billing_interface.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f238e;

    public class a extends com.yandex.metrica.billing_interface.d {
        public a() {
        }

        @Override // com.yandex.metrica.billing_interface.d
        public void a() {
            e eVar = e.this;
            eVar.f238e.f228g.b(eVar.f237d);
        }
    }

    public e(c cVar, x xVar, g gVar) {
        this.f238e = cVar;
        this.f236c = xVar;
        this.f237d = gVar;
    }

    @Override // com.yandex.metrica.billing_interface.d
    public void a() throws Throwable {
        if (this.f238e.f225d.d()) {
            this.f238e.f225d.h(this.f236c, this.f237d);
        } else {
            this.f238e.f223b.execute(new a());
        }
    }
}
