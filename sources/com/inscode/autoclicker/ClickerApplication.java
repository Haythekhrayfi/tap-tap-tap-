package com.inscode.autoclicker;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.database.CursorWindow;
import com.google.android.gms.common.internal.ImagesContract;
import com.inscode.autoclicker.base.BaseApplication;
import com.inscode.autoclicker.service.BackgroundService;
import com.inscode.autoclicker.ui.main.MainActivity;
import com.zipoapps.ads.config.AdManagerConfiguration;
import com.zipoapps.premiumhelper.configuration.appconfig.PremiumHelperConfiguration;
import com.zipoapps.premiumhelper.performance.StartupPerformanceTracker;
import fd.j0;
import ge.c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import jc.e;
import jc.f;
import k7.d;
import k7.g;
import k7.i;
import k7.n;
import kc.j;
import kc.k;
import le.b;
import vc.b0;
import vc.l;
import w6.w;
import x1.q;
import yd.h;

/* JADX INFO: loaded from: classes2.dex */
public final class ClickerApplication extends BaseApplication {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f13026f = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f13027c = f.b(new a());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nb.a f13028d = new nb.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nb.a f13029e = new nb.a();

    public static final class a extends l implements uc.a<Intent> {
        public a() {
            super(0);
        }

        @Override // uc.a
        public Intent invoke() {
            return new Intent(ClickerApplication.this, (Class<?>) BackgroundService.class);
        }
    }

    public final Intent a() {
        return (Intent) this.f13027c.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:140:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:150:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:160:0x060f  */
    @Override // android.app.Application
    public void onCreate() throws IllegalAccessException, NoSuchFieldException {
        wd.a aVarA;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        super.onCreate();
        n nVar = g.f31921a;
        q.e("Context", this);
        g.f31921a = null;
        g.f31921a = new d(new i(this));
        List listA = k.a(w.f37134a);
        HashMap map = new HashMap();
        boolean z14 = true;
        vd.a aVar = new vd.a(false, 1, null);
        j0.j(this, "$receiver");
        j0.j(this, "androidContext");
        j0.j(listA, "modules");
        j0.j(map, "extraProperties");
        j0.j(aVar, "logger");
        wd.a.C0452a c0452a = wd.a.f37302g;
        Objects.requireNonNull(c0452a);
        j0.j(aVar, "<set-?>");
        wd.a.f37301f = aVar;
        b bVar = b.f33118b;
        j0.j(listA, "modules");
        Object[] array = listA.toArray(new uc.l[0]);
        if (array == null) {
            throw new jc.l("null cannot be cast to non-null type kotlin.Array<T>");
        }
        uc.l[] lVarArr = (uc.l[]) array;
        uc.l[] lVarArr2 = (uc.l[]) Arrays.copyOf(lVarArr, lVarArr.length);
        j0.j(lVarArr2, "modules");
        List listB = j.B(lVarArr2);
        synchronized (bVar) {
            if (b.f33117a == null) {
                b.f33117a = wd.a.C0452a.a(c0452a, null, 1);
            }
            wd.a aVar2 = b.f33117a;
            if (aVar2 != null) {
                aVar2.a(listB);
            }
            aVarA = bVar.a();
        }
        j0.j(aVarA, "$receiver");
        j0.j(this, "androidContext");
        wd.a.f37301f.info("[init] declare Android Context");
        ud.a aVar3 = new ud.a(this);
        c cVar = c.Single;
        ge.b<?> bVar2 = new ge.b<>("", b0.a(Context.class), null, null, cVar, false, false, null, aVar3, 172, null);
        j0.j(bVar2, "definition");
        aVarA.f37304b.a(bVar2);
        ge.b<?> bVar3 = new ge.b<>("", b0.a(Application.class), null, null, cVar, false, false, null, new ud.b(this), 172, null);
        j0.j(bVar3, "definition");
        aVarA.f37304b.a(bVar3);
        if (!map.isEmpty()) {
            j0.j(map, "props");
            if (!map.isEmpty()) {
                ce.a aVar4 = aVarA.f37303a;
                Objects.requireNonNull(aVar4);
                j0.j(map, "props");
                aVar4.f3679a.putAll(map);
            }
        }
        ae.b bVar4 = ae.b.f348c;
        j0.j(bVar4, "defaultParameters");
        yd.f fVar = aVarA.f37307e.f37311a;
        Objects.requireNonNull(fVar);
        j0.j(bVar4, "defaultParameters");
        HashSet<ge.b<?>> hashSet = fVar.f44892b.f37598a;
        ArrayList<ge.b> arrayList = new ArrayList();
        for (Object obj : hashSet) {
            if (((ge.b) obj).f30451h) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Objects.requireNonNull(wd.a.f37302g);
            wd.a.f37301f.info("Creating instances ...");
            j0.j(arrayList, "definitions");
            j0.j(bVar4, "params");
            for (ge.b bVar5 : arrayList) {
                fVar.b(bVar5.f30447d, null, bVar4, new yd.c(bVar5));
            }
        }
        ae.b bVar6 = ae.b.f348c;
        q6.b bVar7 = (q6.b) fd.f.d(this).f37311a.c(new h("", b0.a(q6.b.class), null, bVar6));
        this.f13028d.d();
        gc.a<Boolean> aVar5 = bVar7.f34789i;
        lb.l lVar = fc.a.f29534b;
        nb.b bVarE = ec.a.e(aVar5.u(lVar).p(mb.a.a()), null, null, new p6.e(this), 3);
        nb.a aVar6 = this.f13028d;
        j0.j(bVarE, "$receiver");
        j0.j(aVar6, "compositeDisposable");
        aVar6.a(bVarE);
        q6.b bVar8 = (q6.b) fd.f.d(this).f37311a.c(new h("", b0.a(q6.b.class), null, bVar6));
        r6.e eVar = (r6.e) fd.f.d(this).f37311a.c(new h("", b0.a(r6.e.class), null, bVar6));
        this.f13029e.d();
        za.i.c cVar2 = null;
        ec.a.e(bVar8.f34790j.j(new p6.a(new p6.c(eVar), 0)).u(lVar).p(mb.a.a()), null, null, new p6.d(this), 3);
        Field declaredField = CursorWindow.class.getDeclaredField("sCursorWindowSize");
        j0.h(declaredField, "CursorWindow::class.java…ield(\"sCursorWindowSize\")");
        declaredField.setAccessible(true);
        declaredField.set(null, 104857600);
        j0.i(this, "application");
        ma.h.a aVar7 = ma.h.f33410y;
        PremiumHelperConfiguration.a aVar8 = new PremiumHelperConfiguration.a(false);
        j0.i(MainActivity.class, "mainActivityClass");
        aVar8.f28301i = MainActivity.class;
        String string = getString(R.string.ph_main_sku);
        j0.h(string, "application.getString(R.string.ph_main_sku)");
        j0.i(string, "defaultSku");
        HashMap<String, String> map2 = aVar8.f28294b;
        oa.b.c.d dVar = oa.b.f34179k;
        map2.put(dVar.f34212a, string);
        int[] iArr = {R.layout.activity_start_like_pro_x_to_close};
        j0.i(iArr, "startLikeProActivityLayout");
        aVar8.f28296d = iArr;
        int[] iArr2 = {R.layout.activity_relaunch_premium};
        j0.i(iArr2, "relaunchPremiumActivityLayout");
        aVar8.f28299g = iArr2;
        int[] iArr3 = {R.layout.activity_relaunch_premium_one_time};
        j0.i(iArr3, "relaunchOneTimeActivityLayout");
        aVar8.f28300h = iArr3;
        za.i.a aVar9 = new za.i.a(null, null, null, null, null, null, null, 127, null);
        oa.b.f fVar2 = oa.b.f.STARS;
        j0.i(fVar2, "dialogType");
        aVar9.f45232a = fVar2;
        com.zipoapps.premiumhelper.ui.rate.c.b bVar9 = com.zipoapps.premiumhelper.ui.rate.c.b.VALIDATE_INTENT;
        j0.i(bVar9, "dialogMode");
        aVar9.f45233b = bVar9;
        za.i.b.a aVar10 = new za.i.b.a(null, null, null, null, null, null, 63, null);
        aVar10.f45245a = Integer.valueOf(R.color.ph_cta_color);
        za.i.b bVarA = aVar10.a();
        j0.i(bVarA, "dialogStyle");
        aVar9.f45234c = bVarA;
        aVar9.f45237f = 3;
        String string2 = getString(R.string.ph_support_email);
        j0.h(string2, "context.getString(R.string.ph_support_email)");
        j0.i(string2, "supportEmail");
        aVar9.f45235d = string2;
        String string3 = getString(R.string.ph_support_email_vip);
        j0.h(string3, "context.getString(R.string.ph_support_email_vip)");
        j0.i(string3, "supportEmailVip");
        aVar9.f45236e = string3;
        oa.b.f fVar3 = aVar9.f45232a;
        oa.b.f fVar4 = fVar3 == null ? oa.b.f.THUMBSUP : fVar3;
        com.zipoapps.premiumhelper.ui.rate.c.b bVar10 = aVar9.f45233b;
        com.zipoapps.premiumhelper.ui.rate.c.b bVar11 = bVar10 == null ? bVar9 : bVar10;
        za.i.b bVar12 = aVar9.f45234c;
        if (bVar12 == null) {
            throw new IllegalStateException("Rate dialog style is mandatory".toString());
        }
        if (fVar3 != oa.b.f.THUMBSUP) {
            String str = aVar9.f45235d;
            if (!(str == null || ed.q.k(str))) {
                String str2 = aVar9.f45236e;
                if (!(str2 == null || ed.q.k(str2))) {
                    String str3 = aVar9.f45235d;
                    j0.f(str3);
                    String str4 = aVar9.f45236e;
                    j0.f(str4);
                    cVar2 = new za.i.c(str3, str4);
                }
            }
            StringBuilder sbA = defpackage.a.a("Support emails are mandatory when rate type is : ");
            sbA.append(fVar4.name());
            throw new IllegalStateException(sbA.toString().toString());
        }
        za.i iVar = new za.i(fVar4, bVar11, bVar12, cVar2, aVar9.f45237f, aVar9.f45238g, null);
        j0.i(iVar, "rateDialogConfiguration");
        HashMap<String, String> map3 = aVar8.f28294b;
        oa.b.c.C0378b<oa.b.f> c0378b = oa.b.f34178j0;
        map3.put(c0378b.f34212a, iVar.f45226a.name());
        aVar8.f28306n = iVar.f45228c;
        com.zipoapps.premiumhelper.ui.rate.c.b bVar13 = iVar.f45227b;
        if (bVar13 != null) {
            aVar8.f28294b.put(oa.b.f34200w.f34212a, bVar13.name());
        }
        za.i.c cVar3 = iVar.f45229d;
        if (cVar3 != null) {
            aVar8.a(oa.b.f34180k0, cVar3.f45251a);
            aVar8.a(oa.b.f34182l0, cVar3.f45252b);
        }
        Integer num = iVar.f45231f;
        if (num != null) {
            aVar8.f28295c = num.intValue();
        }
        Integer num2 = iVar.f45230e;
        if (num2 != null) {
            aVar8.f28294b.put(oa.b.f34199v.f34212a, String.valueOf(num2.intValue()));
        }
        AdManagerConfiguration.Builder builder = new AdManagerConfiguration.Builder(null, null, null, null, null, null, null, null, 255, null);
        String string4 = getString(R.string.ph_banner_ad_id);
        j0.h(string4, "context.getString(R.string.ph_banner_ad_id)");
        AdManagerConfiguration.Builder builderBannerAd = builder.bannerAd(string4);
        String string5 = getString(R.string.ph_interstitial_ad_id);
        j0.h(string5, "context.getString(R.string.ph_interstitial_ad_id)");
        AdManagerConfiguration.Builder builderInterstitialAd = builderBannerAd.interstitialAd(string5);
        String string6 = getString(R.string.ph_rewarded_ad_id);
        j0.h(string6, "context.getString(R.string.ph_rewarded_ad_id)");
        AdManagerConfiguration.Builder builderRewardedAd = builderInterstitialAd.rewardedAd(string6);
        String string7 = getString(R.string.ph_native_ad_id);
        j0.h(string7, "context.getString(R.string.ph_native_ad_id)");
        AdManagerConfiguration.Builder builderNativeAd = builderRewardedAd.nativeAd(string7);
        String string8 = getString(R.string.ph_exit_banner_ad_id);
        j0.h(string8, "context.getString(R.string.ph_exit_banner_ad_id)");
        AdManagerConfiguration.Builder builderExitBannerAd = builderNativeAd.exitBannerAd(string8);
        String string9 = getString(R.string.ph_exit_native_ad_id);
        j0.h(string9, "context.getString(R.string.ph_exit_native_ad_id)");
        AdManagerConfiguration adManagerConfigurationBuild = builderExitBannerAd.exitNativeAd(string9).build();
        j0.i(adManagerConfigurationBuild, "admobConfiguration");
        j0.i(adManagerConfigurationBuild, "configuration");
        HashMap<String, String> map4 = aVar8.f28294b;
        oa.b.c.d dVar2 = oa.b.f34185n;
        String str5 = dVar2.f34212a;
        String banner = adManagerConfigurationBuild.getBanner();
        if (banner == null) {
            banner = "";
        }
        map4.put(str5, banner);
        HashMap<String, String> map5 = aVar8.f28294b;
        oa.b.c.d dVar3 = oa.b.f34187o;
        map5.put(dVar3.f34212a, adManagerConfigurationBuild.getInterstitial());
        HashMap<String, String> map6 = aVar8.f28294b;
        String str6 = oa.b.f34189p.f34212a;
        String str7 = adManagerConfigurationBuild.getNative();
        if (str7 == null) {
            str7 = "";
        }
        map6.put(str6, str7);
        HashMap<String, String> map7 = aVar8.f28294b;
        String str8 = oa.b.f34191q.f34212a;
        String rewarded = adManagerConfigurationBuild.getRewarded();
        if (rewarded == null) {
            rewarded = "";
        }
        map7.put(str8, rewarded);
        HashMap<String, String> map8 = aVar8.f28294b;
        String str9 = oa.b.f34193r.f34212a;
        String exit_banner = adManagerConfigurationBuild.getExit_banner();
        if (exit_banner == null) {
            exit_banner = "";
        }
        map8.put(str9, exit_banner);
        HashMap<String, String> map9 = aVar8.f28294b;
        String str10 = oa.b.f34195s.f34212a;
        String exit_native = adManagerConfigurationBuild.getExit_native();
        map9.put(str10, exit_native != null ? exit_native : "");
        List<String> testAdvertisingIds = adManagerConfigurationBuild.getTestAdvertisingIds();
        if (testAdvertisingIds != null) {
            z10 = false;
            aVar8.f28307o.putStringArray("test_advertising_ids", (String[]) testAdvertisingIds.toArray(new String[0]));
        } else {
            z10 = false;
        }
        aVar8.f28294b.put(oa.b.C.f34212a, String.valueOf(z10));
        aVar8.a(oa.b.T, Boolean.TRUE);
        oa.b.EnumC0377b enumC0377b = oa.b.EnumC0377b.SESSION;
        j0.i(enumC0377b, "type");
        aVar8.a(oa.b.G, 20L);
        aVar8.a(oa.b.H, enumC0377b);
        aVar8.f28304l = false;
        j0.i(enumC0377b, "type");
        aVar8.a(oa.b.D, 120L);
        aVar8.a(oa.b.E, enumC0377b);
        String string10 = getString(R.string.ph_terms_link);
        j0.h(string10, "application.getString(R.string.ph_terms_link)");
        j0.i(string10, ImagesContract.URL);
        HashMap<String, String> map10 = aVar8.f28294b;
        oa.b.c.d dVar4 = oa.b.f34202y;
        map10.put(dVar4.f34212a, string10);
        String string11 = getString(R.string.ph_privacy_policy_link);
        j0.h(string11, "application.getString(R.…g.ph_privacy_policy_link)");
        j0.i(string11, ImagesContract.URL);
        HashMap<String, String> map11 = aVar8.f28294b;
        oa.b.c.d dVar5 = oa.b.f34203z;
        map11.put(dVar5.f34212a, string11);
        if (aVar8.f28301i == null) {
            throw new IllegalArgumentException("PremiumHelper: Please configure mainActivityClass.");
        }
        boolean z15 = aVar8.f28305m;
        if (!z15) {
            if (aVar8.f28296d.length == 0) {
                throw new IllegalArgumentException("PremiumHelper: Please configure layout for StartLikePro activity.");
            }
        }
        if (!z15) {
            if (aVar8.f28299g.length == 0) {
                throw new IllegalArgumentException("PremiumHelper: Please configure layout for RelaunchPremium activity.");
            }
        }
        if (!z15) {
            if (aVar8.f28300h.length == 0) {
                throw new IllegalArgumentException("PremiumHelper: Please configure layout for RelaunchOneTime activity.");
            }
        }
        String str11 = aVar8.f28294b.get(dVar.f34212a);
        if (str11 == null || str11.length() == 0) {
            throw new IllegalArgumentException("PremiumHelper: Please configure default name for main offer SKU.");
        }
        HashMap<String, String> map12 = aVar8.f28294b;
        oa.b.c.d dVar6 = oa.b.f34181l;
        String str12 = map12.get(dVar6.f34212a);
        if (str12 == null) {
            z11 = false;
        } else if (str12.length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            HashMap<String, String> map13 = aVar8.f28294b;
            oa.b.c.d dVar7 = oa.b.f34183m;
            String str13 = map13.get(dVar7.f34212a);
            if (str13 == null) {
                z12 = false;
            } else if (str13.length() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                String str14 = aVar8.f28294b.get(dVar6.f34212a);
                if (str14 == null) {
                    z13 = false;
                } else if (str14.length() > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    String str15 = aVar8.f28294b.get(dVar7.f34212a);
                    if (str15 == null || str15.length() == 0) {
                        throw new IllegalArgumentException("PremiumHelper: You must configure both ONE_TIME and ONETIME_OFFER_STRIKETHROUGH sku to show one-time relaunch view.");
                    }
                }
                if (!aVar8.f28305m && aVar8.f28294b.get(dVar6.f34212a) != null) {
                    if (aVar8.f28300h.length == 0) {
                        throw new IllegalArgumentException("PremiumHelper: You must configure relaunchOneTimeActivityLayout to show one-time relaunch view.");
                    }
                }
                String str16 = aVar8.f28294b.get(dVar2.f34212a);
                if (str16 == null || str16.length() == 0) {
                    String str17 = aVar8.f28294b.get(dVar3.f34212a);
                    if (str17 == null || str17.length() == 0) {
                        throw new IllegalArgumentException("Please provide ads configuration.");
                    }
                }
                String str18 = aVar8.f28294b.get(dVar4.f34212a);
                if (str18 == null || str18.length() == 0) {
                    throw new IllegalArgumentException("PremiumHelper: You must configure Terms and Conditions url");
                }
                String str19 = aVar8.f28294b.get(dVar5.f34212a);
                if (str19 == null || str19.length() == 0) {
                    throw new IllegalArgumentException("PremiumHelper: You must configure Privacy url");
                }
                String str20 = aVar8.f28294b.get(c0378b.f34212a);
                if (str20 == null || str20.length() == 0) {
                    throw new IllegalArgumentException("PremiumHelper: RateDialog is not configured");
                }
                if (j0.d(aVar8.f28294b.get(oa.b.W.f34212a), "APPLOVIN")) {
                    String str21 = aVar8.f28294b.get(oa.b.Y.f34212a);
                    if (str21 != null && str21.length() != 0) {
                        z14 = false;
                    }
                    if (z14) {
                        throw new IllegalArgumentException("PremiumHelper: AppLovin MREC unit ID is not defined");
                    }
                }
                Class<? extends Activity> cls = aVar8.f28301i;
                j0.f(cls);
                PremiumHelperConfiguration premiumHelperConfiguration = new PremiumHelperConfiguration(cls, aVar8.f28302j, aVar8.f28303k, aVar8.f28295c, aVar8.f28296d, aVar8.f28297e, aVar8.f28298f, aVar8.f28299g, aVar8.f28300h, aVar8.f28293a, aVar8.f28304l, aVar8.f28305m, aVar8.f28306n, aVar8.f28307o, aVar8.f28294b);
                Objects.requireNonNull(aVar7);
                j0.i(this, "application");
                j0.i(premiumHelperConfiguration, "appConfiguration");
                if (ma.h.A != null) {
                    return;
                }
                synchronized (aVar7) {
                    if (ma.h.A == null) {
                        StartupPerformanceTracker.StartupData startupData = StartupPerformanceTracker.f28309b.a().f28311a;
                        if (startupData != null) {
                            startupData.setPhStartTimestamp(System.currentTimeMillis());
                        }
                        ma.h hVar = new ma.h(this, premiumHelperConfiguration, null);
                        ma.h.A = hVar;
                        ma.h.e(hVar);
                    }
                }
                return;
            }
        }
        throw new IllegalArgumentException("PremiumHelper: ONE_TIME and ONETIME_OFFER_STRIKETHROUGH cannot be empty");
    }
}
