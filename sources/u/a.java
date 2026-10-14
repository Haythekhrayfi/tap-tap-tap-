package u;

import java.util.HashMap;
import s.b;
import v.f;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f35898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f35900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f35901d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f35902e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f35903f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f35904g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f35905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f35906i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f35907j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f35908k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f35909l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f35910m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f35911n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f35912o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f35913p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f35914q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashMap<String, b> f35915r;

    public a() {
        this.f35898a = null;
        this.f35899b = 0;
        this.f35900c = 0;
        this.f35901d = 0;
        this.f35902e = 0;
        this.f35903f = Float.NaN;
        this.f35904g = Float.NaN;
        this.f35905h = Float.NaN;
        this.f35906i = Float.NaN;
        this.f35907j = Float.NaN;
        this.f35908k = Float.NaN;
        this.f35909l = Float.NaN;
        this.f35910m = Float.NaN;
        this.f35911n = Float.NaN;
        this.f35912o = Float.NaN;
        this.f35913p = Float.NaN;
        this.f35914q = 0;
        this.f35915r = new HashMap<>();
    }

    public a(a aVar) {
        this.f35898a = null;
        this.f35899b = 0;
        this.f35900c = 0;
        this.f35901d = 0;
        this.f35902e = 0;
        this.f35903f = Float.NaN;
        this.f35904g = Float.NaN;
        this.f35905h = Float.NaN;
        this.f35906i = Float.NaN;
        this.f35907j = Float.NaN;
        this.f35908k = Float.NaN;
        this.f35909l = Float.NaN;
        this.f35910m = Float.NaN;
        this.f35911n = Float.NaN;
        this.f35912o = Float.NaN;
        this.f35913p = Float.NaN;
        this.f35914q = 0;
        HashMap<String, b> map = new HashMap<>();
        this.f35915r = map;
        this.f35898a = aVar.f35898a;
        this.f35899b = aVar.f35899b;
        this.f35900c = aVar.f35900c;
        this.f35901d = aVar.f35901d;
        this.f35902e = aVar.f35902e;
        this.f35903f = aVar.f35903f;
        this.f35904g = aVar.f35904g;
        this.f35905h = aVar.f35905h;
        this.f35906i = aVar.f35906i;
        this.f35907j = aVar.f35907j;
        this.f35908k = aVar.f35908k;
        this.f35909l = aVar.f35909l;
        this.f35910m = aVar.f35910m;
        this.f35911n = aVar.f35911n;
        this.f35912o = aVar.f35912o;
        this.f35913p = aVar.f35913p;
        this.f35914q = aVar.f35914q;
        map.clear();
        for (b bVar : aVar.f35915r.values()) {
            this.f35915r.put(bVar.f35384a, new b(bVar));
        }
    }

    public a(f fVar) {
        this.f35898a = null;
        this.f35899b = 0;
        this.f35900c = 0;
        this.f35901d = 0;
        this.f35902e = 0;
        this.f35903f = Float.NaN;
        this.f35904g = Float.NaN;
        this.f35905h = Float.NaN;
        this.f35906i = Float.NaN;
        this.f35907j = Float.NaN;
        this.f35908k = Float.NaN;
        this.f35909l = Float.NaN;
        this.f35910m = Float.NaN;
        this.f35911n = Float.NaN;
        this.f35912o = Float.NaN;
        this.f35913p = Float.NaN;
        this.f35914q = 0;
        this.f35915r = new HashMap<>();
        this.f35898a = fVar;
    }
}
