package com.yandex.mobile.ads.nativeads.template;

import android.content.Context;
import android.util.TypedValue;
import com.yandex.mobile.ads.impl.eh1;
import com.yandex.mobile.ads.impl.y11;

/* JADX INFO: loaded from: classes3.dex */
abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27868a;

    /* JADX INFO: renamed from: com.yandex.mobile.ads.nativeads.template.a$a, reason: collision with other inner class name */
    public static class C0214a extends a {
        public C0214a(float f10) {
            super(f10);
        }

        @Override // com.yandex.mobile.ads.nativeads.template.a
        public final float a(float f10) {
            if (f10 < 10.0f) {
                return 10.0f;
            }
            return f10;
        }

        @Override // com.yandex.mobile.ads.nativeads.template.a
        public final d a(Context context, int i10, int i11, int i12) {
            float f10 = this.f27868a;
            int i13 = eh1.f20253b;
            int iMin = Math.min(Math.round(TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics())), i10);
            return new d(iMin, Math.round(i12 * (iMin / i11)));
        }
    }

    public static class b extends a {
        public b(float f10) {
            super(f10);
        }

        @Override // com.yandex.mobile.ads.nativeads.template.a
        public final float a(float f10) {
            if (f10 < 0.01f) {
                return 0.01f;
            }
            if (f10 > 1.0f) {
                return 1.0f;
            }
            return f10;
        }

        @Override // com.yandex.mobile.ads.nativeads.template.a
        public final d a(Context context, int i10, int i11, int i12) {
            int iRound = Math.round(i10 * this.f27868a);
            return new d(iRound, Math.round(i12 * (iRound / i11)));
        }
    }

    public static class c extends a {
        public c(float f10) {
            super(f10);
        }

        @Override // com.yandex.mobile.ads.nativeads.template.a
        public final float a(float f10) {
            if (f10 < 0.01f) {
                return 0.01f;
            }
            if (f10 > 1.0f) {
                return 1.0f;
            }
            return f10;
        }

        @Override // com.yandex.mobile.ads.nativeads.template.a
        public final d a(Context context, int i10, int i11, int i12) {
            int i13 = eh1.f20253b;
            int iA = y11.a(context, 1, 140.0f);
            int iRound = Math.round(i10 * this.f27868a);
            if (i11 > iRound) {
                i12 = Math.round(i12 / (i11 / iRound));
                i11 = iRound;
            }
            if (i12 > iA) {
                i11 = Math.round(i11 / (i12 / iA));
            } else {
                iA = i12;
            }
            return new d(i11, iA);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f27869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f27870b;

        public d(int i10, int i11) {
            this.f27869a = i10;
            this.f27870b = i11;
        }

        public final int a() {
            return this.f27870b;
        }

        public final int b() {
            return this.f27869a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f27869a == dVar.f27869a && this.f27870b == dVar.f27870b;
        }

        public final int hashCode() {
            return (this.f27869a * 31) + this.f27870b;
        }
    }

    public a(float f10) {
        this.f27868a = a(f10);
    }

    public abstract float a(float f10);

    public abstract d a(Context context, int i10, int i11, int i12);
}
