package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.developer.filepicker.model.DialogConfigs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface r81 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f24626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f24627b;

        public a(String str, byte[] bArr) {
            this.f24626a = str;
            this.f24627b = bArr;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f24628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<a> f24629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f24630c;

        public b(int i10, String str, ArrayList arrayList, byte[] bArr) {
            this.f24628a = str;
            this.f24629b = arrayList == null ? Collections.emptyList() : Collections.unmodifiableList(arrayList);
            this.f24630c = bArr;
        }
    }

    public interface c {
        SparseArray<r81> a();

        r81 a(int i10, b bVar);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f24632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f24633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f24634d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f24635e;

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + DialogConfigs.DIRECTORY_SEPERATOR;
            } else {
                str = "";
            }
            this.f24631a = str;
            this.f24632b = i11;
            this.f24633c = i12;
            this.f24634d = Integer.MIN_VALUE;
            this.f24635e = "";
        }

        public final void a() {
            int i10 = this.f24634d;
            this.f24634d = i10 == Integer.MIN_VALUE ? this.f24632b : i10 + this.f24633c;
            this.f24635e = this.f24631a + this.f24634d;
        }

        public final String b() {
            if (this.f24634d != Integer.MIN_VALUE) {
                return this.f24635e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        public final int c() {
            int i10 = this.f24634d;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    void a();

    void a(int i10, mp0 mp0Var) throws qp0;

    void a(a71 a71Var, wt wtVar, d dVar);
}
