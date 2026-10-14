package com.applovin.impl.mediation.debugger.ui.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.activity.j;
import androidx.activity.k;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.mediation.debugger.b.a.e;
import com.applovin.impl.sdk.f;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.g;
import com.applovin.impl.sdk.utils.w;
import com.applovin.impl.sdk.y;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class b extends com.applovin.impl.mediation.debugger.ui.d.d implements AppLovinCommunicatorSubscriber, com.applovin.impl.mediation.debugger.a.InterfaceC0127a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f9635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.a.a> f9636b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.a.a> f9637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.b.b> f9638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f9639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f9640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f9641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Boolean f9642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final StringBuilder f9643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f9644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f9645l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.c.b> f9646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.c.b> f9647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.c.b> f9648o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.a.c> f9649p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.a.c> f9650q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.b.c.b> f9651r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.ui.d.c> f9652s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.ui.d.c> f9653t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.ui.d.c> f9654u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.ui.d.c> f9655v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.ui.d.c> f9656w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.ui.d.c> f9657x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private List<com.applovin.impl.mediation.debugger.ui.d.c> f9658y;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.b.b$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9660a;

        static {
            int[] iArr = new int[com.applovin.impl.mediation.debugger.a.b.values().length];
            f9660a = iArr;
            try {
                iArr[com.applovin.impl.mediation.debugger.a.b.DEVELOPER_URI_NOT_FOUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9660a[com.applovin.impl.mediation.debugger.a.b.APPADSTXT_NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9660a[com.applovin.impl.mediation.debugger.a.b.MISSING_APPLOVIN_ENTRIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9660a[com.applovin.impl.mediation.debugger.a.b.MISSING_NON_APPLOVIN_ENTRIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum a {
        AD_UNITS,
        SELECT_LIVE_NETWORKS,
        SELECT_TEST_MODE_NETWORKS,
        INITIALIZATION_AD_UNITS,
        COUNT
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.b.b$b, reason: collision with other inner class name */
    public enum EnumC0133b {
        SUCCESS,
        WARNING,
        ERROR
    }

    public enum c {
        SDK_VERSION,
        PLUGIN_VERSION,
        AD_REVIEW_VERSION,
        FLOW_ENABLED,
        PRIVACY_POLICY_URL,
        TERMS_OF_SERVICE_URL,
        APP_ADS_TXT
    }

    public enum d {
        APP_INFO,
        MAX,
        PRIVACY,
        ADS,
        INCOMPLETE_NETWORKS,
        COMPLETED_NETWORKS,
        MISSING_NETWORKS,
        COUNT
    }

    public b(Context context) {
        super(context);
        this.f9643j = new StringBuilder("");
        this.f9644k = new AtomicBoolean();
        this.f9645l = false;
        this.f9646m = new ArrayList();
        this.f9647n = new ArrayList();
        this.f9648o = new ArrayList();
        this.f9649p = new ArrayList();
        this.f9650q = new ArrayList();
        this.f9651r = new ArrayList();
        this.f9652s = new ArrayList();
        this.f9653t = new ArrayList();
        this.f9654u = new ArrayList();
        this.f9655v = new ArrayList();
        this.f9656w = new ArrayList();
        this.f9657x = new ArrayList();
        this.f9658y = new ArrayList();
    }

    private EnumC0133b a(com.applovin.impl.mediation.debugger.a.b bVar) {
        int i10 = AnonymousClass2.f9660a[bVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return EnumC0133b.ERROR;
        }
        return i10 != 4 ? EnumC0133b.ERROR : EnumC0133b.WARNING;
    }

    private com.applovin.impl.mediation.debugger.ui.d.c a(String str) {
        com.applovin.impl.mediation.debugger.ui.d.c.a aVarP = com.applovin.impl.mediation.debugger.ui.d.c.p();
        if (!this.f9635a.as().a()) {
            aVarP.a(this.f9751c);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StringUtils.isValidString(str) ? "" : "Select ");
        sb2.append("Live Network");
        com.applovin.impl.mediation.debugger.ui.d.c.a aVarA = aVarP.a(sb2.toString());
        if (this.f9635a.as().a()) {
            str = "Enable";
        }
        return aVarA.b(str).b(-16776961).d("Ad loads are not supported while Test Mode is enabled. Please restart the app and make sure your GAID has not been enabled for test mode and that you are not on an emulator.").a(true).a();
    }

    private com.applovin.impl.mediation.debugger.ui.d.c a(String str, EnumC0133b enumC0133b) {
        int i10;
        int i11;
        if (enumC0133b == EnumC0133b.SUCCESS) {
            i10 = R.drawable.applovin_ic_check_mark_bordered;
            i11 = R.color.applovin_sdk_checkmarkColor;
        } else if (enumC0133b == EnumC0133b.WARNING) {
            i10 = R.drawable.applovin_ic_warning;
            i11 = R.color.applovin_sdk_warningColor;
        } else {
            i10 = R.drawable.applovin_ic_x_mark;
            i11 = R.color.applovin_sdk_xmarkColor;
        }
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("app-ads.txt").a(i10).c(g.a(i11, this.f9751c)).c("app-ads.txt").d(str).a(true).a();
    }

    private com.applovin.impl.mediation.debugger.ui.d.c a(String str, boolean z10, boolean z11) {
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a(str).a(z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).c(g.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f9751c)).a(z11).a();
    }

    private String a(com.applovin.impl.mediation.debugger.a.b bVar, String str, String str2) {
        StringBuilder sbA;
        String str3;
        if (TextUtils.isEmpty(str)) {
            str = "app-ads.txt URL";
        }
        int i10 = AnonymousClass2.f9660a[bVar.ordinal()];
        if (i10 == 1) {
            return "Could not retrieve developer website from the Play Store for this package name. Check back once this app has been published on the Play Store.";
        }
        if (i10 == 2) {
            sbA = android.support.v4.media.c.a("Unable to find app-ads.txt file or parse entries of the file at ", str);
            str3 = ".\n\n";
        } else if (i10 == 3) {
            sbA = new StringBuilder();
            sbA.append("Text file at ");
            sbA.append(str);
            sbA.append(" is missing the required AppLovin line:\n\n");
            sbA.append(str2);
            str3 = "\n\n";
        } else {
            if (i10 != 4) {
                return "";
            }
            sbA = android.support.v4.media.c.a("Text file at ", str);
            str3 = " is missing some of the suggested lines.\n\n";
        }
        return k.a(sbA, str3, "For more information, please visit Account -> App-Ads.txt Info at:\nhttps://dash.applovin.com/o/account?r=2#app_ads_txt");
    }

    private String a(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!z10) {
            for (com.applovin.impl.mediation.debugger.b.c.b bVar : this.f9651r) {
                if (str.equals(bVar.h())) {
                    return bVar.i();
                }
            }
            return str;
        }
        for (com.applovin.impl.mediation.debugger.b.a.c cVar : this.f9649p) {
            if (str.equals(cVar.a())) {
                return cVar.b();
            }
        }
        for (com.applovin.impl.mediation.debugger.b.a.c cVar2 : this.f9650q) {
            if (str.equals(cVar2.a())) {
                return cVar2.b();
            }
        }
        return str;
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> a(String str, String str2) {
        ArrayList arrayList = new ArrayList(3);
        com.applovin.impl.mediation.debugger.ui.d.c.a aVarP = com.applovin.impl.mediation.debugger.ui.d.c.p();
        StringBuilder sbA = defpackage.a.a("View Ad Units (");
        sbA.append(this.f9636b.size());
        sbA.append(")");
        arrayList.add(aVarP.a(sbA.toString()).a(this.f9751c).a(true).a());
        arrayList.add(a(str));
        arrayList.add(b(str2));
        if (!this.f9637d.isEmpty()) {
            com.applovin.impl.mediation.debugger.ui.d.c.a aVarP2 = com.applovin.impl.mediation.debugger.ui.d.c.p();
            StringBuilder sbA2 = defpackage.a.a("Selective Init Ad Units (");
            sbA2.append(this.f9637d.size());
            sbA2.append(")");
            arrayList.add(aVarP2.a(sbA2.toString()).a(this.f9751c).a(true).a());
        }
        return arrayList;
    }

    private void a(com.applovin.impl.mediation.debugger.ui.d.c.a aVar, String str) {
        aVar.c("MAX Ad Review").d(str).a(R.drawable.applovin_ic_x_mark).c(g.a(R.color.applovin_sdk_xmarkColor, this.f9751c)).a(true);
    }

    private void a(StringBuilder sb2, String str) {
        String string = sb2.toString();
        if (str.length() + string.length() >= ((Integer) this.f9635a.a(com.applovin.impl.sdk.c.b.as)).intValue()) {
            y.f("MediationDebuggerListAdapter", string);
            this.f9643j.append(string);
            sb2.setLength(1);
        }
        sb2.append(str);
    }

    private void a(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        List<com.applovin.impl.mediation.debugger.b.c.b> list2;
        for (com.applovin.impl.mediation.debugger.b.c.b bVar : list) {
            if (!bVar.g()) {
                if (bVar.a() == com.applovin.impl.mediation.debugger.b.c.b.a.INCOMPLETE_INTEGRATION || bVar.a() == com.applovin.impl.mediation.debugger.b.c.b.a.INVALID_INTEGRATION) {
                    list2 = this.f9646m;
                    list2.add(bVar);
                } else {
                    if (bVar.a() == com.applovin.impl.mediation.debugger.b.c.b.a.COMPLETE) {
                        list2 = this.f9647n;
                    } else if (bVar.a() == com.applovin.impl.mediation.debugger.b.c.b.a.MISSING) {
                        list2 = this.f9648o;
                    }
                    list2.add(bVar);
                }
            }
        }
    }

    private com.applovin.impl.mediation.debugger.ui.d.c b(String str) {
        com.applovin.impl.mediation.debugger.ui.d.c.a aVarP = com.applovin.impl.mediation.debugger.ui.d.c.p();
        if (this.f9635a.as().a()) {
            aVarP.a(this.f9751c);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(StringUtils.isValidString(str) ? "" : "Select ");
        sb2.append("Test Mode Network");
        com.applovin.impl.mediation.debugger.ui.d.c.a aVarA = aVarP.a(sb2.toString());
        if (!this.f9635a.as().a()) {
            str = "Enable";
        }
        return aVarA.b(str).b(-16776961).d("Please re-launch the app to enable test mode. This will allow the selection of test mode networks.").a(true).a();
    }

    private com.applovin.impl.mediation.debugger.ui.d.c b(String str, String str2) {
        com.applovin.impl.mediation.debugger.ui.d.c.a aVarA = com.applovin.impl.mediation.debugger.ui.d.c.p().a(str);
        if (StringUtils.isValidString(str2)) {
            aVarA.b(str2);
        } else {
            aVarA.a(R.drawable.applovin_ic_x_mark);
            aVarA.c(g.a(R.color.applovin_sdk_xmarkColor, this.f9751c));
        }
        return aVarA.a();
    }

    private com.applovin.impl.mediation.debugger.ui.d.c b(boolean z10) {
        return com.applovin.impl.mediation.debugger.ui.d.c.p().a("Java 8").a(z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark).c(g.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f9751c)).c("Upgrade to Java 8").d("For optimal performance, please enable Java 8 support. This will be required in a future SDK release. See: https://dash.applovin.com/documentation/mediation/android/getting-started/integration").a(!z10).a();
    }

    private void b(List<com.applovin.impl.mediation.debugger.b.a.a> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator<com.applovin.impl.mediation.debugger.b.a.a> it = list.iterator();
        while (it.hasNext()) {
            com.applovin.impl.mediation.debugger.b.a.b bVarE = it.next().e();
            Iterator<e> it2 = bVarE.d().iterator();
            while (it2.hasNext()) {
                hashSet.add(it2.next().a());
            }
            Iterator<e> it3 = bVarE.e().iterator();
            while (it3.hasNext()) {
                hashSet2.add(it3.next().a());
            }
        }
        this.f9649p = new ArrayList(hashSet);
        this.f9650q = new ArrayList(hashSet2);
        Collections.sort(this.f9649p);
        Collections.sort(this.f9650q);
    }

    private void c(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        for (com.applovin.impl.mediation.debugger.b.c.b bVar : list) {
            if (bVar.c() == com.applovin.impl.mediation.debugger.b.c.b.EnumC0129b.READY) {
                this.f9651r.add(bVar);
            }
        }
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> d(List<com.applovin.impl.mediation.debugger.b.c.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<com.applovin.impl.mediation.debugger.b.c.b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.a(it.next(), this.f9751c));
        }
        return arrayList;
    }

    private void o() {
        StringBuilder sbA;
        Map<String, String> mapA;
        StringBuilder sb2 = new StringBuilder("\n========== MEDIATION DEBUGGER ==========");
        sb2.append("\n========== APP INFO ==========");
        StringBuilder sbA2 = defpackage.a.a("\nDev Build - ");
        sbA2.append(w.a(this.f9751c, this.f9635a));
        sb2.append(sbA2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\nTest Mode - ");
        sb3.append(this.f9635a.as().a() ? "enabled" : "disabled");
        sb2.append(sb3.toString());
        if (this.f9635a.M() != null) {
            sbA = defpackage.a.a("\nTarget SDK - ");
            sbA.append(this.f9635a.L().B().j());
        } else {
            sbA = defpackage.a.a("\nTarget SDK - ");
            sbA.append(this.f9635a.K().h().get("target_sdk"));
        }
        sb2.append(sbA.toString());
        sb2.append("\n========== MAX ==========");
        String str = AppLovinSdk.VERSION;
        String str2 = (String) this.f9635a.a(com.applovin.impl.sdk.c.b.eo);
        String strA = f.a();
        sb2.append("\nSDK Version - " + str);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("\nPlugin Version - ");
        if (!StringUtils.isValidString(str2)) {
            str2 = "None";
        }
        sb4.append(str2);
        sb2.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("\nAd Review Version - ");
        if (!StringUtils.isValidString(strA)) {
            strA = "Disabled";
        }
        sb5.append(strA);
        sb2.append(sb5.toString());
        if (this.f9635a.g() && (mapA = w.a(this.f9635a.ay())) != null) {
            String str3 = mapA.get("UnityVersion");
            StringBuilder sbA3 = defpackage.a.a("\nUnity Version - ");
            sbA3.append(StringUtils.isValidString(str3) ? str3 : "None");
            sb2.append(sbA3.toString());
        }
        sb2.append("\n========== PRIVACY ==========");
        sb2.append(this.f9635a.ab().b());
        sb2.append(com.applovin.impl.b.a.a(this.f9751c));
        sb2.append(this.f9635a.aa().j());
        sb2.append("\n========== NETWORKS ==========");
        Iterator<com.applovin.impl.mediation.debugger.b.c.b> it = this.f9647n.iterator();
        while (it.hasNext()) {
            a(sb2, it.next().z());
        }
        Iterator<com.applovin.impl.mediation.debugger.b.c.b> it2 = this.f9646m.iterator();
        while (it2.hasNext()) {
            a(sb2, it2.next().z());
        }
        sb2.append("\n========== AD UNITS ==========");
        Iterator<com.applovin.impl.mediation.debugger.b.a.a> it3 = this.f9636b.iterator();
        while (it3.hasNext()) {
            a(sb2, it3.next().g());
        }
        sb2.append("\n========== END ==========");
        y.f("MediationDebuggerListAdapter", sb2.toString());
        this.f9643j.append(sb2.toString());
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> p() {
        String str;
        ArrayList arrayList = new ArrayList(7);
        try {
            str = this.f9751c.getPackageManager().getPackageInfo(this.f9751c.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            str = null;
        }
        arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.p().a("Package Name").b(this.f9751c.getPackageName()).a());
        com.applovin.impl.mediation.debugger.ui.d.c.a aVarA = com.applovin.impl.mediation.debugger.ui.d.c.p().a("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(aVarA.b(str).a());
        arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.p().a("OS").b(w.f()).a());
        arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.p().a("Account").b(StringUtils.isValidString(this.f9641h) ? this.f9641h : "None").a());
        arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.p().a("Mediation Provider").b(StringUtils.isValidString(this.f9635a.u()) ? this.f9635a.u() : "None").a());
        arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.p().a("OM SDK Version").b(this.f9635a.ad().c()).a());
        arrayList.add(b(o.aw()));
        if (this.f9642i != null) {
            arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.p().a("Google Families Policy").b(String.valueOf(this.f9642i)).a());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00be  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d4  */
    private List<com.applovin.impl.mediation.debugger.ui.d.c> q() {
        String strA;
        Map<String, String> mapA;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(com.applovin.impl.mediation.debugger.ui.d.c.p().a("SDK Version").b(AppLovinSdk.VERSION).a());
        String str = (String) this.f9635a.a(com.applovin.impl.sdk.c.b.eo);
        com.applovin.impl.mediation.debugger.ui.d.c.a aVarA = com.applovin.impl.mediation.debugger.ui.d.c.p().a("Plugin Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        arrayList.add(aVarA.b(str).a());
        com.applovin.impl.mediation.debugger.ui.d.c.a aVarA2 = com.applovin.impl.mediation.debugger.ui.d.c.p().a("Ad Review Version");
        String strA2 = f.a();
        if (StringUtils.isValidString(strA2)) {
            String strB = f.b();
            if (!StringUtils.isValidString(strB) || strB.equals(this.f9635a.ax())) {
                aVarA2.b(strA2);
            } else {
                strA = k.a(new StringBuilder("MAX Ad Review integrated with wrong SDK key. Please check that your "), this.f9635a.g() ? "SDK key is downloaded" : "Gradle plugin snippet is integrated", " from the correct account.");
            }
            arrayList.add(aVarA2.a());
            if (this.f9635a.g() && (mapA = w.a(this.f9635a.ay())) != null) {
                String str2 = mapA.get("UnityVersion");
                arrayList.add(b("Unity Version", StringUtils.isValidString(str2) ? str2 : "None"));
            }
            if (this.f9635a.aa().b()) {
                arrayList.addAll(r());
            }
            return arrayList;
        }
        strA = "Integrating MAX Ad review is OPTIONAL. This feature gives developers unprecedented transparency into the creatives the users see in their apps.";
        a(aVarA2, strA);
        arrayList.add(aVarA2.a());
        if (this.f9635a.g()) {
            String str3 = mapA.get("UnityVersion");
            arrayList.add(b("Unity Version", StringUtils.isValidString(str3) ? str3 : "None"));
        }
        if (this.f9635a.aa().b()) {
            arrayList.addAll(r());
        }
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> r() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(a(this.f9635a.aa().c() == com.applovin.impl.b.a.c.a.TERMS ? "MAX Terms Flow" : "MAX Consent Flow", this.f9635a.aa().b(), false));
        arrayList.add(a("Privacy Policy URL", this.f9635a.aa().d() != null, true));
        com.applovin.impl.mediation.debugger.ui.d.c.a aVarA = com.applovin.impl.mediation.debugger.ui.d.c.p().a("Terms of Service URL");
        if (this.f9635a.aa().e() != null) {
            aVarA.a(R.drawable.applovin_ic_check_mark_bordered);
            aVarA.c(g.a(R.color.applovin_sdk_checkmarkColor, this.f9751c));
            aVarA.a(true);
        } else {
            aVarA.b("None");
            aVarA.a(false);
        }
        arrayList.add(aVarA.a());
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> s() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(u());
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(com.applovin.impl.b.a.a(), true, this.f9751c));
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(com.applovin.impl.b.a.b(), false, this.f9751c));
        arrayList.add(new com.applovin.impl.mediation.debugger.ui.b.a.b(com.applovin.impl.b.a.c(), true, this.f9751c));
        return arrayList;
    }

    private List<com.applovin.impl.mediation.debugger.ui.d.c> t() {
        boolean zA = this.f9635a.as().a();
        String strC = this.f9635a.as().c();
        if (StringUtils.isValidString(strC)) {
            return zA ? a((String) null, a(strC, false)) : a(a(strC, true), (String) null);
        }
        return a((String) null, (String) null);
    }

    private com.applovin.impl.mediation.debugger.ui.d.c u() {
        String strA = this.f9635a.ab().a();
        com.applovin.impl.mediation.debugger.ui.d.c.a aVarA = com.applovin.impl.mediation.debugger.ui.d.c.a(com.applovin.impl.mediation.debugger.ui.d.c.b.DETAIL);
        if (!StringUtils.isValidString(strA)) {
            strA = "none";
        }
        return aVarA.b(strA).a("CMP (Consent Management Platform)").a();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int a(int i10) {
        List<com.applovin.impl.mediation.debugger.ui.d.c> list;
        if (i10 == d.APP_INFO.ordinal()) {
            list = this.f9652s;
        } else if (i10 == d.MAX.ordinal()) {
            list = this.f9653t;
        } else if (i10 == d.PRIVACY.ordinal()) {
            list = this.f9654u;
        } else if (i10 == d.ADS.ordinal()) {
            list = this.f9655v;
        } else if (i10 == d.INCOMPLETE_NETWORKS.ordinal()) {
            list = this.f9656w;
        } else {
            list = i10 == d.COMPLETED_NETWORKS.ordinal() ? this.f9657x : this.f9658y;
        }
        return list.size();
    }

    @Override // com.applovin.impl.mediation.debugger.a.InterfaceC0127a
    public void a(com.applovin.impl.mediation.debugger.a.b bVar, String str) {
        if (bVar != com.applovin.impl.mediation.debugger.a.b.DEVELOPER_URI_NOT_FOUND) {
            this.f9653t.add(a(a(bVar, str, (String) null), a(bVar)));
            m();
        } else {
            this.f9635a.F();
            if (y.a()) {
                this.f9635a.F().b("MediationDebuggerListAdapter", "Developer URI was not found; app-ads.txt row will not show on the mediation debugger");
            }
        }
    }

    @Override // com.applovin.impl.mediation.debugger.a.InterfaceC0127a
    public void a(com.applovin.impl.mediation.debugger.b.b.a aVar, String str) {
        com.applovin.impl.mediation.debugger.b.b.b bVar;
        com.applovin.impl.mediation.debugger.a.b bVar2;
        String strA;
        EnumC0133b enumC0133bA;
        String strA2;
        ArrayList arrayList = new ArrayList();
        for (com.applovin.impl.mediation.debugger.b.b.b bVar3 : this.f9638e) {
            List<com.applovin.impl.mediation.debugger.b.b.b> list = aVar.a().get(bVar3.b());
            if (list == null || !list.contains(bVar3)) {
                this.f9635a.F();
                if (y.a()) {
                    y yVarF = this.f9635a.F();
                    StringBuilder sbA = android.support.v4.media.c.a(str, " is missing a required entry: ");
                    sbA.append(bVar3.f());
                    yVarF.e("MediationDebuggerListAdapter", sbA.toString());
                }
                arrayList.add(bVar3);
            }
        }
        if (arrayList.isEmpty()) {
            strA2 = j.a("All required entries found at ", str, ".");
            enumC0133bA = EnumC0133b.SUCCESS;
        } else {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = (com.applovin.impl.mediation.debugger.b.b.b) it.next();
            } while (!bVar.a());
            if (bVar != null) {
                bVar2 = com.applovin.impl.mediation.debugger.a.b.MISSING_APPLOVIN_ENTRIES;
                strA = a(bVar2, str, bVar.f());
            } else {
                bVar2 = com.applovin.impl.mediation.debugger.a.b.MISSING_NON_APPLOVIN_ENTRIES;
                strA = a(bVar2, str, (String) null);
            }
            String str2 = strA;
            enumC0133bA = a(bVar2);
            strA2 = str2;
        }
        this.f9653t.add(a(strA2, enumC0133bA));
        m();
    }

    public void a(List<com.applovin.impl.mediation.debugger.b.c.b> list, List<com.applovin.impl.mediation.debugger.b.a.a> list2, List<com.applovin.impl.mediation.debugger.b.a.a> list3, List<com.applovin.impl.mediation.debugger.b.b.b> list4, String str, String str2, String str3, Boolean bool, o oVar) {
        this.f9635a = oVar;
        this.f9636b = list2;
        this.f9637d = list3;
        this.f9638e = list4;
        this.f9639f = str;
        this.f9640g = str2;
        this.f9641h = str3;
        this.f9642i = bool;
        if (list != null && this.f9644k.compareAndSet(false, true)) {
            oVar.F();
            if (y.a()) {
                oVar.F().b("MediationDebuggerListAdapter", "Populating networks...");
            }
            a(list);
            b(list2);
            c(this.f9647n);
            this.f9652s.addAll(p());
            this.f9653t.addAll(q());
            this.f9654u.addAll(s());
            this.f9655v.addAll(t());
            this.f9656w = d(this.f9646m);
            this.f9657x = d(this.f9647n);
            this.f9658y = d(this.f9648o);
            ArrayList arrayList = new ArrayList(3);
            arrayList.add("privacy_setting_updated");
            arrayList.add("network_sdk_version_updated");
            arrayList.add("live_network_updated");
            arrayList.add("test_mode_network_updated");
            AppLovinCommunicator.getInstance(this.f9751c).subscribe(this, arrayList);
            o();
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.debugger.ui.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                b.this.notifyDataSetChanged();
            }
        });
    }

    public void a(boolean z10) {
        this.f9645l = z10;
    }

    public boolean a() {
        return this.f9644k.get();
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public com.applovin.impl.mediation.debugger.ui.d.c b(int i10) {
        if (i10 == d.APP_INFO.ordinal()) {
            return new com.applovin.impl.mediation.debugger.ui.d.e("APP INFO");
        }
        if (i10 == d.MAX.ordinal()) {
            return new com.applovin.impl.mediation.debugger.ui.d.e("MAX");
        }
        if (i10 == d.PRIVACY.ordinal()) {
            return new com.applovin.impl.mediation.debugger.ui.d.e("PRIVACY");
        }
        if (i10 == d.ADS.ordinal()) {
            return new com.applovin.impl.mediation.debugger.ui.d.e("ADS");
        }
        if (i10 == d.INCOMPLETE_NETWORKS.ordinal()) {
            return new com.applovin.impl.mediation.debugger.ui.d.e("INCOMPLETE SDK INTEGRATIONS");
        }
        return i10 == d.COMPLETED_NETWORKS.ordinal() ? new com.applovin.impl.mediation.debugger.ui.d.e("COMPLETED SDK INTEGRATIONS") : new com.applovin.impl.mediation.debugger.ui.d.e("MISSING SDK INTEGRATIONS");
    }

    public boolean b() {
        return this.f9645l;
    }

    public o c() {
        return this.f9635a;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public List<com.applovin.impl.mediation.debugger.ui.d.c> c(int i10) {
        if (i10 == d.APP_INFO.ordinal()) {
            return this.f9652s;
        }
        if (i10 == d.MAX.ordinal()) {
            return this.f9653t;
        }
        if (i10 == d.PRIVACY.ordinal()) {
            return this.f9654u;
        }
        if (i10 == d.ADS.ordinal()) {
            return this.f9655v;
        }
        if (i10 == d.INCOMPLETE_NETWORKS.ordinal()) {
            return this.f9656w;
        }
        return i10 == d.COMPLETED_NETWORKS.ordinal() ? this.f9657x : this.f9658y;
    }

    public List<com.applovin.impl.mediation.debugger.b.a.a> d() {
        return this.f9636b;
    }

    @Override // com.applovin.impl.mediation.debugger.ui.d.d
    public int e() {
        return d.COUNT.ordinal();
    }

    public List<com.applovin.impl.mediation.debugger.b.a.a> f() {
        return this.f9637d;
    }

    public String g() {
        return this.f9639f;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediationDebuggerListAdapter";
    }

    public String h() {
        return this.f9640g;
    }

    public List<com.applovin.impl.mediation.debugger.b.a.c> i() {
        return this.f9649p;
    }

    public List<com.applovin.impl.mediation.debugger.b.a.c> j() {
        return this.f9650q;
    }

    public List<com.applovin.impl.mediation.debugger.b.c.b> k() {
        return this.f9651r;
    }

    public String l() {
        return this.f9643j.toString();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        List<com.applovin.impl.mediation.debugger.ui.d.c> listA;
        if ("privacy_setting_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f9654u = s();
        } else if ("network_sdk_version_updated".equals(appLovinCommunicatorMessage.getTopic())) {
            this.f9656w = d(this.f9646m);
            this.f9657x = d(this.f9647n);
        } else {
            if ("live_network_updated".equals(appLovinCommunicatorMessage.getTopic())) {
                listA = a(a(appLovinCommunicatorMessage.getMessageData().getString("live_network", null), true), (String) null);
            } else if (!"test_mode_network_updated".equals(appLovinCommunicatorMessage.getTopic())) {
                return;
            } else {
                listA = a((String) null, a(appLovinCommunicatorMessage.getMessageData().getString("test_mode_network", null), false));
            }
            this.f9655v = listA;
        }
        m();
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("MediationDebuggerListAdapter{isInitialized=");
        sbA.append(this.f9644k.get());
        sbA.append("}");
        return sbA.toString();
    }
}
