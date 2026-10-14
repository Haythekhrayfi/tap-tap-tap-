package com.yandex.metrica.impl.ob;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.l7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1776l7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f16813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Integer f16814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f16815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Boolean f16816f;

    public C1776l7(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }

    public C1776l7(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f16811a = str;
        this.f16812b = str2;
        this.f16813c = num;
        this.f16814d = num2;
        this.f16815e = str3;
        this.f16816f = bool;
    }

    public final String a() {
        return this.f16811a;
    }

    public final Integer b() {
        return this.f16814d;
    }

    public final String c() {
        return this.f16812b;
    }

    public final Integer d() {
        return this.f16813c;
    }

    public final String e() {
        return this.f16815e;
    }

    public final Boolean f() {
        return this.f16816f;
    }
}
