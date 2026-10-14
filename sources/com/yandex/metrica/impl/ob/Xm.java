package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"all"})
public class Xm<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<K, V> f15526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f15530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f15531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f15532g;

    public Xm(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f15528c = i10;
        this.f15526a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private void a(int i10) {
        Map.Entry<K, V> next;
        while (this.f15527b > i10 && !this.f15526a.isEmpty() && (next = this.f15526a.entrySet().iterator().next()) != null) {
            K key = next.getKey();
            V value = next.getValue();
            this.f15526a.remove(key);
            this.f15527b -= b(key, value);
            this.f15530e++;
        }
        if (this.f15527b < 0 || (this.f15526a.isEmpty() && this.f15527b != 0)) {
            throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int b(K k10, V v10) {
        int length = O2.c(((Xk) k10).f15524b).length + 4 + 4 + 4;
        if (length >= 0) {
            return length;
        }
        throw new IllegalStateException("Negative size: " + k10 + "=" + v10);
    }

    public final synchronized V a(K k10) {
        V v10 = this.f15526a.get(k10);
        if (v10 != null) {
            this.f15531f++;
            return v10;
        }
        this.f15532g++;
        return null;
    }

    public final synchronized V a(K k10, V v10) {
        V vPut;
        this.f15529d++;
        this.f15527b += b(k10, v10);
        vPut = this.f15526a.put(k10, v10);
        if (vPut != null) {
            this.f15527b -= b(k10, vPut);
        }
        a(this.f15528c);
        return vPut;
    }

    public final synchronized void a() {
        a(-1);
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        i10 = this.f15531f;
        i11 = this.f15532g + i10;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f15528c), Integer.valueOf(this.f15531f), Integer.valueOf(this.f15532g), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }
}
