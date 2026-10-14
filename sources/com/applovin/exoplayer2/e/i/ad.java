package com.applovin.exoplayer2.e.i;

import android.util.SparseArray;
import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.ag;
import com.developer.filepicker.model.DialogConfigs;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface ad {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5746b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f5747c;

        public a(String str, int i10, byte[] bArr) {
            this.f5745a = str;
            this.f5746b = i10;
            this.f5747c = bArr;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f5748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f5749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<a> f5750c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f5751d;

        public b(int i10, String str, List<a> list, byte[] bArr) {
            this.f5748a = i10;
            this.f5749b = str;
            this.f5750c = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
            this.f5751d = bArr;
        }
    }

    public interface c {
        SparseArray<ad> a();

        ad a(int i10, b bVar);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f5752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f5753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f5754c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f5755d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f5756e;

        public d(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        public d(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + DialogConfigs.DIRECTORY_SEPERATOR;
            } else {
                str = "";
            }
            this.f5752a = str;
            this.f5753b = i11;
            this.f5754c = i12;
            this.f5755d = Integer.MIN_VALUE;
            this.f5756e = "";
        }

        private void d() {
            if (this.f5755d == Integer.MIN_VALUE) {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public void a() {
            int i10 = this.f5755d;
            this.f5755d = i10 == Integer.MIN_VALUE ? this.f5753b : i10 + this.f5754c;
            this.f5756e = this.f5752a + this.f5755d;
        }

        public int b() {
            d();
            return this.f5755d;
        }

        public String c() {
            d();
            return this.f5756e;
        }
    }

    void a();

    void a(ag agVar, com.applovin.exoplayer2.e.j jVar, d dVar);

    void a(com.applovin.exoplayer2.l.y yVar, int i10) throws ai;
}
