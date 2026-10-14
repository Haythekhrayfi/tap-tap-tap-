package com.applovin.exoplayer2.b;

import android.media.AudioAttributes;
import android.os.Bundle;
import com.applovin.exoplayer2.l.ai;

/* JADX INFO: loaded from: classes.dex */
public final class d implements com.applovin.exoplayer2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f4412a = new a().a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.applovin.exoplayer2.g.a<d> f4413f = z.f4648d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4417e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private AudioAttributes f4418g;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f4419a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f4420b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f4421c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f4422d = 1;

        public a a(int i10) {
            this.f4419a = i10;
            return this;
        }

        public d a() {
            return new d(this.f4419a, this.f4420b, this.f4421c, this.f4422d);
        }

        public a b(int i10) {
            this.f4420b = i10;
            return this;
        }

        public a c(int i10) {
            this.f4421c = i10;
            return this;
        }

        public a d(int i10) {
            this.f4422d = i10;
            return this;
        }
    }

    private d(int i10, int i11, int i12, int i13) {
        this.f4414b = i10;
        this.f4415c = i11;
        this.f4416d = i12;
        this.f4417e = i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ d a(Bundle bundle) {
        a aVar = new a();
        if (bundle.containsKey(a(0))) {
            aVar.a(bundle.getInt(a(0)));
        }
        if (bundle.containsKey(a(1))) {
            aVar.b(bundle.getInt(a(1)));
        }
        if (bundle.containsKey(a(2))) {
            aVar.c(bundle.getInt(a(2)));
        }
        if (bundle.containsKey(a(3))) {
            aVar.d(bundle.getInt(a(3)));
        }
        return aVar.a();
    }

    private static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    public AudioAttributes a() {
        if (this.f4418g == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f4414b).setFlags(this.f4415c).setUsage(this.f4416d);
            if (ai.f7595a >= 29) {
                usage.setAllowedCapturePolicy(this.f4417e);
            }
            this.f4418g = usage.build();
        }
        return this.f4418g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f4414b == dVar.f4414b && this.f4415c == dVar.f4415c && this.f4416d == dVar.f4416d && this.f4417e == dVar.f4417e;
    }

    public int hashCode() {
        return ((((((527 + this.f4414b) * 31) + this.f4415c) * 31) + this.f4416d) * 31) + this.f4417e;
    }
}
