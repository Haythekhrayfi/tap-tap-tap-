package y1;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import x1.o;
import x1.s;
import x1.u;

/* JADX INFO: loaded from: classes.dex */
public class g extends s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f37992j = x1.m.e("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f37993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.work.e f37995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<? extends u> f37996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<String> f37997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<String> f37998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<g> f37999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f38000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o f38001i;

    public g(k kVar, String str, androidx.work.e eVar, List<? extends u> list) {
        this(kVar, str, eVar, list, null);
    }

    public g(k kVar, String str, androidx.work.e eVar, List<? extends u> list, List<g> list2) {
        this.f37993a = kVar;
        this.f37994b = str;
        this.f37995c = eVar;
        this.f37996d = list;
        this.f37999g = list2;
        this.f37997e = new ArrayList(list.size());
        this.f37998f = new ArrayList();
        if (list2 != null) {
            Iterator<g> it = list2.iterator();
            while (it.hasNext()) {
                this.f37998f.addAll(it.next().f37998f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String strA = list.get(i10).a();
            this.f37997e.add(strA);
            this.f37998f.add(strA);
        }
    }

    public g(k kVar, List<? extends u> list) {
        this(kVar, null, androidx.work.e.KEEP, list, null);
    }

    public static boolean b(g gVar, Set<String> set) {
        set.addAll(gVar.f37997e);
        Set<String> setC = c(gVar);
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (((HashSet) setC).contains(it.next())) {
                return true;
            }
        }
        List<g> list = gVar.f37999g;
        if (list != null && !list.isEmpty()) {
            Iterator<g> it2 = list.iterator();
            while (it2.hasNext()) {
                if (b(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.f37997e);
        return false;
    }

    public static Set<String> c(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> list = gVar.f37999g;
        if (list != null && !list.isEmpty()) {
            Iterator<g> it = list.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().f37997e);
            }
        }
        return hashSet;
    }

    public o a() {
        if (this.f38000h) {
            x1.m.c().g(f37992j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f37997e)), new Throwable[0]);
        } else {
            h2.e eVar = new h2.e(this);
            ((j2.b) this.f37993a.f38011d).f31695a.execute(eVar);
            this.f38001i = eVar.f30501d;
        }
        return this.f38001i;
    }
}
