package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes2.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends TypeAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Gson f12792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter<T> f12793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f12794c;

    public TypeAdapterRuntimeTypeWrapper(Gson gson, TypeAdapter<T> typeAdapter, Type type) {
        this.f12792a = gson;
        this.f12793b = typeAdapter;
        this.f12794c = type;
    }

    @Override // com.google.gson.TypeAdapter
    public T b(o6.a aVar) throws IOException {
        return this.f12793b.b(aVar);
    }

    @Override // com.google.gson.TypeAdapter
    public void c(o6.c cVar, T t10) throws IOException {
        TypeAdapter<T> typeAdapterD = this.f12793b;
        Type type = this.f12794c;
        if (t10 != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t10.getClass();
        }
        if (type != this.f12794c) {
            typeAdapterD = this.f12792a.d(new n6.a<>(type));
            if (typeAdapterD instanceof ReflectiveTypeAdapterFactory.Adapter) {
                TypeAdapter<T> typeAdapter = this.f12793b;
                if (!(typeAdapter instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    typeAdapterD = typeAdapter;
                }
            }
        }
        typeAdapterD.c(cVar, t10);
    }
}
