package com.zipoapps.premiumhelper.util;

import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Process;
import androidx.activity.k;
import ch.qos.logback.core.CoreConstants;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.applovin.sdk.AppLovinEventParameters;
import com.google.android.gms.common.internal.ImagesContract;
import com.inscode.autoclicker.R;
import ed.u;
import fd.j0;
import fd.z;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.UUID;
import jc.i;
import jc.w;
import ma.h;
import ne.f;
import ne.g;
import ne.m;
import ne.q;
import oc.e;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f28448a = new c();

    public enum a {
        NONE,
        THREE_DAYS,
        SEVEN_DAYS,
        THIRTY_DAYS
    }

    public enum b {
        NONE,
        YEARLY,
        MONTHLY,
        WEEKLY
    }

    /* JADX INFO: renamed from: com.zipoapps.premiumhelper.util.c$c, reason: collision with other inner class name */
    public /* synthetic */ class C0244c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28449a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.WEEKLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.MONTHLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.YEARLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f28449a = iArr;
        }
    }

    @e(c = "com.zipoapps.premiumhelper.util.PremiumHelperUtils", f = "PremiumHelperUtils.kt", l = {382, 390, 394}, m = "withRetry")
    public static final class d<T> extends oc.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28450c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f28451d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f28452e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public double f28453f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f28454g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f28455h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f28456i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f28458k;

        public d(mc.d<? super d> dVar) {
            super(dVar);
        }

        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            this.f28456i = obj;
            this.f28458k |= Integer.MIN_VALUE;
            return c.this.r(0, 0L, 0L, 0.0d, null, this);
        }
    }

    public static final String e(Context context) {
        String string;
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            if (context.getApplicationInfo().labelRes == 0) {
                string = context.getApplicationInfo().nonLocalizedLabel.toString();
            } else {
                string = context.getString(context.getApplicationInfo().labelRes);
                j0.h(string, "{\n                contex…o.labelRes)\n            }");
            }
            return string;
        } catch (Exception unused) {
            return "";
        }
    }

    public static final int g(Context context) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        return (int) ((System.currentTimeMillis() - i(context)) / 86400000);
    }

    public static final int h(long j10) {
        String id2 = TimeZone.getDefault().getID();
        Map<String, String> map = q.f33829c;
        q qVarI = q.i(id2, map);
        ne.e eVarJ = ne.e.j(j10);
        g gVar = g.f33786e;
        z.B(eVarJ, "instant");
        z.B(qVarI, "zone");
        f fVar = g.v(eVarJ.f33775c, eVarJ.f33776d, qVarI.h().a(eVarJ)).f33788c;
        Map<String, String> map2 = q.f33829c;
        q qVarI2 = q.i(TimeZone.getDefault().getID(), map);
        ne.e eVarJ2 = ne.e.j(System.currentTimeMillis());
        f fVarD = f.D(z.t(eVarJ2.f33775c + ((long) qVarI2.h().a(eVarJ2).f33835d), 86400L));
        m mVar = m.f33813f;
        Objects.requireNonNull(fVar);
        f fVarR = f.r(fVarD);
        long jU = fVarR.u() - fVar.u();
        int iX = fVarR.f33783e - fVar.f33783e;
        if (jU > 0 && iX < 0) {
            jU--;
            iX = (int) (fVarR.l() - fVar.G(jU).l());
        } else if (jU < 0 && iX > 0) {
            jU++;
            iX -= fVarR.x();
        }
        int i10 = (int) (jU % 12);
        int I = z.I(jU / 12);
        return (((I | i10) | iX) == 0 ? m.f33813f : new m(I, i10, iX)).f33817e;
    }

    public static final long i(Context context) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
        } catch (Throwable unused) {
            return System.currentTimeMillis();
        }
    }

    public static final String k(Context context) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            i.a aVar = i.f31813c;
            int iMyPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            j0.g(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        return runningAppProcessInfo.processName;
                    }
                }
            }
            i.a aVar2 = i.f31813c;
            return null;
        } catch (Throwable th) {
            i.a aVar3 = i.f31813c;
            h9.d.f(th);
            i.a aVar4 = i.f31813c;
            return null;
        }
    }

    public static final String l(Context context) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            j0.h(str, "{\n            context.pa… 0).versionName\n        }");
            return str;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static final boolean m(Context context) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        String strK = k(context);
        return (strK == null || strK.length() == 0) || j0.d(strK, context.getPackageName());
    }

    public static final void n(Context context) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        try {
            try {
                c cVar = f28448a;
                String packageName = context.getPackageName();
                j0.h(packageName, "context.packageName");
                context.startActivity(cVar.p("market://details", packageName));
                h.f33410y.a().j();
            } catch (ActivityNotFoundException unused) {
                c cVar2 = f28448a;
                String packageName2 = context.getPackageName();
                j0.h(packageName2, "context.packageName");
                context.startActivity(cVar2.p("https://play.google.com/store/apps/details", packageName2));
                h.f33410y.a().j();
            }
        } catch (Throwable th) {
            xe.a.b("PremiumHelper").d(th, "Failed to open google play", new Object[0]);
        }
    }

    public static final void o(Context context, String str) {
        Object objF;
        j0.i(str, ImagesContract.URL);
        try {
            i.a aVar = i.f31813c;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
            h.f33410y.a().j();
            objF = w.f31842a;
        } catch (Throwable th) {
            i.a aVar2 = i.f31813c;
            objF = h9.d.f(th);
        }
        Throwable thA = i.a(objF);
        if (thA != null) {
            xe.a.f37601c.c(thA);
        }
    }

    public final Purchase a(Context context, String str) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        return new Purchase("{\n\"orderId\":\"DEBUG.OFFER." + UUID.randomUUID() + "\",\n\"packageName\":\"" + context.getPackageName() + "\",\n\"productId\":\"" + str + "\",\n\"purchaseTime\":" + System.currentTimeMillis() + ",\n\"purchaseState\":0,\n\"purchaseToken\":\"debugtoken." + UUID.randomUUID() + "\",\n\"obfuscatedAccountId\":\"debugaccount." + UUID.randomUUID() + "\",\n\"acknowledged\":true,\n\"autoRenewing\":true\n}", UUID.randomUUID().toString());
    }

    public final SkuDetails b(String str, String str2, String str3) {
        j0.i(str, AppLovinEventParameters.PRODUCT_IDENTIFIER);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{\n\"title\":\"Debug offer\",\n\"price\":\"");
        sb2.append(str3);
        sb2.append("\",\n\"type\":\"");
        sb2.append(str2);
        sb2.append("\",\n\"subscriptionPeriod\":\"P1Y\",\n\"freeTrialPeriod\":\"P1W\",\n\"description\":\"debug-offer\",\n\"price_amount_micros\":890000,\n\"price_currency_code\":\"USD\",\n\"productId\":\"");
        return new SkuDetails(k.a(sb2, str, "\"\n}"));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006d  */
    public final String c(Context context, SkuDetails skuDetails) {
        b bVar;
        String string;
        if (skuDetails == null) {
            return "";
        }
        String strD = skuDetails.d();
        j0.h(strD, "skuDetails.price");
        if (strD.length() == 0) {
            return "";
        }
        Resources resources = context.getResources();
        a aVarD = f28448a.d(skuDetails);
        String strE = skuDetails.e();
        j0.h(strE, "this.sku");
        if (ed.q.h(strE, "_onetime", false, 2)) {
            bVar = b.NONE;
        } else {
            String strE2 = skuDetails.e();
            j0.h(strE2, "this.sku");
            if (ed.q.h(strE2, "_weekly", false, 2)) {
                bVar = b.WEEKLY;
            } else {
                String strE3 = skuDetails.e();
                j0.h(strE3, "this.sku");
                if (ed.q.h(strE3, "_monthly", false, 2)) {
                    bVar = b.MONTHLY;
                } else {
                    String strE4 = skuDetails.e();
                    j0.h(strE4, "this.sku");
                    if (ed.q.h(strE4, "_yearly", false, 2)) {
                        bVar = b.YEARLY;
                    } else {
                        bVar = b.NONE;
                    }
                }
            }
        }
        int i10 = C0244c.f28449a[bVar.ordinal()];
        if (i10 == 1) {
            string = resources.getStringArray(R.array.sku_weekly_prices)[aVarD.ordinal()];
        } else if (i10 == 2) {
            string = resources.getStringArray(R.array.sku_monthly_prices)[aVarD.ordinal()];
        } else if (i10 == 3) {
            string = resources.getStringArray(R.array.sku_yearly_prices)[aVarD.ordinal()];
        } else {
            if (i10 != 4) {
                throw new jc.g();
            }
            string = resources.getString(R.string.sku_price_onetime);
        }
        String str = MessageFormat.format(string, skuDetails.d());
        j0.h(str, "format(priceString, skuDetails.price)");
        return str;
    }

    public final a d(SkuDetails skuDetails) {
        String strE = skuDetails.e();
        j0.h(strE, "this.sku");
        if (!u.x(strE, "trial_0d", false, 2)) {
            String strE2 = skuDetails.e();
            j0.h(strE2, "this.sku");
            if (u.x(strE2, "trial_3d", false, 2)) {
                return a.THREE_DAYS;
            }
            String strE3 = skuDetails.e();
            j0.h(strE3, "this.sku");
            if (u.x(strE3, "trial_7d", false, 2)) {
                return a.SEVEN_DAYS;
            }
            String strE4 = skuDetails.e();
            j0.h(strE4, "this.sku");
            if (u.x(strE4, "trial_30d", false, 2)) {
                return a.THIRTY_DAYS;
            }
        }
        return a.NONE;
    }

    public final String f(Context context, ma.e eVar) {
        String string;
        String str;
        Integer startLikeProTextTrial;
        int iIntValue;
        j0.i(eVar, "offer");
        if (eVar.f33404c != null) {
            oa.b bVar = h.f33410y.a().f33418g;
            a aVarD = d(eVar.f33404c);
            if (aVarD == a.NONE) {
                startLikeProTextTrial = bVar.f34205b.getStartLikeProTextNoTrial();
                if (startLikeProTextTrial == null) {
                    iIntValue = R.string.ph_start_premium_cta;
                }
                string = context.getString(iIntValue);
                str = "{\n\n            val confi…}\n            }\n        }";
            } else {
                if (bVar.f34205b.getStartLikeProTextTrial() != null) {
                    startLikeProTextTrial = bVar.f34205b.getStartLikeProTextTrial();
                } else {
                    string = ((Boolean) bVar.h(oa.b.I)).booleanValue() ? context.getResources().getStringArray(R.array.cta_titles)[aVarD.ordinal()] : context.getString(R.string.ph_start_trial_cta);
                }
                str = "{\n\n            val confi…}\n            }\n        }";
            }
            iIntValue = startLikeProTextTrial.intValue();
            string = context.getString(iIntValue);
            str = "{\n\n            val confi…}\n            }\n        }";
        } else {
            string = context.getString(R.string.ph_start_trial_cta);
            str = "{\n            context.ge…tart_trial_cta)\n        }";
        }
        j0.h(string, str);
        return string;
    }

    public final PackageInfo j(Context context, String str, int i10) {
        try {
            return context.getPackageManager().getPackageInfo(u.Y(str).toString(), i10);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final Intent p(String str, String str2) {
        String str3 = String.format("%s?id=%s", Arrays.copyOf(new Object[]{str, str2}, 2));
        j0.h(str3, "format(format, *args)");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str3));
        intent.addFlags(1476919296);
        return intent;
    }

    public final String q(String str) {
        j0.i(str, "string");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            j0.h(messageDigest, "getInstance(\"SHA-1\")");
            Charset charset = StandardCharsets.UTF_8;
            j0.h(charset, "UTF_8");
            byte[] bytes = str.getBytes(charset);
            j0.h(bytes, "this as java.lang.String).getBytes(charset)");
            messageDigest.update(bytes);
            return new BigInteger(1, messageDigest.digest()).toString(16);
        } catch (NoSuchAlgorithmException e10) {
            Objects.requireNonNull((xe.a.C0464a) xe.a.f37601c);
            for (xe.a.c cVar : xe.a.f37600b) {
                cVar.n(e10);
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e4 -> B:17:0x0051). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final <T> java.lang.Object r(int r19, long r20, long r22, double r24, uc.l<? super mc.d<? super gb.x<? extends T>>, ? extends java.lang.Object> r26, mc.d<? super gb.x<? extends T>> r27) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zipoapps.premiumhelper.util.c.r(int, long, long, double, uc.l, mc.d):java.lang.Object");
    }
}
