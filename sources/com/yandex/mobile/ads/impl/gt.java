package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.Parcel;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class gt implements i51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bm f21161a = new bm();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l51 f21162b = new l51();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque f21163c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21165e;

    public class a extends m51 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.bn
        public final void h() {
            gt.a(gt.this, this);
        }
    }

    public static final class b implements h51 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f21167a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.yandex.mobile.ads.embedded.guava.collect.p<am> f21168b;

        public b(long j10, com.yandex.mobile.ads.embedded.guava.collect.p<am> pVar) {
            this.f21167a = j10;
            this.f21168b = pVar;
        }

        @Override // com.yandex.mobile.ads.impl.h51
        public final int a() {
            return 1;
        }

        @Override // com.yandex.mobile.ads.impl.h51
        public final int a(long j10) {
            return this.f21167a > j10 ? 0 : -1;
        }

        @Override // com.yandex.mobile.ads.impl.h51
        public final long a(int i10) {
            pa.a(i10 == 0);
            return this.f21167a;
        }

        @Override // com.yandex.mobile.ads.impl.h51
        public final List<am> b(long j10) {
            return j10 >= this.f21167a ? this.f21168b : com.yandex.mobile.ads.embedded.guava.collect.p.i();
        }
    }

    public gt() {
        for (int i10 = 0; i10 < 2; i10++) {
            this.f21163c.addFirst(new a());
        }
        this.f21164d = 0;
    }

    public static void a(gt gtVar, m51 m51Var) {
        pa.b(gtVar.f21163c.size() < 2);
        pa.a(!gtVar.f21163c.contains(m51Var));
        m51Var.b();
        gtVar.f21163c.addFirst(m51Var);
    }

    @Override // com.yandex.mobile.ads.impl.xm
    public final m51 a() throws zm {
        pa.b(!this.f21165e);
        if (this.f21164d != 2 || this.f21163c.isEmpty()) {
            return null;
        }
        m51 m51Var = (m51) this.f21163c.removeFirst();
        if (this.f21162b.f()) {
            m51Var.b(4);
        } else {
            l51 l51Var = this.f21162b;
            long j10 = l51Var.f19006e;
            bm bmVar = this.f21161a;
            ByteBuffer byteBuffer = l51Var.f19004c;
            Objects.requireNonNull(byteBuffer);
            byte[] bArrArray = byteBuffer.array();
            Objects.requireNonNull(bmVar);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArrArray, 0, bArrArray.length);
            parcelObtain.setDataPosition(0);
            Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
            parcelObtain.recycle();
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
            Objects.requireNonNull(parcelableArrayList);
            m51Var.a(this.f21162b.f19006e, new b(j10, xf.a(am.f18956s, parcelableArrayList)), 0L);
        }
        this.f21162b.b();
        this.f21164d = 0;
        return m51Var;
    }

    @Override // com.yandex.mobile.ads.impl.i51
    public final void a(long j10) {
    }

    @Override // com.yandex.mobile.ads.impl.xm
    public final void a(l51 l51Var) throws zm {
        pa.b(!this.f21165e);
        pa.b(this.f21164d == 1);
        pa.a(this.f21162b == l51Var);
        this.f21164d = 2;
    }

    @Override // com.yandex.mobile.ads.impl.xm
    public final l51 b() throws zm {
        pa.b(!this.f21165e);
        if (this.f21164d != 0) {
            return null;
        }
        this.f21164d = 1;
        return this.f21162b;
    }

    @Override // com.yandex.mobile.ads.impl.xm
    public final void flush() {
        pa.b(!this.f21165e);
        this.f21162b.b();
        this.f21164d = 0;
    }

    @Override // com.yandex.mobile.ads.impl.xm
    public final void release() {
        this.f21165e = true;
    }
}
