package ba;

/* JADX INFO: loaded from: classes.dex */
public final class b extends com.yandex.metrica.billing_interface.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f3410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ba.a f3411e;

    public static final class a extends com.yandex.metrica.billing_interface.d {
        public a() {
        }

        @Override // com.yandex.metrica.billing_interface.d
        public void a() {
            b bVar = b.this;
            bVar.f3411e.f3406d.b(bVar.f3410d);
        }
    }

    public b(String str, c cVar, ba.a aVar) {
        this.f3409c = str;
        this.f3410d = cVar;
        this.f3411e = aVar;
    }

    @Override // com.yandex.metrica.billing_interface.d
    public void a() {
        if (this.f3411e.f3404b.d()) {
            this.f3411e.f3404b.f(this.f3409c, this.f3410d);
        } else {
            this.f3411e.f3405c.a().execute(new a());
        }
    }
}
