package com.yandex.mobile.ads.impl;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class z00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<oy> f27180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InputStream f27182d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f27183e;

    public z00(int i10, ArrayList arrayList) {
        this(i10, arrayList, -1, null);
    }

    public z00(int i10, ArrayList arrayList, int i11, InputStream inputStream) {
        this.f27179a = i10;
        this.f27180b = arrayList;
        this.f27181c = i11;
        this.f27182d = inputStream;
        this.f27183e = null;
    }

    public z00(int i10, ArrayList arrayList, byte[] bArr) {
        this.f27179a = i10;
        this.f27180b = arrayList;
        this.f27181c = bArr.length;
        this.f27183e = bArr;
        this.f27182d = null;
    }

    public final InputStream a() {
        InputStream inputStream = this.f27182d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f27183e != null) {
            return new ByteArrayInputStream(this.f27183e);
        }
        return null;
    }

    public final int b() {
        return this.f27181c;
    }

    public final List<oy> c() {
        return Collections.unmodifiableList(this.f27180b);
    }

    public final int d() {
        return this.f27179a;
    }
}
