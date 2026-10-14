package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.s;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f12753c = new s() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.s
        public <T> TypeAdapter<T> b(Gson gson, n6.a<T> aVar) {
            Type type = aVar.type;
            boolean z10 = type instanceof GenericArrayType;
            if (!z10 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z10 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new ArrayTypeAdapter(gson, gson.d(new n6.a<>(genericComponentType)), com.google.gson.internal.a.e(genericComponentType));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<E> f12754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter<E> f12755b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.f12755b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.f12754a = cls;
    }

    @Override // com.google.gson.TypeAdapter
    public Object b(o6.a aVar) throws IOException {
        if (aVar.V() == o6.b.NULL) {
            aVar.O();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.k()) {
            arrayList.add(this.f12755b.b(aVar));
        }
        aVar.g();
        int size = arrayList.size();
        Object objNewInstance = Array.newInstance((Class<?>) this.f12754a, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.TypeAdapter
    public void c(o6.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.k();
            return;
        }
        cVar.b();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f12755b.c(cVar, (E) Array.get(obj, i10));
        }
        cVar.g();
    }
}
