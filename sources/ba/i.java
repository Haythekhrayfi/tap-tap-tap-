package ba;

/* JADX INFO: loaded from: classes.dex */
public final class i extends com.yandex.metrica.billing_interface.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f3445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f3446d;

    public static final class a extends com.yandex.metrica.billing_interface.d {
        public a() {
        }

        @Override // com.yandex.metrica.billing_interface.d
        public void a() {
            i iVar = i.this;
            iVar.f3445c.f3441f.b(iVar.f3446d);
        }
    }

    public i(h hVar, f fVar) {
        this.f3445c = hVar;
        this.f3446d = fVar;
    }

    @Override // com.yandex.metrica.billing_interface.d
    public void a() {
        if (!this.f3445c.f3437b.d()) {
            this.f3445c.f3438c.a().execute(new a());
        } else {
            h hVar = this.f3445c;
            hVar.f3437b.g(hVar.f3436a, this.f3446d);
        }
    }
}
