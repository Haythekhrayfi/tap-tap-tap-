package h2;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class a extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y1.k f30491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ UUID f30492e;

    public a(y1.k kVar, UUID uuid) {
        this.f30491d = kVar;
        this.f30492e = uuid;
    }

    @Override // h2.d
    public void c() {
        WorkDatabase workDatabase = this.f30491d.f38010c;
        workDatabase.c();
        try {
            a(this.f30491d, this.f30492e.toString());
            workDatabase.p();
            workDatabase.g();
            b(this.f30491d);
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
