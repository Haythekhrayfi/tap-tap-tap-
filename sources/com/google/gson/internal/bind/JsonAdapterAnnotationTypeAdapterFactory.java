package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.h;
import com.google.gson.internal.g;
import com.google.gson.p;
import com.google.gson.s;

/* JADX INFO: loaded from: classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f12761c;

    public JsonAdapterAnnotationTypeAdapterFactory(g gVar) {
        this.f12761c = gVar;
    }

    public TypeAdapter<?> a(g gVar, Gson gson, n6.a<?> aVar, k6.a aVar2) {
        TypeAdapter<?> treeTypeAdapter;
        Object objA = gVar.a(new n6.a(aVar2.value())).a();
        if (objA instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) objA;
        } else if (objA instanceof s) {
            treeTypeAdapter = ((s) objA).b(gson, aVar);
        } else {
            boolean z10 = objA instanceof p;
            if (!z10 && !(objA instanceof h)) {
                StringBuilder sbA = defpackage.a.a("Invalid attempt to bind an instance of ");
                sbA.append(objA.getClass().getName());
                sbA.append(" as a @JsonAdapter for ");
                sbA.append(aVar.toString());
                sbA.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(sbA.toString());
            }
            treeTypeAdapter = new TreeTypeAdapter<>(z10 ? (p) objA : null, objA instanceof h ? (h) objA : null, gson, aVar, null);
        }
        return (treeTypeAdapter == null || !aVar2.nullSafe()) ? treeTypeAdapter : treeTypeAdapter.a();
    }

    @Override // com.google.gson.s
    public <T> TypeAdapter<T> b(Gson gson, n6.a<T> aVar) {
        k6.a aVar2 = (k6.a) aVar.rawType.getAnnotation(k6.a.class);
        if (aVar2 == null) {
            return null;
        }
        return (TypeAdapter<T>) a(this.f12761c, gson, aVar, aVar2);
    }
}
