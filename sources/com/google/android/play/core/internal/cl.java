package com.google.android.play.core.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class cl<T> implements cn, cj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f12292a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile cn<T> f12293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Object f12294c = f12292a;

    private cl(cn<T> cnVar) {
        this.f12293b = cnVar;
    }

    public static <P extends cn<T>, T> cn<T> a(P p10) {
        bq.a(p10);
        return p10 instanceof cl ? p10 : new cl(p10);
    }

    public static <P extends cn<T>, T> cj<T> b(P p10) {
        if (p10 instanceof cj) {
            return (cj) p10;
        }
        bq.a(p10);
        return new cl(p10);
    }

    @Override // com.google.android.play.core.internal.cn
    public final T a() {
        T tA = (T) this.f12294c;
        Object obj = f12292a;
        if (tA == obj) {
            synchronized (this) {
                tA = (T) this.f12294c;
                if (tA == obj) {
                    tA = this.f12293b.a();
                    Object obj2 = this.f12294c;
                    if (obj2 != obj && !(obj2 instanceof cm) && obj2 != tA) {
                        String strValueOf = String.valueOf(obj2);
                        String strValueOf2 = String.valueOf(tA);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 118 + strValueOf2.length());
                        sb2.append("Scoped provider was invoked recursively returning different results: ");
                        sb2.append(strValueOf);
                        sb2.append(" & ");
                        sb2.append(strValueOf2);
                        sb2.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    this.f12294c = tA;
                    this.f12293b = null;
                }
            }
        }
        return tA;
    }
}
