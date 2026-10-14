package com.zipoapps.premiumhelper.configuration.appconfig;

import android.app.Activity;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.gson.Gson;
import com.zipoapps.premiumhelper.util.PHMessagingService;
import ed.o;
import ed.p;
import ed.u;
import fd.j0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Http2;
import org.json.JSONObject;
import vc.g;
import za.i;

/* JADX INFO: loaded from: classes3.dex */
public final class PremiumHelperConfiguration {
    private final boolean adManagerTestAds;
    private final Map<String, String> configMap;
    private final Bundle debugData;
    private final Class<? extends Activity> introActivityClass;
    private final boolean isDebugMode;
    private final Class<? extends Activity> mainActivityClass;
    private final PHMessagingService.a pushMessageListener;
    private final i.b rateBarDialogStyle;
    private final int rateDialogLayout;
    private final int[] relaunchOneTimeActivityLayout;
    private final int[] relaunchPremiumActivityLayout;
    private final int[] startLikeProActivityLayout;
    private final Integer startLikeProTextNoTrial;
    private final Integer startLikeProTextTrial;
    private final boolean useTestLayouts;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f28293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashMap<String, String> f28294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f28295c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int[] f28296d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f28297e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Integer f28298f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int[] f28299g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int[] f28300h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Class<? extends Activity> f28301i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Class<? extends Activity> f28302j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PHMessagingService.a f28303k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f28304l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f28305m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public i.b f28306n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Bundle f28307o;

        public a(boolean z10) {
            this(z10, new HashMap(), 0, new int[]{0}, null, null, new int[]{0}, new int[]{0}, null, null, null, false, false, null, null, 31744, null);
        }

        public a(boolean z10, HashMap<String, String> map, int i10, int[] iArr, Integer num, Integer num2, int[] iArr2, int[] iArr3, Class<? extends Activity> cls, Class<? extends Activity> cls2, PHMessagingService.a aVar, boolean z11, boolean z12, i.b bVar, Bundle bundle) {
            j0.i(map, "configMap");
            j0.i(iArr, "startLikeProActivityLayout");
            j0.i(iArr2, "relaunchPremiumActivityLayout");
            j0.i(iArr3, "relaunchOneTimeActivityLayout");
            j0.i(bundle, "debugData");
            this.f28293a = z10;
            this.f28294b = map;
            this.f28295c = i10;
            this.f28296d = iArr;
            this.f28297e = num;
            this.f28298f = num2;
            this.f28299g = iArr2;
            this.f28300h = iArr3;
            this.f28301i = cls;
            this.f28302j = cls2;
            this.f28303k = aVar;
            this.f28304l = z11;
            this.f28305m = z12;
            this.f28306n = bVar;
            this.f28307o = bundle;
        }

        public /* synthetic */ a(boolean z10, HashMap map, int i10, int[] iArr, Integer num, Integer num2, int[] iArr2, int[] iArr3, Class cls, Class cls2, PHMessagingService.a aVar, boolean z11, boolean z12, i.b bVar, Bundle bundle, int i11, g gVar) {
            this(z10, (i11 & 2) != 0 ? new HashMap() : map, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? new int[0] : iArr, (i11 & 16) != 0 ? null : num, (i11 & 32) != 0 ? null : num2, (i11 & 64) != 0 ? new int[0] : iArr2, (i11 & 128) != 0 ? new int[0] : iArr3, (i11 & 256) != 0 ? null : cls, (i11 & 512) != 0 ? null : cls2, (i11 & 1024) != 0 ? null : aVar, (i11 & 2048) == 0 ? z11 : false, (i11 & 4096) != 0 ? true : z12, (i11 & 8192) == 0 ? bVar : null, (i11 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? new Bundle() : bundle);
        }

        public final <T> a a(oa.b.c<T> cVar, T t10) {
            j0.i(cVar, "param");
            this.f28294b.put(cVar.f34212a, String.valueOf(t10));
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f28293a == aVar.f28293a && j0.d(this.f28294b, aVar.f28294b) && this.f28295c == aVar.f28295c && j0.d(this.f28296d, aVar.f28296d) && j0.d(this.f28297e, aVar.f28297e) && j0.d(this.f28298f, aVar.f28298f) && j0.d(this.f28299g, aVar.f28299g) && j0.d(this.f28300h, aVar.f28300h) && j0.d(this.f28301i, aVar.f28301i) && j0.d(this.f28302j, aVar.f28302j) && j0.d(this.f28303k, aVar.f28303k) && this.f28304l == aVar.f28304l && this.f28305m == aVar.f28305m && j0.d(this.f28306n, aVar.f28306n) && j0.d(this.f28307o, aVar.f28307o);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v25, types: [int] */
        /* JADX WARN: Type inference failed for: r0v31 */
        /* JADX WARN: Type inference failed for: r0v37 */
        /* JADX WARN: Type inference failed for: r0v38 */
        /* JADX WARN: Type inference failed for: r0v39 */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r2v22, types: [int] */
        public int hashCode() {
            boolean z10 = this.f28293a;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int iHashCode = (Arrays.hashCode(this.f28296d) + r6.a.a(this.f28295c, (this.f28294b.hashCode() + (r10 * 31)) * 31, 31)) * 31;
            Integer num = this.f28297e;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f28298f;
            int iHashCode3 = (Arrays.hashCode(this.f28300h) + ((Arrays.hashCode(this.f28299g) + ((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31)) * 31;
            Class<? extends Activity> cls = this.f28301i;
            int iHashCode4 = (iHashCode3 + (cls == null ? 0 : cls.hashCode())) * 31;
            Class<? extends Activity> cls2 = this.f28302j;
            int iHashCode5 = (iHashCode4 + (cls2 == null ? 0 : cls2.hashCode())) * 31;
            PHMessagingService.a aVar = this.f28303k;
            int iHashCode6 = (iHashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            boolean z11 = this.f28304l;
            ?? r11 = z11;
            if (z11) {
                r11 = 1;
            }
            int i10 = (iHashCode6 + r11) * 31;
            boolean z12 = this.f28305m;
            int i11 = (i10 + (z12 ? 1 : z12)) * 31;
            i.b bVar = this.f28306n;
            return this.f28307o.hashCode() + ((i11 + (bVar != null ? bVar.hashCode() : 0)) * 31);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Builder(isDebugMode=");
            sbA.append(this.f28293a);
            sbA.append(", configMap=");
            sbA.append(this.f28294b);
            sbA.append(", rateDialogLayout=");
            sbA.append(this.f28295c);
            sbA.append(", startLikeProActivityLayout=");
            sbA.append(Arrays.toString(this.f28296d));
            sbA.append(", startLikeProTextNoTrial=");
            sbA.append(this.f28297e);
            sbA.append(", startLikeProTextTrial=");
            sbA.append(this.f28298f);
            sbA.append(", relaunchPremiumActivityLayout=");
            sbA.append(Arrays.toString(this.f28299g));
            sbA.append(", relaunchOneTimeActivityLayout=");
            sbA.append(Arrays.toString(this.f28300h));
            sbA.append(", mainActivityClass=");
            sbA.append(this.f28301i);
            sbA.append(", introActivityClass=");
            sbA.append(this.f28302j);
            sbA.append(", pushMessageListener=");
            sbA.append(this.f28303k);
            sbA.append(", adManagerTestAds=");
            sbA.append(this.f28304l);
            sbA.append(", useTestLayouts=");
            sbA.append(this.f28305m);
            sbA.append(", rateBarDialogStyle=");
            sbA.append(this.f28306n);
            sbA.append(", debugData=");
            sbA.append(this.f28307o);
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return sbA.toString();
        }
    }

    public static final class b implements oa.a {
        public b() {
        }

        @Override // oa.a
        public boolean a(String str, boolean z10) {
            return oa.a.C0376a.b(this, str, z10);
        }

        @Override // oa.a
        public String b() {
            return "App Default";
        }

        @Override // oa.a
        public Map<String, String> c() {
            return PremiumHelperConfiguration.this.getConfigMap();
        }

        @Override // oa.a
        public boolean contains(String str) {
            j0.i(str, Action.KEY_ATTRIBUTE);
            return PremiumHelperConfiguration.this.getConfigMap().containsKey(str);
        }

        @Override // oa.a
        public <T> T d(oa.a aVar, String str, T t10) {
            j0.i(aVar, "<this>");
            Object objE = null;
            if (t10 instanceof String) {
                objE = PremiumHelperConfiguration.this.getConfigMap().get(str);
            } else if (t10 instanceof Boolean) {
                String str2 = PremiumHelperConfiguration.this.getConfigMap().get(str);
                if (str2 != null) {
                    objE = u.X(str2);
                }
            } else if (t10 instanceof Long) {
                String str3 = PremiumHelperConfiguration.this.getConfigMap().get(str);
                if (str3 != null) {
                    objE = p.g(str3);
                }
            } else {
                if (!(t10 instanceof Double)) {
                    throw new IllegalStateException("Unsupported type".toString());
                }
                String str4 = PremiumHelperConfiguration.this.getConfigMap().get(str);
                if (str4 != null) {
                    objE = o.e(str4);
                }
            }
            return objE == null ? t10 : (T) objE;
        }
    }

    public PremiumHelperConfiguration(Class<? extends Activity> cls, Class<? extends Activity> cls2, PHMessagingService.a aVar, int i10, int[] iArr, Integer num, Integer num2, int[] iArr2, int[] iArr3, boolean z10, boolean z11, boolean z12, i.b bVar, Bundle bundle, Map<String, String> map) {
        j0.i(cls, "mainActivityClass");
        j0.i(iArr, "startLikeProActivityLayout");
        j0.i(iArr2, "relaunchPremiumActivityLayout");
        j0.i(iArr3, "relaunchOneTimeActivityLayout");
        j0.i(map, "configMap");
        this.mainActivityClass = cls;
        this.introActivityClass = cls2;
        this.pushMessageListener = aVar;
        this.rateDialogLayout = i10;
        this.startLikeProActivityLayout = iArr;
        this.startLikeProTextNoTrial = num;
        this.startLikeProTextTrial = num2;
        this.relaunchPremiumActivityLayout = iArr2;
        this.relaunchOneTimeActivityLayout = iArr3;
        this.isDebugMode = z10;
        this.adManagerTestAds = z11;
        this.useTestLayouts = z12;
        this.rateBarDialogStyle = bVar;
        this.debugData = bundle;
        this.configMap = map;
    }

    public /* synthetic */ PremiumHelperConfiguration(Class cls, Class cls2, PHMessagingService.a aVar, int i10, int[] iArr, Integer num, Integer num2, int[] iArr2, int[] iArr3, boolean z10, boolean z11, boolean z12, i.b bVar, Bundle bundle, Map map, int i11, g gVar) {
        this(cls, cls2, aVar, i10, iArr, num, num2, iArr2, iArr3, z10, z11, z12, bVar, bundle, (i11 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? new HashMap() : map);
    }

    public final Class<? extends Activity> component1() {
        return this.mainActivityClass;
    }

    public final boolean component10() {
        return this.isDebugMode;
    }

    public final boolean component11() {
        return this.adManagerTestAds;
    }

    public final boolean component12() {
        return this.useTestLayouts;
    }

    public final i.b component13() {
        return this.rateBarDialogStyle;
    }

    public final Bundle component14() {
        return this.debugData;
    }

    public final Map<String, String> component15() {
        return this.configMap;
    }

    public final Class<? extends Activity> component2() {
        return this.introActivityClass;
    }

    public final PHMessagingService.a component3() {
        return this.pushMessageListener;
    }

    public final int component4() {
        return this.rateDialogLayout;
    }

    public final int[] component5() {
        return this.startLikeProActivityLayout;
    }

    public final Integer component6() {
        return this.startLikeProTextNoTrial;
    }

    public final Integer component7() {
        return this.startLikeProTextTrial;
    }

    public final int[] component8() {
        return this.relaunchPremiumActivityLayout;
    }

    public final int[] component9() {
        return this.relaunchOneTimeActivityLayout;
    }

    public final PremiumHelperConfiguration copy(Class<? extends Activity> cls, Class<? extends Activity> cls2, PHMessagingService.a aVar, int i10, int[] iArr, Integer num, Integer num2, int[] iArr2, int[] iArr3, boolean z10, boolean z11, boolean z12, i.b bVar, Bundle bundle, Map<String, String> map) {
        j0.i(cls, "mainActivityClass");
        j0.i(iArr, "startLikeProActivityLayout");
        j0.i(iArr2, "relaunchPremiumActivityLayout");
        j0.i(iArr3, "relaunchOneTimeActivityLayout");
        j0.i(map, "configMap");
        return new PremiumHelperConfiguration(cls, cls2, aVar, i10, iArr, num, num2, iArr2, iArr3, z10, z11, z12, bVar, bundle, map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PremiumHelperConfiguration)) {
            return false;
        }
        PremiumHelperConfiguration premiumHelperConfiguration = (PremiumHelperConfiguration) obj;
        return j0.d(this.mainActivityClass, premiumHelperConfiguration.mainActivityClass) && j0.d(this.introActivityClass, premiumHelperConfiguration.introActivityClass) && j0.d(this.pushMessageListener, premiumHelperConfiguration.pushMessageListener) && this.rateDialogLayout == premiumHelperConfiguration.rateDialogLayout && j0.d(this.startLikeProActivityLayout, premiumHelperConfiguration.startLikeProActivityLayout) && j0.d(this.startLikeProTextNoTrial, premiumHelperConfiguration.startLikeProTextNoTrial) && j0.d(this.startLikeProTextTrial, premiumHelperConfiguration.startLikeProTextTrial) && j0.d(this.relaunchPremiumActivityLayout, premiumHelperConfiguration.relaunchPremiumActivityLayout) && j0.d(this.relaunchOneTimeActivityLayout, premiumHelperConfiguration.relaunchOneTimeActivityLayout) && this.isDebugMode == premiumHelperConfiguration.isDebugMode && this.adManagerTestAds == premiumHelperConfiguration.adManagerTestAds && this.useTestLayouts == premiumHelperConfiguration.useTestLayouts && j0.d(this.rateBarDialogStyle, premiumHelperConfiguration.rateBarDialogStyle) && j0.d(this.debugData, premiumHelperConfiguration.debugData) && j0.d(this.configMap, premiumHelperConfiguration.configMap);
    }

    public final boolean getAdManagerTestAds() {
        return this.adManagerTestAds;
    }

    public final Map<String, String> getConfigMap() {
        return this.configMap;
    }

    public final Bundle getDebugData() {
        return this.debugData;
    }

    public final Class<? extends Activity> getIntroActivityClass() {
        return this.introActivityClass;
    }

    public final Class<? extends Activity> getMainActivityClass() {
        return this.mainActivityClass;
    }

    public final PHMessagingService.a getPushMessageListener() {
        return this.pushMessageListener;
    }

    public final i.b getRateBarDialogStyle() {
        return this.rateBarDialogStyle;
    }

    public final int getRateDialogLayout() {
        return this.rateDialogLayout;
    }

    public final int[] getRelaunchOneTimeActivityLayout() {
        return this.relaunchOneTimeActivityLayout;
    }

    public final int[] getRelaunchPremiumActivityLayout() {
        return this.relaunchPremiumActivityLayout;
    }

    public final int[] getStartLikeProActivityLayout() {
        return this.startLikeProActivityLayout;
    }

    public final Integer getStartLikeProTextNoTrial() {
        return this.startLikeProTextNoTrial;
    }

    public final Integer getStartLikeProTextTrial() {
        return this.startLikeProTextTrial;
    }

    public final boolean getUseTestLayouts() {
        return this.useTestLayouts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    public int hashCode() {
        int iHashCode = this.mainActivityClass.hashCode() * 31;
        Class<? extends Activity> cls = this.introActivityClass;
        int iHashCode2 = (iHashCode + (cls == null ? 0 : cls.hashCode())) * 31;
        PHMessagingService.a aVar = this.pushMessageListener;
        int iHashCode3 = (Arrays.hashCode(this.startLikeProActivityLayout) + r6.a.a(this.rateDialogLayout, (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31)) * 31;
        Integer num = this.startLikeProTextNoTrial;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.startLikeProTextTrial;
        int iHashCode5 = (Arrays.hashCode(this.relaunchOneTimeActivityLayout) + ((Arrays.hashCode(this.relaunchPremiumActivityLayout) + ((iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31)) * 31;
        boolean z10 = this.isDebugMode;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode5 + r10) * 31;
        boolean z11 = this.adManagerTestAds;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
        boolean z12 = this.useTestLayouts;
        int i12 = (i11 + (z12 ? 1 : z12)) * 31;
        i.b bVar = this.rateBarDialogStyle;
        int iHashCode6 = (i12 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Bundle bundle = this.debugData;
        return this.configMap.hashCode() + ((iHashCode6 + (bundle != null ? bundle.hashCode() : 0)) * 31);
    }

    public final boolean isDebugMode() {
        return this.isDebugMode;
    }

    public final oa.a repository() {
        return new b();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sbA = defpackage.a.a("MainActivity : ");
        sbA.append(this.mainActivityClass.getName());
        sb2.append(sbA.toString());
        sb2.append('\n');
        StringBuilder sb3 = new StringBuilder();
        sb3.append("PushMessageListener : ");
        PHMessagingService.a aVar = this.pushMessageListener;
        String name = aVar != null ? aVar.getClass().getName() : null;
        if (name == null) {
            name = "not set";
        }
        sb3.append(name);
        sb2.append(sb3.toString());
        sb2.append('\n');
        sb2.append("rateDialogLayout : " + this.rateDialogLayout);
        sb2.append('\n');
        sb2.append("startLikeProActivityLayout : " + this.startLikeProActivityLayout);
        sb2.append('\n');
        sb2.append("startLikeProTextNoTrial : " + this.startLikeProTextNoTrial);
        sb2.append('\n');
        sb2.append("startLikeProTextTrial : " + this.startLikeProTextTrial);
        sb2.append('\n');
        sb2.append("relaunchPremiumActivityLayout : " + this.relaunchPremiumActivityLayout);
        sb2.append('\n');
        sb2.append("relaunchOneTimeActivityLayout : " + this.relaunchOneTimeActivityLayout);
        sb2.append('\n');
        sb2.append("isDebugMode : " + this.isDebugMode);
        sb2.append('\n');
        sb2.append("adManagerTestAds : " + this.adManagerTestAds);
        sb2.append('\n');
        sb2.append("useTestLayouts : " + this.useTestLayouts);
        sb2.append('\n');
        sb2.append("configMap : ");
        sb2.append('\n');
        sb2.append(new JSONObject(new Gson().g(this.configMap)).toString(4));
        sb2.append('\n');
        String string = sb2.toString();
        j0.h(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
