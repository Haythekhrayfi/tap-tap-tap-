package com.yandex.mobile.ads.exo.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import ch.qos.logback.classic.Level;
import com.applovin.exoplayer2.l.b0;
import com.yandex.mobile.ads.exo.scheduler.Requirements;
import com.yandex.mobile.ads.impl.bk1;
import com.yandex.mobile.ads.impl.bx0;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.dg;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.hg;
import com.yandex.mobile.ads.impl.lm;
import com.yandex.mobile.ads.impl.p90;
import com.yandex.mobile.ads.impl.pa;
import com.yandex.mobile.ads.impl.sq;
import com.yandex.mobile.ads.impl.tq;
import com.yandex.mobile.ads.impl.un;
import com.yandex.mobile.ads.impl.uq;
import com.yandex.mobile.ads.impl.v60;
import com.yandex.mobile.ads.impl.vi1;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Requirements f18683j = new Requirements(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f18684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArraySet<InterfaceC0196c> f18685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f18690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<com.yandex.mobile.ads.exo.offline.b> f18692i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.yandex.mobile.ads.exo.offline.b f18693a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f18694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<com.yandex.mobile.ads.exo.offline.b> f18695c;

        public a(com.yandex.mobile.ads.exo.offline.b bVar, boolean z10, ArrayList arrayList, Exception exc) {
            this.f18693a = bVar;
            this.f18694b = z10;
            this.f18695c = arrayList;
        }
    }

    public static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HandlerThread f18696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final bk1 f18697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final uq f18698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Handler f18699d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ArrayList<com.yandex.mobile.ads.exo.offline.b> f18700e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final HashMap<String, d> f18701f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f18702g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f18703h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f18704i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f18705j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f18706k;

        public b(HandlerThread handlerThread, com.yandex.mobile.ads.exo.offline.a aVar, un unVar, Handler handler, int i10, int i11, boolean z10) {
            super(handlerThread.getLooper());
            this.f18696a = handlerThread;
            this.f18697b = aVar;
            this.f18698c = unVar;
            this.f18699d = handler;
            this.f18704i = i10;
            this.f18705j = i11;
            this.f18703h = z10;
            this.f18700e = new ArrayList<>();
            this.f18701f = new HashMap<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int a(com.yandex.mobile.ads.exo.offline.b bVar, com.yandex.mobile.ads.exo.offline.b bVar2) {
            long j10 = bVar.f18677c;
            long j11 = bVar2.f18677c;
            int i10 = da1.f19803a;
            if (j10 < j11) {
                return -1;
            }
            return j10 == j11 ? 0 : 1;
        }

        private int a(String str) {
            for (int i10 = 0; i10 < this.f18700e.size(); i10++) {
                if (this.f18700e.get(i10).f18675a.f18651a.equals(str)) {
                    return i10;
                }
            }
            return -1;
        }

        private com.yandex.mobile.ads.exo.offline.b a(com.yandex.mobile.ads.exo.offline.b bVar) {
            ArrayList<com.yandex.mobile.ads.exo.offline.b> arrayList;
            Comparator comparator;
            int i10 = bVar.f18676b;
            pa.b((i10 == 3 || i10 == 4) ? false : true);
            int iA = a(bVar.f18675a.f18651a);
            try {
                if (iA != -1) {
                    boolean z10 = bVar.f18677c != this.f18700e.get(iA).f18677c;
                    this.f18700e.set(iA, bVar);
                    if (z10) {
                        arrayList = this.f18700e;
                        comparator = g.f18726e;
                    }
                    ((com.yandex.mobile.ads.exo.offline.a) this.f18697b).a(bVar);
                    this.f18699d.obtainMessage(2, new a(bVar, false, new ArrayList(this.f18700e), null)).sendToTarget();
                    return bVar;
                }
                this.f18700e.add(bVar);
                arrayList = this.f18700e;
                comparator = new Comparator() { // from class: com.yandex.mobile.ads.exo.offline.f
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return c.b.a((b) obj, (b) obj2);
                    }
                };
                ((com.yandex.mobile.ads.exo.offline.a) this.f18697b).a(bVar);
            } catch (IOException e10) {
                p90.a("DownloadManager", "Failed to update index.", e10);
            }
            Collections.sort(arrayList, comparator);
            this.f18699d.obtainMessage(2, new a(bVar, false, new ArrayList(this.f18700e), null)).sendToTarget();
            return bVar;
        }

        private com.yandex.mobile.ads.exo.offline.b a(com.yandex.mobile.ads.exo.offline.b bVar, int i10, int i11) {
            pa.b((i10 == 3 || i10 == 4) ? false : true);
            return a(new com.yandex.mobile.ads.exo.offline.b(bVar.f18675a, i10, bVar.f18677c, System.currentTimeMillis(), bVar.f18679e, i11, 0, bVar.f18682h));
        }

        private com.yandex.mobile.ads.exo.offline.b a(String str, boolean z10) {
            int iA = a(str);
            if (iA != -1) {
                return this.f18700e.get(iA);
            }
            if (!z10) {
                return null;
            }
            try {
                return ((com.yandex.mobile.ads.exo.offline.a) this.f18697b).b(str);
            } catch (IOException e10) {
                p90.a("DownloadManager", "Failed to load download: " + str, e10);
                return null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0056 A[LOOP:1: B:19:0x004e->B:21:0x0056, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:25:0x008b A[LOOP:2: B:23:0x0085->B:25:0x008b, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:34:0x00e4 A[LOOP:3: B:32:0x00dc->B:34:0x00e4, LOOP_END] */
        private void a() {
            int i10;
            int i11;
            ArrayList arrayList;
            int i12;
            sq sqVarA;
            ArrayList arrayList2 = new ArrayList();
            try {
                sqVarA = ((com.yandex.mobile.ads.exo.offline.a) this.f18697b).a(3, 4);
                ((com.yandex.mobile.ads.exo.offline.a.C0195a) sqVarA).close();
            } catch (IOException unused) {
                p90.b("DownloadManager", "Failed to load downloads.");
            }
            try {
                while (true) {
                    try {
                        com.yandex.mobile.ads.exo.offline.a.C0195a c0195a = (com.yandex.mobile.ads.exo.offline.a.C0195a) sqVarA;
                        if (!c0195a.moveToPosition(c0195a.getPosition() + 1)) {
                            break;
                        } else {
                            arrayList2.add(((com.yandex.mobile.ads.exo.offline.a.C0195a) sqVarA).a());
                        }
                        for (i10 = 0; i10 < this.f18700e.size(); i10++) {
                            ArrayList<com.yandex.mobile.ads.exo.offline.b> arrayList3 = this.f18700e;
                            com.yandex.mobile.ads.exo.offline.b bVar = arrayList3.get(i10);
                            arrayList3.set(i10, new com.yandex.mobile.ads.exo.offline.b(bVar.f18675a, 5, bVar.f18677c, System.currentTimeMillis(), bVar.f18679e, 0, 0, bVar.f18682h));
                        }
                        for (i11 = 0; i11 < arrayList2.size(); i11++) {
                            ArrayList<com.yandex.mobile.ads.exo.offline.b> arrayList4 = this.f18700e;
                            com.yandex.mobile.ads.exo.offline.b bVar2 = (com.yandex.mobile.ads.exo.offline.b) arrayList2.get(i11);
                            arrayList4.add(new com.yandex.mobile.ads.exo.offline.b(bVar2.f18675a, 5, bVar2.f18677c, System.currentTimeMillis(), bVar2.f18679e, 0, 0, bVar2.f18682h));
                        }
                        Collections.sort(this.f18700e, g.f18725d);
                        ((com.yandex.mobile.ads.exo.offline.a) this.f18697b).c();
                        arrayList = new ArrayList(this.f18700e);
                        for (i12 = 0; i12 < this.f18700e.size(); i12++) {
                            this.f18699d.obtainMessage(2, new a(this.f18700e.get(i12), false, arrayList, null)).sendToTarget();
                        }
                        b();
                    } catch (Throwable th) {
                        try {
                            ((com.yandex.mobile.ads.exo.offline.a.C0195a) sqVarA).close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                    p90.b("DownloadManager", "Failed to load downloads.");
                }
                ((com.yandex.mobile.ads.exo.offline.a) this.f18697b).c();
            } catch (IOException e10) {
                p90.a("DownloadManager", "Failed to update index.", e10);
            }
            while (i10 < this.f18700e.size()) {
                ArrayList<com.yandex.mobile.ads.exo.offline.b> arrayList5 = this.f18700e;
                com.yandex.mobile.ads.exo.offline.b bVar3 = arrayList5.get(i10);
                arrayList5.set(i10, new com.yandex.mobile.ads.exo.offline.b(bVar3.f18675a, 5, bVar3.f18677c, System.currentTimeMillis(), bVar3.f18679e, 0, 0, bVar3.f18682h));
            }
            while (i11 < arrayList2.size()) {
                ArrayList<com.yandex.mobile.ads.exo.offline.b> arrayList6 = this.f18700e;
                com.yandex.mobile.ads.exo.offline.b bVar4 = (com.yandex.mobile.ads.exo.offline.b) arrayList2.get(i11);
                arrayList6.add(new com.yandex.mobile.ads.exo.offline.b(bVar4.f18675a, 5, bVar4.f18677c, System.currentTimeMillis(), bVar4.f18679e, 0, 0, bVar4.f18682h));
            }
            Collections.sort(this.f18700e, g.f18725d);
            arrayList = new ArrayList(this.f18700e);
            while (i12 < this.f18700e.size()) {
                this.f18699d.obtainMessage(2, new a(this.f18700e.get(i12), false, arrayList, null)).sendToTarget();
            }
            b();
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
        
            if (r4 != null) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void b() {
            /*
                Method dump skipped, instruction units count: 242
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.offline.c.b.b():void");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:102:0x0234  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            com.yandex.mobile.ads.exo.offline.b bVar;
            long j10;
            Message messageObtainMessage;
            sq sqVarA = null;
            int i10 = 0;
            switch (message.what) {
                case 0:
                    this.f18702g = message.arg1;
                    try {
                        try {
                            ((com.yandex.mobile.ads.exo.offline.a) this.f18697b).b();
                            sqVarA = ((com.yandex.mobile.ads.exo.offline.a) this.f18697b).a(0, 1, 2, 5, 7);
                            while (true) {
                                com.yandex.mobile.ads.exo.offline.a.C0195a c0195a = (com.yandex.mobile.ads.exo.offline.a.C0195a) sqVarA;
                                if (!c0195a.moveToPosition(c0195a.getPosition() + 1)) {
                                    da1.a((Closeable) sqVarA);
                                    this.f18699d.obtainMessage(0, new ArrayList(this.f18700e)).sendToTarget();
                                    b();
                                    i10 = 1;
                                    this.f18699d.obtainMessage(1, i10, this.f18701f.size()).sendToTarget();
                                    return;
                                }
                                this.f18700e.add(((com.yandex.mobile.ads.exo.offline.a.C0195a) sqVarA).a());
                            }
                        } catch (IOException e10) {
                            p90.a("DownloadManager", "Failed to load index.", e10);
                            this.f18700e.clear();
                        }
                    } catch (Throwable th) {
                        da1.a((Closeable) sqVarA);
                        throw th;
                    }
                    break;
                case 1:
                    this.f18703h = message.arg1 != 0;
                    b();
                    i10 = 1;
                    this.f18699d.obtainMessage(1, i10, this.f18701f.size()).sendToTarget();
                    return;
                case 2:
                    this.f18702g = message.arg1;
                    b();
                    i10 = 1;
                    this.f18699d.obtainMessage(1, i10, this.f18701f.size()).sendToTarget();
                    return;
                case 3:
                    String str = (String) message.obj;
                    int i11 = message.arg1;
                    if (str == null) {
                        for (int i12 = 0; i12 < this.f18700e.size(); i12++) {
                            com.yandex.mobile.ads.exo.offline.b bVar2 = this.f18700e.get(i12);
                            if (i11 == 0) {
                                if (bVar2.f18676b == 1) {
                                    a(bVar2, 0, 0);
                                }
                            } else if (i11 != bVar2.f18680f) {
                                int i13 = bVar2.f18676b;
                                a(new com.yandex.mobile.ads.exo.offline.b(bVar2.f18675a, (i13 == 0 || i13 == 2) ? 1 : i13, bVar2.f18677c, System.currentTimeMillis(), bVar2.f18679e, i11, 0, bVar2.f18682h));
                            }
                        }
                        try {
                            ((com.yandex.mobile.ads.exo.offline.a) this.f18697b).a(i11);
                        } catch (IOException e11) {
                            p90.a("DownloadManager", "Failed to set manual stop reason", e11);
                        }
                        break;
                    } else {
                        com.yandex.mobile.ads.exo.offline.b bVarA = a(str, false);
                        if (bVarA == null) {
                            try {
                                ((com.yandex.mobile.ads.exo.offline.a) this.f18697b).a(i11, str);
                            } catch (IOException e12) {
                                p90.a("DownloadManager", "Failed to set manual stop reason: " + str, e12);
                            }
                            break;
                        } else if (i11 == 0) {
                            if (bVarA.f18676b == 1) {
                                a(bVarA, 0, 0);
                            }
                        } else if (i11 != bVarA.f18680f) {
                            int i14 = bVarA.f18676b;
                            bVar = new com.yandex.mobile.ads.exo.offline.b(bVarA.f18675a, (i14 == 0 || i14 == 2) ? 1 : i14, bVarA.f18677c, System.currentTimeMillis(), bVarA.f18679e, i11, 0, bVarA.f18682h);
                            a(bVar);
                        }
                    }
                    b();
                    i10 = 1;
                    this.f18699d.obtainMessage(1, i10, this.f18701f.size()).sendToTarget();
                    return;
                case 4:
                    this.f18704i = message.arg1;
                    b();
                    i10 = 1;
                    this.f18699d.obtainMessage(1, i10, this.f18701f.size()).sendToTarget();
                    return;
                case 5:
                    this.f18705j = message.arg1;
                    i10 = 1;
                    this.f18699d.obtainMessage(1, i10, this.f18701f.size()).sendToTarget();
                    return;
                case 6:
                    DownloadRequest downloadRequest = (DownloadRequest) message.obj;
                    int i15 = message.arg1;
                    com.yandex.mobile.ads.exo.offline.b bVarA2 = a(downloadRequest.f18651a, true);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (bVarA2 != null) {
                        int i16 = bVarA2.f18676b;
                        if (i16 == 5) {
                            j10 = jCurrentTimeMillis;
                        } else if ((i16 == 3 || i16 == 4) == true) {
                            j10 = jCurrentTimeMillis;
                        } else {
                            j10 = bVarA2.f18677c;
                        }
                        a(new com.yandex.mobile.ads.exo.offline.b(bVarA2.f18675a.a(downloadRequest), (i16 == 5 || i16 == 7) ? 7 : i15 != 0 ? 1 : 0, j10, jCurrentTimeMillis, i15));
                    } else {
                        bVar = new com.yandex.mobile.ads.exo.offline.b(downloadRequest, i15 != 0 ? 1 : 0, jCurrentTimeMillis, jCurrentTimeMillis, i15);
                        a(bVar);
                    }
                    b();
                    i10 = 1;
                    this.f18699d.obtainMessage(1, i10, this.f18701f.size()).sendToTarget();
                    return;
                case 7:
                    String str2 = (String) message.obj;
                    com.yandex.mobile.ads.exo.offline.b bVarA3 = a(str2, true);
                    if (bVarA3 == null) {
                        p90.b("DownloadManager", "Failed to remove nonexistent download: " + str2);
                    } else {
                        a(bVarA3, 5, 0);
                        b();
                    }
                    i10 = 1;
                    this.f18699d.obtainMessage(1, i10, this.f18701f.size()).sendToTarget();
                    return;
                case 8:
                    a();
                    i10 = 1;
                    this.f18699d.obtainMessage(1, i10, this.f18701f.size()).sendToTarget();
                    return;
                case 9:
                    d dVar = (d) message.obj;
                    String str3 = dVar.f18707b.f18651a;
                    this.f18701f.remove(str3);
                    boolean z10 = dVar.f18710e;
                    if (!z10) {
                        int i17 = this.f18706k - 1;
                        this.f18706k = i17;
                        if (i17 == 0) {
                            removeMessages(11);
                        }
                    }
                    if (!dVar.f18713h) {
                        Exception exc = dVar.f18714i;
                        if (exc != null) {
                            StringBuilder sbA = v60.a("Task failed: ");
                            sbA.append(dVar.f18707b);
                            sbA.append(", ");
                            sbA.append(z10);
                            p90.a("DownloadManager", sbA.toString(), exc);
                        }
                        com.yandex.mobile.ads.exo.offline.b bVarA4 = a(str3, false);
                        Objects.requireNonNull(bVarA4);
                        int i18 = bVarA4.f18676b;
                        if (i18 == 2) {
                            pa.b(!z10);
                            com.yandex.mobile.ads.exo.offline.b bVar3 = new com.yandex.mobile.ads.exo.offline.b(bVarA4.f18675a, exc == null ? 3 : 4, bVarA4.f18677c, System.currentTimeMillis(), bVarA4.f18679e, bVarA4.f18680f, exc == null ? 0 : 1, bVarA4.f18682h);
                            this.f18700e.remove(a(bVar3.f18675a.f18651a));
                            try {
                                ((com.yandex.mobile.ads.exo.offline.a) this.f18697b).a(bVar3);
                            } catch (IOException e13) {
                                p90.a("DownloadManager", "Failed to update index.", e13);
                            }
                            messageObtainMessage = this.f18699d.obtainMessage(2, new a(bVar3, false, new ArrayList(this.f18700e), exc));
                        } else {
                            if (i18 != 5 && i18 != 7) {
                                throw new IllegalStateException();
                            }
                            pa.b(z10);
                            if (bVarA4.f18676b == 7) {
                                int i19 = bVarA4.f18680f;
                                a(bVarA4, i19 == 0 ? 0 : 1, i19);
                                b();
                            } else {
                                this.f18700e.remove(a(bVarA4.f18675a.f18651a));
                                try {
                                    ((com.yandex.mobile.ads.exo.offline.a) this.f18697b).c(bVarA4.f18675a.f18651a);
                                } catch (IOException unused) {
                                    p90.b("DownloadManager", "Failed to remove from database");
                                }
                                messageObtainMessage = this.f18699d.obtainMessage(2, new a(bVarA4, true, new ArrayList(this.f18700e), null));
                            }
                        }
                        messageObtainMessage.sendToTarget();
                        break;
                    }
                    b();
                    this.f18699d.obtainMessage(1, i10, this.f18701f.size()).sendToTarget();
                    return;
                case 10:
                    d dVar2 = (d) message.obj;
                    int i20 = message.arg1;
                    int i21 = message.arg2;
                    int i22 = da1.f19803a;
                    long j11 = ((((long) i20) & 4294967295L) << 32) | (4294967295L & ((long) i21));
                    com.yandex.mobile.ads.exo.offline.b bVarA5 = a(dVar2.f18707b.f18651a, false);
                    Objects.requireNonNull(bVarA5);
                    if (j11 == bVarA5.f18679e || j11 == -1) {
                        return;
                    }
                    a(new com.yandex.mobile.ads.exo.offline.b(bVarA5.f18675a, bVarA5.f18676b, bVarA5.f18677c, System.currentTimeMillis(), j11, bVarA5.f18680f, bVarA5.f18681g, bVarA5.f18682h));
                    return;
                case 11:
                    for (int i23 = 0; i23 < this.f18700e.size(); i23++) {
                        com.yandex.mobile.ads.exo.offline.b bVar4 = this.f18700e.get(i23);
                        if (bVar4.f18676b == 2) {
                            try {
                                ((com.yandex.mobile.ads.exo.offline.a) this.f18697b).a(bVar4);
                            } catch (IOException e14) {
                                p90.a("DownloadManager", "Failed to update index.", e14);
                            }
                        }
                    }
                    sendEmptyMessageDelayed(11, 5000L);
                    return;
                case 12:
                    Iterator<d> it = this.f18701f.values().iterator();
                    while (it.hasNext()) {
                        it.next().a(true);
                    }
                    try {
                        ((com.yandex.mobile.ads.exo.offline.a) this.f18697b).b();
                        break;
                    } catch (IOException e15) {
                        p90.a("DownloadManager", "Failed to update index.", e15);
                    }
                    this.f18700e.clear();
                    this.f18696a.quit();
                    synchronized (this) {
                        notifyAll();
                        break;
                    }
                    return;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    /* JADX INFO: renamed from: com.yandex.mobile.ads.exo.offline.c$c, reason: collision with other inner class name */
    public interface InterfaceC0196c {
        default void a(c cVar, com.yandex.mobile.ads.exo.offline.b bVar) {
        }
    }

    public static class d extends Thread implements com.yandex.mobile.ads.exo.offline.d.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final DownloadRequest f18707b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.yandex.mobile.ads.exo.offline.d f18708c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final tq f18709d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f18710e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f18711f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private volatile b f18712g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile boolean f18713h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Exception f18714i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private long f18715j;

        private d(DownloadRequest downloadRequest, com.yandex.mobile.ads.exo.offline.d dVar, tq tqVar, boolean z10, int i10, b bVar) {
            this.f18707b = downloadRequest;
            this.f18708c = dVar;
            this.f18709d = tqVar;
            this.f18710e = z10;
            this.f18711f = i10;
            this.f18712g = bVar;
            this.f18715j = -1L;
        }

        public /* synthetic */ d(DownloadRequest downloadRequest, com.yandex.mobile.ads.exo.offline.d dVar, tq tqVar, boolean z10, int i10, b bVar, int i11) {
            this(downloadRequest, dVar, tqVar, z10, i10, bVar);
        }

        public final void a(long j10, long j11, float f10) {
            this.f18709d.f25437a = j11;
            this.f18709d.f25438b = f10;
            if (j10 != this.f18715j) {
                this.f18715j = j10;
                b bVar = this.f18712g;
                if (bVar != null) {
                    bVar.obtainMessage(10, (int) (j10 >> 32), (int) j10, this).sendToTarget();
                }
            }
        }

        public final void a(boolean z10) {
            if (z10) {
                this.f18712g = null;
            }
            if (this.f18713h) {
                return;
            }
            this.f18713h = true;
            this.f18708c.cancel();
            interrupt();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.f18710e) {
                    this.f18708c.remove();
                } else {
                    long j10 = -1;
                    int i10 = 0;
                    while (!this.f18713h) {
                        try {
                            this.f18708c.a(this);
                            break;
                        } catch (IOException e10) {
                            if (!this.f18713h) {
                                long j11 = this.f18709d.f25437a;
                                if (j11 != j10) {
                                    i10 = 0;
                                    j10 = j11;
                                }
                                i10++;
                                if (i10 > this.f18711f) {
                                    throw e10;
                                }
                                Thread.sleep(Math.min((i10 - 1) * 1000, Level.TRACE_INT));
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e11) {
                this.f18714i = e11;
            }
            b bVar = this.f18712g;
            if (bVar != null) {
                bVar.obtainMessage(9, this).sendToTarget();
            }
        }
    }

    public c(Context context, com.yandex.mobile.ads.exo.offline.a aVar, un unVar) {
        context.getApplicationContext();
        this.f18688e = 3;
        this.f18689f = 5;
        this.f18687d = true;
        this.f18692i = Collections.emptyList();
        this.f18685b = new CopyOnWriteArraySet<>();
        Handler handlerB = da1.b(new b0(this));
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        b bVar = new b(handlerThread, aVar, unVar, handlerB, this.f18688e, this.f18689f, this.f18687d);
        this.f18684a = bVar;
        int iA = new bx0(context, new d0.a(this)).a();
        this.f18690g = iA;
        this.f18686c = 1;
        bVar.obtainMessage(0, iA, 0).sendToTarget();
    }

    public c(Context context, h41 h41Var, dg dgVar, lm.a aVar, ExecutorService executorService) {
        this(context, new com.yandex.mobile.ads.exo.offline.a(h41Var), new un(new hg.b().a(dgVar).a(aVar), executorService));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(bx0 bx0Var, int i10) {
        Objects.requireNonNull(bx0Var);
        if (this.f18690g != i10) {
            this.f18690g = i10;
            this.f18686c++;
            this.f18684a.obtainMessage(2, i10, 0).sendToTarget();
        }
        boolean zB = b();
        Iterator<InterfaceC0196c> it = this.f18685b.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
        }
        if (zB) {
            Iterator<InterfaceC0196c> it2 = this.f18685b.iterator();
            while (it2.hasNext()) {
                Objects.requireNonNull(it2.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            this.f18692i = Collections.unmodifiableList((List) message.obj);
            boolean zB = b();
            Iterator<InterfaceC0196c> it = this.f18685b.iterator();
            while (it.hasNext()) {
                Objects.requireNonNull(it.next());
            }
            if (zB) {
                Iterator<InterfaceC0196c> it2 = this.f18685b.iterator();
                while (it2.hasNext()) {
                    Objects.requireNonNull(it2.next());
                }
            }
        } else if (i10 == 1) {
            int i11 = message.arg1;
            int i12 = message.arg2;
            int i13 = this.f18686c - i11;
            this.f18686c = i13;
            if (i12 == 0 && i13 == 0) {
                Iterator<InterfaceC0196c> it3 = this.f18685b.iterator();
                while (it3.hasNext()) {
                    Objects.requireNonNull(it3.next());
                }
            }
        } else {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            a aVar = (a) message.obj;
            this.f18692i = Collections.unmodifiableList(aVar.f18695c);
            com.yandex.mobile.ads.exo.offline.b bVar = aVar.f18693a;
            boolean zB2 = b();
            if (aVar.f18694b) {
                Iterator<InterfaceC0196c> it4 = this.f18685b.iterator();
                while (it4.hasNext()) {
                    Objects.requireNonNull(it4.next());
                }
            } else {
                Iterator<InterfaceC0196c> it5 = this.f18685b.iterator();
                while (it5.hasNext()) {
                    it5.next().a(this, bVar);
                }
            }
            if (zB2) {
                Iterator<InterfaceC0196c> it6 = this.f18685b.iterator();
                while (it6.hasNext()) {
                    Objects.requireNonNull(it6.next());
                }
            }
        }
        return true;
    }

    private boolean b() {
        boolean z10;
        if (!this.f18687d && this.f18690g != 0) {
            int i10 = 0;
            while (true) {
                if (i10 >= this.f18692i.size()) {
                    z10 = false;
                    break;
                }
                if (this.f18692i.get(i10).f18676b == 0) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        } else {
            z10 = false;
            break;
        }
        boolean z11 = this.f18691h != z10;
        this.f18691h = z10;
        return z11;
    }

    public final void a() {
        if (this.f18687d) {
            this.f18687d = false;
            this.f18686c++;
            this.f18684a.obtainMessage(1, 0, 0).sendToTarget();
            boolean zB = b();
            Iterator<InterfaceC0196c> it = this.f18685b.iterator();
            while (it.hasNext()) {
                Objects.requireNonNull(it.next());
            }
            if (zB) {
                Iterator<InterfaceC0196c> it2 = this.f18685b.iterator();
                while (it2.hasNext()) {
                    Objects.requireNonNull(it2.next());
                }
            }
        }
    }

    public final void a(DownloadRequest downloadRequest) {
        this.f18686c++;
        this.f18684a.obtainMessage(6, 0, 0, downloadRequest).sendToTarget();
    }

    public final void a(InterfaceC0196c interfaceC0196c) {
        this.f18685b.remove(interfaceC0196c);
    }

    public final void a(vi1 vi1Var) {
        this.f18685b.add(vi1Var);
    }

    public final void a(String str) {
        this.f18686c++;
        this.f18684a.obtainMessage(7, str).sendToTarget();
    }
}
