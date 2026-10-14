package l9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f33027d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f33028a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f33029b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q.a<String, a> f33030c = new q.a<>();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f33031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f33032b;

        public final void a() {
            this.f33031a = 0L;
            this.f33032b = 0;
        }
    }

    public static final class b {
        public b() {
        }

        public b(vc.g gVar) {
        }

        public static final long a(b bVar, long j10) {
            Objects.requireNonNull(bVar);
            return j10 / 1000;
        }
    }

    public final Map<String, Object> a() {
        HashMap map = new HashMap();
        map.put("view obtaining - total count", Integer.valueOf(this.f33028a.f33032b));
        map.put("view obtaining - total time (µs)", Long.valueOf(h9.d.q(b.a(f33027d, this.f33028a.f33031a))));
        Iterator it = ((q.g.b) this.f33030c.entrySet()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            a aVar = (a) entry.getValue();
            if (aVar.f33032b > 0) {
                map.put("blocking view obtaining for " + ((Object) str) + " - count", Integer.valueOf(aVar.f33032b));
                String str2 = "blocking view obtaining for " + ((Object) str) + " - avg time (µs)";
                b bVar = f33027d;
                int i10 = aVar.f33032b;
                map.put(str2, Long.valueOf(h9.d.q(b.a(bVar, i10 != 0 ? aVar.f33031a / ((long) i10) : 0L))));
            }
        }
        int i11 = this.f33029b.f33032b;
        if (i11 > 0) {
            map.put("long view requests - count", Integer.valueOf(i11));
            b bVar2 = f33027d;
            a aVar2 = this.f33029b;
            int i12 = aVar2.f33032b;
            map.put("long view requests - avg time (µs)", Long.valueOf(h9.d.q(b.a(bVar2, i12 != 0 ? aVar2.f33031a / ((long) i12) : 0L))));
        }
        return map;
    }

    public final void b(String str, long j10) {
        a aVar = this.f33028a;
        aVar.f33031a += j10;
        aVar.f33032b++;
        q.a<String, a> aVar2 = this.f33030c;
        a orDefault = aVar2.getOrDefault(str, null);
        if (orDefault == null) {
            orDefault = new a();
            aVar2.put(str, orDefault);
        }
        a aVar3 = orDefault;
        aVar3.f33031a += j10;
        aVar3.f33032b++;
    }
}
