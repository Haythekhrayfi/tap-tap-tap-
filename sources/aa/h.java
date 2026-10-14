package aa;

import ba.j;

/* JADX INFO: loaded from: classes.dex */
public class h extends com.yandex.metrica.billing_interface.d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f250c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f251d;

    public h(androidx.viewpager2.widget.d dVar) {
        this.f251d = dVar;
    }

    @Override // com.yandex.metrica.billing_interface.d
    public void a() {
        switch (this.f250c) {
            case 0:
                ((com.android.billingclient.api.e) ((androidx.viewpager2.widget.d) this.f251d).f3051b).c();
                break;
            default:
                ((j) this.f251d).f3449b.c();
                break;
        }
    }

    public h(j jVar) {
        this.f251d = jVar;
    }
}
