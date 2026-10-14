package com.google.gson.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Type, com.google.gson.e<?>> f12857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m6.b f12858b = m6.b.f33225a;

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class a<T> implements s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.e f12859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Type f12860b;

        public a(g gVar, com.google.gson.e eVar, Type type) {
            this.f12859a = eVar;
            this.f12860b = type;
        }

        @Override // com.google.gson.internal.s
        public T a() {
            return (T) this.f12859a.a(this.f12860b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class b<T> implements s<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.google.gson.e f12861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Type f12862b;

        public b(g gVar, com.google.gson.e eVar, Type type) {
            this.f12861a = eVar;
            this.f12862b = type;
        }

        @Override // com.google.gson.internal.s
        public T a() {
            return (T) this.f12861a.a(this.f12862b);
        }
    }

    public g(Map<Type, com.google.gson.e<?>> map) {
        this.f12857a = map;
    }

    public <T> s<T> a(n6.a<T> aVar) {
        h hVar;
        Type type = aVar.type;
        Class<? super T> cls = aVar.rawType;
        com.google.gson.e<?> eVar = this.f12857a.get(type);
        if (eVar != null) {
            return new a(this, eVar, type);
        }
        com.google.gson.e<?> eVar2 = this.f12857a.get(cls);
        if (eVar2 != null) {
            return new b(this, eVar2, type);
        }
        s<T> eVar3 = null;
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f12858b.a(declaredConstructor);
            }
            hVar = new h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            hVar = null;
        }
        if (hVar != null) {
            return hVar;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                eVar3 = new i(this);
            } else if (EnumSet.class.isAssignableFrom(cls)) {
                eVar3 = new j(this, type);
            } else if (Set.class.isAssignableFrom(cls)) {
                eVar3 = new k(this);
            } else {
                eVar3 = Queue.class.isAssignableFrom(cls) ? new l(this) : new m(this);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                eVar3 = new n(this);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                eVar3 = new com.google.gson.internal.b(this);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                eVar3 = new c(this);
            } else {
                eVar3 = (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new n6.a(((ParameterizedType) type).getActualTypeArguments()[0]).rawType)) ? new e(this) : new d(this);
            }
        }
        return eVar3 != null ? eVar3 : new f(this, cls, type);
    }

    public String toString() {
        return this.f12857a.toString();
    }
}
