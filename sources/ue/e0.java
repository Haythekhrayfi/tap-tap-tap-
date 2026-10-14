package ue;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f36396a = new e0();

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return d0.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof d0;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        StringBuilder sbA = defpackage.a.a("@");
        sbA.append(d0.class.getName());
        sbA.append("()");
        return sbA.toString();
    }
}
