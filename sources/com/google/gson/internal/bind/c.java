package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import java.io.IOException;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public class c extends ReflectiveTypeAdapterFactory.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Field f12848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f12849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ TypeAdapter f12850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Gson f12851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n6.a f12852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f12853i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory, String str, boolean z10, boolean z11, Field field, boolean z12, TypeAdapter typeAdapter, Gson gson, n6.a aVar, boolean z13) {
        super(str, z10, z11);
        this.f12848d = field;
        this.f12849e = z12;
        this.f12850f = typeAdapter;
        this.f12851g = gson;
        this.f12852h = aVar;
        this.f12853i = z13;
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    public void a(o6.a aVar, Object obj) throws IllegalAccessException, IOException {
        Object objB = this.f12850f.b(aVar);
        if (objB == null && this.f12853i) {
            return;
        }
        this.f12848d.set(obj, objB);
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    public void b(o6.c cVar, Object obj) throws IllegalAccessException, IOException {
        (this.f12849e ? this.f12850f : new TypeAdapterRuntimeTypeWrapper(this.f12851g, this.f12850f, this.f12852h.type)).c(cVar, this.f12848d.get(obj));
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.a
    public boolean c(Object obj) throws IllegalAccessException, IOException {
        return this.f12779b && this.f12848d.get(obj) != obj;
    }
}
