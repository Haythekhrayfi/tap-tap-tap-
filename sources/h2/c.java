package h2;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class c extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y1.k f30495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f30496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f30497f;

    public c(y1.k kVar, String str, boolean z10) {
        this.f30495d = kVar;
        this.f30496e = str;
        this.f30497f = z10;
    }

    @Override // h2.d
    public void c() {
        WorkDatabase workDatabase = this.f30495d.f38010c;
        workDatabase.c();
        try {
            Iterator it = ((ArrayList) ((g2.r) workDatabase.v()).g(this.f30496e)).iterator();
            while (it.hasNext()) {
                a(this.f30495d, (String) it.next());
            }
            workDatabase.p();
            workDatabase.g();
            if (this.f30497f) {
                b(this.f30495d);
            }
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
