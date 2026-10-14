package com.facebook.ads.internal.util.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import ch.qos.logback.core.net.SyslogConstants;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import com.facebook.ads.redexgen.X.C06937v;
import com.facebook.ads.redexgen.X.C06947w;
import com.facebook.ads.redexgen.X.C1336Xv;
import com.facebook.ads.redexgen.X.C1337Xw;
import com.facebook.ads.redexgen.X.IN;
import com.facebook.ads.redexgen.X.KI;
import com.facebook.ads.redexgen.X.KK;
import com.facebook.ads.redexgen.X.KL;
import com.facebook.ads.redexgen.X.KP;
import com.facebook.ads.redexgen.X.LI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ActivityUtils implements Application.ActivityLifecycleCallbacks {
    public static Context A01;
    public static C1336Xv A02;
    public static byte[] A03;
    public static String[] A04 = {"ouMPsLdF8VOzsynXqmRiTnVq9sCULlEK", "RDluICFSUJyOT3sC2lXOFgStPQc7gg7Y", "UmtUlnThENixw5hdz8sG1KFdsGmJDk97", "fTn296Ch3TXxkAVBDyGQxp9TrJ", "IUqXVRs0X8uhoFuXuWrDHC", "AqSoSQ8lTXl56yd6tw1FPxb5AEpw6", "5ylHfIThOZnGyEtaFkstDkkPbeVs18fd", "i0x"};
    public static final KP A05;
    public static final List<KL> A06;
    public static final List<Runnable> A07;
    public static final Map<Activity, Integer> A08;
    public final Class<? extends Activity> A00;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A04;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "4AKSMNDzmxTAf23dNNcZP8";
            strArr2[7] = "cH1";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 12);
            i13++;
        }
    }

    public static void A02() {
        A03 = new byte[]{54, 58, 91, 121, 110, 115, 108, 115, 110, 99, 32, 58, 92, 80, 2, 21, 22, 74, 80, 115, 81, 70, 91, 68, 91, 70, 75, 18, 86, 91, 65, 81, 64, 87, 66, 83, 92, 81, 91, 87, 65, Ascii.FS, 55, 6, 6, 53, Ascii.EM, Ascii.CAN, 2, 19, 14, 2, 86, Ascii.US, 5, 86, Ascii.CAN, Ascii.EM, 2, 86, 55, 6, 6, Ascii.SUB, Ascii.US, 21, 23, 2, Ascii.US, Ascii.EM, Ascii.CAN, 88, 40, 4, 5, 8, Ascii.RS, Ascii.EM, Ascii.EM, 14, 5, Ascii.US, 75, 6, 4, 15, 2, 13, 2, 8, 10, Ascii.US, 2, 4, 5, 75, 14, 19, 8, 14, Ascii.ESC, Ascii.US, 2, 4, 5, 75, Ascii.US, 3, Ascii.EM, 4, Ascii.FS, 5, 15, Ascii.RS, Ascii.EM, 2, 5, 12, 75, Ascii.EM, 14, 12, 2, Ascii.CAN, Ascii.US, 14, Ascii.EM, 42, 8, Ascii.US, 2, Ascii.GS, 2, Ascii.US, 18, 40, 10, 7, 7, 9, 10, 8, 0, Ascii.CAN, 39, 2, Ascii.CAN, Ascii.US, 14, 5, 14, Ascii.EM, 10, 41, 33, 101, 36, 38, 49, 44, 51, 44, 49, 60, 101, 54, 49, 36, 49, 32, Ascii.DEL, 101, 115, 66, 86, 80, 70, 71, 3, 66, 64, 87, 74, 85, 74, 87, 90, 3, 74, 80, 3, 77, 76, 87, 3, 81, 70, 80, 86, 78, 70, 71, 13, 74, 125, 107, 34, 56, Ascii.US, Ascii.GS, 10, 33, 11, 10, 23, 18, 4, 21, 12, 81, 80, Ascii.DEL, 93, 74, 87, 72, 87, 74, 71, 125, 76, 91, 95, 74, 91, 90};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static synchronized void A04(C1336Xv c1336Xv, Class<? extends Activity> cls) {
        A02 = c1336Xv;
        Context applicationContext = c1336Xv.getApplicationContext();
        A01 = applicationContext;
        if (applicationContext instanceof Application) {
            ANActivityLifecycleCallbacksListener aNActivityLifecycleCallbacksListener = ANActivityLifecycleCallbacksListener.getANActivityLifecycleCallbacksListener();
            if (aNActivityLifecycleCallbacksListener != null) {
                Map<Activity, Integer> activityStateMap = aNActivityLifecycleCallbacksListener.getActivityStateMap();
                synchronized (activityStateMap) {
                    try {
                        A08.putAll(activityStateMap);
                    } catch (ConcurrentModificationException unused) {
                        c1336Xv.A07().A9K(A01(208, 8, 114), C06937v.A02, new C06947w(A01(72, 80, 103)));
                    }
                }
                ANActivityLifecycleCallbacksListener.unregisterActivityCallbacks(c1336Xv);
            }
            ((Application) A01).registerActivityLifecycleCallbacks(new ActivityUtils(cls));
        } else {
            c1336Xv.A07().A9K(A01(216, 3, 105), C06937v.A0d, new C06947w(A01(42, 30, 122)));
        }
    }

    static {
        A02();
        A08 = Collections.synchronizedMap(new WeakHashMap());
        A06 = Collections.synchronizedList(new ArrayList());
        A07 = new ArrayList();
        A05 = KP.A00();
    }

    public ActivityUtils(Class<? extends Activity> adsActivityClass) {
        this.A00 = adsActivityClass;
    }

    public static synchronized Activity A00() {
        Activity key = null;
        for (Map.Entry<Activity, Integer> entry : A08.entrySet()) {
            if (entry.getValue().intValue() == 3) {
                key = entry.getKey();
                break;
            }
        }
        Activity activityA00 = null;
        boolean z10 = key == null || Build.VERSION.SDK_INT < 28;
        if (z10) {
            activityA00 = KI.A00();
        }
        if (A02 != null && z10 && key != activityA00) {
            C06947w c06947w = new C06947w(A01(19, 23, 62), A01(203, 5, 20) + key + A01(12, 7, 124) + activityA00);
            c06947w.A03(1);
            A02.A07().A9K(A01(208, 8, 114), C06937v.A03, c06947w);
        }
        return key != null ? key : activityA00;
    }

    public static void A03(C1337Xw c1337Xw) {
        if (!IN.A1N(c1337Xw) || Build.VERSION.SDK_INT >= 29) {
            return;
        }
        KK kk = new KK(c1337Xw);
        List<Runnable> list = A07;
        synchronized (list) {
            list.add(kk);
        }
        LI.A01.A01().postDelayed(kk, 2000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        A08.put(activity, 1);
        Iterator<KL> it = A06.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(219, 17, 50));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        A08.put(activity, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ArrayList arrayList;
        Map<Activity, Integer> map = A08;
        Integer num = map.get(activity);
        if (num == null || num.intValue() != 3) {
            C06947w c06947w = new C06947w(A01(172, 31, 47), A01(SyslogConstants.LOG_LOCAL3, 20, 73) + num + A01(0, 12, 22) + activity);
            c06947w.A03(0);
            A02.A07().A9K(A01(208, 8, 114), C06937v.A03, c06947w);
        }
        map.put(activity, 4);
        if (activity.getClass() != this.A00) {
            List<Runnable> list = A07;
            synchronized (list) {
                arrayList = new ArrayList(list);
                list.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                LI.A01.A01().removeCallbacks((Runnable) it.next());
            }
        }
        A05.A01();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        A08.put(activity, 3);
        A05.A02();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        A08.put(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        A08.put(activity, 5);
    }
}
