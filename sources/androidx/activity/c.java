package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.t;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.zipoapps.premiumhelper.ui.settings.delete_account.PhDeleteAccountActivity;
import com.zipoapps.premiumhelper.ui.splash.PHSplashActivity;
import d6.h0;
import d6.z;
import fd.j0;
import i8.n0;
import i8.q0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import p0.i0;
import t9.u;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f492c = 4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f493d;

    public /* synthetic */ c(Activity activity) {
        this.f493d = activity;
    }

    public /* synthetic */ c(Context context) {
        this.f493d = context;
    }

    public /* synthetic */ c(MediaCodec mediaCodec) {
        this.f493d = mediaCodec;
    }

    public /* synthetic */ c(ComponentActivity componentActivity) {
        this.f493d = componentActivity;
    }

    public /* synthetic */ c(OnBackPressedDispatcher onBackPressedDispatcher) {
        this.f493d = onBackPressedDispatcher;
    }

    public /* synthetic */ c(e eVar) {
        this.f493d = eVar;
    }

    public /* synthetic */ c(com.applovin.exoplayer2.a.a aVar) {
        this.f493d = aVar;
    }

    public /* synthetic */ c(com.applovin.exoplayer2.m.a.i iVar) {
        this.f493d = iVar;
    }

    public /* synthetic */ c(com.applovin.exoplayer2.ui.d dVar) {
        this.f493d = dVar;
    }

    public /* synthetic */ c(WorkInitializer workInitializer) {
        this.f493d = workInitializer;
    }

    public /* synthetic */ c(com.google.firebase.installations.b bVar) {
        this.f493d = bVar;
    }

    public /* synthetic */ c(InterstitialAd interstitialAd) {
        this.f493d = interstitialAd;
    }

    public /* synthetic */ c(RewardedAd rewardedAd) {
        this.f493d = rewardedAd;
    }

    public /* synthetic */ c(h0.a aVar) {
        this.f493d = aVar;
    }

    public /* synthetic */ c(z zVar) {
        this.f493d = zVar;
    }

    public /* synthetic */ c(i8.k kVar) {
        this.f493d = kVar;
    }

    public /* synthetic */ c(q0 q0Var) {
        this.f493d = q0Var;
    }

    public /* synthetic */ c(u uVar) {
        this.f493d = uVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0222  */
    /* JADX WARN: Code duplicated, block: B:105:0x0230  */
    @Override // java.lang.Runnable
    public final void run() {
        l0.f fVarG;
        Context contextD;
        Object obj;
        Object systemService = null;
        boolean z10 = true;
        switch (this.f492c) {
            case 0:
                ((ComponentActivity) this.f493d).invalidateMenu();
                return;
            case 1:
                e.m0onBackPressedDispatcher$lambda1((e) this.f493d);
                return;
            case 2:
                ((OnBackPressedDispatcher) this.f493d).b();
                return;
            case 3:
                Context context = (Context) this.f493d;
                t.a aVar = androidx.appcompat.app.i.f671c;
                if (Build.VERSION.SDK_INT >= 33) {
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (l0.a.c()) {
                            Iterator<WeakReference<androidx.appcompat.app.i>> it = androidx.appcompat.app.i.f677i.iterator();
                            while (it.hasNext()) {
                                androidx.appcompat.app.i iVar = it.next().get();
                                if (iVar != null && (contextD = iVar.d()) != null) {
                                    systemService = contextD.getSystemService("locale");
                                    if (systemService != null) {
                                        fVarG = l0.f.g(androidx.appcompat.app.i.b.a(systemService));
                                    } else {
                                        fVarG = l0.f.f32092b;
                                    }
                                }
                            }
                            if (systemService != null) {
                                fVarG = l0.f.g(androidx.appcompat.app.i.b.a(systemService));
                            } else {
                                fVarG = l0.f.f32092b;
                            }
                        } else {
                            fVarG = androidx.appcompat.app.i.f673e;
                            if (fVarG == null) {
                                fVarG = l0.f.f32092b;
                            }
                        }
                        if (fVarG.d()) {
                            String strB = t.b(context);
                            Object systemService2 = context.getSystemService("locale");
                            if (systemService2 != null) {
                                androidx.appcompat.app.i.b.b(systemService2, androidx.appcompat.app.i.a.a(strB));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                androidx.appcompat.app.i.f676h = true;
                return;
            case 4:
                Activity activity = (Activity) this.f493d;
                int i10 = androidx.core.app.a.f1645c;
                if (activity.isFinishing()) {
                    return;
                }
                Class<?> cls = d0.h.f28522a;
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.recreate();
                } else if ((d0.h.a() && d0.h.f28527f == null) || (d0.h.f28526e == null && d0.h.f28525d == null)) {
                    z10 = false;
                } else {
                    try {
                        Object obj2 = d0.h.f28524c.get(activity);
                        if (obj2 == null || (obj = d0.h.f28523b.get(activity)) == null) {
                            z10 = false;
                        } else {
                            Application application = activity.getApplication();
                            d0.h.a aVar2 = new d0.h.a(activity);
                            application.registerActivityLifecycleCallbacks(aVar2);
                            Handler handler = d0.h.f28528g;
                            handler.post(new d0.e(aVar2, obj2));
                            try {
                                if (d0.h.a()) {
                                    Method method = d0.h.f28527f;
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new d0.f(application, aVar2));
                            } catch (Throwable th) {
                                d0.h.f28528g.post(new d0.f(application, aVar2));
                                throw th;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (z10) {
                    return;
                }
                activity.recreate();
                return;
            case 5:
                ((com.applovin.exoplayer2.a.a) this.f493d).i();
                return;
            case 6:
                ((MediaCodec) this.f493d).start();
                return;
            case 7:
                ((com.applovin.exoplayer2.m.a.i) this.f493d).b();
                return;
            case 8:
                ((com.applovin.exoplayer2.ui.d) this.f493d).c();
                return;
            case 9:
                ((WorkInitializer) this.f493d).lambda$ensureContextsScheduled$1();
                return;
            case 10:
                com.google.firebase.installations.b bVar = (com.google.firebase.installations.b) this.f493d;
                Object obj3 = com.google.firebase.installations.b.f12568m;
                bVar.b(false);
                return;
            case 11:
                z zVar = (z) this.f493d;
                synchronized (zVar.f28751d) {
                    SharedPreferences.Editor editorEdit = zVar.f28748a.edit();
                    String str = zVar.f28749b;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<String> it2 = zVar.f28751d.iterator();
                    while (it2.hasNext()) {
                        sb2.append(it2.next());
                        sb2.append(zVar.f28750c);
                    }
                    editorEdit.putString(str, sb2.toString()).commit();
                    break;
                }
                return;
            case 12:
                h0.a aVar3 = (h0.a) this.f493d;
                Objects.requireNonNull(aVar3);
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + aVar3.f28710a.getAction() + " Releasing WakeLock.");
                aVar3.a();
                return;
            case 13:
                i8.k kVar = (i8.k) this.f493d;
                int i11 = i8.k.S;
                j0.i(kVar, "this$0");
                Iterator<View> it3 = ((i0.a) i0.b(kVar)).iterator();
                while (true) {
                    p0.j0 j0Var = (p0.j0) it3;
                    if (!j0Var.hasNext()) {
                        kVar.removeAllViews();
                        return;
                    }
                    u1.a.u(kVar.getReleaseViewVisitor$div_release(), (View) j0Var.next());
                }
                break;
            case 14:
                q0 q0Var = (q0) this.f493d;
                int i12 = q0.f31409h;
                j0.i(q0Var, "this$0");
                n0 n0Var = q0Var.f31411b;
                WeakHashMap<View, y9.k> weakHashMap = q0Var.f31414e;
                Objects.requireNonNull(n0Var);
                j0.i(weakHashMap, "visibleViews");
                n0Var.f31391b.a(weakHashMap);
                q0Var.f31415f = false;
                return;
            case 15:
                j8.b bVar2 = (j8.b) this.f493d;
                j0.i(bVar2, "this$0");
                if (bVar2.f31719d) {
                    bVar2.a(bVar2.f31716a, true);
                }
                bVar2.f31719d = false;
                return;
            case 16:
                ((u) this.f493d).requestLayout();
                return;
            case 17:
                ((InterstitialAd) this.f493d).a();
                return;
            case 18:
                ((RewardedAd) this.f493d).a();
                return;
            case 19:
                PhDeleteAccountActivity phDeleteAccountActivity = (PhDeleteAccountActivity) this.f493d;
                int i13 = cb.a.f3670b;
                j0.i(phDeleteAccountActivity, "this$0");
                phDeleteAccountActivity.finish();
                return;
            default:
                PHSplashActivity pHSplashActivity = (PHSplashActivity) this.f493d;
                int i14 = PHSplashActivity.f28400e;
                j0.i(pHSplashActivity, "this$0");
                pHSplashActivity.h();
                return;
        }
    }
}
