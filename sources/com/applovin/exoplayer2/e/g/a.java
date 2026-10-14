package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5468a;

    /* JADX INFO: renamed from: com.applovin.exoplayer2.e.g.a$a, reason: collision with other inner class name */
    public static final class C0086a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f5469b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<b> f5470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<C0086a> f5471d;

        public C0086a(int i10, long j10) {
            super(i10);
            this.f5469b = j10;
            this.f5470c = new ArrayList();
            this.f5471d = new ArrayList();
        }

        public void a(C0086a c0086a) {
            this.f5471d.add(c0086a);
        }

        public void a(b bVar) {
            this.f5470c.add(bVar);
        }

        public b d(int i10) {
            int size = this.f5470c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f5470c.get(i11);
                if (bVar.f5468a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        public C0086a e(int i10) {
            int size = this.f5471d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0086a c0086a = this.f5471d.get(i11);
                if (c0086a.f5468a == i10) {
                    return c0086a;
                }
            }
            return null;
        }

        @Override // com.applovin.exoplayer2.e.g.a
        public String toString() {
            return a.c(this.f5468a) + " leaves: " + Arrays.toString(this.f5470c.toArray()) + " containers: " + Arrays.toString(this.f5471d.toArray());
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y f5472b;

        public b(int i10, y yVar) {
            super(i10);
            this.f5472b = yVar;
        }
    }

    public a(int i10) {
        this.f5468a = i10;
    }

    public static int a(int i10) {
        return (i10 >> 24) & 255;
    }

    public static int b(int i10) {
        return i10 & 16777215;
    }

    public static String c(int i10) {
        StringBuilder sbA = defpackage.a.a("");
        sbA.append((char) ((i10 >> 24) & 255));
        sbA.append((char) ((i10 >> 16) & 255));
        sbA.append((char) ((i10 >> 8) & 255));
        sbA.append((char) (i10 & 255));
        return sbA.toString();
    }

    public String toString() {
        return c(this.f5468a);
    }
}
