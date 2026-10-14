package fa;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.applovin.sdk.AppLovinMediationProvider;
import fd.g0;
import fd.j0;
import fd.s0;
import java.util.ArrayList;
import java.util.Objects;
import kd.z;
import y8.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f29433a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final md.b f29434b;

    @oc.e(c = "com.zipoapps.ads.AdsErrorReporter$reportAdErrorAsync$1", f = "AdsErrorReporter.kt", l = {58, 24, 28}, m = "invokeSuspend")
    public static final class a extends oc.h implements uc.p<g0, mc.d<? super jc.w>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f29435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f29436d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f29437e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f29438f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f29439g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f29440h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f29441i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f29442j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Context f29443k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f29444l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f29445m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, String str2, mc.d<? super a> dVar) {
            super(2, dVar);
            this.f29443k = context;
            this.f29444l = str;
            this.f29445m = str2;
        }

        @Override // oc.a
        public final mc.d<jc.w> create(Object obj, mc.d<?> dVar) {
            return new a(this.f29443k, this.f29444l, this.f29445m, dVar);
        }

        @Override // uc.p
        public Object invoke(g0 g0Var, mc.d<? super jc.w> dVar) {
            return new a(this.f29443k, this.f29444l, this.f29445m, dVar).invokeSuspend(jc.w.f31842a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x00e4 A[Catch: all -> 0x0221, TryCatch #0 {all -> 0x0221, blocks: (B:8:0x002d, B:46:0x013e, B:50:0x0152, B:54:0x0177, B:58:0x01a7, B:62:0x01d3, B:13:0x004f, B:28:0x00d3, B:29:0x00de, B:31:0x00e4, B:36:0x00f6, B:37:0x00fa, B:40:0x0115, B:42:0x011d, B:20:0x0092, B:25:0x00ba, B:23:0x00b2), top: B:68:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:34:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:42:0x011d A[Catch: all -> 0x0221, TryCatch #0 {all -> 0x0221, blocks: (B:8:0x002d, B:46:0x013e, B:50:0x0152, B:54:0x0177, B:58:0x01a7, B:62:0x01d3, B:13:0x004f, B:28:0x00d3, B:29:0x00de, B:31:0x00e4, B:36:0x00f6, B:37:0x00fa, B:40:0x0115, B:42:0x011d, B:20:0x0092, B:25:0x00ba, B:23:0x00b2), top: B:68:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:44:0x0139 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:45:0x013a  */
        /* JADX WARN: Code duplicated, block: B:47:0x014d  */
        /* JADX WARN: Code duplicated, block: B:49:0x0150  */
        /* JADX WARN: Code duplicated, block: B:52:0x0174  */
        /* JADX WARN: Code duplicated, block: B:53:0x0176  */
        /* JADX WARN: Code duplicated, block: B:56:0x01a4  */
        /* JADX WARN: Code duplicated, block: B:57:0x01a6  */
        /* JADX WARN: Code duplicated, block: B:60:0x01d0  */
        /* JADX WARN: Code duplicated, block: B:61:0x01d2  */
        /* JADX WARN: Code duplicated, block: B:70:0x00f6 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:73:0x00de A[SYNTHETIC] */
        @Override // oc.a
        public final Object invokeSuspend(Object obj) {
            String str;
            md.b bVar;
            Context context;
            String str2;
            boolean zHasCapability;
            String strW;
            Object objB;
            String str3;
            Context context2;
            String str4;
            String strA;
            int iIntValue;
            Object objA;
            boolean z10;
            String str5;
            Context context3;
            String str6;
            ArrayList arrayList;
            boolean z11;
            boolean zC;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            nc.a aVar = nc.a.COROUTINE_SUSPENDED;
            int i10 = this.f29442j;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        String str7 = (String) this.f29438f;
                        String str8 = (String) this.f29437e;
                        Context context4 = (Context) this.f29436d;
                        md.b bVar2 = (md.b) this.f29435c;
                        h9.d.t(obj);
                        bVar = bVar2;
                        context = context4;
                        str = str8;
                        str2 = str7;
                    } else {
                        if (i10 == 2) {
                            zHasCapability = this.f29441i;
                            str2 = (String) this.f29438f;
                            str = (String) this.f29437e;
                            context = (Context) this.f29436d;
                            bVar = (md.b) this.f29435c;
                            h9.d.t(obj);
                            objB = obj;
                            arrayList = new ArrayList();
                            for (Object obj2 : (Iterable) objB) {
                                if (((String) obj2).length() > 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    arrayList.add(obj2);
                                }
                            }
                            strW = kc.t.w(arrayList, ",", null, null, 0, null, null, 62);
                            String str9 = str;
                            str3 = str2;
                            context2 = context;
                            str4 = str9;
                            strA = gb.w.f30411a.a(context2);
                            if (zHasCapability) {
                                ua.a aVarA = ua.a.f36179c.a(null);
                                this.f29435c = bVar;
                                this.f29436d = context2;
                                this.f29437e = str4;
                                this.f29438f = str3;
                                this.f29439g = strA;
                                this.f29440h = strW;
                                this.f29441i = zHasCapability;
                                this.f29442j = 3;
                                objA = aVarA.a(this);
                                if (objA == aVar) {
                                    return aVar;
                                }
                                z10 = zHasCapability;
                                str5 = strW;
                                context3 = context2;
                                str6 = strA;
                            } else {
                                iIntValue = 0;
                            }
                            if (str4 == null) {
                                str4 = AppLovinMediationProvider.UNKNOWN;
                            }
                            zC = gb.w.f30411a.c(context2);
                            ma.h.a aVar2 = ma.h.f33410y;
                            z12 = aVar2.a().f33421j.c().f28152a.getBoolean("consent_form_was_shown", false);
                            jc.h[] hVarArr = new jc.h[9];
                            if (zHasCapability) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            hVarArr[0] = new jc.h("is_network_available", Boolean.valueOf(z13));
                            hVarArr[1] = new jc.h("unreachable_domains", strW);
                            hVarArr[2] = new jc.h("private_dns_name", strA);
                            hVarArr[3] = new jc.h("ad_error", str4);
                            if (zC) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            hVarArr[4] = new jc.h("is_vpn_active", Boolean.valueOf(z14));
                            hVarArr[5] = new jc.h("ad_type", str3);
                            hVarArr[6] = new jc.h("available_domain_ratio", new Integer(iIntValue));
                            if (z12) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            hVarArr[7] = new jc.h("consent_form_shown", Boolean.valueOf(z15));
                            hVarArr[8] = new jc.h("ads_provider", aVar2.a().f33421j.f28028e.name());
                            Bundle bundleA = androidx.activity.i.a(hVarArr);
                            xe.a.f37601c.a(bundleA.toString(), new Object[0]);
                            com.zipoapps.premiumhelper.a aVar3 = aVar2.a().f33419h;
                            Objects.requireNonNull(aVar3);
                            aVar3.u(aVar3.b("Ad_load_error", false, bundleA));
                            jc.w wVar = jc.w.f31842a;
                            bVar.a(null);
                            return wVar;
                        }
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z10 = this.f29441i;
                        str5 = (String) this.f29440h;
                        str6 = (String) this.f29439g;
                        str3 = (String) this.f29438f;
                        str4 = (String) this.f29437e;
                        context3 = (Context) this.f29436d;
                        bVar = (md.b) this.f29435c;
                        h9.d.t(obj);
                        objA = obj;
                    }
                    String str10 = str5;
                    zHasCapability = z10;
                    iIntValue = ((Number) objA).intValue();
                    strA = str6;
                    context2 = context3;
                    strW = str10;
                    if (str4 == null) {
                        str4 = AppLovinMediationProvider.UNKNOWN;
                    }
                    zC = gb.w.f30411a.c(context2);
                    ma.h.a aVar4 = ma.h.f33410y;
                    z12 = aVar4.a().f33421j.c().f28152a.getBoolean("consent_form_was_shown", false);
                    jc.h[] hVarArr2 = new jc.h[9];
                    if (zHasCapability) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    hVarArr2[0] = new jc.h("is_network_available", Boolean.valueOf(z13));
                    hVarArr2[1] = new jc.h("unreachable_domains", strW);
                    hVarArr2[2] = new jc.h("private_dns_name", strA);
                    hVarArr2[3] = new jc.h("ad_error", str4);
                    if (zC) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    hVarArr2[4] = new jc.h("is_vpn_active", Boolean.valueOf(z14));
                    hVarArr2[5] = new jc.h("ad_type", str3);
                    hVarArr2[6] = new jc.h("available_domain_ratio", new Integer(iIntValue));
                    if (z12) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    hVarArr2[7] = new jc.h("consent_form_shown", Boolean.valueOf(z15));
                    hVarArr2[8] = new jc.h("ads_provider", aVar4.a().f33421j.f28028e.name());
                    Bundle bundleA2 = androidx.activity.i.a(hVarArr2);
                    xe.a.f37601c.a(bundleA2.toString(), new Object[0]);
                    com.zipoapps.premiumhelper.a aVar5 = aVar4.a().f33419h;
                    Objects.requireNonNull(aVar5);
                    aVar5.u(aVar5.b("Ad_load_error", false, bundleA2));
                    jc.w wVar2 = jc.w.f31842a;
                    bVar.a(null);
                    return wVar2;
                }
                h9.d.t(obj);
                md.b bVar3 = g.f29434b;
                Context context5 = this.f29443k;
                str = this.f29444l;
                String str11 = this.f29445m;
                this.f29435c = bVar3;
                this.f29436d = context5;
                this.f29437e = str;
                this.f29438f = str11;
                this.f29442j = 1;
                md.c cVar = (md.c) bVar3;
                if (cVar.b(null, this) == aVar) {
                    return aVar;
                }
                bVar = cVar;
                context = context5;
                str2 = str11;
                gb.w wVar3 = gb.w.f30411a;
                j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
                Object systemService = context.getSystemService("connectivity");
                j0.g(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                zHasCapability = networkCapabilities == null ? false : networkCapabilities.hasCapability(12);
                if (zHasCapability) {
                    ua.a aVarA2 = ua.a.f36179c.a(null);
                    this.f29435c = bVar;
                    this.f29436d = context;
                    this.f29437e = str;
                    this.f29438f = str2;
                    this.f29441i = zHasCapability;
                    this.f29442j = 2;
                    objB = aVarA2.b(this);
                    if (objB == aVar) {
                        return aVar;
                    }
                    arrayList = new ArrayList();
                    while (r11.hasNext()) {
                        if (((String) obj2).length() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            arrayList.add(obj2);
                        }
                    }
                    strW = kc.t.w(arrayList, ",", null, null, 0, null, null, 62);
                } else {
                    strW = "";
                }
                String str12 = str;
                str3 = str2;
                context2 = context;
                str4 = str12;
                strA = gb.w.f30411a.a(context2);
                if (zHasCapability) {
                    ua.a aVarA3 = ua.a.f36179c.a(null);
                    this.f29435c = bVar;
                    this.f29436d = context2;
                    this.f29437e = str4;
                    this.f29438f = str3;
                    this.f29439g = strA;
                    this.f29440h = strW;
                    this.f29441i = zHasCapability;
                    this.f29442j = 3;
                    objA = aVarA3.a(this);
                    if (objA == aVar) {
                        return aVar;
                    }
                    z10 = zHasCapability;
                    str5 = strW;
                    context3 = context2;
                    str6 = strA;
                    String str13 = str5;
                    zHasCapability = z10;
                    iIntValue = ((Number) objA).intValue();
                    strA = str6;
                    context2 = context3;
                    strW = str13;
                } else {
                    iIntValue = 0;
                }
                if (str4 == null) {
                    str4 = AppLovinMediationProvider.UNKNOWN;
                }
                zC = gb.w.f30411a.c(context2);
                ma.h.a aVar6 = ma.h.f33410y;
                z12 = aVar6.a().f33421j.c().f28152a.getBoolean("consent_form_was_shown", false);
                jc.h[] hVarArr3 = new jc.h[9];
                if (zHasCapability) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                hVarArr3[0] = new jc.h("is_network_available", Boolean.valueOf(z13));
                hVarArr3[1] = new jc.h("unreachable_domains", strW);
                hVarArr3[2] = new jc.h("private_dns_name", strA);
                hVarArr3[3] = new jc.h("ad_error", str4);
                if (zC) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                hVarArr3[4] = new jc.h("is_vpn_active", Boolean.valueOf(z14));
                hVarArr3[5] = new jc.h("ad_type", str3);
                hVarArr3[6] = new jc.h("available_domain_ratio", new Integer(iIntValue));
                if (z12) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                hVarArr3[7] = new jc.h("consent_form_shown", Boolean.valueOf(z15));
                hVarArr3[8] = new jc.h("ads_provider", aVar6.a().f33421j.f28028e.name());
                Bundle bundleA3 = androidx.activity.i.a(hVarArr3);
                xe.a.f37601c.a(bundleA3.toString(), new Object[0]);
                com.zipoapps.premiumhelper.a aVar7 = aVar6.a().f33419h;
                Objects.requireNonNull(aVar7);
                aVar7.u(aVar7.b("Ad_load_error", false, bundleA3));
                jc.w wVar4 = jc.w.f31842a;
                bVar.a(null);
                return wVar4;
            } catch (Throwable th) {
                bVar.a(null);
                throw th;
            }
        }
    }

    static {
        z zVar = md.e.f33553a;
        f29434b = new md.c(false);
    }

    public final void a(Context context, String str, String str2) {
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        c0.z(fd.z.a(s0.f29620b), null, null, new a(context, str2, str, null), 3, null);
    }
}
