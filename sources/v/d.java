package v;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import w.p;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f36566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f36567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f36568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f36569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f36570f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r.i f36573i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet<d> f36565a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f36571g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f36572h = Integer.MIN_VALUE;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36574a;

        static {
            int[] iArr = new int[b.values().length];
            f36574a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36574a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36574a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36574a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36574a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36574a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36574a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36574a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36574a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(f fVar, b bVar) {
        this.f36568d = fVar;
        this.f36569e = bVar;
    }

    public boolean a(d dVar, int i10) {
        return b(dVar, i10, Integer.MIN_VALUE, false);
    }

    public boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            k();
            return true;
        }
        if (!z10 && !j(dVar)) {
            return false;
        }
        this.f36570f = dVar;
        if (dVar.f36565a == null) {
            dVar.f36565a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f36570f.f36565a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f36571g = i10;
        this.f36572h = i11;
        return true;
    }

    public void c(int i10, ArrayList<p> arrayList, p pVar) {
        HashSet<d> hashSet = this.f36565a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                w.j.a(it.next().f36568d, i10, arrayList, pVar);
            }
        }
    }

    public int d() {
        if (this.f36567c) {
            return this.f36566b;
        }
        return 0;
    }

    public int e() {
        d dVar;
        if (this.f36568d.f36608q0 == 8) {
            return 0;
        }
        int i10 = this.f36572h;
        return (i10 == Integer.MIN_VALUE || (dVar = this.f36570f) == null || dVar.f36568d.f36608q0 != 8) ? this.f36571g : i10;
    }

    public final d f() {
        switch (a.f36574a[this.f36569e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f36568d.O;
            case 3:
                return this.f36568d.M;
            case 4:
                return this.f36568d.P;
            case 5:
                return this.f36568d.N;
            default:
                throw new AssertionError(this.f36569e.name());
        }
    }

    public boolean g() {
        HashSet<d> hashSet = this.f36565a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().i()) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        HashSet<d> hashSet = this.f36565a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean i() {
        return this.f36570f != null;
    }

    public boolean j(d dVar) {
        if (dVar == null) {
            return false;
        }
        b bVar = dVar.f36569e;
        b bVar2 = this.f36569e;
        if (bVar == bVar2) {
            return bVar2 != b.BASELINE || (dVar.f36568d.H && this.f36568d.H);
        }
        switch (a.f36574a[bVar2.ordinal()]) {
            case 1:
                return (bVar == b.BASELINE || bVar == b.CENTER_X || bVar == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z10 = bVar == b.LEFT || bVar == b.RIGHT;
                if (dVar.f36568d instanceof i) {
                    return z10 || bVar == b.CENTER_X;
                }
                return z10;
            case 4:
            case 5:
                boolean z11 = bVar == b.TOP || bVar == b.BOTTOM;
                if (dVar.f36568d instanceof i) {
                    return z11 || bVar == b.CENTER_Y;
                }
                return z11;
            case 6:
                return (bVar == b.LEFT || bVar == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f36569e.name());
        }
    }

    public void k() {
        HashSet<d> hashSet;
        d dVar = this.f36570f;
        if (dVar != null && (hashSet = dVar.f36565a) != null) {
            hashSet.remove(this);
            if (this.f36570f.f36565a.size() == 0) {
                this.f36570f.f36565a = null;
            }
        }
        this.f36565a = null;
        this.f36570f = null;
        this.f36571g = 0;
        this.f36572h = Integer.MIN_VALUE;
        this.f36567c = false;
        this.f36566b = 0;
    }

    public void l() {
        r.i iVar = this.f36573i;
        if (iVar == null) {
            this.f36573i = new r.i(r.i.a.UNRESTRICTED, (String) null);
        } else {
            iVar.c();
        }
    }

    public void m(int i10) {
        this.f36566b = i10;
        this.f36567c = true;
    }

    public String toString() {
        return this.f36568d.f36612s0 + ":" + this.f36569e.toString();
    }
}
