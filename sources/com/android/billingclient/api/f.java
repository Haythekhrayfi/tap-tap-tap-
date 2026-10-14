package com.android.billingclient.api;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.android.billingclient.BuildConfig;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zze;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzfl;
import com.google.android.gms.internal.play_billing.zzfm;
import com.google.android.gms.internal.play_billing.zzu;
import com.google.android.gms.internal.play_billing.zzz;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class f extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile int f3787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f3789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile j1.c f3790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f3791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j1.c f3792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile zze f3793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile d0 f3794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f3798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f3799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3800n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f3801o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3802p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3803q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f3804r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3805s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ExecutorService f3806t;

    public f(fd.j0 j0Var, Context context, w wVar, c cVar) {
        String strM = m();
        this.f3787a = 0;
        this.f3789c = new Handler(Looper.getMainLooper());
        this.f3796j = 0;
        this.f3788b = strM;
        this.f3791e = context.getApplicationContext();
        zzfl zzflVarZzv = zzfm.zzv();
        zzflVarZzv.zzj(strM);
        zzflVarZzv.zzi(this.f3791e.getPackageName());
        this.f3792f = new j1.c(this.f3791e, (zzfm) zzflVarZzv.zzc());
        if (wVar == null) {
            zzb.zzj("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f3790d = new j1.c(this.f3791e, wVar, null, this.f3792f);
        this.f3805s = false;
    }

    @SuppressLint({"PrivateApi"})
    public static String m() {
        try {
            return (String) y2.a.class.getField(CoreConstants.VERSION_NAME_KEY).get(null);
        } catch (Exception unused) {
            return BuildConfig.VERSION_NAME;
        }
    }

    @Override // com.android.billingclient.api.e
    public final void a(final a aVar, final b bVar) {
        j1.c cVar;
        int i10;
        n nVar;
        if (!d()) {
            cVar = this.f3792f;
            i10 = 2;
            nVar = e0.f3779l;
        } else if (TextUtils.isEmpty(aVar.f3756a)) {
            zzb.zzj("BillingClient", "Please provide a valid purchase token.");
            cVar = this.f3792f;
            i10 = 26;
            nVar = e0.f3776i;
        } else {
            if (this.f3798l) {
                if (n(new Callable() { // from class: com.android.billingclient.api.o0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        f fVar = this.f3853c;
                        a aVar2 = aVar;
                        b bVar2 = bVar;
                        Objects.requireNonNull(fVar);
                        try {
                            zze zzeVar = fVar.f3793g;
                            String packageName = fVar.f3791e.getPackageName();
                            String str = aVar2.f3756a;
                            String str2 = fVar.f3788b;
                            Bundle bundle = new Bundle();
                            bundle.putString("playBillingLibraryVersion", str2);
                            Bundle bundleZzd = zzeVar.zzd(9, packageName, str, bundle);
                            int iZzb = zzb.zzb(bundleZzd, "BillingClient");
                            String strZzf = zzb.zzf(bundleZzd, "BillingClient");
                            n nVar2 = new n();
                            nVar2.f3848a = iZzb;
                            nVar2.f3849b = strZzf;
                            fd.r<n> rVar = ((g) bVar2).f3808a;
                            fd.j0.h(nVar2, "it");
                            rVar.O(nVar2);
                            return null;
                        } catch (Exception e10) {
                            zzb.zzk("BillingClient", "Error acknowledge purchase!", e10);
                            j1.c cVar2 = fVar.f3792f;
                            n nVar3 = e0.f3779l;
                            cVar2.e(u1.a.w(28, 3, nVar3));
                            ((g) bVar2).a(nVar3);
                            return null;
                        }
                    }
                }, 30000L, new Runnable() { // from class: com.android.billingclient.api.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        f fVar = this.f3856c;
                        b bVar2 = bVar;
                        j1.c cVar2 = fVar.f3792f;
                        n nVar2 = e0.f3780m;
                        cVar2.e(u1.a.w(24, 3, nVar2));
                        ((g) bVar2).a(nVar2);
                    }
                }, j()) == null) {
                    n nVarL = l();
                    this.f3792f.e(u1.a.w(25, 3, nVarL));
                    ((g) bVar).f3808a.O(nVarL);
                    return;
                }
                return;
            }
            cVar = this.f3792f;
            i10 = 27;
            nVar = e0.f3769b;
        }
        cVar.e(u1.a.w(i10, 3, nVar));
        fd.r<n> rVar = ((g) bVar).f3808a;
        fd.j0.h(nVar, "it");
        rVar.O(nVar);
    }

    @Override // com.android.billingclient.api.e
    public final void b(final o oVar, final p pVar) {
        if (!d()) {
            j1.c cVar = this.f3792f;
            n nVar = e0.f3779l;
            cVar.e(u1.a.w(2, 4, nVar));
            ((h) pVar).a(nVar, oVar.f3852a);
            return;
        }
        if (n(new Callable() { // from class: com.android.billingclient.api.l0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int iZza;
                String strZzf;
                f fVar = this.f3826c;
                o oVar2 = oVar;
                p pVar2 = pVar;
                Objects.requireNonNull(fVar);
                String str = oVar2.f3852a;
                try {
                    zzb.zzi("BillingClient", "Consuming purchase with token: " + str);
                    if (fVar.f3798l) {
                        zze zzeVar = fVar.f3793g;
                        String packageName = fVar.f3791e.getPackageName();
                        boolean z10 = fVar.f3798l;
                        String str2 = fVar.f3788b;
                        Bundle bundle = new Bundle();
                        if (z10) {
                            bundle.putString("playBillingLibraryVersion", str2);
                        }
                        Bundle bundleZze = zzeVar.zze(9, packageName, str, bundle);
                        iZza = bundleZze.getInt("RESPONSE_CODE");
                        strZzf = zzb.zzf(bundleZze, "BillingClient");
                    } else {
                        iZza = fVar.f3793g.zza(3, fVar.f3791e.getPackageName(), str);
                        strZzf = "";
                    }
                    n nVar2 = new n();
                    nVar2.f3848a = iZza;
                    nVar2.f3849b = strZzf;
                    if (iZza == 0) {
                        zzb.zzi("BillingClient", "Successfully consumed purchase.");
                    } else {
                        zzb.zzj("BillingClient", "Error consuming purchase with token. Response code: " + iZza);
                        fVar.f3792f.e(u1.a.w(23, 4, nVar2));
                    }
                    ((h) pVar2).a(nVar2, str);
                    return null;
                } catch (Exception e10) {
                    zzb.zzk("BillingClient", "Error consuming purchase!", e10);
                    j1.c cVar2 = fVar.f3792f;
                    n nVar3 = e0.f3779l;
                    cVar2.e(u1.a.w(29, 4, nVar3));
                    ((h) pVar2).a(nVar3, str);
                    return null;
                }
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.m0
            @Override // java.lang.Runnable
            public final void run() {
                f fVar = this.f3845c;
                p pVar2 = pVar;
                o oVar2 = oVar;
                j1.c cVar2 = fVar.f3792f;
                n nVar2 = e0.f3780m;
                cVar2.e(u1.a.w(24, 4, nVar2));
                ((h) pVar2).a(nVar2, oVar2.f3852a);
            }
        }, j()) == null) {
            n nVarL = l();
            this.f3792f.e(u1.a.w(25, 4, nVarL));
            ((h) pVar).a(nVarL, oVar.f3852a);
        }
    }

    @Override // com.android.billingclient.api.e
    public final void c() {
        this.f3792f.f(u1.a.x(12));
        try {
            try {
                this.f3790d.g();
                if (this.f3794h != null) {
                    d0 d0Var = this.f3794h;
                    synchronized (d0Var.f3764a) {
                        d0Var.f3766c = null;
                        d0Var.f3765b = true;
                    }
                }
                if (this.f3794h != null && this.f3793g != null) {
                    zzb.zzi("BillingClient", "Unbinding from service.");
                    this.f3791e.unbindService(this.f3794h);
                    this.f3794h = null;
                }
                this.f3793g = null;
                ExecutorService executorService = this.f3806t;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.f3806t = null;
                }
                this.f3787a = 3;
            } catch (Exception e10) {
                zzb.zzk("BillingClient", "There was an exception while ending connection!", e10);
                this.f3787a = 3;
            }
        } catch (Throwable th) {
            this.f3787a = 3;
            throw th;
        }
    }

    @Override // com.android.billingclient.api.e
    public final boolean d() {
        return (this.f3787a != 2 || this.f3793g == null || this.f3794h == null) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    @Override // com.android.billingclient.api.e
    public final n e(Activity activity, final m mVar) {
        boolean z10;
        String str;
        Callable callable;
        j1.c cVar;
        int i10;
        n nVar;
        zzfb zzfbVarW;
        boolean z11;
        String str2;
        zzu zzuVar;
        SkuDetails skuDetails;
        m.b bVar;
        String str3;
        String str4;
        String str5;
        boolean z12;
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        String str6;
        String str7;
        int i11;
        final int i12;
        int i13;
        j1.c cVar2;
        n nVar2;
        zzfb zzfbVarW2;
        final f fVar = this;
        if (d()) {
            ArrayList<SkuDetails> arrayList3 = new ArrayList();
            arrayList3.addAll(mVar.f3834f);
            zzu zzuVar2 = mVar.f3833e;
            SkuDetails skuDetails2 = (SkuDetails) zzz.zza(arrayList3, null);
            m.b bVar2 = (m.b) zzz.zza(zzuVar2, null);
            if (skuDetails2 == null) {
                Objects.requireNonNull(bVar2);
                throw null;
            }
            final String strE = skuDetails2.e();
            final String strF = skuDetails2.f();
            String str8 = "BillingClient";
            if (!strF.equals("subs") || fVar.f3795i) {
                if (mVar.f3830b == null && mVar.f3831c == null) {
                    m.c cVar3 = mVar.f3832d;
                    if (cVar3.f3841b == null && cVar3.f3842c == 0 && cVar3.f3843d == 0 && !mVar.f3829a && !mVar.f3835g) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else {
                    z10 = true;
                }
                if (z10 && !fVar.f3797k) {
                    zzb.zzj("BillingClient", "Current client doesn't support extra params for buy intent.");
                    cVar = fVar.f3792f;
                    i13 = 18;
                    nVar = e0.f3775h;
                } else {
                    if (arrayList3.size() <= 1 || fVar.f3802p) {
                        if (zzuVar2.isEmpty() || fVar.f3803q) {
                            if (fVar.f3797k) {
                                boolean z13 = fVar.f3798l;
                                boolean z14 = fVar.f3805s;
                                String str9 = fVar.f3788b;
                                final Bundle bundle = new Bundle();
                                bundle.putString("playBillingLibraryVersion", str9);
                                m.c cVar4 = mVar.f3832d;
                                int i14 = cVar4.f3843d;
                                if (i14 != 0) {
                                    bundle.putInt("prorationMode", i14);
                                } else {
                                    int i15 = cVar4.f3842c;
                                    if (i15 != 0) {
                                        bundle.putInt("prorationMode", i15);
                                    }
                                }
                                if (!TextUtils.isEmpty(mVar.f3830b)) {
                                    bundle.putString("accountId", mVar.f3830b);
                                }
                                if (!TextUtils.isEmpty(mVar.f3831c)) {
                                    bundle.putString("obfuscatedProfileId", mVar.f3831c);
                                }
                                if (mVar.f3835g) {
                                    bundle.putBoolean("isOfferPersonalizedByDeveloper", true);
                                }
                                if (!TextUtils.isEmpty(null)) {
                                    bundle.putStringArrayList("skusToReplace", new ArrayList<>(Arrays.asList(null)));
                                }
                                if (!TextUtils.isEmpty(mVar.f3832d.f3840a)) {
                                    bundle.putString("oldSkuPurchaseToken", mVar.f3832d.f3840a);
                                }
                                if (!TextUtils.isEmpty(null)) {
                                    bundle.putString("oldSkuPurchaseId", null);
                                }
                                if (!TextUtils.isEmpty(mVar.f3832d.f3841b)) {
                                    bundle.putString("originalExternalTransactionId", mVar.f3832d.f3841b);
                                }
                                if (!TextUtils.isEmpty(null)) {
                                    bundle.putString("paymentsPurchaseParams", null);
                                }
                                if (z13) {
                                    z11 = true;
                                    bundle.putBoolean("enablePendingPurchases", true);
                                } else {
                                    z11 = true;
                                }
                                if (z14) {
                                    bundle.putBoolean("enableAlternativeBilling", z11);
                                }
                                if (arrayList3.isEmpty()) {
                                    str2 = "proxyPackageVersion";
                                    zzuVar = zzuVar2;
                                    skuDetails = skuDetails2;
                                    bVar = bVar2;
                                    str3 = strE;
                                    str4 = strF;
                                    str5 = "BillingClient";
                                    z12 = true;
                                    arrayList = new ArrayList<>(zzuVar.size() - 1);
                                    arrayList2 = new ArrayList<>(zzuVar.size() - 1);
                                    ArrayList<String> arrayList4 = new ArrayList<>();
                                    ArrayList<String> arrayList5 = new ArrayList<>();
                                    ArrayList<String> arrayList6 = new ArrayList<>();
                                    if (zzuVar.size() > 0) {
                                        Objects.requireNonNull((m.b) zzuVar.get(0));
                                        throw null;
                                    }
                                    bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList5);
                                    if (!arrayList4.isEmpty()) {
                                        bundle.putStringArrayList("skuDetailsTokens", arrayList4);
                                    }
                                    if (!arrayList6.isEmpty()) {
                                        bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList6);
                                    }
                                    if (!arrayList.isEmpty()) {
                                        bundle.putStringArrayList("additionalSkus", arrayList);
                                        bundle.putStringArrayList("additionalSkuTypes", arrayList2);
                                    }
                                } else {
                                    ArrayList<String> arrayList7 = new ArrayList<>();
                                    ArrayList<String> arrayList8 = new ArrayList<>();
                                    str4 = strF;
                                    ArrayList<String> arrayList9 = new ArrayList<>();
                                    str3 = strE;
                                    ArrayList<Integer> arrayList10 = new ArrayList<>();
                                    str2 = "proxyPackageVersion";
                                    ArrayList<String> arrayList11 = new ArrayList<>();
                                    boolean z15 = false;
                                    boolean z16 = false;
                                    boolean z17 = false;
                                    boolean z18 = false;
                                    for (SkuDetails skuDetails3 : arrayList3) {
                                        String str10 = str8;
                                        m.b bVar3 = bVar2;
                                        SkuDetails skuDetails4 = skuDetails2;
                                        if (!skuDetails3.f3755b.optString("skuDetailsToken").isEmpty()) {
                                            arrayList7.add(skuDetails3.f3755b.optString("skuDetailsToken"));
                                        }
                                        String strOptString = skuDetails3.f3755b.optString("offerIdToken");
                                        if (strOptString.isEmpty()) {
                                            strOptString = skuDetails3.f3755b.optString("offer_id_token");
                                        }
                                        String strOptString2 = skuDetails3.f3755b.optString("offer_id");
                                        zzu zzuVar3 = zzuVar2;
                                        int iOptInt = skuDetails3.f3755b.optInt("offer_type");
                                        String strOptString3 = skuDetails3.f3755b.optString("serializedDocid");
                                        arrayList8.add(strOptString);
                                        z15 |= !TextUtils.isEmpty(strOptString);
                                        arrayList9.add(strOptString2);
                                        z16 |= !TextUtils.isEmpty(strOptString2);
                                        arrayList10.add(Integer.valueOf(iOptInt));
                                        z17 |= iOptInt != 0;
                                        z18 |= !TextUtils.isEmpty(strOptString3);
                                        arrayList11.add(strOptString3);
                                        bVar2 = bVar3;
                                        str8 = str10;
                                        skuDetails2 = skuDetails4;
                                        zzuVar2 = zzuVar3;
                                    }
                                    zzuVar = zzuVar2;
                                    skuDetails = skuDetails2;
                                    bVar = bVar2;
                                    str5 = str8;
                                    if (!arrayList7.isEmpty()) {
                                        bundle.putStringArrayList("skuDetailsTokens", arrayList7);
                                    }
                                    if (z15) {
                                        bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList8);
                                    }
                                    if (z16) {
                                        bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList9);
                                    }
                                    if (z17) {
                                        bundle.putIntegerArrayList("SKU_OFFER_TYPE_LIST", arrayList10);
                                    }
                                    if (z18) {
                                        bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList11);
                                    }
                                    z12 = true;
                                    if (arrayList3.size() > 1) {
                                        arrayList = new ArrayList<>(arrayList3.size() - 1);
                                        arrayList2 = new ArrayList<>(arrayList3.size() - 1);
                                        for (int i16 = 1; i16 < arrayList3.size(); i16++) {
                                            arrayList.add(((SkuDetails) arrayList3.get(i16)).e());
                                            arrayList2.add(((SkuDetails) arrayList3.get(i16)).f());
                                        }
                                        bundle.putStringArrayList("additionalSkus", arrayList);
                                        bundle.putStringArrayList("additionalSkuTypes", arrayList2);
                                    }
                                    zzfbVarW = u1.a.w(i10, 2, nVar);
                                }
                                fVar = this;
                                if (!bundle.containsKey("SKU_OFFER_ID_TOKEN_LIST") || fVar.f3800n) {
                                    if (TextUtils.isEmpty(skuDetails.g())) {
                                        str6 = null;
                                        if (bVar != null) {
                                            throw null;
                                        }
                                        z12 = false;
                                    } else {
                                        bundle.putString("skuPackageName", skuDetails.g());
                                        str6 = null;
                                    }
                                    if (!TextUtils.isEmpty(str6)) {
                                        bundle.putString("accountName", str6);
                                    }
                                    Intent intent = activity.getIntent();
                                    if (intent == null) {
                                        str = str5;
                                        zzb.zzj(str, "Activity's intent is null.");
                                    } else {
                                        str = str5;
                                        if (!TextUtils.isEmpty(intent.getStringExtra("PROXY_PACKAGE"))) {
                                            String stringExtra = intent.getStringExtra("PROXY_PACKAGE");
                                            bundle.putString("proxyPackage", stringExtra);
                                            try {
                                                str7 = str2;
                                                try {
                                                    bundle.putString(str7, fVar.f3791e.getPackageManager().getPackageInfo(stringExtra, 0).versionName);
                                                } catch (PackageManager.NameNotFoundException unused) {
                                                    bundle.putString(str7, "package not found");
                                                }
                                            } catch (PackageManager.NameNotFoundException unused2) {
                                                str7 = str2;
                                            }
                                        }
                                    }
                                    if (fVar.f3803q && !zzuVar.isEmpty()) {
                                        i11 = 17;
                                    } else if (fVar.f3801o && z12) {
                                        i11 = 15;
                                    } else {
                                        if (fVar.f3798l) {
                                            i12 = 9;
                                        } else {
                                            i11 = 6;
                                        }
                                        final String str11 = str3;
                                        final String str12 = str4;
                                        callable = new Callable(i12, str11, str12, mVar, bundle) { // from class: com.android.billingclient.api.r0

                                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                                            public final /* synthetic */ int f3863d;

                                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                                            public final /* synthetic */ String f3864e;

                                            /* JADX INFO: renamed from: f, reason: collision with root package name */
                                            public final /* synthetic */ String f3865f;

                                            /* JADX INFO: renamed from: g, reason: collision with root package name */
                                            public final /* synthetic */ Bundle f3866g;

                                            {
                                                this.f3866g = bundle;
                                            }

                                            @Override // java.util.concurrent.Callable
                                            public final Object call() {
                                                f fVar2 = this.f3862c;
                                                return fVar2.f3793g.zzg(this.f3863d, fVar2.f3791e.getPackageName(), this.f3864e, this.f3865f, null, this.f3866g);
                                            }
                                        };
                                    }
                                    i12 = i11;
                                    final String str13 = str3;
                                    final String str14 = str4;
                                    callable = new Callable(i12, str13, str14, mVar, bundle) { // from class: com.android.billingclient.api.r0

                                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                                        public final /* synthetic */ int f3863d;

                                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                                        public final /* synthetic */ String f3864e;

                                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                                        public final /* synthetic */ String f3865f;

                                        /* JADX INFO: renamed from: g, reason: collision with root package name */
                                        public final /* synthetic */ Bundle f3866g;

                                        {
                                            this.f3866g = bundle;
                                        }

                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            f fVar2 = this.f3862c;
                                            return fVar2.f3793g.zzg(this.f3863d, fVar2.f3791e.getPackageName(), this.f3864e, this.f3865f, null, this.f3866g);
                                        }
                                    };
                                } else {
                                    cVar = fVar.f3792f;
                                    i10 = 21;
                                    nVar = e0.f3784q;
                                }
                                zzfbVarW = u1.a.w(i10, 2, nVar);
                            } else {
                                str = "BillingClient";
                                callable = new Callable() { // from class: com.android.billingclient.api.s0
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        f fVar2 = this.f3867c;
                                        return fVar2.f3793g.zzf(3, fVar2.f3791e.getPackageName(), strE, strF, null);
                                    }
                                };
                            }
                            try {
                                Bundle bundle2 = (Bundle) n(callable, 5000L, null, fVar.f3789c).get(5000L, TimeUnit.MILLISECONDS);
                                int iZzb = zzb.zzb(bundle2, str);
                                String strZzf = zzb.zzf(bundle2, str);
                                if (iZzb == 0) {
                                    Intent intent2 = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
                                    intent2.putExtra("BUY_INTENT", (PendingIntent) bundle2.getParcelable("BUY_INTENT"));
                                    activity.startActivity(intent2);
                                    return e0.f3778k;
                                }
                                zzb.zzj(str, "Unable to buy item, Error response code: " + iZzb);
                                n nVar3 = new n();
                                nVar3.f3848a = iZzb;
                                nVar3.f3849b = strZzf;
                                fVar.f3792f.e(u1.a.w(3, 2, nVar3));
                                fVar.k(nVar3);
                                return nVar3;
                            } catch (CancellationException e10) {
                                e = e10;
                                zzb.zzk(str, "Time out while launching billing flow. Try to reconnect", e);
                                cVar = fVar.f3792f;
                                i10 = 4;
                                nVar = e0.f3780m;
                                zzfbVarW = u1.a.w(i10, 2, nVar);
                                cVar.e(zzfbVarW);
                                fVar.k(nVar);
                                return nVar;
                            } catch (TimeoutException e11) {
                                e = e11;
                                zzb.zzk(str, "Time out while launching billing flow. Try to reconnect", e);
                                cVar = fVar.f3792f;
                                i10 = 4;
                                nVar = e0.f3780m;
                                zzfbVarW = u1.a.w(i10, 2, nVar);
                                cVar.e(zzfbVarW);
                                fVar.k(nVar);
                                return nVar;
                            } catch (Exception e12) {
                                zzb.zzk(str, "Exception while launching billing flow. Try to reconnect", e12);
                                cVar = fVar.f3792f;
                                i10 = 5;
                                nVar = e0.f3779l;
                            }
                        } else {
                            zzb.zzj("BillingClient", "Current client doesn't support purchases with ProductDetails.");
                            cVar = fVar.f3792f;
                            i13 = 20;
                            nVar = e0.f3785r;
                        }
                        cVar.e(zzfbVarW);
                        fVar.k(nVar);
                        return nVar;
                    }
                    zzb.zzj("BillingClient", "Current client doesn't support multi-item purchases.");
                    cVar = fVar.f3792f;
                    i13 = 19;
                    nVar = e0.f3783p;
                }
                zzfbVarW = u1.a.w(i13, 2, nVar);
                cVar.e(zzfbVarW);
                fVar.k(nVar);
                return nVar;
            }
            zzb.zzj("BillingClient", "Current client doesn't support subscriptions.");
            cVar2 = fVar.f3792f;
            nVar2 = e0.f3781n;
            zzfbVarW2 = u1.a.w(9, 2, nVar2);
        } else {
            cVar2 = fVar.f3792f;
            nVar2 = e0.f3779l;
            zzfbVarW2 = u1.a.w(2, 2, nVar2);
        }
        cVar2.e(zzfbVarW2);
        fVar.k(nVar2);
        return nVar2;
    }

    @Override // com.android.billingclient.api.e
    public final void f(String str, final s sVar) {
        if (!d()) {
            j1.c cVar = this.f3792f;
            n nVar = e0.f3779l;
            cVar.e(u1.a.w(2, 11, nVar));
            sVar.a(nVar, null);
            return;
        }
        if (n(new w0(this, str, sVar), 30000L, new Runnable() { // from class: com.android.billingclient.api.n0
            @Override // java.lang.Runnable
            public final void run() {
                f fVar = this.f3850c;
                s sVar2 = sVar;
                j1.c cVar2 = fVar.f3792f;
                n nVar2 = e0.f3780m;
                cVar2.e(u1.a.w(24, 11, nVar2));
                sVar2.a(nVar2, null);
            }
        }, j()) == null) {
            n nVarL = l();
            this.f3792f.e(u1.a.w(25, 11, nVarL));
            sVar.a(nVarL, null);
        }
    }

    @Override // com.android.billingclient.api.e
    public final void g(String str, final u uVar) {
        j1.c cVar;
        int i10;
        n nVar;
        if (!d()) {
            cVar = this.f3792f;
            i10 = 2;
            nVar = e0.f3779l;
        } else {
            if (!TextUtils.isEmpty(str)) {
                if (n(new w0(this, str, uVar), 30000L, new Runnable() { // from class: com.android.billingclient.api.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        f fVar = this.f3872c;
                        u uVar2 = uVar;
                        j1.c cVar2 = fVar.f3792f;
                        n nVar2 = e0.f3780m;
                        cVar2.e(u1.a.w(24, 9, nVar2));
                        uVar2.a(nVar2, zzu.zzk());
                    }
                }, j()) == null) {
                    n nVarL = l();
                    this.f3792f.e(u1.a.w(25, 9, nVarL));
                    uVar.a(nVarL, zzu.zzk());
                    return;
                }
                return;
            }
            zzb.zzj("BillingClient", "Please provide a valid product type.");
            cVar = this.f3792f;
            i10 = 50;
            nVar = e0.f3774g;
        }
        cVar.e(u1.a.w(i10, 9, nVar));
        uVar.a(nVar, zzu.zzk());
    }

    @Override // com.android.billingclient.api.e
    public final void h(x xVar, final y yVar) {
        if (!d()) {
            j1.c cVar = this.f3792f;
            n nVar = e0.f3779l;
            cVar.e(u1.a.w(2, 8, nVar));
            yVar.a(nVar, null);
            return;
        }
        final String str = xVar.f3884a;
        final List list = xVar.f3885b;
        if (TextUtils.isEmpty(str)) {
            zzb.zzj("BillingClient", "Please fix the input params. SKU type can't be empty.");
            j1.c cVar2 = this.f3792f;
            n nVar2 = e0.f3773f;
            cVar2.e(u1.a.w(49, 8, nVar2));
            yVar.a(nVar2, null);
            return;
        }
        if (list == null) {
            zzb.zzj("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
            j1.c cVar3 = this.f3792f;
            n nVar3 = e0.f3772e;
            cVar3.e(u1.a.w(48, 8, nVar3));
            yVar.a(nVar3, null);
            return;
        }
        final String str2 = null;
        if (n(new Callable(str, list, str2, yVar) { // from class: com.android.billingclient.api.k0

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f3823d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ List f3824e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ y f3825f;

            {
                this.f3825f = yVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strZzf;
                int i10;
                int i11;
                Bundle bundleZzk;
                j1.c cVar4;
                int i12;
                f fVar = this.f3822c;
                String str3 = this.f3823d;
                List list2 = this.f3824e;
                y yVar2 = this.f3825f;
                Objects.requireNonNull(fVar);
                ArrayList arrayList = new ArrayList();
                int size = list2.size();
                int i13 = 0;
                while (true) {
                    String str4 = "Error trying to decode SkuDetails.";
                    if (i13 < size) {
                        int i14 = i13 + 20;
                        ArrayList<String> arrayList2 = new ArrayList<>(list2.subList(i13, i14 > size ? size : i14));
                        Bundle bundle = new Bundle();
                        bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
                        bundle.putString("playBillingLibraryVersion", fVar.f3788b);
                        try {
                            if (fVar.f3799m) {
                                zze zzeVar = fVar.f3793g;
                                String packageName = fVar.f3791e.getPackageName();
                                int i15 = fVar.f3796j;
                                String str5 = fVar.f3788b;
                                Bundle bundle2 = new Bundle();
                                if (i15 >= 9) {
                                    bundle2.putString("playBillingLibraryVersion", str5);
                                }
                                if (i15 >= 9) {
                                    bundle2.putBoolean("enablePendingPurchases", true);
                                }
                                i11 = 8;
                                try {
                                    bundleZzk = zzeVar.zzl(10, packageName, str3, bundle, bundle2);
                                } catch (Exception e10) {
                                    e = e10;
                                    zzb.zzk("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect).", e);
                                    fVar.f3792f.e(u1.a.w(43, i11, e0.f3779l));
                                    str4 = "Service connection is disconnected.";
                                    i10 = -1;
                                    strZzf = str4;
                                    arrayList = null;
                                    n nVar4 = new n();
                                    nVar4.f3848a = i10;
                                    nVar4.f3849b = strZzf;
                                    yVar2.a(nVar4, arrayList);
                                    return null;
                                }
                            } else {
                                i11 = 8;
                                bundleZzk = fVar.f3793g.zzk(3, fVar.f3791e.getPackageName(), str3, bundle);
                            }
                            if (bundleZzk == null) {
                                zzb.zzj("BillingClient", "querySkuDetailsAsync got null sku details list");
                                cVar4 = fVar.f3792f;
                                i12 = 44;
                                break;
                            }
                            if (bundleZzk.containsKey("DETAILS_LIST")) {
                                ArrayList<String> stringArrayList = bundleZzk.getStringArrayList("DETAILS_LIST");
                                if (stringArrayList == null) {
                                    zzb.zzj("BillingClient", "querySkuDetailsAsync got null response list");
                                    cVar4 = fVar.f3792f;
                                    i12 = 46;
                                    break;
                                }
                                for (int i16 = 0; i16 < stringArrayList.size(); i16++) {
                                    try {
                                        SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i16));
                                        zzb.zzi("BillingClient", "Got sku details: ".concat(skuDetails.toString()));
                                        arrayList.add(skuDetails);
                                    } catch (JSONException e11) {
                                        zzb.zzk("BillingClient", "Got a JSON exception trying to decode SkuDetails.", e11);
                                        fVar.f3792f.e(u1.a.w(47, i11, e0.a(6, "Error trying to decode SkuDetails.")));
                                        i10 = 6;
                                        strZzf = str4;
                                        arrayList = null;
                                        n nVar5 = new n();
                                        nVar5.f3848a = i10;
                                        nVar5.f3849b = strZzf;
                                        yVar2.a(nVar5, arrayList);
                                        return null;
                                    }
                                }
                                i13 = i14;
                            } else {
                                int iZzb = zzb.zzb(bundleZzk, "BillingClient");
                                strZzf = zzb.zzf(bundleZzk, "BillingClient");
                                if (iZzb != 0) {
                                    zzb.zzj("BillingClient", "getSkuDetails() failed. Response code: " + iZzb);
                                    fVar.f3792f.e(u1.a.w(23, i11, e0.a(iZzb, strZzf)));
                                    i10 = iZzb;
                                } else {
                                    zzb.zzj("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                                    fVar.f3792f.e(u1.a.w(45, i11, e0.a(6, strZzf)));
                                    i10 = 6;
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            i11 = 8;
                        }
                    } else {
                        strZzf = "";
                        i10 = 0;
                    }
                    n nVar6 = new n();
                    nVar6.f3848a = i10;
                    nVar6.f3849b = strZzf;
                    yVar2.a(nVar6, arrayList);
                    return null;
                }
                cVar4.e(u1.a.w(i12, i11, e0.f3786s));
                i10 = 4;
                strZzf = "Item is unavailable for purchase.";
                arrayList = null;
                n nVar7 = new n();
                nVar7.f3848a = i10;
                nVar7.f3849b = strZzf;
                yVar2.a(nVar7, arrayList);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.q0
            @Override // java.lang.Runnable
            public final void run() {
                f fVar = this.f3860c;
                y yVar2 = yVar;
                j1.c cVar4 = fVar.f3792f;
                n nVar4 = e0.f3780m;
                cVar4.e(u1.a.w(24, 8, nVar4));
                yVar2.a(nVar4, null);
            }
        }, j()) == null) {
            n nVarL = l();
            this.f3792f.e(u1.a.w(25, 8, nVarL));
            yVar.a(nVarL, null);
        }
    }

    @Override // com.android.billingclient.api.e
    public final void i(l lVar) {
        if (d()) {
            zzb.zzi("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.f3792f.f(u1.a.x(6));
            lVar.a(e0.f3778k);
            return;
        }
        int i10 = 1;
        if (this.f3787a == 1) {
            zzb.zzj("BillingClient", "Client is already in the process of connecting to billing service.");
            j1.c cVar = this.f3792f;
            n nVar = e0.f3771d;
            cVar.e(u1.a.w(37, 6, nVar));
            lVar.a(nVar);
            return;
        }
        if (this.f3787a == 3) {
            zzb.zzj("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            j1.c cVar2 = this.f3792f;
            n nVar2 = e0.f3779l;
            cVar2.e(u1.a.w(38, 6, nVar2));
            lVar.a(nVar2);
            return;
        }
        this.f3787a = 1;
        j1.c cVar3 = this.f3790d;
        Objects.requireNonNull(cVar3);
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        intentFilter.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        j0 j0Var = (j0) cVar3.f31680b;
        Context context = (Context) cVar3.f31679a;
        if (!j0Var.f3819d) {
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver((j0) j0Var.f3820e.f31680b, intentFilter, 2);
            } else {
                context.registerReceiver((j0) j0Var.f3820e.f31680b, intentFilter);
            }
            j0Var.f3819d = true;
        }
        zzb.zzi("BillingClient", "Starting in-app billing setup.");
        this.f3794h = new d0(this, lVar);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.f3791e.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i10 = 41;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    zzb.zzj("BillingClient", "The device doesn't have valid Play Store.");
                    i10 = 40;
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f3788b);
                    if (this.f3791e.bindService(intent2, this.f3794h, 1)) {
                        zzb.zzi("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        zzb.zzj("BillingClient", "Connection to Billing service is blocked.");
                        i10 = 39;
                    }
                }
            }
        }
        this.f3787a = 0;
        zzb.zzi("BillingClient", "Billing service unavailable on device.");
        j1.c cVar4 = this.f3792f;
        n nVar3 = e0.f3770c;
        cVar4.e(u1.a.w(i10, 6, nVar3));
        lVar.a(nVar3);
    }

    public final Handler j() {
        return Looper.myLooper() == null ? this.f3789c : new Handler(Looper.myLooper());
    }

    public final n k(final n nVar) {
        if (Thread.interrupted()) {
            return nVar;
        }
        this.f3789c.post(new Runnable() { // from class: com.android.billingclient.api.v0
            @Override // java.lang.Runnable
            public final void run() {
                f fVar = this.f3878c;
                n nVar2 = nVar;
                if (((j0) fVar.f3790d.f31680b).f3816a != null) {
                    ((j0) fVar.f3790d.f31680b).f3816a.a(nVar2, null);
                } else {
                    Objects.requireNonNull((j0) fVar.f3790d.f31680b);
                    zzb.zzj("BillingClient", "No valid listener is set in BroadcastManager");
                }
            }
        });
        return nVar;
    }

    public final n l() {
        return (this.f3787a == 0 || this.f3787a == 3) ? e0.f3779l : e0.f3777j;
    }

    public final Future n(Callable callable, long j10, final Runnable runnable, Handler handler) {
        if (this.f3806t == null) {
            this.f3806t = Executors.newFixedThreadPool(zzb.zza, new a0());
        }
        try {
            final Future futureSubmit = this.f3806t.submit(callable);
            handler.postDelayed(new Runnable() { // from class: com.android.billingclient.api.u0
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    Runnable runnable2 = runnable;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    zzb.zzj("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j10 * 0.95d));
            return futureSubmit;
        } catch (Exception e10) {
            zzb.zzk("BillingClient", "Async task throws exception!", e10);
            return null;
        }
    }
}
