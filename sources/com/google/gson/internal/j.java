package com.google.gson.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes2.dex */
public class j implements s<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Type f12864a;

    public j(g gVar, Type type) {
        this.f12864a = type;
    }

    @Override // com.google.gson.internal.s
    public Object a() {
        Type type = this.f12864a;
        if (!(type instanceof ParameterizedType)) {
            StringBuilder sbA = defpackage.a.a("Invalid EnumSet type: ");
            sbA.append(this.f12864a.toString());
            throw new com.google.gson.j(sbA.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        StringBuilder sbA2 = defpackage.a.a("Invalid EnumSet type: ");
        sbA2.append(this.f12864a.toString());
        throw new com.google.gson.j(sbA2.toString());
    }
}
