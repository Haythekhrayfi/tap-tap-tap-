package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.internal.u;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes2.dex */
public final class Gson {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final n6.a<?> f12715n = new n6.a<>(Object.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal<Map<n6.a<?>, FutureTypeAdapter<?>>> f12716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<n6.a<?>, TypeAdapter<?>> f12717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.gson.internal.g f12718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f12719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<s> f12720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map<Type, e<?>> f12721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f12722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f12724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f12725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f12726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<s> f12727l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<s> f12728m;

    /* JADX INFO: renamed from: com.google.gson.Gson$3, reason: invalid class name */
    final class AnonymousClass3 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        public Number b(o6.a aVar) throws IOException {
            if (aVar.V() != o6.b.NULL) {
                return Long.valueOf(aVar.C());
            }
            aVar.O();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        public void c(o6.c cVar, Number number) throws IOException {
            Number number2 = number;
            if (number2 == null) {
                cVar.k();
            } else {
                cVar.K(number2.toString());
            }
        }
    }

    public static class FutureTypeAdapter<T> extends TypeAdapter<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TypeAdapter<T> f12731a;

        @Override // com.google.gson.TypeAdapter
        public T b(o6.a aVar) throws IOException {
            TypeAdapter<T> typeAdapter = this.f12731a;
            if (typeAdapter != null) {
                return typeAdapter.b(aVar);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.TypeAdapter
        public void c(o6.c cVar, T t10) throws IOException {
            TypeAdapter<T> typeAdapter = this.f12731a;
            if (typeAdapter == null) {
                throw new IllegalStateException();
            }
            typeAdapter.c(cVar, t10);
        }
    }

    public Gson() {
        Excluder excluder = Excluder.f12734h;
        c cVar = c.IDENTITY;
        Map<Type, e<?>> mapEmptyMap = Collections.emptyMap();
        r rVar = r.DEFAULT;
        List<s> listEmptyList = Collections.emptyList();
        List<s> listEmptyList2 = Collections.emptyList();
        List listEmptyList3 = Collections.emptyList();
        this.f12716a = new ThreadLocal<>();
        this.f12717b = new ConcurrentHashMap();
        this.f12721f = mapEmptyMap;
        com.google.gson.internal.g gVar = new com.google.gson.internal.g(mapEmptyMap);
        this.f12718c = gVar;
        this.f12722g = false;
        this.f12723h = false;
        this.f12724i = true;
        this.f12725j = false;
        this.f12726k = false;
        this.f12727l = listEmptyList;
        this.f12728m = listEmptyList2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.D);
        arrayList.add(ObjectTypeAdapter.f12768b);
        arrayList.add(excluder);
        arrayList.addAll(listEmptyList3);
        arrayList.add(TypeAdapters.f12812r);
        arrayList.add(TypeAdapters.f12801g);
        arrayList.add(TypeAdapters.f12798d);
        arrayList.add(TypeAdapters.f12799e);
        arrayList.add(TypeAdapters.f12800f);
        final TypeAdapter<Number> typeAdapter = TypeAdapters.f12805k;
        arrayList.add(TypeAdapters.b(Long.TYPE, Long.class, typeAdapter));
        arrayList.add(TypeAdapters.b(Double.TYPE, Double.class, new TypeAdapter<Number>(this) { // from class: com.google.gson.Gson.1
            @Override // com.google.gson.TypeAdapter
            public Number b(o6.a aVar) throws IOException {
                if (aVar.V() != o6.b.NULL) {
                    return Double.valueOf(aVar.p());
                }
                aVar.O();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar2, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    cVar2.k();
                } else {
                    Gson.a(number2.doubleValue());
                    cVar2.J(number2);
                }
            }
        }));
        arrayList.add(TypeAdapters.b(Float.TYPE, Float.class, new TypeAdapter<Number>(this) { // from class: com.google.gson.Gson.2
            @Override // com.google.gson.TypeAdapter
            public Number b(o6.a aVar) throws IOException {
                if (aVar.V() != o6.b.NULL) {
                    return Float.valueOf((float) aVar.p());
                }
                aVar.O();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void c(o6.c cVar2, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    cVar2.k();
                } else {
                    Gson.a(number2.floatValue());
                    cVar2.J(number2);
                }
            }
        }));
        arrayList.add(TypeAdapters.f12808n);
        arrayList.add(TypeAdapters.f12802h);
        arrayList.add(TypeAdapters.f12803i);
        arrayList.add(TypeAdapters.a(AtomicLong.class, new TypeAdapter.AnonymousClass1()));
        arrayList.add(TypeAdapters.a(AtomicLongArray.class, new TypeAdapter.AnonymousClass1()));
        arrayList.add(TypeAdapters.f12804j);
        arrayList.add(TypeAdapters.f12809o);
        arrayList.add(TypeAdapters.f12813s);
        arrayList.add(TypeAdapters.f12814t);
        arrayList.add(TypeAdapters.a(BigDecimal.class, TypeAdapters.f12810p));
        arrayList.add(TypeAdapters.a(BigInteger.class, TypeAdapters.f12811q));
        arrayList.add(TypeAdapters.f12815u);
        arrayList.add(TypeAdapters.f12816v);
        arrayList.add(TypeAdapters.f12818x);
        arrayList.add(TypeAdapters.f12819y);
        arrayList.add(TypeAdapters.B);
        arrayList.add(TypeAdapters.f12817w);
        arrayList.add(TypeAdapters.f12796b);
        arrayList.add(DateTypeAdapter.f12759b);
        arrayList.add(TypeAdapters.A);
        arrayList.add(TimeTypeAdapter.f12783b);
        arrayList.add(SqlDateTypeAdapter.f12781b);
        arrayList.add(TypeAdapters.f12820z);
        arrayList.add(ArrayTypeAdapter.f12753c);
        arrayList.add(TypeAdapters.f12795a);
        arrayList.add(new CollectionTypeAdapterFactory(gVar));
        arrayList.add(new MapTypeAdapterFactory(gVar, false));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(gVar);
        this.f12719d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.E);
        arrayList.add(new ReflectiveTypeAdapterFactory(gVar, cVar, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f12720e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public <T> T b(String str, Class<T> cls) throws q {
        Object objC = c(str, cls);
        Class<T> cls2 = (Class) u.f12890a.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.cast(objC);
    }

    public <T> T c(String str, Type type) throws q {
        T tB = null;
        if (str == null) {
            return null;
        }
        o6.a aVar = new o6.a(new StringReader(str));
        boolean z10 = this.f12726k;
        aVar.f33969d = z10;
        boolean z11 = true;
        aVar.f33969d = true;
        try {
            try {
                try {
                    aVar.V();
                    z11 = false;
                    tB = d(new n6.a<>(type)).b(aVar);
                } catch (EOFException e10) {
                    if (!z11) {
                        throw new q(e10);
                    }
                } catch (AssertionError e11) {
                    throw new AssertionError("AssertionError (GSON 2.8.5): " + e11.getMessage(), e11);
                }
                aVar.f33969d = z10;
                if (tB != null) {
                    try {
                        if (aVar.V() != o6.b.END_DOCUMENT) {
                            throw new j("JSON document was not fully consumed.");
                        }
                    } catch (o6.d e12) {
                        throw new q(e12);
                    } catch (IOException e13) {
                        throw new j(e13);
                    }
                }
                return tB;
            } catch (IOException e14) {
                throw new q(e14);
            } catch (IllegalStateException e15) {
                throw new q(e15);
            }
        } catch (Throwable th) {
            aVar.f33969d = z10;
            throw th;
        }
    }

    public <T> TypeAdapter<T> d(n6.a<T> aVar) {
        TypeAdapter<T> typeAdapter = (TypeAdapter) this.f12717b.get(aVar);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map<n6.a<?>, FutureTypeAdapter<?>> map = this.f12716a.get();
        boolean z10 = false;
        if (map == null) {
            map = new HashMap<>();
            this.f12716a.set(map);
            z10 = true;
        }
        FutureTypeAdapter<?> futureTypeAdapter = map.get(aVar);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter<?> futureTypeAdapter2 = new FutureTypeAdapter<>();
            map.put(aVar, futureTypeAdapter2);
            Iterator<s> it = this.f12720e.iterator();
            while (it.hasNext()) {
                TypeAdapter<T> typeAdapterB = it.next().b(this, aVar);
                if (typeAdapterB != null) {
                    if (futureTypeAdapter2.f12731a != null) {
                        throw new AssertionError();
                    }
                    futureTypeAdapter2.f12731a = typeAdapterB;
                    this.f12717b.put(aVar, typeAdapterB);
                    map.remove(aVar);
                    if (z10) {
                        this.f12716a.remove();
                    }
                    return typeAdapterB;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + aVar);
        } catch (Throwable th) {
            map.remove(aVar);
            if (z10) {
                this.f12716a.remove();
            }
            throw th;
        }
    }

    public <T> TypeAdapter<T> e(s sVar, n6.a<T> aVar) {
        if (!this.f12720e.contains(sVar)) {
            sVar = this.f12719d;
        }
        boolean z10 = false;
        for (s sVar2 : this.f12720e) {
            if (z10) {
                TypeAdapter<T> typeAdapterB = sVar2.b(this, aVar);
                if (typeAdapterB != null) {
                    return typeAdapterB;
                }
            } else if (sVar2 == sVar) {
                z10 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public o6.c f(Writer writer) throws IOException {
        if (this.f12723h) {
            writer.write(")]}'\n");
        }
        o6.c cVar = new o6.c(writer);
        if (this.f12725j) {
            cVar.f33988f = "  ";
            cVar.f33989g = ": ";
        }
        cVar.f33993k = this.f12722g;
        return cVar;
    }

    public String g(Object obj) {
        if (obj == null) {
            i iVar = k.f12897a;
            StringWriter stringWriter = new StringWriter();
            try {
                h(iVar, f(stringWriter));
                return stringWriter.toString();
            } catch (IOException e10) {
                throw new j(e10);
            }
        }
        Type type = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            i(obj, type, f(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e11) {
            throw new j(e11);
        }
    }

    public void h(i iVar, o6.c cVar) throws j {
        boolean z10 = cVar.f33990h;
        cVar.f33990h = true;
        boolean z11 = cVar.f33991i;
        cVar.f33991i = this.f12724i;
        boolean z12 = cVar.f33993k;
        cVar.f33993k = this.f12722g;
        try {
            try {
                TypeAdapters.C.c(cVar, iVar);
                cVar.f33990h = z10;
                cVar.f33991i = z11;
                cVar.f33993k = z12;
            } catch (IOException e10) {
                throw new j(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e11.getMessage(), e11);
            }
        } catch (Throwable th) {
            cVar.f33990h = z10;
            cVar.f33991i = z11;
            cVar.f33993k = z12;
            throw th;
        }
    }

    public void i(Object obj, Type type, o6.c cVar) throws j {
        TypeAdapter typeAdapterD = d(new n6.a(type));
        boolean z10 = cVar.f33990h;
        cVar.f33990h = true;
        boolean z11 = cVar.f33991i;
        cVar.f33991i = this.f12724i;
        boolean z12 = cVar.f33993k;
        cVar.f33993k = this.f12722g;
        try {
            try {
                try {
                    typeAdapterD.c(cVar, obj);
                    cVar.f33990h = z10;
                    cVar.f33991i = z11;
                    cVar.f33993k = z12;
                } catch (IOException e10) {
                    throw new j(e10);
                }
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.8.5): " + e11.getMessage(), e11);
            }
        } catch (Throwable th) {
            cVar.f33990h = z10;
            cVar.f33991i = z11;
            cVar.f33993k = z12;
            throw th;
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f12722g + ",factories:" + this.f12720e + ",instanceCreators:" + this.f12718c + "}";
    }
}
