package y1;

import androidx.lifecycle.v;
import x1.o;

/* JADX INFO: loaded from: classes.dex */
public class c implements o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v<o.b> f37974c = new v<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i2.d<o.b.c> f37975d = new i2.d<>();

    public c() {
        a(o.f37412b);
    }

    public void a(o.b bVar) {
        this.f37974c.j(bVar);
        if (bVar instanceof o.b.c) {
            this.f37975d.j((o.b.c) bVar);
        } else if (bVar instanceof o.b.a) {
            this.f37975d.k(((o.b.a) bVar).f37413a);
        }
    }
}
