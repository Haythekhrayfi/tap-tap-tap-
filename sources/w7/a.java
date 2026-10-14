package w7;

import android.os.Handler;
import android.os.Looper;
import fd.j0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import jc.w;
import k9.j;
import kc.t;
import uc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j<l<String, w>> f37136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<String, w> f37137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f37138c;

    /* JADX INFO: renamed from: w7.a$a, reason: collision with other inner class name */
    public static final class C0446a extends vc.l implements l<String, w> {
        public C0446a() {
            super(1);
        }

        @Override // uc.l
        public w invoke(String str) {
            List listH;
            String str2 = str;
            j0.i(str2, "variableName");
            j<l<String, w>> jVar = a.this.f37136a;
            synchronized (jVar.f31953a) {
                listH = t.H(jVar.f31953a);
            }
            Iterator it = listH.iterator();
            while (it.hasNext()) {
                ((l) it.next()).invoke(str2);
            }
            return w.f31842a;
        }
    }

    public a() {
        new Handler(Looper.getMainLooper());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        j jVar = new j();
        new LinkedHashSet();
        new LinkedHashSet();
        this.f37136a = new j<>();
        C0446a c0446a = new C0446a();
        this.f37137b = c0446a;
        this.f37138c = new i(concurrentHashMap, c0446a, jVar);
    }
}
