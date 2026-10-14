package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import com.google.gson.i;
import com.google.gson.internal.g;
import com.google.gson.internal.p;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.q;
import com.google.gson.s;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

/* JADX INFO: loaded from: classes2.dex */
public final class MapTypeAdapterFactory implements s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f12762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12763d;

    public final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TypeAdapter<K> f12764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TypeAdapter<V> f12765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.google.gson.internal.s<? extends Map<K, V>> f12766c;

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, com.google.gson.internal.s<? extends Map<K, V>> sVar) {
            this.f12764a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.f12765b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.f12766c = sVar;
        }

        @Override // com.google.gson.TypeAdapter
        public Object b(o6.a aVar) throws IOException {
            o6.b bVarV = aVar.V();
            if (bVarV == o6.b.NULL) {
                aVar.O();
                return null;
            }
            Map<K, V> mapA = this.f12766c.a();
            if (bVarV == o6.b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.k()) {
                    aVar.a();
                    K kB = this.f12764a.b(aVar);
                    if (mapA.put(kB, this.f12765b.b(aVar)) != null) {
                        throw new q("duplicate key: " + kB);
                    }
                    aVar.g();
                }
                aVar.g();
            } else {
                aVar.b();
                while (aVar.k()) {
                    p.f12866a.a(aVar);
                    K kB2 = this.f12764a.b(aVar);
                    if (mapA.put(kB2, this.f12765b.b(aVar)) != null) {
                        throw new q("duplicate key: " + kB2);
                    }
                }
                aVar.h();
            }
            return mapA;
        }

        @Override // com.google.gson.TypeAdapter
        public void c(o6.c cVar, Object obj) throws IOException {
            String strG;
            Map map = (Map) obj;
            if (map == null) {
                cVar.k();
                return;
            }
            if (MapTypeAdapterFactory.this.f12763d) {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i10 = 0;
                boolean z10 = false;
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    TypeAdapter<K> typeAdapter = this.f12764a;
                    K key = entry.getKey();
                    Objects.requireNonNull(typeAdapter);
                    try {
                        b bVar = new b();
                        typeAdapter.c(bVar, key);
                        if (!bVar.f12845n.isEmpty()) {
                            throw new IllegalStateException("Expected one JSON element but was " + bVar.f12845n);
                        }
                        i iVar = bVar.f12847p;
                        arrayList.add(iVar);
                        arrayList2.add(entry.getValue());
                        Objects.requireNonNull(iVar);
                        z10 |= (iVar instanceof f) || (iVar instanceof l);
                    } catch (IOException e10) {
                        throw new j(e10);
                    }
                }
                if (z10) {
                    cVar.b();
                    int size = arrayList.size();
                    while (i10 < size) {
                        cVar.b();
                        TypeAdapters.C.c(cVar, (i) arrayList.get(i10));
                        this.f12765b.c(cVar, (V) arrayList2.get(i10));
                        cVar.g();
                        i10++;
                    }
                    cVar.g();
                    return;
                }
                cVar.c();
                int size2 = arrayList.size();
                while (i10 < size2) {
                    i iVar2 = (i) arrayList.get(i10);
                    Objects.requireNonNull(iVar2);
                    if (iVar2 instanceof n) {
                        n nVarD = iVar2.d();
                        Object obj2 = nVarD.f12900a;
                        if (obj2 instanceof Number) {
                            strG = String.valueOf(nVarD.f());
                        } else if (obj2 instanceof Boolean) {
                            strG = Boolean.toString(nVarD.e());
                        } else {
                            if (!(obj2 instanceof String)) {
                                throw new AssertionError();
                            }
                            strG = nVarD.g();
                        }
                    } else {
                        if (!(iVar2 instanceof k)) {
                            throw new AssertionError();
                        }
                        strG = "null";
                    }
                    cVar.i(strG);
                    this.f12765b.c(cVar, (V) arrayList2.get(i10));
                    i10++;
                }
            } else {
                cVar.c();
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    cVar.i(String.valueOf(entry2.getKey()));
                    this.f12765b.c(cVar, entry2.getValue());
                }
            }
            cVar.h();
        }
    }

    public MapTypeAdapterFactory(g gVar, boolean z10) {
        this.f12762c = gVar;
        this.f12763d = z10;
    }

    @Override // com.google.gson.s
    public <T> TypeAdapter<T> b(Gson gson, n6.a<T> aVar) {
        Type[] actualTypeArguments;
        Type type = aVar.type;
        if (!Map.class.isAssignableFrom(aVar.rawType)) {
            return null;
        }
        Class<?> clsE = com.google.gson.internal.a.e(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type typeF = com.google.gson.internal.a.f(type, clsE, Map.class);
            actualTypeArguments = typeF instanceof ParameterizedType ? ((ParameterizedType) typeF).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new Adapter(gson, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? TypeAdapters.f12797c : gson.d(new n6.a<>(type2)), actualTypeArguments[1], gson.d(new n6.a<>(actualTypeArguments[1])), this.f12762c.a(aVar));
    }
}
