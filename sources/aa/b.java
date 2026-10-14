package aa;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.yandex.metrica.billing_interface.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aa.a f220e;

    public class a extends com.yandex.metrica.billing_interface.d {
        public a() {
        }

        @Override // com.yandex.metrica.billing_interface.d
        public void a() {
            b bVar = b.this;
            bVar.f220e.f215f.b(bVar.f219d);
        }
    }

    public b(aa.a aVar, String str, c cVar) {
        this.f220e = aVar;
        this.f218c = str;
        this.f219d = cVar;
    }

    @Override // com.yandex.metrica.billing_interface.d
    public void a() throws Throwable {
        if (this.f220e.f213d.d()) {
            this.f220e.f213d.f(this.f218c, this.f219d);
        } else {
            this.f220e.f211b.execute(new a());
        }
    }
}
