package com.yandex.mobile.ads.impl;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<qa<?>> f26174a;

    /* JADX WARN: Multi-variable type inference failed */
    public w40(List<? extends qa<?>> list) {
        this.f26174a = list;
    }

    public final qa<?> a(String str) {
        fd.j0.i(str, "assetName");
        List<qa<?>> list = this.f26174a;
        Object obj = null;
        if (list == null) {
            return null;
        }
        for (Object obj2 : list) {
            if (fd.j0.d(((qa) obj2).b(), str)) {
                obj = obj2;
                break;
            }
        }
        return (qa) obj;
    }
}
