package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.yandex.mobile.ads.impl.eh1;
import com.yandex.mobile.ads.impl.t6;
import com.yandex.mobile.ads.impl.vh;

/* JADX INFO: loaded from: classes2.dex */
final class i {

    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f18148a;

        public a(e eVar) {
            this.f18148a = eVar;
        }

        @Override // com.yandex.mobile.ads.banner.h
        public final void a(Context context, View view) {
        }

        @Override // com.yandex.mobile.ads.banner.h
        public final void onAttachedToWindow() {
            if (t6.a((vh) this.f18148a)) {
                return;
            }
            this.f18148a.q();
        }

        @Override // com.yandex.mobile.ads.banner.h
        public final void onDetachedFromWindow() {
            if (t6.a((vh) this.f18148a)) {
                return;
            }
            this.f18148a.s();
        }
    }

    public static final class b implements h {
        @Override // com.yandex.mobile.ads.banner.h
        public final void a(Context context, View view) {
            view.setVisibility(0);
            int i10 = eh1.f20253b;
            view.setMinimumHeight(Math.round(TypedValue.applyDimension(1, 50.0f, context.getResources().getDisplayMetrics())));
        }

        @Override // com.yandex.mobile.ads.banner.h
        public final void onAttachedToWindow() {
        }

        @Override // com.yandex.mobile.ads.banner.h
        public final void onDetachedFromWindow() {
        }
    }

    public static h a(View view, e eVar) {
        return view.isInEditMode() ? new b() : new a(eVar);
    }
}
