package h2;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y1.k f30493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f30494e;

    public b(y1.k kVar, String str) {
        this.f30493d = kVar;
        this.f30494e = str;
    }

    @Override // h2.d
    public void c() {
        WorkDatabase workDatabase = this.f30493d.f38010c;
        workDatabase.c();
        try {
            Iterator it = ((ArrayList) ((g2.r) workDatabase.v()).h(this.f30494e)).iterator();
            while (it.hasNext()) {
                a(this.f30493d, (String) it.next());
            }
            workDatabase.p();
            workDatabase.g();
            b(this.f30493d);
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }
}
