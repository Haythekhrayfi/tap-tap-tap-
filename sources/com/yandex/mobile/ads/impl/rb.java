package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
abstract class rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24653a;

    public static final class a extends rb {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f24654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f24655c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ArrayList f24656d;

        public a(int i10, long j10) {
            super(i10);
            this.f24654b = j10;
            this.f24655c = new ArrayList();
            this.f24656d = new ArrayList();
        }

        public final a c(int i10) {
            int size = this.f24656d.size();
            for (int i11 = 0; i11 < size; i11++) {
                a aVar = (a) this.f24656d.get(i11);
                if (aVar.f24653a == i10) {
                    return aVar;
                }
            }
            return null;
        }

        public final b d(int i10) {
            int size = this.f24655c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = (b) this.f24655c.get(i11);
                if (bVar.f24653a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // com.yandex.mobile.ads.impl.rb
        public final String toString() {
            return rb.a(this.f24653a) + " leaves: " + Arrays.toString(this.f24655c.toArray()) + " containers: " + Arrays.toString(this.f24656d.toArray());
        }
    }

    public static final class b extends rb {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final mp0 f24657b;

        public b(int i10, mp0 mp0Var) {
            super(i10);
            this.f24657b = mp0Var;
        }
    }

    public rb(int i10) {
        this.f24653a = i10;
    }

    public static String a(int i10) {
        StringBuilder sbA = v60.a("");
        sbA.append((char) ((i10 >> 24) & 255));
        sbA.append((char) ((i10 >> 16) & 255));
        sbA.append((char) ((i10 >> 8) & 255));
        sbA.append((char) (i10 & 255));
        return sbA.toString();
    }

    public static int b(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return a(this.f24653a);
    }
}
