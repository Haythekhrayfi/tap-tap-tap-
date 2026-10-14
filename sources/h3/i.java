package h3;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class i implements h3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g<a, Object> f30562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f30563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f30564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Class<?>, h3.a<?>> f30565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30567f;

    public static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f30568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f30569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Class<?> f30570c;

        public a(b bVar) {
            this.f30568a = bVar;
        }

        @Override // h3.l
        public void a() {
            this.f30568a.c(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f30569b == aVar.f30569b && this.f30570c == aVar.f30570c;
        }

        public int hashCode() {
            int i10 = this.f30569b * 31;
            Class<?> cls = this.f30570c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Key{size=");
            sbA.append(this.f30569b);
            sbA.append("array=");
            sbA.append(this.f30570c);
            sbA.append('}');
            return sbA.toString();
        }
    }

    public static final class b extends c<a> {
        @Override // h3.c
        public l a() {
            return new a(this);
        }

        public a d(int i10, Class<?> cls) {
            a aVarB = b();
            aVarB.f30569b = i10;
            aVarB.f30570c = cls;
            return aVarB;
        }
    }

    public i() {
        this.f30562a = new g<>();
        this.f30563b = new b();
        this.f30564c = new HashMap();
        this.f30565d = new HashMap();
        this.f30566e = 4194304;
    }

    public i(int i10) {
        this.f30562a = new g<>();
        this.f30563b = new b();
        this.f30564c = new HashMap();
        this.f30565d = new HashMap();
        this.f30566e = i10;
    }

    @Override // h3.b
    public synchronized void a(int i10) {
        if (i10 >= 40) {
            synchronized (this) {
                f(0);
            }
        } else if (i10 >= 20 || i10 == 15) {
            f(this.f30566e / 2);
        }
    }

    @Override // h3.b
    public synchronized void b() {
        f(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h3.b
    public synchronized <T> T c(int i10, Class<T> cls) {
        a aVarB;
        aVarB = this.f30563b.b();
        aVarB.f30569b = i10;
        aVarB.f30570c = cls;
        return (T) h(aVarB, cls);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // h3.b
    public synchronized <T> T d(int i10, Class<T> cls) {
        a aVarD;
        Integer numCeilingKey = i(cls).ceilingKey(Integer.valueOf(i10));
        boolean z10 = true;
        if (numCeilingKey == null) {
            z10 = false;
        } else {
            int i11 = this.f30567f;
            if (!(i11 == 0 || this.f30566e / i11 >= 2) && numCeilingKey.intValue() > i10 * 8) {
                z10 = false;
            }
        }
        if (z10) {
            aVarD = this.f30563b.d(numCeilingKey.intValue(), cls);
        } else {
            a aVarB = this.f30563b.b();
            aVarB.f30569b = i10;
            aVarB.f30570c = cls;
            aVarD = aVarB;
        }
        return (T) h(aVarD, cls);
    }

    public final void e(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapI = i(cls);
        Integer num = (Integer) navigableMapI.get(Integer.valueOf(i10));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
        }
        int iIntValue = num.intValue();
        Integer numValueOf = Integer.valueOf(i10);
        if (iIntValue == 1) {
            navigableMapI.remove(numValueOf);
        } else {
            navigableMapI.put(numValueOf, Integer.valueOf(num.intValue() - 1));
        }
    }

    public final void f(int i10) {
        while (this.f30567f > i10) {
            Object objC = this.f30562a.c();
            Objects.requireNonNull(objC, "Argument must not be null");
            h3.a aVarG = g(objC.getClass());
            this.f30567f -= aVarG.a() * aVarG.b(objC);
            e(aVarG.b(objC), objC.getClass());
            if (Log.isLoggable(aVarG.e(), 2)) {
                String strE = aVarG.e();
                StringBuilder sbA = defpackage.a.a("evicted: ");
                sbA.append(aVarG.b(objC));
                Log.v(strE, sbA.toString());
            }
        }
    }

    public final <T> h3.a<T> g(Class<T> cls) {
        h3.a<T> fVar = (h3.a) this.f30565d.get(cls);
        if (fVar == null) {
            if (cls.equals(int[].class)) {
                fVar = new h();
            } else {
                if (!cls.equals(byte[].class)) {
                    StringBuilder sbA = defpackage.a.a("No array pool found for: ");
                    sbA.append(cls.getSimpleName());
                    throw new IllegalArgumentException(sbA.toString());
                }
                fVar = new f();
            }
            this.f30565d.put(cls, fVar);
        }
        return fVar;
    }

    public final <T> T h(a aVar, Class<T> cls) {
        h3.a<T> aVarG = g(cls);
        T t10 = (T) this.f30562a.a(aVar);
        if (t10 != null) {
            this.f30567f -= aVarG.a() * aVarG.b(t10);
            e(aVarG.b(t10), cls);
        }
        if (t10 != null) {
            return t10;
        }
        if (Log.isLoggable(aVarG.e(), 2)) {
            String strE = aVarG.e();
            StringBuilder sbA = defpackage.a.a("Allocated ");
            sbA.append(aVar.f30569b);
            sbA.append(" bytes");
            Log.v(strE, sbA.toString());
        }
        return aVarG.newArray(aVar.f30569b);
    }

    public final NavigableMap<Integer, Integer> i(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f30564c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f30564c.put(cls, treeMap);
        return treeMap;
    }

    @Override // h3.b
    public synchronized <T> void put(T t10) {
        Class<?> cls = t10.getClass();
        h3.a<T> aVarG = g(cls);
        int iB = aVarG.b(t10);
        int iA = aVarG.a() * iB;
        int iIntValue = 1;
        if (iA <= this.f30566e / 2) {
            a aVarD = this.f30563b.d(iB, cls);
            this.f30562a.b(aVarD, t10);
            NavigableMap<Integer, Integer> navigableMapI = i(cls);
            Integer num = (Integer) navigableMapI.get(Integer.valueOf(aVarD.f30569b));
            Integer numValueOf = Integer.valueOf(aVarD.f30569b);
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapI.put(numValueOf, Integer.valueOf(iIntValue));
            this.f30567f += iA;
            f(this.f30566e);
        }
    }
}
