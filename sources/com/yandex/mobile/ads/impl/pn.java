package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.spi.ComponentTracker;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class pn implements ad, g81 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final com.yandex.mobile.ads.embedded.guava.collect.p<Long> f24125n = com.yandex.mobile.ads.embedded.guava.collect.p.a(4800000L, 3100000L, 2100000L, 1500000L, 800000L);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final com.yandex.mobile.ads.embedded.guava.collect.p<Long> f24126o = com.yandex.mobile.ads.embedded.guava.collect.p.a(1500000L, 1000000L, 730000L, 440000L, 170000L);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final com.yandex.mobile.ads.embedded.guava.collect.p<Long> f24127p = com.yandex.mobile.ads.embedded.guava.collect.p.a(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final com.yandex.mobile.ads.embedded.guava.collect.p<Long> f24128q = com.yandex.mobile.ads.embedded.guava.collect.p.a(3000000L, 1900000L, 1400000L, 1000000L, 660000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final com.yandex.mobile.ads.embedded.guava.collect.p<Long> f24129r = com.yandex.mobile.ads.embedded.guava.collect.p.a(6000000L, 4100000L, 3200000L, Long.valueOf(ComponentTracker.DEFAULT_TIMEOUT), 1000000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final com.yandex.mobile.ads.embedded.guava.collect.p<Long> f24130s = com.yandex.mobile.ads.embedded.guava.collect.p.a(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static pn f24131t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.yandex.mobile.ads.embedded.guava.collect.q<Integer, Long> f24132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ad.a.C0199a f24133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p21 f24134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ki f24135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f24136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f24137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f24138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f24139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f24140i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f24141j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f24142k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f24143l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f24144m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f24145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HashMap f24146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f24147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private q51 f24148d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f24149e;

        public a(Context context) {
            this.f24145a = context == null ? null : context.getApplicationContext();
            this.f24146b = a(da1.b(context));
            this.f24147c = 2000;
            this.f24148d = ki.f22415a;
            this.f24149e = true;
        }

        private static HashMap a(String str) {
            int[] iArrB = pn.b(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            com.yandex.mobile.ads.embedded.guava.collect.p<Long> pVar = pn.f24125n;
            map.put(2, pVar.get(iArrB[0]));
            map.put(3, pn.f24126o.get(iArrB[1]));
            map.put(4, pn.f24127p.get(iArrB[2]));
            map.put(5, pn.f24128q.get(iArrB[3]));
            map.put(10, pn.f24129r.get(iArrB[4]));
            map.put(9, pn.f24130s.get(iArrB[5]));
            map.put(7, pVar.get(iArrB[0]));
            return map;
        }

        public final pn a() {
            return new pn(this.f24145a, this.f24146b, this.f24147c, this.f24148d, this.f24149e, 0);
        }
    }

    private pn(Context context, HashMap map, int i10, q51 q51Var, boolean z10) {
        this.f24132a = com.yandex.mobile.ads.embedded.guava.collect.q.a(map);
        this.f24133b = new ad.a.C0199a();
        this.f24134c = new p21(i10);
        this.f24135d = q51Var;
        this.f24136e = z10;
        if (context == null) {
            this.f24140i = 0;
            this.f24143l = a(0);
            return;
        }
        dn0 dn0VarB = dn0.b(context);
        int iA = dn0VarB.a();
        this.f24140i = iA;
        this.f24143l = a(iA);
        dn0VarB.b(new dn0.b() { // from class: com.yandex.mobile.ads.impl.mp1
            @Override // com.yandex.mobile.ads.impl.dn0.b
            public final void a(int i11) {
                this.f23134a.b(i11);
            }
        });
    }

    public /* synthetic */ pn(Context context, HashMap map, int i10, q51 q51Var, boolean z10, int i11) {
        this(context, map, i10, q51Var, z10);
    }

    private long a(int i10) {
        Long l10 = this.f24132a.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = this.f24132a.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public static synchronized pn a(Context context) {
        if (f24131t == null) {
            f24131t = new a(context).a();
        }
        return f24131t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(int i10) {
        int i11 = this.f24140i;
        if (i11 == 0 || this.f24136e) {
            if (i11 == i10) {
                return;
            }
            this.f24140i = i10;
            if (i10 != 1 && i10 != 0 && i10 != 8) {
                this.f24143l = a(i10);
                long jC = this.f24135d.c();
                int i12 = this.f24137f > 0 ? (int) (jC - this.f24138g) : 0;
                long j10 = this.f24139h;
                long j11 = this.f24143l;
                if (i12 != 0 || j10 != 0 || j11 != this.f24144m) {
                    this.f24144m = j11;
                    this.f24133b.a(i12, j10, j11);
                }
                this.f24138g = jC;
                this.f24139h = 0L;
                this.f24142k = 0L;
                this.f24141j = 0L;
                this.f24134c.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:974:0x0d1c  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 14, list:
  (r0v0 int) from 0x000a: IF  (r0v0 int) != (2091 int)  -> B:4:0x000c A[HIDDEN]
  (r0v0 int) from 0x000e: IF  (r0v0 int) != (2092 int)  -> B:6:0x0010 A[HIDDEN]
  (r0v0 int) from 0x0012: IF  (r0v0 int) != (2102 int)  -> B:8:0x0014 A[HIDDEN]
  (r0v0 int) from 0x0016: IF  (r0v0 int) != (2103 int)  -> B:10:0x0018 A[HIDDEN]
  (r0v0 int) from 0x001a: IF  (r0v0 int) != (2111 int)  -> B:12:0x001c A[HIDDEN]
  (r0v0 int) from 0x001e: IF  (r0v0 int) != (2112 int)  -> B:14:0x0020 A[HIDDEN]
  (r0v0 int) from 0x0022: IF  (r0v0 int) != (2129 int)  -> B:16:0x0024 A[HIDDEN]
  (r0v0 int) from 0x0026: IF  (r0v0 int) != (2130 int)  -> B:18:0x0028 A[HIDDEN]
  (r0v0 int) from 0x002a: IF  (r0v0 int) != (2135 int)  -> B:20:0x002c A[HIDDEN]
  (r0v0 int) from 0x002e: IF  (r0v0 int) != (2136 int)  -> B:22:0x0030 A[HIDDEN]
  (r0v0 int) from 0x0033: SWITCH (r0v0 int)
 case 2088: goto B:916:0x0c64
 case 2094: goto B:912:0x0c57
 case 2105: goto B:908:0x0c49
 case 2114: goto B:904:0x0c3b
 case 2115: goto B:900:0x0c2d
 case 2116: goto B:896:0x0c1f
 case 2117: goto B:892:0x0c11
 case 2118: goto B:888:0x0c03
 case 2119: goto B:884:0x0bf5
 case 2120: goto B:880:0x0be7
 case 2127: goto B:876:0x0bd9
 case 2133: goto B:872:0x0bcb
 case 2142: goto B:868:0x0bbd
 case 2145: goto B:864:0x0baf
 case 2152: goto B:860:0x0ba1
 case 2153: goto B:856:0x0b93
 case 2154: goto B:852:0x0b85
 case 2155: goto B:848:0x0b77
 case 2156: goto B:844:0x0b69
 case 2159: goto B:840:0x0b5b
 case 2162: goto B:836:0x0b4d
 case 2163: goto B:832:0x0b3f
 case 2164: goto B:828:0x0b31
 case 2165: goto B:824:0x0b23
 case 2166: goto B:820:0x0b15
 case 2167: goto B:816:0x0b07
 case 2177: goto B:812:0x0af9
 case 2182: goto B:808:0x0aeb
 case 2183: goto B:804:0x0add
 case 2185: goto B:800:0x0acf
 case 2187: goto B:796:0x0ac1
 case 2198: goto B:792:0x0ab3
 case 2206: goto B:788:0x0aa5
 case 2208: goto B:784:0x0a97
 case 2210: goto B:780:0x0a89
 case 2221: goto B:776:0x0a7b
 case 2222: goto B:772:0x0a6d
 case 2223: goto B:768:0x0a5f
 case 2243: goto B:764:0x0a51
 case 2244: goto B:760:0x0a43
 case 2245: goto B:756:0x0a35
 case 2247: goto B:752:0x0a27
 case 2249: goto B:748:0x0a19
 case 2252: goto B:744:0x0a0b
 case 2266: goto B:740:0x09fd
 case 2267: goto B:736:0x09ef
 case 2269: goto B:732:0x09e1
 case 2270: goto B:728:0x09d3
 case 2271: goto B:724:0x09c5
 case 2272: goto B:720:0x09b7
 case 2273: goto B:716:0x09a9
 case 2274: goto B:712:0x099b
 case 2277: goto B:708:0x098d
 case 2278: goto B:704:0x097f
 case 2279: goto B:700:0x0971
 case 2281: goto B:696:0x0963
 case 2282: goto B:692:0x0955
 case 2283: goto B:688:0x0947
 case 2285: goto B:684:0x0939
 case 2286: goto B:680:0x092b
 case 2288: goto B:676:0x091d
 case 2290: goto B:672:0x090f
 case 2307: goto B:668:0x0901
 case 2314: goto B:664:0x08f3
 case 2316: goto B:660:0x08e5
 case 2317: goto B:656:0x08d7
 case 2331: goto B:652:0x08c9
 case 2332: goto B:648:0x08bb
 case 2339: goto B:644:0x08ad
 case 2340: goto B:640:0x089f
 case 2341: goto B:636:0x0891
 case 2342: goto B:632:0x0883
 case 2344: goto B:628:0x0875
 case 2345: goto B:624:0x0867
 case 2346: goto B:620:0x0859
 case 2347: goto B:616:0x084b
 case 2363: goto B:612:0x083d
 case 2371: goto B:608:0x082f
 case 2373: goto B:604:0x0821
 case 2374: goto B:600:0x0813
 case 2394: goto B:596:0x0805
 case 2396: goto B:592:0x07f7
 case 2397: goto B:588:0x07e9
 case 2398: goto B:584:0x07db
 case 2402: goto B:580:0x07cd
 case 2403: goto B:576:0x07bf
 case 2405: goto B:572:0x07b1
 case 2407: goto B:568:0x07a3
 case 2412: goto B:564:0x0795
 case 2414: goto B:560:0x0787
 case 2415: goto B:556:0x0779
 case 2421: goto B:552:0x076b
 case 2422: goto B:548:0x075d
 case 2423: goto B:544:0x074f
 case 2429: goto B:540:0x0741
 case 2431: goto B:536:0x0733
 case 2438: goto B:532:0x0725
 case 2439: goto B:528:0x0717
 case 2440: goto B:524:0x0709
 case 2441: goto B:520:0x06fb
 case 2442: goto B:516:0x06ed
 case 2445: goto B:512:0x06df
 case 2452: goto B:508:0x06d1
 case 2454: goto B:504:0x06c3
 case 2455: goto B:500:0x06b5
 case 2456: goto B:496:0x06a7
 case 2457: goto B:492:0x0699
 case 2458: goto B:488:0x068b
 case 2459: goto B:484:0x067d
 case 2462: goto B:480:0x066f
 case 2463: goto B:476:0x0661
 case 2464: goto B:472:0x0653
 case 2465: goto B:468:0x0645
 case 2466: goto B:464:0x0637
 case 2467: goto B:460:0x0629
 case 2468: goto B:456:0x061b
 case 2469: goto B:452:0x060d
 case 2470: goto B:448:0x05ff
 case 2471: goto B:444:0x05f1
 case 2472: goto B:440:0x05e3
 case 2473: goto B:436:0x05d5
 case 2474: goto B:432:0x05c7
 case 2475: goto B:428:0x05b9
 case 2476: goto B:424:0x05ab
 case 2477: goto B:420:0x059d
 case 2483: goto B:416:0x058f
 case 2485: goto B:412:0x0581
 case 2487: goto B:408:0x0573
 case 2489: goto B:404:0x0565
 case 2491: goto B:400:0x0557
 case 2494: goto B:396:0x0549
 case 2497: goto B:392:0x053b
 case 2498: goto B:388:0x052d
 case 2500: goto B:384:0x051f
 case 2503: goto B:380:0x0511
 case 2508: goto B:376:0x0503
 case 2526: goto B:372:0x04f5
 case 2545: goto B:368:0x04e7
 case 2549: goto B:364:0x04d9
 case 2550: goto B:360:0x04cb
 case 2551: goto B:356:0x04bd
 case 2552: goto B:352:0x04af
 case 2555: goto B:348:0x04a1
 case 2556: goto B:344:0x0493
 case 2557: goto B:340:0x0485
 case 2562: goto B:336:0x0477
 case 2563: goto B:332:0x0469
 case 2564: goto B:328:0x045b
 case 2567: goto B:324:0x044d
 case 2576: goto B:320:0x043f
 case 2611: goto B:316:0x0431
 case 2621: goto B:312:0x0423
 case 2625: goto B:308:0x0415
 case 2627: goto B:304:0x0407
 case 2629: goto B:300:0x03f9
 case 2638: goto B:296:0x03eb
 case 2639: goto B:292:0x03dd
 case 2640: goto B:288:0x03cf
 case 2641: goto B:284:0x03c1
 case 2642: goto B:280:0x03b3
 case 2644: goto B:276:0x03a5
 case 2645: goto B:272:0x0397
 case 2646: goto B:268:0x0389
 case 2648: goto B:264:0x037b
 case 2649: goto B:260:0x036d
 case 2650: goto B:256:0x035f
 case 2651: goto B:252:0x0351
 case 2652: goto B:248:0x0343
 case 2655: goto B:244:0x0335
 case 2656: goto B:240:0x0327
 case 2657: goto B:236:0x0319
 case 2659: goto B:232:0x030b
 case 2661: goto B:228:0x02fd
 case 2662: goto B:224:0x02ef
 case 2663: goto B:220:0x02e1
 case 2671: goto B:216:0x02d3
 case 2672: goto B:212:0x02c5
 case 2675: goto B:208:0x02b7
 case 2676: goto B:204:0x02a9
 case 2678: goto B:200:0x029b
 case 2679: goto B:196:0x028d
 case 2680: goto B:192:0x027f
 case 2681: goto B:188:0x0271
 case 2682: goto B:184:0x0263
 case 2683: goto B:180:0x0255
 case 2686: goto B:176:0x0247
 case 2688: goto B:172:0x0239
 case 2690: goto B:168:0x022b
 case 2691: goto B:164:0x021d
 case 2694: goto B:160:0x020f
 case 2700: goto B:156:0x0201
 case 2706: goto B:152:0x01f3
 case 2718: goto B:148:0x01e5
 case 2724: goto B:144:0x01d7
 case 2725: goto B:140:0x01c9
 case 2731: goto B:136:0x01bb
 case 2733: goto B:132:0x01ad
 case 2735: goto B:128:0x019f
 case 2737: goto B:124:0x0191
 case 2739: goto B:120:0x0183
 case 2744: goto B:116:0x0175
 case 2751: goto B:112:0x0167
 case 2767: goto B:108:0x0159
 case 2780: goto B:104:0x014b
 case 2803: goto B:100:0x013d
 case 2828: goto B:96:0x012f
 case 2843: goto B:92:0x0121
 case 2855: goto B:88:0x0113
 case 2867: goto B:84:0x0105
 case 2877: goto B:80:0x00f7
 default: goto B:24:0x0036 A[RegionRef:SW:23]
  (r0v0 int) from 0x0036: SWITCH (r0v0 int)
 case 2096: goto B:76:0x00e9
 case 2097: goto B:72:0x00db
 case 2098: goto B:68:0x00cd
 case 2099: goto B:64:0x00bf
 case 2100: goto B:60:0x00b1
 default: goto B:25:0x0039 A[RegionRef:SW:24]
  (r0v0 int) from 0x0039: SWITCH (r0v0 int)
 case 2122: goto B:56:0x00a3
 case 2123: goto B:52:0x0095
 case 2124: goto B:48:0x0087
 case 2125: goto B:44:0x0079
 default: goto B:26:0x003c A[RegionRef:SW:25]
  (r0v0 int) from 0x003c: SWITCH (r0v0 int)
 case 2147: goto B:40:0x006b
 case 2148: goto B:36:0x005d
 case 2149: goto B:32:0x004f
 case 2150: goto B:28:0x0041
 default: goto B:974:0x0d1c A[RegionRef:SW:26]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] b(String str) {
        byte b10;
        Objects.requireNonNull(str);
        if (iHashCode != 2091) {
            if (iHashCode != 2092) {
                if (iHashCode != 2102) {
                    if (iHashCode != 2103) {
                        if (iHashCode != 2111) {
                            if (iHashCode != 2112) {
                                if (iHashCode != 2129) {
                                    if (iHashCode != 2130) {
                                        if (iHashCode != 2135) {
                                            if (iHashCode != 2136) {
                                                switch (str) {
                                                    case "AD":
                                                        b10 = 0;
                                                        break;
                                                    case "AE":
                                                        b10 = 1;
                                                        break;
                                                    case "AF":
                                                        b10 = 2;
                                                        break;
                                                    case "AG":
                                                        b10 = 3;
                                                        break;
                                                    default:
                                                        switch (str) {
                                                            case 2088:
                                                                if (!str.equals("AI")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 4;
                                                                }
                                                                break;
                                                            case 2094:
                                                                if (!str.equals("AO")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 7;
                                                                }
                                                                break;
                                                            case 2105:
                                                                if (!str.equals("AZ")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 15;
                                                                }
                                                                break;
                                                            case 2114:
                                                                if (!str.equals("BD")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 18;
                                                                }
                                                                break;
                                                            case 2115:
                                                                if (!str.equals("BE")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 19;
                                                                }
                                                                break;
                                                            case 2116:
                                                                if (!str.equals("BF")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 20;
                                                                }
                                                                break;
                                                            case 2117:
                                                                if (!str.equals("BG")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 21;
                                                                }
                                                                break;
                                                            case 2118:
                                                                if (!str.equals("BH")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 22;
                                                                }
                                                                break;
                                                            case 2119:
                                                                if (!str.equals("BI")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 23;
                                                                }
                                                                break;
                                                            case 2120:
                                                                if (!str.equals("BJ")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = Ascii.CAN;
                                                                }
                                                                break;
                                                            case 2127:
                                                                if (!str.equals("BQ")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = Ascii.GS;
                                                                }
                                                                break;
                                                            case 2133:
                                                                if (!str.equals("BW")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 32;
                                                                }
                                                                break;
                                                            case 2142:
                                                                if (!str.equals("CA")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 35;
                                                                }
                                                                break;
                                                            case 2145:
                                                                if (!str.equals("CD")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 36;
                                                                }
                                                                break;
                                                            case 2152:
                                                                if (!str.equals("CK")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 41;
                                                                }
                                                                break;
                                                            case 2153:
                                                                if (!str.equals("CL")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 42;
                                                                }
                                                                break;
                                                            case 2154:
                                                                if (!str.equals("CM")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 43;
                                                                }
                                                                break;
                                                            case 2155:
                                                                if (!str.equals("CN")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 44;
                                                                }
                                                                break;
                                                            case 2156:
                                                                if (!str.equals("CO")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 45;
                                                                }
                                                                break;
                                                            case 2159:
                                                                if (!str.equals("CR")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 46;
                                                                }
                                                                break;
                                                            case 2162:
                                                                if (!str.equals("CU")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 47;
                                                                }
                                                                break;
                                                            case 2163:
                                                                if (!str.equals("CV")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 48;
                                                                }
                                                                break;
                                                            case 2164:
                                                                if (!str.equals("CW")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 49;
                                                                }
                                                                break;
                                                            case 2165:
                                                                if (!str.equals("CX")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 50;
                                                                }
                                                                break;
                                                            case 2166:
                                                                if (!str.equals("CY")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 51;
                                                                }
                                                                break;
                                                            case 2167:
                                                                if (!str.equals("CZ")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 52;
                                                                }
                                                                break;
                                                            case 2177:
                                                                if (!str.equals("DE")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 53;
                                                                }
                                                                break;
                                                            case 2182:
                                                                if (!str.equals("DJ")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 54;
                                                                }
                                                                break;
                                                            case 2183:
                                                                if (!str.equals("DK")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 55;
                                                                }
                                                                break;
                                                            case 2185:
                                                                if (!str.equals("DM")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 56;
                                                                }
                                                                break;
                                                            case 2187:
                                                                if (!str.equals("DO")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 57;
                                                                }
                                                                break;
                                                            case 2198:
                                                                if (!str.equals("DZ")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 58;
                                                                }
                                                                break;
                                                            case 2206:
                                                                if (!str.equals("EC")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 59;
                                                                }
                                                                break;
                                                            case 2208:
                                                                if (!str.equals("EE")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 60;
                                                                }
                                                                break;
                                                            case 2210:
                                                                if (!str.equals("EG")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 61;
                                                                }
                                                                break;
                                                            case 2221:
                                                                if (!str.equals("ER")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 62;
                                                                }
                                                                break;
                                                            case 2222:
                                                                if (!str.equals("ES")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 63;
                                                                }
                                                                break;
                                                            case 2223:
                                                                if (!str.equals("ET")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 64;
                                                                }
                                                                break;
                                                            case 2243:
                                                                if (!str.equals("FI")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 65;
                                                                }
                                                                break;
                                                            case 2244:
                                                                if (!str.equals("FJ")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 66;
                                                                }
                                                                break;
                                                            case 2245:
                                                                if (!str.equals("FK")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 67;
                                                                }
                                                                break;
                                                            case 2247:
                                                                if (!str.equals("FM")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 68;
                                                                }
                                                                break;
                                                            case 2249:
                                                                if (!str.equals("FO")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 69;
                                                                }
                                                                break;
                                                            case 2252:
                                                                if (!str.equals("FR")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 70;
                                                                }
                                                                break;
                                                            case 2266:
                                                                if (!str.equals("GA")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 71;
                                                                }
                                                                break;
                                                            case 2267:
                                                                if (!str.equals("GB")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 72;
                                                                }
                                                                break;
                                                            case 2269:
                                                                if (!str.equals("GD")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 73;
                                                                }
                                                                break;
                                                            case 2270:
                                                                if (!str.equals("GE")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 74;
                                                                }
                                                                break;
                                                            case 2271:
                                                                if (!str.equals("GF")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 75;
                                                                }
                                                                break;
                                                            case 2272:
                                                                if (!str.equals("GG")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 76;
                                                                }
                                                                break;
                                                            case 2273:
                                                                if (!str.equals("GH")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 77;
                                                                }
                                                                break;
                                                            case 2274:
                                                                if (!str.equals("GI")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 78;
                                                                }
                                                                break;
                                                            case 2277:
                                                                if (!str.equals("GL")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 79;
                                                                }
                                                                break;
                                                            case 2278:
                                                                if (!str.equals("GM")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 80;
                                                                }
                                                                break;
                                                            case 2279:
                                                                if (!str.equals("GN")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 81;
                                                                }
                                                                break;
                                                            case 2281:
                                                                if (!str.equals("GP")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 82;
                                                                }
                                                                break;
                                                            case 2282:
                                                                if (!str.equals("GQ")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 83;
                                                                }
                                                                break;
                                                            case 2283:
                                                                if (!str.equals("GR")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 84;
                                                                }
                                                                break;
                                                            case 2285:
                                                                if (!str.equals("GT")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 85;
                                                                }
                                                                break;
                                                            case 2286:
                                                                if (!str.equals("GU")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 86;
                                                                }
                                                                break;
                                                            case 2288:
                                                                if (!str.equals("GW")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 87;
                                                                }
                                                                break;
                                                            case 2290:
                                                                if (!str.equals("GY")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 88;
                                                                }
                                                                break;
                                                            case 2307:
                                                                if (!str.equals("HK")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 89;
                                                                }
                                                                break;
                                                            case 2314:
                                                                if (!str.equals("HR")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 90;
                                                                }
                                                                break;
                                                            case 2316:
                                                                if (!str.equals("HT")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 91;
                                                                }
                                                                break;
                                                            case 2317:
                                                                if (!str.equals("HU")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 92;
                                                                }
                                                                break;
                                                            case 2331:
                                                                if (!str.equals("ID")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 93;
                                                                }
                                                                break;
                                                            case 2332:
                                                                if (!str.equals("IE")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 94;
                                                                }
                                                                break;
                                                            case 2339:
                                                                if (!str.equals("IL")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 95;
                                                                }
                                                                break;
                                                            case 2340:
                                                                if (!str.equals("IM")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 96;
                                                                }
                                                                break;
                                                            case 2341:
                                                                if (!str.equals("IN")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 97;
                                                                }
                                                                break;
                                                            case 2342:
                                                                if (!str.equals("IO")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 98;
                                                                }
                                                                break;
                                                            case 2344:
                                                                if (!str.equals("IQ")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 99;
                                                                }
                                                                break;
                                                            case 2345:
                                                                if (!str.equals("IR")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 100;
                                                                }
                                                                break;
                                                            case 2346:
                                                                if (!str.equals("IS")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 101;
                                                                }
                                                                break;
                                                            case 2347:
                                                                if (!str.equals("IT")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 102;
                                                                }
                                                                break;
                                                            case 2363:
                                                                if (!str.equals("JE")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 103;
                                                                }
                                                                break;
                                                            case 2371:
                                                                if (!str.equals("JM")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 104;
                                                                }
                                                                break;
                                                            case 2373:
                                                                if (!str.equals("JO")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 105;
                                                                }
                                                                break;
                                                            case 2374:
                                                                if (!str.equals("JP")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 106;
                                                                }
                                                                break;
                                                            case 2394:
                                                                if (!str.equals("KE")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 107;
                                                                }
                                                                break;
                                                            case 2396:
                                                                if (!str.equals("KG")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 108;
                                                                }
                                                                break;
                                                            case 2397:
                                                                if (!str.equals("KH")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 109;
                                                                }
                                                                break;
                                                            case 2398:
                                                                if (!str.equals("KI")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 110;
                                                                }
                                                                break;
                                                            case 2402:
                                                                if (!str.equals("KM")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 111;
                                                                }
                                                                break;
                                                            case 2403:
                                                                if (!str.equals("KN")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 112;
                                                                }
                                                                break;
                                                            case 2405:
                                                                if (!str.equals("KP")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 113;
                                                                }
                                                                break;
                                                            case 2407:
                                                                if (!str.equals("KR")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 114;
                                                                }
                                                                break;
                                                            case 2412:
                                                                if (!str.equals("KW")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 115;
                                                                }
                                                                break;
                                                            case 2414:
                                                                if (!str.equals("KY")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 116;
                                                                }
                                                                break;
                                                            case 2415:
                                                                if (!str.equals("KZ")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 117;
                                                                }
                                                                break;
                                                            case 2421:
                                                                if (!str.equals("LA")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 118;
                                                                }
                                                                break;
                                                            case 2422:
                                                                if (!str.equals("LB")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 119;
                                                                }
                                                                break;
                                                            case 2423:
                                                                if (!str.equals("LC")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 120;
                                                                }
                                                                break;
                                                            case 2429:
                                                                if (!str.equals("LI")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 121;
                                                                }
                                                                break;
                                                            case 2431:
                                                                if (!str.equals("LK")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 122;
                                                                }
                                                                break;
                                                            case 2438:
                                                                if (!str.equals("LR")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 123;
                                                                }
                                                                break;
                                                            case 2439:
                                                                if (!str.equals("LS")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 124;
                                                                }
                                                                break;
                                                            case 2440:
                                                                if (!str.equals("LT")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 125;
                                                                }
                                                                break;
                                                            case 2441:
                                                                if (!str.equals("LU")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 126;
                                                                }
                                                                break;
                                                            case 2442:
                                                                if (!str.equals("LV")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = Ascii.DEL;
                                                                }
                                                                break;
                                                            case 2445:
                                                                if (!str.equals("LY")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 128;
                                                                }
                                                                break;
                                                            case 2452:
                                                                if (!str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_MA)) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 129;
                                                                }
                                                                break;
                                                            case 2454:
                                                                if (!str.equals("MC")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 130;
                                                                }
                                                                break;
                                                            case 2455:
                                                                if (!str.equals("MD")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 131;
                                                                }
                                                                break;
                                                            case 2456:
                                                                if (!str.equals("ME")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 132;
                                                                }
                                                                break;
                                                            case 2457:
                                                                if (!str.equals("MF")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 133;
                                                                }
                                                                break;
                                                            case 2458:
                                                                if (!str.equals("MG")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 134;
                                                                }
                                                                break;
                                                            case 2459:
                                                                if (!str.equals("MH")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 135;
                                                                }
                                                                break;
                                                            case 2462:
                                                                if (!str.equals("MK")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 136;
                                                                }
                                                                break;
                                                            case 2463:
                                                                if (!str.equals("ML")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 137;
                                                                }
                                                                break;
                                                            case 2464:
                                                                if (!str.equals("MM")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 138;
                                                                }
                                                                break;
                                                            case 2465:
                                                                if (!str.equals("MN")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 139;
                                                                }
                                                                break;
                                                            case 2466:
                                                                if (!str.equals("MO")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 140;
                                                                }
                                                                break;
                                                            case 2467:
                                                                if (!str.equals("MP")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 141;
                                                                }
                                                                break;
                                                            case 2468:
                                                                if (!str.equals("MQ")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 142;
                                                                }
                                                                break;
                                                            case 2469:
                                                                if (!str.equals("MR")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 143;
                                                                }
                                                                break;
                                                            case 2470:
                                                                if (!str.equals("MS")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 144;
                                                                }
                                                                break;
                                                            case 2471:
                                                                if (!str.equals("MT")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 145;
                                                                }
                                                                break;
                                                            case 2472:
                                                                if (!str.equals("MU")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 146;
                                                                }
                                                                break;
                                                            case 2473:
                                                                if (!str.equals("MV")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 147;
                                                                }
                                                                break;
                                                            case 2474:
                                                                if (!str.equals("MW")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 148;
                                                                }
                                                                break;
                                                            case 2475:
                                                                if (!str.equals("MX")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 149;
                                                                }
                                                                break;
                                                            case 2476:
                                                                if (!str.equals("MY")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 150;
                                                                }
                                                                break;
                                                            case 2477:
                                                                if (!str.equals("MZ")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 151;
                                                                }
                                                                break;
                                                            case 2483:
                                                                if (!str.equals("NA")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 152;
                                                                }
                                                                break;
                                                            case 2485:
                                                                if (!str.equals("NC")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 153;
                                                                }
                                                                break;
                                                            case 2487:
                                                                if (!str.equals("NE")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 154;
                                                                }
                                                                break;
                                                            case 2489:
                                                                if (!str.equals("NG")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 155;
                                                                }
                                                                break;
                                                            case 2491:
                                                                if (!str.equals("NI")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 156;
                                                                }
                                                                break;
                                                            case 2494:
                                                                if (!str.equals("NL")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 157;
                                                                }
                                                                break;
                                                            case 2497:
                                                                if (!str.equals("NO")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 158;
                                                                }
                                                                break;
                                                            case 2498:
                                                                if (!str.equals("NP")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 159;
                                                                }
                                                                break;
                                                            case 2500:
                                                                if (!str.equals("NR")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 160;
                                                                }
                                                                break;
                                                            case 2503:
                                                                if (!str.equals("NU")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 161;
                                                                }
                                                                break;
                                                            case 2508:
                                                                if (!str.equals("NZ")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 162;
                                                                }
                                                                break;
                                                            case 2526:
                                                                if (!str.equals("OM")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 163;
                                                                }
                                                                break;
                                                            case 2545:
                                                                if (!str.equals("PA")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 164;
                                                                }
                                                                break;
                                                            case 2549:
                                                                if (!str.equals("PE")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 165;
                                                                }
                                                                break;
                                                            case 2550:
                                                                if (!str.equals("PF")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 166;
                                                                }
                                                                break;
                                                            case 2551:
                                                                if (!str.equals(RequestConfiguration.MAX_AD_CONTENT_RATING_PG)) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 167;
                                                                }
                                                                break;
                                                            case 2552:
                                                                if (!str.equals("PH")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 168;
                                                                }
                                                                break;
                                                            case 2555:
                                                                if (!str.equals("PK")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 169;
                                                                }
                                                                break;
                                                            case 2556:
                                                                if (!str.equals("PL")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 170;
                                                                }
                                                                break;
                                                            case 2557:
                                                                if (!str.equals("PM")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 171;
                                                                }
                                                                break;
                                                            case 2562:
                                                                if (!str.equals("PR")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 172;
                                                                }
                                                                break;
                                                            case 2563:
                                                                if (!str.equals("PS")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 173;
                                                                }
                                                                break;
                                                            case 2564:
                                                                if (!str.equals("PT")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 174;
                                                                }
                                                                break;
                                                            case 2567:
                                                                if (!str.equals("PW")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 175;
                                                                }
                                                                break;
                                                            case 2576:
                                                                if (!str.equals("QA")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 176;
                                                                }
                                                                break;
                                                            case 2611:
                                                                if (!str.equals("RE")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 177;
                                                                }
                                                                break;
                                                            case 2621:
                                                                if (!str.equals("RO")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 178;
                                                                }
                                                                break;
                                                            case 2625:
                                                                if (!str.equals("RS")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 179;
                                                                }
                                                                break;
                                                            case 2627:
                                                                if (!str.equals("RU")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 180;
                                                                }
                                                                break;
                                                            case 2629:
                                                                if (!str.equals("RW")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 181;
                                                                }
                                                                break;
                                                            case 2638:
                                                                if (!str.equals("SA")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 182;
                                                                }
                                                                break;
                                                            case 2639:
                                                                if (!str.equals("SB")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 183;
                                                                }
                                                                break;
                                                            case 2640:
                                                                if (!str.equals("SC")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 184;
                                                                }
                                                                break;
                                                            case 2641:
                                                                if (!str.equals("SD")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 185;
                                                                }
                                                                break;
                                                            case 2642:
                                                                if (!str.equals("SE")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 186;
                                                                }
                                                                break;
                                                            case 2644:
                                                                if (!str.equals("SG")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 187;
                                                                }
                                                                break;
                                                            case 2645:
                                                                if (!str.equals("SH")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 188;
                                                                }
                                                                break;
                                                            case 2646:
                                                                if (!str.equals("SI")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 189;
                                                                }
                                                                break;
                                                            case 2648:
                                                                if (!str.equals("SK")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 190;
                                                                }
                                                                break;
                                                            case 2649:
                                                                if (!str.equals("SL")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 191;
                                                                }
                                                                break;
                                                            case 2650:
                                                                if (!str.equals("SM")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 192;
                                                                }
                                                                break;
                                                            case 2651:
                                                                if (!str.equals("SN")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 193;
                                                                }
                                                                break;
                                                            case 2652:
                                                                if (!str.equals("SO")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 194;
                                                                }
                                                                break;
                                                            case 2655:
                                                                if (!str.equals("SR")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 195;
                                                                }
                                                                break;
                                                            case 2656:
                                                                if (!str.equals("SS")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 196;
                                                                }
                                                                break;
                                                            case 2657:
                                                                if (!str.equals("ST")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 197;
                                                                }
                                                                break;
                                                            case 2659:
                                                                if (!str.equals("SV")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 198;
                                                                }
                                                                break;
                                                            case 2661:
                                                                if (!str.equals("SX")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 199;
                                                                }
                                                                break;
                                                            case 2662:
                                                                if (!str.equals("SY")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 200;
                                                                }
                                                                break;
                                                            case 2663:
                                                                if (!str.equals("SZ")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 201;
                                                                }
                                                                break;
                                                            case 2671:
                                                                if (!str.equals("TC")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 202;
                                                                }
                                                                break;
                                                            case 2672:
                                                                if (!str.equals("TD")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 203;
                                                                }
                                                                break;
                                                            case 2675:
                                                                if (!str.equals("TG")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 204;
                                                                }
                                                                break;
                                                            case 2676:
                                                                if (!str.equals("TH")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 205;
                                                                }
                                                                break;
                                                            case 2678:
                                                                if (!str.equals("TJ")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 206;
                                                                }
                                                                break;
                                                            case 2679:
                                                                if (!str.equals("TK")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 207;
                                                                }
                                                                break;
                                                            case 2680:
                                                                if (!str.equals("TL")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 208;
                                                                }
                                                                break;
                                                            case 2681:
                                                                if (!str.equals("TM")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 209;
                                                                }
                                                                break;
                                                            case 2682:
                                                                if (!str.equals("TN")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 210;
                                                                }
                                                                break;
                                                            case 2683:
                                                                if (!str.equals("TO")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 211;
                                                                }
                                                                break;
                                                            case 2686:
                                                                if (!str.equals("TR")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 212;
                                                                }
                                                                break;
                                                            case 2688:
                                                                if (!str.equals("TT")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 213;
                                                                }
                                                                break;
                                                            case 2690:
                                                                if (!str.equals("TV")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 214;
                                                                }
                                                                break;
                                                            case 2691:
                                                                if (!str.equals("TW")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 215;
                                                                }
                                                                break;
                                                            case 2694:
                                                                if (!str.equals("TZ")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 216;
                                                                }
                                                                break;
                                                            case 2700:
                                                                if (!str.equals("UA")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 217;
                                                                }
                                                                break;
                                                            case 2706:
                                                                if (!str.equals("UG")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 218;
                                                                }
                                                                break;
                                                            case 2718:
                                                                if (!str.equals("US")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 219;
                                                                }
                                                                break;
                                                            case 2724:
                                                                if (!str.equals("UY")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 220;
                                                                }
                                                                break;
                                                            case 2725:
                                                                if (!str.equals("UZ")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 221;
                                                                }
                                                                break;
                                                            case 2731:
                                                                if (!str.equals("VA")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 222;
                                                                }
                                                                break;
                                                            case 2733:
                                                                if (!str.equals("VC")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 223;
                                                                }
                                                                break;
                                                            case 2735:
                                                                if (!str.equals("VE")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 224;
                                                                }
                                                                break;
                                                            case 2737:
                                                                if (!str.equals("VG")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 225;
                                                                }
                                                                break;
                                                            case 2739:
                                                                if (!str.equals("VI")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 226;
                                                                }
                                                                break;
                                                            case 2744:
                                                                if (!str.equals("VN")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 227;
                                                                }
                                                                break;
                                                            case 2751:
                                                                if (!str.equals("VU")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 228;
                                                                }
                                                                break;
                                                            case 2767:
                                                                if (!str.equals("WF")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 229;
                                                                }
                                                                break;
                                                            case 2780:
                                                                if (!str.equals("WS")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 230;
                                                                }
                                                                break;
                                                            case 2803:
                                                                if (!str.equals("XK")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 231;
                                                                }
                                                                break;
                                                            case 2828:
                                                                if (!str.equals("YE")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 232;
                                                                }
                                                                break;
                                                            case 2843:
                                                                if (!str.equals("YT")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 233;
                                                                }
                                                                break;
                                                            case 2855:
                                                                if (!str.equals("ZA")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 234;
                                                                }
                                                                break;
                                                            case 2867:
                                                                if (!str.equals("ZM")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 235;
                                                                }
                                                                break;
                                                            case 2877:
                                                                if (!str.equals("ZW")) {
                                                                    b10 = -1;
                                                                } else {
                                                                    b10 = 236;
                                                                }
                                                                break;
                                                            default:
                                                                switch (str) {
                                                                    case 2096:
                                                                        if (!str.equals("AQ")) {
                                                                            b10 = -1;
                                                                        } else {
                                                                            b10 = 8;
                                                                        }
                                                                        break;
                                                                    case 2097:
                                                                        if (!str.equals("AR")) {
                                                                            b10 = -1;
                                                                        } else {
                                                                            b10 = 9;
                                                                        }
                                                                        break;
                                                                    case 2098:
                                                                        if (!str.equals("AS")) {
                                                                            b10 = -1;
                                                                        } else {
                                                                            b10 = 10;
                                                                        }
                                                                        break;
                                                                    case 2099:
                                                                        if (!str.equals("AT")) {
                                                                            b10 = -1;
                                                                        } else {
                                                                            b10 = 11;
                                                                        }
                                                                        break;
                                                                    case AdError.BROKEN_MEDIA_ERROR_CODE /* 2100 */:
                                                                        if (!str.equals("AU")) {
                                                                            b10 = -1;
                                                                        } else {
                                                                            b10 = 12;
                                                                        }
                                                                        break;
                                                                    default:
                                                                        switch (str) {
                                                                            case 2122:
                                                                                if (!str.equals("BL")) {
                                                                                    b10 = -1;
                                                                                } else {
                                                                                    b10 = Ascii.EM;
                                                                                }
                                                                                break;
                                                                            case 2123:
                                                                                if (!str.equals("BM")) {
                                                                                    b10 = -1;
                                                                                } else {
                                                                                    b10 = Ascii.SUB;
                                                                                }
                                                                                break;
                                                                            case 2124:
                                                                                if (!str.equals("BN")) {
                                                                                    b10 = -1;
                                                                                } else {
                                                                                    b10 = Ascii.ESC;
                                                                                }
                                                                                break;
                                                                            case 2125:
                                                                                if (!str.equals("BO")) {
                                                                                    b10 = -1;
                                                                                } else {
                                                                                    b10 = Ascii.FS;
                                                                                }
                                                                                break;
                                                                            default:
                                                                                switch (str) {
                                                                                    case 2147:
                                                                                        if (!str.equals("CF")) {
                                                                                            b10 = -1;
                                                                                        } else {
                                                                                            b10 = 37;
                                                                                        }
                                                                                        break;
                                                                                    case 2148:
                                                                                        if (!str.equals("CG")) {
                                                                                            b10 = -1;
                                                                                        } else {
                                                                                            b10 = 38;
                                                                                        }
                                                                                        break;
                                                                                    case 2149:
                                                                                        if (!str.equals("CH")) {
                                                                                            b10 = -1;
                                                                                        } else {
                                                                                            b10 = 39;
                                                                                        }
                                                                                        break;
                                                                                    case 2150:
                                                                                        if (!str.equals("CI")) {
                                                                                            b10 = -1;
                                                                                        } else {
                                                                                            b10 = 40;
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        b10 = -1;
                                                                                        break;
                                                                                }
                                                                                break;
                                                                        }
                                                                        break;
                                                                }
                                                                break;
                                                        }
                                                }
                                            } else if (str.equals("BZ")) {
                                                b10 = 34;
                                            } else {
                                                b10 = -1;
                                            }
                                        } else if (str.equals("BY")) {
                                            b10 = 33;
                                        } else {
                                            b10 = -1;
                                        }
                                    } else if (str.equals("BT")) {
                                        b10 = Ascii.US;
                                    } else {
                                        b10 = -1;
                                    }
                                } else if (str.equals("BS")) {
                                    b10 = Ascii.RS;
                                } else {
                                    b10 = -1;
                                }
                            } else if (str.equals("BB")) {
                                b10 = 17;
                            } else {
                                b10 = -1;
                            }
                        } else if (str.equals("BA")) {
                            b10 = 16;
                        } else {
                            b10 = -1;
                        }
                    } else if (str.equals("AX")) {
                        b10 = 14;
                    } else {
                        b10 = -1;
                    }
                } else if (str.equals("AW")) {
                    b10 = 13;
                } else {
                    b10 = -1;
                }
            } else if (str.equals("AM")) {
                b10 = 6;
            } else {
                b10 = -1;
            }
        } else if (str.equals("AL")) {
            b10 = 5;
        } else {
            b10 = -1;
        }
        switch (b10) {
            case 0:
            case 26:
            case 29:
            case 73:
            case 79:
            case 112:
            case 116:
            case 120:
            case 223:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 4, 4, 4, 0};
            case 2:
            case 80:
                return new int[]{4, 3, 3, 4, 2, 2};
            case 3:
                return new int[]{2, 4, 1, 2, 2, 2};
            case 4:
                return new int[]{0, 2, 0, 3, 2, 2};
            case 5:
            case 231:
                return new int[]{1, 1, 1, 1, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 3, 2, 2};
            case 7:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 8:
            case 62:
            case 188:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
            case 108:
            case 210:
            case 220:
                return new int[]{2, 1, 1, 1, 2, 2};
            case 10:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 11:
                return new int[]{1, 0, 1, 1, 0, 0};
            case 12:
                return new int[]{0, 1, 1, 1, 2, 0};
            case 13:
                return new int[]{1, 3, 4, 4, 2, 2};
            case 14:
            case 121:
            case SyslogConstants.LOG_LOCAL2 /* 144 */:
            case 171:
            case 192:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 75:
            case 128:
            case 169:
            case 194:
            case 211:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 16:
                return new int[]{1, 2, 1, 1, 2, 2};
            case 17:
            case 56:
            case 69:
            case 78:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 18:
                return new int[]{2, 1, 3, 3, 2, 2};
            case 19:
                return new int[]{0, 1, 4, 4, 3, 2};
            case 20:
                return new int[]{4, 3, 4, 3, 2, 2};
            case 21:
            case 145:
            case 190:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 2, 1, 3, 4, 2};
            case 23:
            case 91:
            case 111:
            case 134:
            case 154:
            case 185:
            case 203:
            case 224:
            case 232:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 3, 3, 2, 2};
            case 25:
            case 50:
            case 222:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 27:
            case 49:
                return new int[]{2, 2, 0, 0, 2, 2};
            case 28:
                return new int[]{1, 2, 3, 2, 2, 2};
            case 30:
                return new int[]{4, 4, 2, 2, 2, 2};
            case 31:
                return new int[]{3, 1, 3, 2, 2, 2};
            case 32:
                return new int[]{3, 2, 1, 0, 2, 2};
            case 33:
                return new int[]{0, 1, 2, 3, 2, 2};
            case 34:
                return new int[]{2, 4, 2, 1, 2, 2};
            case 35:
                return new int[]{0, 2, 2, 2, 3, 2};
            case 36:
                return new int[]{4, 2, 3, 2, 2, 2};
            case 37:
            case 110:
                return new int[]{4, 2, 4, 2, 2, 2};
            case 38:
            case 61:
            case 87:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 39:
                return new int[]{0, 0, 0, 1, 0, 2};
            case 40:
            case 58:
            case 123:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 41:
            case 166:
                return new int[]{2, 2, 2, 1, 2, 2};
            case 42:
            case 95:
                return new int[]{1, 2, 2, 2, 3, 2};
            case 43:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 44:
                return new int[]{2, 0, 1, 1, 3, 2};
            case 45:
                return new int[]{2, 3, 4, 3, 2, 2};
            case 46:
                return new int[]{2, 3, 4, 4, 2, 2};
            case 47:
            case 54:
            case 200:
            case 206:
            case 208:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 48:
                return new int[]{2, 1, 0, 0, 2, 2};
            case 51:
            case 115:
                return new int[]{1, 0, 0, 0, 0, 2};
            case 52:
            case 158:
                return new int[]{0, 0, 2, 0, 1, 2};
            case 53:
                return new int[]{0, 1, 2, 2, 2, 3};
            case 55:
                return new int[]{0, 0, 3, 2, 0, 2};
            case 57:
                return new int[]{3, 4, 4, 4, 4, 2};
            case 59:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 60:
            case 101:
            case 127:
            case 174:
            case 186:
            case 215:
                return new int[]{0, 0, 0, 0, 0, 2};
            case 63:
            case 94:
                return new int[]{0, 1, 1, 1, 2, 2};
            case 64:
                return new int[]{4, 3, 3, 1, 2, 2};
            case 65:
                return new int[]{0, 0, 0, 3, 0, 2};
            case 66:
                return new int[]{3, 1, 2, 2, 2, 2};
            case 67:
            case 107:
            case 113:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 68:
                return new int[]{4, 2, 4, 1, 2, 2};
            case 70:
                return new int[]{1, 2, 3, 1, 0, 2};
            case 71:
            case 204:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 72:
                return new int[]{0, 0, 1, 1, 1, 1};
            case 74:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 76:
            case 226:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 77:
            case SyslogConstants.LOG_LOCAL3 /* 152 */:
            case 228:
                return new int[]{3, 3, 3, 2, 2, 2};
            case 81:
                return new int[]{4, 3, 4, 2, 2, 2};
            case 82:
            case 142:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 83:
                return new int[]{4, 2, 1, 4, 2, 2};
            case 84:
            case 90:
            case 189:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 85:
                return new int[]{2, 3, 2, 2, 2, 2};
            case 86:
            case 165:
                return new int[]{1, 2, 4, 4, 4, 2};
            case 88:
                return new int[]{3, 2, 2, 1, 2, 2};
            case 89:
                return new int[]{0, 1, 2, 3, 2, 0};
            case 92:
                return new int[]{0, 0, 0, 1, 3, 2};
            case 93:
                return new int[]{3, 1, 2, 2, 3, 2};
            case 96:
            case 217:
                return new int[]{0, 2, 1, 1, 2, 2};
            case 97:
                return new int[]{1, 1, 3, 2, 3, 3};
            case 98:
            case 135:
            case 214:
            case 229:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 99:
                return new int[]{3, 2, 2, 3, 2, 2};
            case 100:
                return new int[]{3, 0, 1, 1, 4, 1};
            case 102:
                return new int[]{0, 0, 0, 1, 1, 2};
            case 103:
            case 233:
                return new int[]{4, 2, 2, 3, 2, 2};
            case 104:
                return new int[]{2, 4, 3, 2, 2, 2};
            case 105:
                return new int[]{2, 1, 1, 2, 2, 2};
            case 106:
                return new int[]{0, 1, 1, 2, 2, 4};
            case 109:
                return new int[]{2, 1, 4, 2, 2, 2};
            case 114:
                return new int[]{0, 1, 1, 3, 4, 4};
            case 117:
                return new int[]{2, 1, 2, 2, 2, 2};
            case 118:
                return new int[]{1, 2, 1, 3, 2, 2};
            case 119:
                return new int[]{3, 3, 2, 4, 2, 2};
            case 122:
                return new int[]{3, 1, 3, 3, 4, 2};
            case 124:
                return new int[]{3, 3, 2, 2, 2, 2};
            case 125:
                return new int[]{0, 0, 0, 0, 2, 2};
            case 126:
                return new int[]{1, 0, 3, 2, 1, 4};
            case 129:
                return new int[]{3, 3, 1, 1, 2, 2};
            case 130:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 131:
            case 179:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 132:
                return new int[]{2, 0, 0, 1, 2, 2};
            case 133:
            case 177:
                return new int[]{1, 2, 1, 2, 2, 2};
            case SyslogConstants.LOG_LOCAL1 /* 136 */:
                return new int[]{1, 0, 0, 1, 3, 2};
            case 137:
            case 167:
                return new int[]{4, 3, 3, 2, 2, 2};
            case 138:
                return new int[]{2, 4, 2, 3, 2, 2};
            case 139:
                return new int[]{2, 0, 1, 2, 2, 2};
            case 140:
            case 141:
                return new int[]{0, 2, 4, 4, 2, 2};
            case 143:
            case 236:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 146:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 147:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 148:
                return new int[]{4, 2, 3, 3, 2, 2};
            case 149:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 150:
                return new int[]{1, 0, 3, 1, 3, 2};
            case 151:
                return new int[]{3, 1, 2, 1, 2, 2};
            case 153:
                return new int[]{3, 3, 4, 4, 2, 2};
            case 155:
                return new int[]{3, 4, 2, 1, 2, 2};
            case 156:
            case 164:
            case 198:
                return new int[]{2, 3, 3, 3, 2, 2};
            case 157:
                return new int[]{0, 2, 2, 3, 0, 3};
            case 159:
                return new int[]{2, 2, 4, 3, 2, 2};
            case SyslogConstants.LOG_LOCAL4 /* 160 */:
            case 161:
                return new int[]{4, 2, 2, 1, 2, 2};
            case 162:
            case 170:
                return new int[]{1, 1, 2, 2, 4, 2};
            case 163:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 168:
                return new int[]{2, 1, 3, 3, 3, 0};
            case 172:
                return new int[]{2, 0, 2, 1, 2, 1};
            case 173:
                return new int[]{3, 4, 1, 2, 2, 2};
            case HideBottomViewOnScrollBehavior.EXIT_ANIMATION_DURATION /* 175 */:
                return new int[]{2, 2, 4, 1, 2, 2};
            case SyslogConstants.LOG_LOCAL6 /* 176 */:
                return new int[]{2, 4, 4, 4, 4, 2};
            case 178:
                return new int[]{0, 0, 1, 2, 1, 2};
            case BaseTransientBottomBar.ANIMATION_FADE_DURATION /* 180 */:
                return new int[]{1, 0, 0, 0, 4, 3};
            case 181:
                return new int[]{3, 4, 2, 0, 2, 2};
            case 182:
                return new int[]{3, 1, 1, 1, 2, 2};
            case 183:
                return new int[]{4, 2, 4, 3, 2, 2};
            case SyslogConstants.LOG_LOCAL7 /* 184 */:
            case 209:
                return new int[]{4, 2, 1, 1, 2, 2};
            case 187:
                return new int[]{1, 1, 2, 2, 2, 1};
            case 191:
            case 218:
                return new int[]{3, 3, 4, 3, 2, 2};
            case 193:
                return new int[]{4, 4, 4, 3, 2, 2};
            case 195:
                return new int[]{2, 4, 3, 0, 2, 2};
            case 196:
                return new int[]{4, 3, 2, 3, 2, 2};
            case 197:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 199:
            case 202:
                return new int[]{1, 2, 1, 0, 2, 2};
            case 201:
                return new int[]{3, 3, 3, 4, 2, 2};
            case 205:
                return new int[]{0, 2, 2, 3, 3, 4};
            case 207:
                return new int[]{2, 2, 2, 4, 2, 2};
            case 212:
                return new int[]{1, 1, 0, 0, 2, 2};
            case 213:
                return new int[]{1, 4, 1, 3, 2, 2};
            case 216:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 219:
                return new int[]{1, 0, 2, 2, 3, 1};
            case 221:
                return new int[]{2, 2, 3, 4, 2, 2};
            case HideBottomViewOnScrollBehavior.ENTER_ANIMATION_DURATION /* 225 */:
                return new int[]{2, 2, 1, 1, 2, 2};
            case 227:
                return new int[]{0, 3, 3, 4, 2, 2};
            case 230:
                return new int[]{3, 1, 3, 1, 2, 2};
            case 234:
                return new int[]{3, 2, 2, 1, 1, 2};
            case 235:
                return new int[]{3, 3, 4, 2, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    @Override // com.yandex.mobile.ads.impl.ad
    public final pn a() {
        return this;
    }

    @Override // com.yandex.mobile.ads.impl.ad
    public final void a(Handler handler, w8 w8Var) {
        Objects.requireNonNull(w8Var);
        this.f24133b.a(handler, w8Var);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0012  */
    /* JADX WARN: Code duplicated, block: B:13:0x0015 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:15:0x0017 A[Catch: all -> 0x000f, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0007, B:15:0x0017, B:18:0x001c, B:20:0x0039, B:22:0x0052, B:25:0x0064, B:29:0x0070, B:33:0x007e, B:32:0x0077, B:24:0x005b, B:34:0x0082), top: B:39:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x001b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0039 A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:6:0x0007, B:15:0x0017, B:18:0x001c, B:20:0x0039, B:22:0x0052, B:25:0x0064, B:29:0x0070, B:33:0x007e, B:32:0x0077, B:24:0x005b, B:34:0x0082), top: B:39:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x005b A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:6:0x0007, B:15:0x0017, B:18:0x001c, B:20:0x0039, B:22:0x0052, B:25:0x0064, B:29:0x0070, B:33:0x007e, B:32:0x0077, B:24:0x005b, B:34:0x0082), top: B:39:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0077 A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:6:0x0007, B:15:0x0017, B:18:0x001c, B:20:0x0039, B:22:0x0052, B:25:0x0064, B:29:0x0070, B:33:0x007e, B:32:0x0077, B:24:0x005b, B:34:0x0082), top: B:39:0x0007 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x0015, please report this as an issue */
    @Override // com.yandex.mobile.ads.impl.g81
    public final synchronized void a(pm pmVar, boolean z10) {
        boolean z11;
        long jC;
        int i10;
        long j10;
        long j11;
        long j12;
        if (!z10) {
            z11 = false;
            if (z11) {
                pa.b(this.f24137f > 0);
                jC = this.f24135d.c();
                i10 = (int) (jC - this.f24138g);
                this.f24141j += (long) i10;
                long j13 = this.f24142k;
                j10 = this.f24139h;
                this.f24142k = j13 + j10;
                if (i10 > 0) {
                    this.f24134c.a((int) Math.sqrt(j10), (j10 * 8000.0f) / i10);
                    if (this.f24141j < 2000) {
                        this.f24143l = (long) this.f24134c.a();
                    } else {
                        this.f24143l = (long) this.f24134c.a();
                    }
                    j11 = this.f24139h;
                    j12 = this.f24143l;
                    if (i10 == 0) {
                        this.f24144m = j12;
                        this.f24133b.a(i10, j11, j12);
                    } else {
                        this.f24144m = j12;
                        this.f24133b.a(i10, j11, j12);
                    }
                    this.f24138g = jC;
                    this.f24139h = 0L;
                }
                this.f24137f--;
                return;
            }
            return;
        }
        if (pmVar.a(8)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return;
        }
        pa.b(this.f24137f > 0);
        jC = this.f24135d.c();
        i10 = (int) (jC - this.f24138g);
        this.f24141j += (long) i10;
        long j14 = this.f24142k;
        j10 = this.f24139h;
        this.f24142k = j14 + j10;
        if (i10 > 0) {
            this.f24134c.a((int) Math.sqrt(j10), (j10 * 8000.0f) / i10);
            if (this.f24141j < 2000 || this.f24142k >= 524288) {
                this.f24143l = (long) this.f24134c.a();
            }
            j11 = this.f24139h;
            j12 = this.f24143l;
            if (i10 == 0 || j11 != 0 || j12 != this.f24144m) {
                this.f24144m = j12;
                this.f24133b.a(i10, j11, j12);
            }
            this.f24138g = jC;
            this.f24139h = 0L;
        }
        this.f24137f--;
        return;
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x000f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:14:0x0014 A[Catch: all -> 0x000d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:14:0x0014), top: B:19:0x0005 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:12:0x0012, please report this as an issue */
    @Override // com.yandex.mobile.ads.impl.g81
    public final synchronized void a(pm pmVar, boolean z10, int i10) {
        boolean z11;
        if (!z10) {
            z11 = false;
            if (z11) {
                this.f24139h += (long) i10;
                return;
            }
            return;
        }
        if (pmVar.a(8)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return;
        }
        this.f24139h += (long) i10;
        return;
        throw th;
    }

    @Override // com.yandex.mobile.ads.impl.ad
    public final void a(w8 w8Var) {
        this.f24133b.a(w8Var);
    }

    @Override // com.yandex.mobile.ads.impl.g81
    public final void b() {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0010  */
    /* JADX WARN: Code duplicated, block: B:13:0x0013 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:15:0x0015 A[Catch: all -> 0x000e, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0006, B:15:0x0015, B:17:0x0019, B:18:0x0021), top: B:23:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0019 A[Catch: all -> 0x000e, TryCatch #0 {, blocks: (B:6:0x0006, B:15:0x0015, B:17:0x0019, B:18:0x0021), top: B:23:0x0006 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x0013, please report this as an issue */
    @Override // com.yandex.mobile.ads.impl.g81
    public final synchronized void b(pm pmVar, boolean z10) {
        boolean z11;
        if (!z10) {
            z11 = false;
            if (z11) {
                if (this.f24137f == 0) {
                    this.f24138g = this.f24135d.c();
                }
                this.f24137f++;
                return;
            }
            return;
        }
        if (pmVar.a(8)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            return;
        }
        if (this.f24137f == 0) {
            this.f24138g = this.f24135d.c();
        }
        this.f24137f++;
        return;
        throw th;
    }
}
