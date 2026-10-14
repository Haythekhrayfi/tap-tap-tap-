package com.zipoapps.premiumhelper.ui.rate;

import android.app.Activity;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import cd.i;
import ch.qos.logback.core.CoreConstants;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.android.play.core.tasks.Task;
import fd.j0;
import java.util.Objects;
import jc.w;
import kotlin.reflect.KProperty;
import uc.l;
import vc.b0;
import vc.t;
import za.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f28360d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa.b f28361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ma.f f28362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ta.e f28363c;

    public interface a {
        void a(EnumC0239c enumC0239c, boolean z10);
    }

    public enum b {
        NONE,
        ALL,
        VALIDATE_INTENT
    }

    /* JADX INFO: renamed from: com.zipoapps.premiumhelper.ui.rate.c$c, reason: collision with other inner class name */
    public enum EnumC0239c {
        NONE,
        DIALOG,
        IN_APP_REVIEW
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f28364a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f28365b;

        public d(String str, String str2) {
            j0.i(str, "supportEmail");
            j0.i(str2, "supportVipEmail");
            this.f28364a = str;
            this.f28365b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return j0.d(this.f28364a, dVar.f28364a) && j0.d(this.f28365b, dVar.f28365b);
        }

        public int hashCode() {
            return this.f28365b.hashCode() + (this.f28364a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("SupportEmailsWrapper(supportEmail=");
            sbA.append(this.f28364a);
            sbA.append(", supportVipEmail=");
            return s.a.a(sbA, this.f28365b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f28367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f28368c;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.VALIDATE_INTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28366a = iArr;
            int[] iArr2 = new int[oa.b.f.values().length];
            try {
                iArr2[oa.b.f.THUMBSUP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            f28367b = iArr2;
            int[] iArr3 = new int[EnumC0239c.values().length];
            try {
                iArr3[EnumC0239c.DIALOG.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[EnumC0239c.IN_APP_REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[EnumC0239c.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f28368c = iArr3;
        }
    }

    public static final class f implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ uc.a<w> f28369a;

        public f(uc.a<w> aVar) {
            this.f28369a = aVar;
        }

        @Override // com.zipoapps.premiumhelper.ui.rate.c.a
        public void a(EnumC0239c enumC0239c, boolean z10) {
            j0.i(enumC0239c, "reviewUiShown");
            uc.a<w> aVar = this.f28369a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public static final class g implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<EnumC0239c, w> f28370a;

        /* JADX WARN: Multi-variable type inference failed */
        public g(l<? super EnumC0239c, w> lVar) {
            this.f28370a = lVar;
        }

        @Override // com.zipoapps.premiumhelper.ui.rate.c.a
        public void a(EnumC0239c enumC0239c, boolean z10) {
            j0.i(enumC0239c, "reviewUiShown");
            l<EnumC0239c, w> lVar = this.f28370a;
            if (lVar != null) {
                lVar.invoke(enumC0239c);
            }
        }
    }

    static {
        t tVar = new t(c.class, "log", "getLog()Lcom/zipoapps/premiumhelper/log/TimberLogger;", 0);
        Objects.requireNonNull(b0.f36991a);
        f28360d = new i[]{tVar};
    }

    public c(oa.b bVar, ma.f fVar) {
        j0.i(bVar, "configuration");
        j0.i(fVar, "preferences");
        this.f28361a = bVar;
        this.f28362b = fVar;
        this.f28363c = new ta.e("PremiumHelper");
    }

    public final ta.d a() {
        return this.f28363c.a(this, f28360d[0]);
    }

    public final EnumC0239c b() {
        long jLongValue = ((Number) this.f28361a.h(oa.b.f34199v)).longValue();
        int iH = this.f28362b.h();
        a().g("Rate: shouldShowRateThisSession appStartCounter=" + iH + ", startSession=" + jLongValue, new Object[0]);
        if (!(((long) iH) >= jLongValue)) {
            return EnumC0239c.NONE;
        }
        b bVar = (b) this.f28361a.g(oa.b.f34200w);
        int iH2 = this.f28362b.h();
        a().g("Rate: shouldShowRateOnAppStart rateMode=" + bVar, new Object[0]);
        int i10 = e.f28366a[bVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new jc.g();
                }
                return EnumC0239c.NONE;
            }
            return EnumC0239c.IN_APP_REVIEW;
        }
        a().g(android.support.v4.media.a.a("Rate: shouldShowRateOnAppStart appStartCounter=", iH2), new Object[0]);
        ma.f fVar = this.f28362b;
        Objects.requireNonNull(fVar);
        String strA = oa.a.C0376a.a(fVar, "rate_intent", "");
        a().g(i.f.a("Rate: shouldShowRateOnAppStart rateIntent=", strA), new Object[0]);
        if (!(strA.length() == 0)) {
            if (!j0.d(strA, "positive")) {
                j0.d(strA, "negative");
            }
            return EnumC0239c.IN_APP_REVIEW;
        }
        int i11 = this.f28362b.f33405a.getInt("rate_session_number", 0);
        a().g(android.support.v4.media.a.a("Rate: shouldShowRateOnAppStart nextSession=", i11), new Object[0]);
        if (iH2 >= i11) {
            return EnumC0239c.DIALOG;
        }
        return EnumC0239c.NONE;
    }

    public final void c(Activity activity, a aVar) {
        j0.i(activity, "activity");
        ReviewManager reviewManagerCreate = ReviewManagerFactory.create(activity);
        j0.h(reviewManagerCreate, "create(activity)");
        Task<ReviewInfo> taskRequestReviewFlow = reviewManagerCreate.requestReviewFlow();
        j0.h(taskRequestReviewFlow, "manager.requestReviewFlow()");
        taskRequestReviewFlow.addOnCompleteListener(new com.applovin.exoplayer2.a.f(reviewManagerCreate, activity, aVar));
    }

    public final void d(Activity activity, uc.a<w> aVar) {
        j0.i(activity, "activity");
        c(activity, new f(aVar));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0090  */
    public final void e(FragmentManager fragmentManager, int i10, String str, a aVar) {
        d dVar;
        if (e.f28367b[((oa.b.f) this.f28361a.g(oa.b.f34178j0)).ordinal()] == 1) {
            Objects.requireNonNull(h.f45222f);
            h hVar = new h();
            hVar.f45223c = aVar;
            hVar.setArguments(androidx.activity.i.a(new jc.h("theme", Integer.valueOf(i10)), new jc.h("arg_rate_source", str)));
            try {
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(fragmentManager);
                aVar2.e(0, hVar, "RATE_DIALOG", 1);
                aVar2.j();
                return;
            } catch (IllegalStateException e10) {
                xe.a.f37601c.d(e10, "Failed to show rate dialog", new Object[0]);
                return;
            }
        }
        RateBarDialog.a aVar3 = RateBarDialog.f28330s;
        String str2 = (String) this.f28361a.h(oa.b.f34180k0);
        String str3 = (String) this.f28361a.h(oa.b.f34182l0);
        if (str2.length() > 0) {
            if (str3.length() > 0) {
                dVar = new d(str2, str3);
            } else {
                dVar = null;
            }
        } else {
            dVar = null;
        }
        Objects.requireNonNull(aVar3);
        RateBarDialog rateBarDialog = new RateBarDialog();
        rateBarDialog.f28331c = aVar;
        if (str == null) {
            str = "";
        }
        jc.h[] hVarArr = new jc.h[4];
        hVarArr[0] = new jc.h("theme", Integer.valueOf(i10));
        hVarArr[1] = new jc.h("rate_source", str);
        hVarArr[2] = new jc.h("support_email", dVar != null ? dVar.f28364a : null);
        hVarArr[3] = new jc.h("support_vip_email", dVar != null ? dVar.f28365b : null);
        rateBarDialog.setArguments(androidx.activity.i.a(hVarArr));
        try {
            androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(fragmentManager);
            aVar4.e(0, rateBarDialog, "RATE_DIALOG", 1);
            aVar4.j();
        } catch (IllegalStateException e11) {
            xe.a.f37601c.d(e11, "Failed to show rate dialog", new Object[0]);
        }
    }

    public final void f(AppCompatActivity appCompatActivity, int i10, String str, l<? super EnumC0239c, w> lVar) {
        j0.i(appCompatActivity, "activity");
        g gVar = new g(lVar);
        EnumC0239c enumC0239cB = b();
        a().g("Rate: showRateUi=" + enumC0239cB, new Object[0]);
        int i11 = e.f28368c[enumC0239cB.ordinal()];
        if (i11 == 1) {
            FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
            j0.h(supportFragmentManager, "activity.supportFragmentManager");
            e(supportFragmentManager, i10, str, gVar);
        } else if (i11 == 2) {
            c(appCompatActivity, gVar);
        } else if (i11 == 3) {
            EnumC0239c enumC0239c = EnumC0239c.NONE;
            ma.f fVar = this.f28362b;
            Objects.requireNonNull(fVar);
            gVar.a(enumC0239c, j0.d(oa.a.C0376a.a(fVar, "rate_intent", ""), "negative"));
        }
        if (enumC0239cB != EnumC0239c.NONE) {
            ma.f fVar2 = this.f28362b;
            int iH = fVar2.h() + 3;
            SharedPreferences.Editor editorEdit = fVar2.f33405a.edit();
            editorEdit.putInt("rate_session_number", iH);
            editorEdit.apply();
        }
    }
}
