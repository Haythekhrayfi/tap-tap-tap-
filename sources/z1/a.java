package z1;

import g2.p;
import x1.m;

/* JADX INFO: loaded from: classes.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f45000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f45001d;

    public a(b bVar, p pVar) {
        this.f45001d = bVar;
        this.f45000c = pVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        m.c().a(b.f45002d, String.format("Scheduling work %s", this.f45000c.f29740a), new Throwable[0]);
        this.f45001d.f45003a.a(this.f45000c);
    }
}
