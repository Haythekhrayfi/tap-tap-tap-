package c8;

import com.developer.filepicker.model.DialogConfigs;
import ed.u;
import fd.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import kc.q;
import kc.t;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3631c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<jc.h<String, String>> f3633b;

    public static final class a {
        public a() {
        }

        public a(vc.g gVar) {
        }

        public final e a(long j10) {
            return new e(j10, new ArrayList());
        }
    }

    public e(long j10, List<jc.h<String, String>> list) {
        j0.i(list, "states");
        this.f3632a = j10;
        this.f3633b = list;
    }

    public /* synthetic */ e(long j10, List list, int i10, vc.g gVar) {
        this(j10, (i10 & 2) != 0 ? new ArrayList() : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final e e(String str) throws i {
        Objects.requireNonNull(f3631c);
        ArrayList arrayList = new ArrayList();
        List listR = u.R(str, new String[]{DialogConfigs.DIRECTORY_SEPERATOR}, false, 0, 6);
        try {
            long j10 = Long.parseLong((String) listR.get(0));
            int i10 = 2;
            if (listR.size() % 2 != 1) {
                throw new i(j0.p("Must be even number of states in path: ", str), null, i10, 0 == true ? 1 : 0);
            }
            bd.a aVarG = bd.e.g(bd.e.h(1, listR.size()), 2);
            int i11 = aVarG.f3515c;
            int i12 = aVarG.f3516d;
            int i13 = aVarG.f3517e;
            if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                while (true) {
                    int i14 = i11 + i13;
                    arrayList.add(new jc.h(listR.get(i11), listR.get(i11 + 1)));
                    if (i11 == i12) {
                        break;
                    }
                    i11 = i14;
                }
            }
            return new e(j10, arrayList);
        } catch (NumberFormatException e10) {
            throw new i(j0.p("Top level id must be number: ", str), e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a() {
        if (this.f3633b.isEmpty()) {
            return null;
        }
        return (String) ((jc.h) t.x(this.f3633b)).f31812d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String b() {
        if (this.f3633b.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        long j10 = this.f3632a;
        List<jc.h<String, String>> list = this.f3633b;
        sb2.append(new e(j10, list.subList(0, list.size() - 1)));
        sb2.append('/');
        sb2.append((String) ((jc.h) t.x(this.f3633b)).f31811c);
        return sb2.toString();
    }

    public final boolean c() {
        return this.f3633b.isEmpty();
    }

    public final e d() {
        if (c()) {
            return this;
        }
        List listJ = t.J(this.f3633b);
        j0.i(listJ, "<this>");
        ArrayList arrayList = (ArrayList) listJ;
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        arrayList.remove(kc.l.b(listJ));
        return new e(this.f3632a, listJ);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f3632a == eVar.f3632a && j0.d(this.f3633b, eVar.f3633b);
    }

    public int hashCode() {
        return this.f3633b.hashCode() + (Long.hashCode(this.f3632a) * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        if (!(!this.f3633b.isEmpty())) {
            return String.valueOf(this.f3632a);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f3632a);
        sb2.append('/');
        List<jc.h<String, String>> list = this.f3633b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            jc.h hVar = (jc.h) it.next();
            q.l(arrayList, kc.l.c((String) hVar.f31811c, (String) hVar.f31812d));
        }
        sb2.append(t.w(arrayList, DialogConfigs.DIRECTORY_SEPERATOR, null, null, 0, null, null, 62));
        return sb2.toString();
    }
}
