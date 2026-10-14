package ba;

import com.android.billingclient.api.x;

/* JADX INFO: loaded from: classes.dex */
public final class e extends com.yandex.metrica.billing_interface.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f3424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f3425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f3426e;

    public static final class a extends com.yandex.metrica.billing_interface.d {
        public a() {
        }

        @Override // com.yandex.metrica.billing_interface.d
        public void a() {
            e eVar = e.this;
            eVar.f3424c.f3417e.b(eVar.f3426e);
        }
    }

    public e(c cVar, x xVar, h hVar) {
        this.f3424c = cVar;
        this.f3425d = xVar;
        this.f3426e = hVar;
    }

    @Override // com.yandex.metrica.billing_interface.d
    public void a() {
        if (this.f3424c.f3414b.d()) {
            this.f3424c.f3414b.h(this.f3425d, this.f3426e);
        } else {
            this.f3424c.f3415c.a().execute(new a());
        }
    }
}
