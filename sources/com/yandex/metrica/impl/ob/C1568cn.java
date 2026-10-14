package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1568cn {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C1568cn f15896c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, C1518an> f15898b = new HashMap();

    public C1568cn(Context context) {
        this.f15897a = context;
    }

    public static C1568cn a(Context context) {
        if (f15896c == null) {
            synchronized (C1568cn.class) {
                if (f15896c == null) {
                    f15896c = new C1568cn(context);
                }
            }
        }
        return f15896c;
    }

    public C1518an a(String str) {
        if (!this.f15898b.containsKey(str)) {
            synchronized (this) {
                if (!this.f15898b.containsKey(str)) {
                    this.f15898b.put(str, new C1518an(new ReentrantLock(), new C1543bn(this.f15897a, str)));
                }
            }
        }
        return this.f15898b.get(str);
    }
}
