package com.google.gson.internal;

import ch.qos.logback.core.net.SyslogConstants;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Excluder implements com.google.gson.s, Cloneable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Excluder f12734h = new Excluder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f12735c = -1.0d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12736d = SyslogConstants.LOG_LOCAL1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12737e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<com.google.gson.a> f12738f = Collections.emptyList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<com.google.gson.a> f12739g = Collections.emptyList();

    @Override // com.google.gson.s
    public <T> TypeAdapter<T> b(final Gson gson, final n6.a<T> aVar) {
        Class<? super T> cls = aVar.rawType;
        boolean zC = c(cls);
        final boolean z10 = zC || d(cls, true);
        final boolean z11 = zC || d(cls, false);
        if (z10 || z11) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public TypeAdapter<T> f12740a;

                @Override // com.google.gson.TypeAdapter
                public T b(o6.a aVar2) throws IOException {
                    if (z11) {
                        aVar2.e0();
                        return null;
                    }
                    TypeAdapter<T> typeAdapterE = this.f12740a;
                    if (typeAdapterE == null) {
                        typeAdapterE = gson.e(Excluder.this, aVar);
                        this.f12740a = typeAdapterE;
                    }
                    return typeAdapterE.b(aVar2);
                }

                @Override // com.google.gson.TypeAdapter
                public void c(o6.c cVar, T t10) throws IOException {
                    if (z10) {
                        cVar.k();
                        return;
                    }
                    TypeAdapter<T> typeAdapterE = this.f12740a;
                    if (typeAdapterE == null) {
                        typeAdapterE = gson.e(Excluder.this, aVar);
                        this.f12740a = typeAdapterE;
                    }
                    typeAdapterE.c(cVar, t10);
                }
            };
        }
        return null;
    }

    public final boolean c(Class<?> cls) {
        if (this.f12735c == -1.0d || g((k6.c) cls.getAnnotation(k6.c.class), (k6.d) cls.getAnnotation(k6.d.class))) {
            return (!this.f12737e && f(cls)) || e(cls);
        }
        return true;
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean d(Class<?> cls, boolean z10) {
        Iterator<com.google.gson.a> it = (z10 ? this.f12738f : this.f12739g).iterator();
        while (it.hasNext()) {
            if (it.next().b(cls)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public final boolean f(Class<?> cls) {
        if (cls.isMemberClass()) {
            if (!((cls.getModifiers() & 8) != 0)) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(k6.c cVar, k6.d dVar) {
        if (cVar == null || cVar.value() <= this.f12735c) {
            return dVar == null || (dVar.value() > this.f12735c ? 1 : (dVar.value() == this.f12735c ? 0 : -1)) > 0;
        }
        return false;
    }
}
