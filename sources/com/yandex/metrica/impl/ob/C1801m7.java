package com.yandex.metrica.impl.ob;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.m7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1801m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f16882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<StackTraceElement> f16883f;

    public C1801m7(String str, int i10, long j10, String str2, Integer num, List<StackTraceElement> list) {
        this.f16878a = str;
        this.f16879b = i10;
        this.f16880c = j10;
        this.f16881d = str2;
        this.f16882e = num;
        this.f16883f = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }
}
